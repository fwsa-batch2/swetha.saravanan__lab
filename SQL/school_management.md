# SCHOOL MANAGEMENT

### CREATING TABLE CALLED students
```
create table students(id int primary key auto_increment,Name varchar(100) not null,Email varchar(100) not null unique,Password varchar(100) not null,Gender char(1) not null,DOB date,created_date timestamp not null default current_timestamp,check(Gender in ('M','F')));
```
Query OK, 0 rows affected (0.06 sec)
### CREATING ANOTHER TABLE CALLED student_class
```
create table student_class(id int primary key auto_increment,student_id int not null,class int not null,status varchar(20) not null,foreign key(student_id) references students(id),check(class >=1
and class<=12),check(status in ('ACTIVE','INACTIVE')));
```
Query OK, 0 rows affected (0.10 sec)
### ADDING Column
```
alter table students add column mobile_no bigint not null after Email;
```
Query OK, 0 rows affected (0.12 sec)
Records: 0  Duplicates: 0  Warnings: 0
### DESCRIBING TABLE students
```
desc students;
```

| Field        | Type         | Null | Key | Default           | Extra             |
|--------------|--------------|------|-----|-------------------|-------------------|
| id           | int          | NO   | PRI | NULL              | auto_increment    |
| Name         | varchar(100) | NO   |     | NULL              |                   |
| Email        | varchar(100) | NO   | UNI | NULL              |                   |
| mobile_no    | bigint       | NO   |     | NULL              |                   |
| Password     | varchar(100) | NO   |     | NULL              |                   |
| Gender       | char(1)      | NO   |     | NULL              |                   |
| DOB          | date         | YES  |     | NULL              |                   |
| created_date | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |

8 rows in set (0.00 sec)
### DESCRIBING student_class
```
desc student_class;
```

| Field      | Type        | Null | Key | Default | Extra          |
|------------|-------------|------|-----|---------|----------------|
| id         | int         | NO   | PRI | NULL    | auto_increment |
| student_id | int         | NO   | MUL | NULL    |                |
| class      | int         | NO   |     | NULL    |                |
| status     | varchar(20) | NO   |     | NULL    |                |

4 rows in set (0.01 sec)
###  FEATURE 1 - Student Registration
```
insert into students(id,Name,Email,mobile_no,Password,Gender,DOB) values(1,'Abisha','abisha.antony@fwsa.freshworks.com',6379481526,'abisha','F','2003-06-03');
```
```
insert into students(Name,Email,mobile_no,Password,Gender,DOB) values('Annamalai','annamlai.shanmugam@fwsa.freshworks.com',7695883749,'annamalai','M','2003-08-19'),('Aswath','aswath.kaja@fwsa.freshworks.com',7639838503,'aswath','M','2004-02-26'),('Jerusheya','jerusheya.johnson@fwsa.freshworks.com',9363232559,'jerusheya','F','2002-08-26'),('Swetha','swetha.saravanan@fwsa.freshworks.com',9025336748,'swetha','F','2004-11-16');
```
```
insert into students(Name,Email,mobile_no,Password ,Gender,DOB) values ('Haiden','haiden.arulappan@fwsa.freshworks.com',7890543221,'haiden','M','2002-01-31'),('Rishi','rishi.atgondon@fwsa.freshworks.com',8877665321,'rishi','M','2002-08-13'),('Saranya','saranya.subbaih@fwsa.freshworks.com',9988775533,'saranya','F','2004-06-20'),('Santhanu','santhanu.suruliram@fwsa.freshworks.com',8822331133,'santhanu','M','2002-11-15');
```

###  Feature 02 - List out the details of Students
```
select*from students;
```

| id | Name      | Email                                  | mobile_no  | Password  | Gender | DOB        | created_date        |
|----|-----------|----------------------------------------|------------|-----------|--------|------------|---------------------|
|  1 | Abisha    | abisha.antony@fwsa.freshworks.com      | 6379481526 | abisha    | F      | 2003-06-03 | 2022-03-02 12:18:07 |
|  2 | Annamalai | annamlai.shanmugam@fwsa.freshworks.com | 7695883749 | annamalai | M      | 2003-08-19 | 2022-03-02 12:29:22 |
|  3 | Aswath    | aswath.kaja@fwsa.freshworks.com        | 7639838503 | aswath    | M      | 2004-02-26 | 2022-03-02 12:29:22 |
|  4 | Jerusheya | jerusheya.johnson@fwsa.freshworks.com  | 9363232559 | jerusheya | F      | 2002-08-26 | 2022-03-02 12:38:39 |
|  5 | Swetha    | swetha.saravanan@fwsa.freshworks.com   | 9025336748 | swetha    | F      | 2004-11-16 | 2022-03-02 12:38:39 |
|  6 | Haiden    | haiden.arulappan@fwsa.freshworks.com   | 7890543221 | haiden    | M      | 2002-01-31 | 2022-03-02 14:34:32 |
|  7 | Rishi     | rishi.atgondon@fwsa.freshworks.com     | 8877665321 | rishi     | M      | 2002-08-13 | 2022-03-02 14:34:32 |
|  8 | Saranya   | saranya.subbaih@fwsa.freshworks.com    | 9988775533 | saranya   | F      | 2004-06-20 | 2022-03-02 14:34:32 |
|  9 | Santhanu  | santhanu.suruliram@fwsa.freshworks.com | 8822331133 | santhanu  | M      | 2002-11-15 | 2022-03-02 14:34:32 |
| 10 | Riyas     | mohammad.riyas@fwsa.freshworks.com     | 9900112233 | riyas     | M      | 2002-12-12 | 2022-03-02 14:37:39 |

