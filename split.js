const fs = require('fs');
const path = require('path');

const quizzes = [
  { id: '02', pkg: 'c' },
  { id: '03', pkg: 'd' },
  { id: '04', pkg: 'e' },
  { id: '05', pkg: 'f' },
  { id: '06', pkg: 'g' },
  { id: '07', pkg: 'h' },
  { id: '08', pkg: 'i' },
  { id: '09', pkg: 'j' },
  { id: '10', pkg: 'k' },
];

function wrapText(text, maxLen) {
    const lines = text.split('\n');
    const out = [];
    for (let line of lines) {
        if (line.length <= maxLen || !line.trim().startsWith('*')) {
            out.push(line);
            continue;
        }
        let prefixMatch = line.match(/^(\s*\*\s+)(.*)$/);
        if (!prefixMatch) {
            out.push(line);
            continue;
        }
        let prefix = prefixMatch[1];
        let content = prefixMatch[2];
        let currentLine = prefix;
        let words = content.split(' ');
        for (let word of words) {
            if (currentLine.length + word.length + 1 > maxLen) {
                out.push(currentLine);
                currentLine = prefix + word;
            } else {
                currentLine += (currentLine === prefix ? '' : ' ') + word;
            }
        }
        out.push(currentLine);
    }
    return out.join('\n');
}

for (const q of quizzes) {
  const javaFile = path.join('javalin_questions', `APQuiz${q.id}.java`);
  const testFile = path.join('javalin_questions', `APQuiz${q.id}Test.java`);
  if (!fs.existsSync(javaFile) || !fs.existsSync(testFile)) {
      console.log(`Missing ${javaFile} or test`);
      continue;
  }
  
  const javaContent = fs.readFileSync(javaFile, 'utf8').replace(/\r\n/g, '\n');
  const testContent = fs.readFileSync(testFile, 'utf8').replace(/\r\n/g, '\n');
  
  const packagePath = path.join('src', 'main', 'java', 'assessment', 'java', q.pkg);
  const testPackagePath = path.join('src', 'test', 'java', 'assessment', 'java', q.pkg);
  fs.mkdirSync(packagePath, { recursive: true });
  fs.mkdirSync(testPackagePath, { recursive: true });

  const javaParts = javaContent.split('\n    /**\n');
  for (let i = 1; i < javaParts.length; i++) {
      let part = '    /**\n' + javaParts[i];
      if (i === javaParts.length - 1) {
          part = part.replace(/\n\}\s*$/, '\n');
      }
      part = wrapText(part, 80);

      const nameMatch = part.match(/public static [^\s]+ (\w+)\(/);
      if (nameMatch) {
          const name = nameMatch[1];
          const className = name.charAt(0).toUpperCase() + name.slice(1);
          const classContent = `package assessment.java.${q.pkg};\n\npublic class ${className} {\n${part}}\n`;
          fs.writeFileSync(path.join(packagePath, `${className}.java`), classContent);
      }
  }

  const testParts = testContent.split('\n    /**\n');
  for (let i = 1; i < testParts.length; i++) {
      let part = '    /**\n' + testParts[i];
      if (i === testParts.length - 1) {
          part = part.replace(/\n\}\s*$/, '\n');
      }
      
      const nameMatch = part.match(/public void test(\w+)\(\)/);
      if (nameMatch) {
          const className = nameMatch[1]; 
          let tCode = part.replace(new RegExp(`APQuiz${q.id}\\.`, 'g'), `${className}.`);
          const tContent = `package assessment.java.${q.pkg};\n\nimport org.junit.jupiter.api.Test;\nimport static org.junit.jupiter.api.Assertions.*;\nimport java.util.Arrays;\nimport java.util.List;\n\npublic class ${className}Test {\n${tCode}}\n`;
          fs.writeFileSync(path.join(testPackagePath, `${className}Test.java`), tContent);
      }
  }
  
  fs.unlinkSync(javaFile);
  fs.unlinkSync(testFile);
}

console.log("Migration complete.");
