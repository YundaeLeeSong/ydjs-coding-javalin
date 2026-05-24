CREATE TABLE class (id SERIAL PRIMARY KEY,teacher_name VARCHAR(255),class_title VARCHAR(255));
INSERT INTO class (teacher_name, class_title) VALUES('Ms. Lovelace', 'Physics'),('Ms. Lovelace', 'Math'),('Mr. McCarthy', 'Writing'),('Ms. Goodall', 'Biology');
CREATE TABLE student (id SERIAL PRIMARY KEY,student_name VARCHAR(255),class_title VARCHAR(255));
INSERT INTO student (student_name, class_title) VALUES('John Stewart', 'Writing'),('Stephen Colbert', 'Physics'),('Samantha Bee', 'Math'),('Aasif Mandvi', 'Writing'),('Robert Riggle', 'Physics'),('Jessica Williams', 'Art');
