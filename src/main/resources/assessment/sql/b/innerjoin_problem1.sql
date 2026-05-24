SELECT s.id, s.student_name 
FROM class c INNER JOIN student s ON c.class_title = s.class_title 
WHERE c.teacher_name = 'Ms. Lovelace';