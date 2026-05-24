const fs = require('fs');
const glob = require('glob');
const path = require('path');

function wrapText(text, maxLen) {
    if (text.length <= maxLen) return text;
    let wrapped = '';
    let currentLine = '';
    const words = text.split(' ');

    for (let i = 0; i < words.length; i++) {
        const word = words[i];
        if (currentLine.length + word.length + 1 > maxLen) {
            wrapped += currentLine + '\n * ';
            currentLine = word;
        } else {
            if (currentLine.length > 0) {
                currentLine += ' ' + word;
            } else {
                currentLine = word;
            }
        }
    }
    wrapped += currentLine;
    return wrapped;
}

function processJavaFile(filePath) {
    let content = fs.readFileSync(filePath, 'utf8');
    let lines = content.split('\n');
    let newLines = [];
    let modified = false;

    for (let line of lines) {
        // Strip trailing carriage return if present
        if (line.endsWith('\r')) {
            line = line.slice(0, -1);
        }

        if (line.length > 80 && !line.includes('javaz.util.FileManager.parseSqlFile(')) {
            // Very simple Javadoc line wrapping
            const match = line.match(/^(\s*\*\s)(.*)$/);
            if (match) {
                const prefix = match[1];
                const text = match[2];
                // we want the total line to be <= 80, so text max length is 80 - prefix.length
                const maxLen = 80 - prefix.length;
                if (text.length > maxLen) {
                    const wrappedText = wrapText(text, maxLen);
                    // Split the wrapped text and prepend the prefix to each line (if not already done by wrapText)
                    // Note: wrapText prepends ' * ', but let's align it with prefix
                    const wrappedLines = wrappedText.split('\n * ');
                    for (let i=0; i<wrappedLines.length; i++) {
                         if (i===0) {
                              newLines.push(prefix + wrappedLines[i]);
                         } else {
                              newLines.push(prefix.replace(/\*/, ' ') + '* ' + wrappedLines[i]);
                         }
                    }
                    modified = true;
                    continue; // Skip pushing the original line
                }
            } else if (line.trim().startsWith('//')) {
                const prefixMatch = line.match(/^(\s*\/\/\s*)(.*)$/);
                if (prefixMatch) {
                    const prefix = prefixMatch[1];
                    const text = prefixMatch[2];
                    const maxLen = 80 - prefix.length;
                     if (text.length > maxLen) {
                         const wrappedText = wrapText(text, maxLen);
                         const wrappedLines = wrappedText.split('\n * ');
                         for (let i=0; i<wrappedLines.length; i++) {
                             if (i===0) {
                                  newLines.push(prefix + wrappedLines[i]);
                             } else {
                                  newLines.push(prefix + wrappedLines[i]);
                             }
                         }
                         modified = true;
                         continue;
                     }
                }
            }
        }
        newLines.push(line);
    }

    if (modified) {
        fs.writeFileSync(filePath, newLines.join('\n'));
        console.log('Modified:', filePath);
    }
}

glob.sync('src/{main,test}/java/assessment/sql/**/*.java').forEach(processJavaFile);
