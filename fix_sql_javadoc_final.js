const fs = require('fs');
const path = require('path');

function processJavaFile(filePath) {
    let content = fs.readFileSync(filePath, 'utf8');
    
    // We are restoring the original file and fixing the formatting more robustly.
    // The previous script created things like:
    //  *      - A datatype defines what type of data we will be stored into this specific
    //    * column.
    // Notice the indent is completely off.
    
    let lines = content.split(/\r?\n/);
    let newLines = [];
    let inJavadoc = false;
    let modified = false;

    // Helper to wrap text with a strict prefix and max line length of 80.
    function wrapText(prefix, text) {
        let wrapped = [];
        let words = text.split(' ');
        let currentLine = prefix;
        
        for (let word of words) {
            if (currentLine.length + word.length + 1 > 80 && currentLine.length > prefix.length) {
                wrapped.push(currentLine);
                currentLine = prefix + word;
            } else {
                if (currentLine.length > prefix.length) {
                    currentLine += ' ' + word;
                } else {
                    currentLine += word;
                }
            }
        }
        wrapped.push(currentLine);
        return wrapped;
    }

    for (let i = 0; i < lines.length; i++) {
        let line = lines[i];

        if (line.trim().startsWith('/**') || line.trim().startsWith('/*')) {
            inJavadoc = true;
        }

        if (inJavadoc) {
            // Check if it's an end comment
            if (line.trim().endsWith('*/')) {
                inJavadoc = false;
                newLines.push(line);
                continue;
            }

            // Normal javadoc line
            let match = line.match(/^(\s*\*\s*)(.*)$/);
            if (match) {
                let prefix = match[1]; // e.g. ' * ' or '     * '
                let text = match[2];
                
                // Keep table layouts intact, don't wrap them! They use | and - mostly.
                if (text.includes('|') || text.startsWith('---') || text.trim() === '') {
                     newLines.push(line);
                     continue;
                }
                
                // If it's a code block or example starting heavily indented, leave it.
                if (text.startsWith('    ')) {
                     newLines.push(line);
                     continue;
                }

                if (line.length > 80) {
                     // Normalize prefix to be strictly the spaces up to * and one space after.
                     let normalizedPrefix = line.substring(0, line.indexOf('*') + 2); 
                     
                     let wrapped = wrapText(normalizedPrefix, text);
                     newLines.push(...wrapped);
                     modified = true;
                     continue;
                }
            }
        } else if (line.trim().startsWith('//')) {
            let match = line.match(/^(\s*\/\/\s*)(.*)$/);
            if (match && line.length > 80) {
                let prefix = match[1];
                let text = match[2];
                let wrapped = wrapText(prefix, text);
                newLines.push(...wrapped);
                modified = true;
                continue;
            }
        }

        newLines.push(line);
    }

    if (modified) {
        fs.writeFileSync(filePath, newLines.join('\n'));
        console.log('Modified:', filePath);
    }
}

function walkSync(dir, callback) {
    const files = fs.readdirSync(dir);
    for (const file of files) {
        const filepath = path.join(dir, file);
        const stats = fs.statSync(filepath);
        if (stats.isDirectory()) {
            walkSync(filepath, callback);
        } else if (stats.isFile() && filepath.endsWith('.java')) {
            callback(filepath);
        }
    }
}

walkSync('src/main/java/assessment/sql', processJavaFile);
walkSync('src/test/java/assessment/sql', processJavaFile);
