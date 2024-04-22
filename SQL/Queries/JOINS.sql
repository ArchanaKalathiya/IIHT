USE School

SELECT * FROM Teacher;
SELECT * FROM Courses;
SELECT * FROM Students;

SELECT * FROM Enrollments
-- JOINS

SELECT * FROM Enrollments
INNER JOIN Teacher ON teacher.ID=Enrollments.TeacherID -- JOIN Table from teacher table where it matches the ID in teacher table
INNER JOIN Students ON Students.ID=Enrollments.StudentID 
INNER JOIN Courses ON Courses.CourseID=Enrollments.CourseID

-- ALL THE DETAILS OF ALL TABLES ARE SHOWING 

-- SELECTING SPECIFIC COLUMNS ACROSS DIFFERENT TABLES

SELECT t.FirstName+' '+t.LastName [Teachers Name],s.firstname+' '+s.lastname [Students Name], c.Title [Course Enrolled],c.CourseCode [Course Code],e.Grade
FROM Enrollments e
INNER JOIN Teacher t ON t.ID=e.TeacherID
INNER JOIN Students s ON s.ID=e.StudentID 
INNER JOIN Courses c ON c.CourseID=e.CourseID
WHERE t.ID='3' -- It will only print smith and the students and courses it is assigned

