CREATE DATABASE school_db;
USE school_db;

CREATE TABLE students (
    student_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    email VARCHAR(100),
    phone VARCHAR(15),
    course VARCHAR(50),
    dob DATE,
    gender VARCHAR(10)
);
INSERT INTO students VALUES
(1,'Rahul','Sharma','rahul@gmail.com','9876543210','Science','2004-05-10','Male'),
(2,'Neha','Verma','neha@gmail.com','9876543211','Commerce','2003-08-15','Female'),
(3,'Amit','Singh','amit@gmail.com','9876543212','Science','2002-07-20','Male'),
(4,'Pooja','Jain','pooja@gmail.com','9876543213','Arts','2005-01-25','Female'),
(5,'Rohit','Mehta','rohit@gmail.com','9876543214','Science','2001-03-18','Male');
-- Display all students
SELECT * FROM students;

-- Update student
UPDATE students SET course='Arts' WHERE student_id=2;

-- Delete student
DELETE FROM students WHERE student_id=4;

-- Students enrolled in Science
SELECT * FROM students WHERE course='Science';

-- Count students in each course
SELECT course, COUNT(*) FROM students GROUP BY course;

-- Students older than 18
SELECT * FROM students WHERE dob < DATE_SUB(CURDATE(), INTERVAL 18 YEAR);
select * from students;
