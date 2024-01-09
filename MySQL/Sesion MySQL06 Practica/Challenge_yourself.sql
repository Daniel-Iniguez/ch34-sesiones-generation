/*
## Challenge yourself
 1. Write a Query that allows you to count all the students that are enrolled in a given module.
 *Hint*: You need to count all the students enrolled in all the courses of the module.
*/

SELECT * FROM modules;
SELECT * FROM courses;
SELECT * FROM courses_has_students;
SELECT * FROM students;

/*
SELECT 
COUNT(chs.course_code) AS total_students_DBMySQL
FROM students s
INNER JOIN courses_has_students chs
ON s.idStudent = chs.students_id_student
INNER JOIN courses c
ON chs.course_code = c.code
INNER JOIN modules m
ON c.module_code = m.code
WHERE chs.course_code LIKE "%DB-MYSQL%"
GROUP BY chs.course_code;
*/


SELECT 
COUNT(chs.course_code) AS "Total de Estudiantes en el modulo DB-MySQL"
FROM courses_has_students chs 
WHERE chs.course_code LIKE "%DB-MYSQL%";

SELECT
c.module_code,
COUNT(c.module_code) AS "Total de Estudiantes por Modulo"
FROM courses_has_students chs
INNER JOIN courses c
ON chs.course_code = c.code
GROUP BY c.module_code;
