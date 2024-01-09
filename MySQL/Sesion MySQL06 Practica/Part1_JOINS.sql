/*
## Part 1: JOINS
1. Run the following SQL Query to complete your first JOIN to see more information about the Students:
 ```sql
 SELECT Students.*, Countries.name country FROM Students INNER JOIN Countries ON Students.nationality = Countries.idCountries;
 
  ```
2. Modify the previous SQL statment so it joins the Students table with the IDTypes table to know each students' type of ID.
3. Write an additional SQL statment to JOIN the Students table with the CourseHasStudent table to get the code of the courses that each students is enrolled in.
4. Write a SQL query to join the CourseHasStudent table with the Courses table to get the name of the course information with the student ID of students enrolled in the course.
5. Now that you have the two queries, use an INNER JOIN to combine the results of the queries (this is called nested queries, and will allow you to combine SQL queries to order the data the way you like).
*/

-- 1. Run the following SQL Query to complete your first JOIN to see more information about the Students:
 SELECT Students.*, Countries.name country FROM Students INNER JOIN Countries ON Students.nationality = Countries.idCountries;

-- 2. Modify the previous SQL statment so it joins the Students table with the IDTypes table to know each students' type of ID.
SELECT 
s.*, 
c.name country,
ty.name TypeID_Name
FROM Students s
INNER JOIN Countries c
ON s.nationality = c.idCountries
INNER JOIN idtypes ty
ON s.IdType_id = ty.id_idTypes;
 
 -- 3. Write an additional SQL statment to JOIN the Students table with the CourseHasStudent table to get the code of the courses that each students is enrolled in.
SELECT 
s.idStudent,
s.name nameStudent,
s.last_name AS lastName,
chs.course_code
FROM students s
INNER JOIN courses_has_students chs
ON s.idStudent = chs.students_id_student;

-- 4. Write a SQL query to join the CourseHasStudent table with the Courses table to get the name of the course information with the student ID of students enrolled in the course.
SELECT 
chs.course_code,
chs.students_id_student,
c.name NameOfCourse
FROM courses_has_students chs
INNER JOIN courses c
ON c.code = chs.course_code;

-- 5. Now that you have the two queries, use an INNER JOIN to combine the results of the queries (this is called nested queries, and will allow you to combine SQL queries to order the data the way you like).
SELECT 
s.idStudent,
s.name nameStudent,
s.last_name AS lastName,
chs.course_code,
c.name NameOfCourse
FROM students s
INNER JOIN courses_has_students chs
ON s.idStudent = chs.students_id_student
INNER JOIN courses c
ON c.code = chs.course_code;
