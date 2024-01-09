/*
## Part 2: Understanding your data
 1. Write a SQL query that allows you to find all the students in a given country.
 2. Write a SQL query that allows you to find all the Countries which name starts with 'Ca'.
 3. Count all the students that are enrolled in the course 'JAVA-1'.
 4. Calculate the *SUM* of the credits of all the courses that have the word 'JAVA' in the name. 
*/

-- 1. Write a SQL query that allows you to find all the students in a given country.
SELECT 
s.*,
c.Name Country
FROM students s
INNER JOIN countries c
ON s.nationality = c.idCountries
WHERE c.Name = "Colombia";

-- 2. Write a SQL query that allows you to find all the Countries which name starts with 'Ca'.
SELECT * FROM countries WHERE name LIKE "Ca%";

-- 3. Count all the students that are enrolled in the course 'JAVA-1'.
SELECT 
COUNT(chs.course_code) AS StudenstInJAVA1
FROM students s
INNER JOIN courses_has_students chs
ON s.idStudent = chs.students_id_student
GROUP BY chs.course_code
HAVING chs.course_code = "Java-1" ;

-- 4. Calculate the *SUM* of the credits of all the courses that have the word 'JAVA' in the name. 
SELECT 
SUM(credits) AS TotalCredits 
FROM courses 
WHERE name LIKE "%JAVA%";