###  Feature 03 - Login with Email and Password
```
SELECT*FROM students WHERE Email='swetha.saravanan@fwsa.freshworks.com' AND Password='swetha';
```

| id | Name   | Email                                | mobile_no  | Password | Gender | DOB        | created_date        |
|----|--------|--------------------------------------|------------|----------|--------|------------|---------------------|
|  5 | Swetha | swetha.saravanan@fwsa.freshworks.com | 9025336748 | swetha   | F      | 2004-11-16 | 2022-03-02 12:38:39 |

###  Feature 04 - UPDATE Password
```
UPDATE students SET Password='swethams' WHERE id=5;
```

### Show the updation of password
```
SELECT*FROM students;
```

| id | Name      | Email                                  | mobile_no  | Password  | Gender | DOB        | created_date        |
|----|-----------|----------------------------------------|------------|-----------|--------|------------|---------------------|
|  1 | Abisha    | abisha.antony@fwsa.freshworks.com      | 6379481526 | abisha    | F      | 2003-06-03 | 2022-03-02 12:18:07 |
|  2 | Annamalai | annamlai.shanmugam@fwsa.freshworks.com | 7695883749 | annamalai | M      | 2003-08-19 | 2022-03-02 12:29:22 |
|  3 | Aswath    | aswath.kaja@fwsa.freshworks.com        | 7639838503 | aswath    | M      | 2004-02-26 | 2022-03-02 12:29:22 |
|  4 | Jerusheya | jerusheya.johnson@fwsa.freshworks.com  | 9363232559 | jerusheya | F      | 2002-08-26 | 2022-03-02 12:38:39 |
|  5 | Swetha    | swetha.saravanan@fwsa.freshworks.com   | 9025336748 | swethams  | F      | 2004-11-16 | 2022-03-02 12:38:39 |
|  6 | Haiden    | haiden.arulappan@fwsa.freshworks.com   | 7890543221 | haiden    | M      | 2002-01-31 | 2022-03-02 14:34:32 |
|  7 | Rishi     | rishi.atgondon@fwsa.freshworks.com     | 8877665321 | rishi     | M      | 2002-08-13 | 2022-03-02 14:34:32 |
|  8 | Saranya   | saranya.subbaih@fwsa.freshworks.com    | 9988775533 | saranya   | F      | 2004-06-20 | 2022-03-02 14:34:32 |
|  9 | Santhanu  | santhanu.suruliram@fwsa.freshworks.com | 8822331133 | santhanu  | M      | 2002-11-15 | 2022-03-02 14:34:32 |
| 10 | Riyas     | mohammad.riyas@fwsa.freshworks.com     | 9900112233 | riyas     | M      | 2002-12-12 | 2022-03-02 14:37:39 |

### Feature 05 - Enroll Student into Class
```
insert into student_class values(1,1,12,'ACTIVE');
```
```
insert into student_class(student_id,class,status) values(2,11,'ACTIVE'),(3,10,'ACTIVE');
```
```
insert into student_class(student_id,class,status) values(4,12,'ACTIVE'),(5,9,'ACTIVE');
```
```
insert into student_class(student_id,class,status) values(6,5,'ACTIVE'),(7,5,'ACTIVE'),(8,6,'ACTIVE'),(9,5,'ACTIVE'),(10,6,'ACTIVE');
```
### Feature 06 - Find Students who are enrolled in the given class
```
SELECT*FROM student_class;
```

| id | student_id | class | status |
|----|------------|-------|--------|
|  1 |          1 |    12 | ACTIVE |
|  2 |          2 |    11 | ACTIVE |
|  3 |          3 |     5 | ACTIVE |
|  4 |          4 |    12 | ACTIVE |
|  5 |          5 |     6 | ACTIVE |
|  6 |          6 |     5 | ACTIVE |
|  7 |          7 |     5 | ACTIVE |
|  8 |          8 |     6 | ACTIVE |
|  9 |          9 |     5 | ACTIVE |
| 10 |         10 |     6 | ACTIVE |

