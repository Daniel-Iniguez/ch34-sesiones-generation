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