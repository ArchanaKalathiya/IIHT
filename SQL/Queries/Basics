--USING DATABASE
USE School

--CREATING TABLES

CREATE TABLE Students(
	ID int primary key not null identity(1,1),
	lastname nvarchar(50) not null,
	firstname nvarchar(50) not null,
	DateofBirth datetime not null,
	EnrollmentDate datetime,
);

CREATE TABLE Courses(
	CourseID int identity(1,1) primary key not null,
	Title nvarchar(50),
	NumberOfCredits int,
	CourseCode nvarchar(5), --Example:CS303 so it is alpha-numeric values
);


-- INSERTING DATA 
INSERT INTO dbo.Students(lastname, [firstname],[dateofBirth],[EnrollmentDate]) 
VALUES ('Ronaldo','Cristiano','1985-02-05','2024-05-01'),
-- INSERTING MULTIPLE VALUES 
('Test','Student','2002-02-20',null),
('Test1','Student1','2003-02-20','2019-05-01'),
('Test2','Student2','2004-02-20','2019-05-01'),
('Test3','Student3','2005-02-20','2019-05-01')

SET IDENTITY_INSERT dbo.Students ON;


INSERT INTO School.dbo.Students(ID,lastname, [firstname],[dateofBirth],[EnrollmentDate]) 
VALUES ('1','Messi','Lionel','1987-06-24','2024-05-01'),
  ('3','Neymar','Junior','1992-02-05','2024-05-01'),
  ('5','Mbappe','Kylian','1998-12-20','2024-05-01'),
  ('6','Lewandowski','Robert','1988-08-21','2024-05-01'),
  ('7','Haaland','Erling','2000-07-21','2024-05-01'),
  ('8','Kane','Harry','1993-07-28','2024-05-01'),
  ('11','De Bruyne','Kevin','1991-06-28','2024-05-01'),
  ('12','Salah','Mohamed','1992-06-15','2024-05-01'),
  ('13','Van Dijk','Virgil','1991-07-08','2024-05-01');


SET IDENTITY_INSERT dbo.Students OFF;

-- SELECTING DATA FROM TABLE

SELECT * FROM Students -- TO Read the whole table 
SELECT firstname AS 'FIRST NAME',
	   lastname [LAST NAME] 
	   FROM Students

SELECT * FROM Courses

-- Advanced Selecting Queries

SELECT  [ID]
      ,[lastname]
      ,[firstname] [FIRST NAME] 
      ,[DateofBirth]
      ,[EnrollmentDate]
  FROM [School].[dbo].[Students]

SELECT TOP (5) [ID]
      ,[lastname]
      ,[firstname]
      ,[DateofBirth]
      ,[EnrollmentDate]
  FROM [School].[dbo].[Students]
  -- WHERE firstname='Cristiano'
  WHERE firstname LIKE '%student%'

SELECT firstname, lastname,1[Random Number],firstname+' '+lastname [FULL NAME],'Hello Student',EnrollmentDate
FROM School.dbo.Students

-- Select Course with highest number of credits
SELECT * FROM School.dbo.Courses
WHERE NumberOfCredits = '3' OR NumberOfCredits > 4

-- UPDATING TABLES
-- update all the enrollment dates which are null 
UPDATE Students set EnrollmentDate = '2019-05-01' 
WHERE EnrollmentDate is not null
-- update all enrollment dates and multiple records (be careful)
UPDATE Students set EnrollmentDate= '2019-06-01'
-- updating duplicate values
UPDATE Students set firstname='Ron'
WHERE ID='2'
-- update students with ids 4 and 9 change firstname and multiple columns
UPDATE Students set firstname='Tajee', lastname='McDermott'
WHERE ID='4'

UPDATE Students set firstname='Nikesh', lastname='Parikh'
WHERE ID='9'

-- deleting data from table
-- delete student with id 1
DELETE FROM Students WHERE Id='1'

-- delete  student named 'student2'
DELETE FROM Students WHERE firstname='student2'

-- delete  all students with names containing the word 'student'
DELETE FROM Students WHERE firstname LIKE '%student%'