### Feature 07 - Update Student Class information
```
UPDATE student_class SET class=5 WHERE id=2;
```
### Displaying the data of updation
```
SELECT*FROM student_class;
```

| id | student_id | class | status |
|----|------------|-------|--------|
|  1 |          1 |    12 | ACTIVE |
|  2 |          2 |     5 | ACTIVE |
|  3 |          3 |     5 | ACTIVE |
|  4 |          4 |    12 | ACTIVE |
|  5 |          5 |     6 | ACTIVE |
|  6 |          6 |     5 | ACTIVE |
|  7 |          7 |     5 | ACTIVE |
|  8 |          8 |     6 | ACTIVE |
|  9 |          9 |     5 | ACTIVE |
| 10 |         10 |     6 | ACTIVE |

### Find Students who are enrolled in the given class
```
SELECT*FROM student_class WHERE class=5;
```

| id | student_id | class | status |
|----|------------|-------|--------|
|  2 |          2 |     5 | ACTIVE |
|  3 |          3 |     5 | ACTIVE |
|  6 |          6 |     5 | ACTIVE |
|  7 |          7 |     5 | ACTIVE |
|  9 |          9 |     5 | ACTIVE |

### Feature 8: Student withdrawn from a Class
```
DELETE FROM student_class WHERE id=10;
```

### Display student_class
```
SELECT*FROM student_class;
```

| id | student_id | class | status |
|----|------------|-------|--------|
|  1 |          1 |    12 | ACTIVE |
|  2 |          2 |     5 | ACTIVE |
|  3 |          3 |     5 | ACTIVE |
|  4 |          4 |    12 | ACTIVE |
|  5 |          5 |     6 | ACTIVE |
|  6 |          6 |     5 | ACTIVE |
|  7 |          7 |     5 | ACTIVE |
|  8 |          8 |     6 | ACTIVE |
|  9 |          9 |     5 | ACTIVE |

###  Feature 09 - Find student details who have not updated their Date Of Birth
```
SELECT*FROM students WHERE DOB IS NULL;
```
Empty set (0.00 sec)
### Inserting values
```
insert into student_class values(10,10,6,'INACTIVE');
```
### Feature 10 - Find Total no of students actively studying in this school
```
SELECT COUNT(class),status FROM student_class WHERE status='ACTIVE';
```
| COUNT(class) | status   |
|--------------|----------|
|            9 | ACTIVE   |

### Feature 11 - Find Total no of students actively studying in each class
```
mysql> SELECT COUNT(class),class FROM student_class WHERE status='ACTIVE'  GROUP BY class;
```

| COUNT(class) | class |
|--------------|-------|
|            2 |    12 |
|            5 |     5 |
|            2 |     6 |

3 rows in set (0.00 sec)
### Feature 12 _ Find Total no of students actively studying each class which has less than 5 students.
```
select count(class),class FROM student_class GROUP BY class HAVING count(class)>5;
```
Empty set (0.00 sec)
### Feature 13 - Display student and class details
```
SELECT * FROM students INNER JOIN student_class ON students.id=student_class.id;
```

| id | Name      | Email                                  | mobile_no  | Password  | Gender | DOB        | created_date        | id | student_id | class | status   |
|----|-----------|----------------------------------------|------------|-----------|--------|------------|---------------------|----|------------|-------|----------|
|  1 | Abisha    | abisha.antony@fwsa.freshworks.com      | 6379481526 | abisha    | F      | 2003-06-03 | 2022-03-02 12:18:07 |  1 |          1 |    12 | ACTIVE   |
|  2 | Annamalai | annamlai.shanmugam@fwsa.freshworks.com | 7695883749 | annamalai | M      | 2003-08-19 | 2022-03-02 12:29:22 |  2 |          2 |     5 | ACTIVE   |
|  3 | Aswath    | aswath.kaja@fwsa.freshworks.com        | 7639838503 | aswath    | M      | 2004-02-26 | 2022-03-02 12:29:22 |  3 |          3 |     5 | ACTIVE   |
|  4 | Jerusheya | jerusheya.johnson@fwsa.freshworks.com  | 9363232559 | jerusheya | F      | 2002-08-26 | 2022-03-02 12:38:39 |  4 |          4 |    12 | ACTIVE   |
|  5 | Swetha    | swetha.saravanan@fwsa.freshworks.com   | 9025336748 | swethams  | F      | 2004-11-16 | 2022-03-02 12:38:39 |  5 |          5 |     6 | ACTIVE   |
|  6 | Haiden    | haiden.arulappan@fwsa.freshworks.com   | 7890543221 | haiden    | M      | 2002-01-31 | 2022-03-02 14:34:32 |  6 |          6 |     5 | ACTIVE   |
|  7 | Rishi     | rishi.atgondon@fwsa.freshworks.com     | 8877665321 | rishi     | M      | 2002-08-13 | 2022-03-02 14:34:32 |  7 |          7 |     5 | ACTIVE   |
|  8 | Saranya   | saranya.subbaih@fwsa.freshworks.com    | 9988775533 | saranya   | F      | 2004-06-20 | 2022-03-02 14:34:32 |  8 |          8 |     6 | ACTIVE   |
|  9 | Santhanu  | santhanu.suruliram@fwsa.freshworks.com | 8822331133 | santhanu  | M      | 2002-11-15 | 2022-03-02 14:34:32 |  9 |          9 |     5 | ACTIVE   |
| 10 | Riyas     | mohammad.riyas@fwsa.freshworks.com     | 9900112233 | riyas     | M      | 2002-12-12 | 2022-03-02 14:37:39 | 10 |         10 |     6 | INACTIVE |

