## SQL - VIEWS
### creating db views
```
create database views;
```
Query OK, 1 row affected (0.01 sec)
### using db
```
use views;
```
### creating table register
```
create table register(id int primary key auto_increment,Name varchar(20),Gmail varchar(20),Age int,Password varchar(20));
```
### inserting values
```
insert into register values(1,'Swetha','swetha@gmail.com',17,'swetha');
```
```
insert into register values(2,'Abisha','abi@gmail.com',18,'abisha'),(3,'Aswath','aswath@gmail.com',18,'aswath'),(4,'Saranya','saran@gmail.com',17,'saran'),(5,'Jerusheya','jeru@gmail.com',19,'jerusheya');
```
### creating view called login
```
create view login as select id,Gmail,Password from register;
```
### showing tables
```
show tables;
```

| Tables_in_views |
|-----------------|
| login           |
| register        |
### extract datas from views
```
select*from login;
```

| id | Gmail            | Password  |
|----|------------------|-----------|
|  1 | swetha@gmail.com | swetha    |
|  2 | abi@gmail.com    | abisha    |
|  3 | aswath@gmail.com | aswath    |
|  4 | saran@gmail.com  | saran     |
|  5 | jeru@gmail.com   | jerusheya |
### inserting datas to views
```
insert into login values(6,'rishi@gmail.com','rishi');
```
```
insert into login values(7,'haiden@gmail.com','haiden');
```
```
select*from login;
```

| id | Gmail            | Password  |
|----|------------------|-----------|
|  1 | swetha@gmail.com | swetha    |
|  2 | abi@gmail.com    | abisha    |
|  3 | aswath@gmail.com | aswath    |
|  4 | saran@gmail.com  | saran     |
|  5 | jeru@gmail.com   | jerusheya |
|  6 | rishi@gmail.com  | rishi     |
|  7 | haiden@gmail.com | haiden    |
```
select*from register;
```

| id | Name      | Gmail            | Age  | Password  |
|----|-----------|------------------|------|-----------|
|  1 | Swetha    | swetha@gmail.com |   17 | swetha    |
|  2 | Abisha    | abi@gmail.com    |   18 | abisha    |
|  3 | Aswath    | aswath@gmail.com |   18 | aswath    |
|  4 | Saranya   | saran@gmail.com  |   17 | saran     |
|  5 | Jerusheya | jeru@gmail.com   |   19 | jerusheya |
|  6 | NULL      | rishi@gmail.com  | NULL | rishi     |
|  7 | NULL      | haiden@gmail.com | NULL | haiden    |

7 rows in set (0.00 sec)
### updating values
```
update register set Name='Rishi' , Age=20 where id=6;
```
```
update register set Name='Haiden' , Age=20 where id=7;
```
### Updating view
```
create or replace view login as select id,Gmail,Password from register where Age>17;
```
```
select*from login;
```

| id | Gmail            | Password  |
|----|------------------|-----------|
|  2 | abi@gmail.com    | abisha    |
|  3 | aswath@gmail.com | aswath    |
|  5 | jeru@gmail.com   | jerusheya |
|  6 | rishi@gmail.com  | rishi     |
|  7 | haiden@gmail.com | haiden    |

### deleting values
```
delete from login where id=6;
```
```
select*from login;
```

| id | Gmail            | Password  |
|----|------------------|-----------|
|  2 | abi@gmail.com    | abisha    |
|  3 | aswath@gmail.com | aswath    |
|  5 | jeru@gmail.com   | jerusheya |
|  7 | haiden@gmail.com | haiden    |
```
select*from register;
```

| id | Name      | Gmail            | Age  | Password  |
|----|-----------|------------------|------|-----------|
|  1 | Swetha    | swetha@gmail.com |   17 | swetha    |
|  2 | Abisha    | abi@gmail.com    |   18 | abisha    |
|  3 | Aswath    | aswath@gmail.com |   18 | aswath    |
|  4 | Saranya   | saran@gmail.com  |   17 | saran     |
|  5 | Jerusheya | jeru@gmail.com   |   19 | jerusheya |
|  7 | Haiden    | haiden@gmail.com |   20 | haiden    |
### creating table called student_list
```
create table student_list (course varchar(20),batch varchar(20));
```
```
insert into student_list values('CSS','batch2');
```
```
insert into student_list values('JS','batch2');
```
```
insert into student_list values('C','batch1');
```
```
insert into student_list values('C++','batch1');
```
```
insert into student_list values('Java','batch2');
```
```
insert into student_list values('Ruby','batch3');
```
```
select*from student_list;
```

| course | batch  |
|--------|--------|
| HTML   | batch1 |
| CSS    | batch2 |
| JS     | batch2 |
| C      | batch1 |
| C++    | batch1 |
| Java   | batch2 |
| Ruby   | batch3 |
### creating view student_course
```
create view student_course as select register.id,register.Name,student_list.course from register,student_list;
```
```
show tables;
```

| Tables_in_views |
|-----------------|
| login           |
| register        |
| student_course  |
| student_list    |
```
select*from student_course;
```

| id | Name      | course |
|----|-----------|--------|
|  7 | Haiden    | HTML   |
|  5 | Jerusheya | HTML   |
|  4 | Saranya   | HTML   |
|  3 | Aswath    | HTML   |
|  2 | Abisha    | HTML   |
|  1 | Swetha    | HTML   |
|  7 | Haiden    | CSS    |
|  5 | Jerusheya | CSS    |
|  4 | Saranya   | CSS    |
|  3 | Aswath    | CSS    |
|  2 | Abisha    | CSS    |
|  1 | Swetha    | CSS    |
|  7 | Haiden    | JS     |
|  5 | Jerusheya | JS     |
|  4 | Saranya   | JS     |
|  3 | Aswath    | JS     |
|  2 | Abisha    | JS     |
|  1 | Swetha    | JS     |
|  7 | Haiden    | C      |
|  5 | Jerusheya | C      |
|  4 | Saranya   | C      |
|  3 | Aswath    | C      |
|  2 | Abisha    | C      |
|  1 | Swetha    | C      |
|  7 | Haiden    | C++    |
|  5 | Jerusheya | C++    |
|  4 | Saranya   | C++    |
|  3 | Aswath    | C++    |
|  2 | Abisha    | C++    |
|  1 | Swetha    | C++    |
|  7 | Haiden    | Java   |
|  5 | Jerusheya | Java   |
|  4 | Saranya   | Java   |
|  3 | Aswath    | Java   |
|  2 | Abisha    | Java   |
|  1 | Swetha    | Java   |
|  7 | Haiden    | Ruby   |
|  5 | Jerusheya | Ruby   |
|  4 | Saranya   | Ruby   |
|  3 | Aswath    | Ruby   |
|  2 | Abisha    | Ruby   |
|  1 | Swetha    | Ruby   |

```
show full tables where table_type!='view';
```

| Tables_in_views | Table_type |
|-----------------|------------|
| login           | VIEW       |
| register        | BASE TABLE |
| student_course  | VIEW       |
| student_list    | BASE TABLE |
```
show full tables where table_type='BASE TABLE';
```

| Tables_in_views | Table_type |
|-----------------|------------|
| register        | BASE TABLE |
| student_list    | BASE TABLE |
```
show full tables where table_type='VIEW';
```

| Tables_in_views | Table_type |
|-----------------|------------|
| login           | VIEW       |
| student_course  | VIEW       |
### drop views
```
drop view student_course;
```
```
show tables;
```

| Tables_in_views |
|-----------------|
| login           |
| register        |
| student_list    |