10 rows in set (0.00 sec)
### Feature 14 - Display Student Details for the given input class=5th std
```
SELECT * FROM students INNER JOIN student_class ON students.id=student_class.id WHERE student_class.class IN(SELECT class FROM student_class WHERE class=5);
```

| id | Name      | Email                                  | mobile_no  | Password  | Gender | DOB        | created_date        | id | student_id | class | status |
|----|-----------|----------------------------------------|------------|-----------|--------|------------|---------------------|----|------------|-------|--------|
|  2 | Annamalai | annamlai.shanmugam@fwsa.freshworks.com | 7695883749 | annamalai | M      | 2003-08-19 | 2022-03-02 12:29:22 |  2 |          2 |     5 | ACTIVE |
|  3 | Aswath    | aswath.kaja@fwsa.freshworks.com        | 7639838503 | aswath    | M      | 2004-02-26 | 2022-03-02 12:29:22 |  3 |          3 |     5 | ACTIVE |
|  6 | Haiden    | haiden.arulappan@fwsa.freshworks.com   | 7890543221 | haiden    | M      | 2002-01-31 | 2022-03-02 14:34:32 |  6 |          6 |     5 | ACTIVE |
|  7 | Rishi     | rishi.atgondon@fwsa.freshworks.com     | 8877665321 | rishi     | M      | 2002-08-13 | 2022-03-02 14:34:32 |  7 |          7 |     5 | ACTIVE |
|  9 | Santhanu  | santhanu.suruliram@fwsa.freshworks.com | 8822331133 | santhanu  | M      | 2002-11-15 | 2022-03-02 14:34:32 |  9 |          9 |     5 | ACTIVE |

5 rows in set (0.01 sec)

### Feature 15 - Find Class for the given student email id 
### Email: n@gmail.com
```
SELECT * FROM students INNER JOIN student_class ON students.id=student_class.id WHERE students.Email IN(SELECT Email FROM students WHERE Email LIKE '_n%');
```

| id | Name      | Email                                  | mobile_no  | Password  | Gender | DOB        | created_date        | id | student_id | class | status |
|----|-----------|----------------------------------------|------------|-----------|--------|------------|---------------------|----|------------|-------|--------|
|  2 | Annamalai | annamlai.shanmugam@fwsa.freshworks.com | 7695883749 | annamalai | M      | 2003-08-19 | 2022-03-02 12:29:22 |  2 |          2 |     5 | ACTIVE |

1 row in set (0.00 sec)
### Feature 16 - Find Students who has not enrolled in a class 
	
```
SELECT * FROM student_class LEFT JOIN students ON students.id=student_class.id  WHERE student_class.id IN(SELECT class FROM student_class WHERE class is NULL);
```
Empty set (0.00 sec)


### Feature 17 - Display all students name with class - include both enrolled and not enrolled
```
 SELECT students.id,students.name , student_class.class FROM students LEFT JOIN student_class ON students.id = student_class.id;
```

| id | name      | class |
|----|-----------|-------|
|  1 | Abisha    |    12 |
|  2 | Annamalai |     5 |
|  3 | Aswath    |     5 |
|  4 | Jerusheya |    12 |
|  5 | Swetha    |     6 |
|  6 | Haiden    |     5 |
|  7 | Rishi     |     5 |
|  8 | Saranya   |     6 |
|  9 | Santhanu  |     5 |
| 10 | Riyas     |     6 |
| 11 | Shravan   |  NULL |

11 rows in set (0.01 sec)

mysql> 

