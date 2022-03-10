## Subqueires
```
show databases;
```

| Database           |
|--------------------|
| Academy            |
| Example            |
| blazers            |
| information_schema |
| lab                |
| mysql              |
| performance_schema |
| swetha             |
| sys                |
| view               |
| views              |
### creating db called subqueries
```
create database subqueries;
```
```
show databases;
```

| Database           |
|--------------------|
| Academy            |
| Example            |
| blazers            |
| information_schema |
| lab                |
| mysql              |
| performance_schema |
| subqueries         |
| sys                |
| views              |
### using subqueries
```
use subqueries;
```
### creating table called book
```
create table book(sno int primary key auto_increment,name varchar(20),marks int);
```
### inserting values to book
```
insert into book values(1,'Abisha','96'),(2,'Annam','97'),(3,'Aswath','50'),(4,'Haiden','85'),(5,'Jerusheya','87'),(6,'Rishi','60'),(7,'Santhanu','99'),(8,'Saranya','90'),(9,'Swetha','100'),(10,'Selva','98');
```
### Get datas from book
```
select*from book;
```

| sno | name      | marks |
|-----|-----------|-------|
|   1 | Abisha    | 96%   |
|   2 | Annam     | 97%   |
|   3 | Aswath    | 50%   |
|   4 | Haiden    | 85%   |
|   5 | Jerusheya | 87%   |
|   6 | Rishi     | 60%   |
|   7 | Santhanu  | 99    |
|   8 | Saranya   | 90    |
|   9 | Swetha    | 100   |
|  10 | Selva     | 98    |
### using subquery in select statement
```
select* from book where marks in (select marks from book where marks>95);
```

| sno | name     | marks |
|-----|----------|-------|
|   1 | Abisha   |    96 |
|   2 | Annam    |    96 |
|   7 | Santhanu |    99 |
|   9 | Swetha   |   100 |
|  10 | Selva    |    98 |
```
select avg(marks) from book;
```

| avg(marks) |
|------------|
|    84.4000 |

```
select* from book where marks > (select avg(marks) from book);
```

| sno | name     | marks |
|-----|----------|-------|
|   1 | Abisha   |    96 |
|   2 | Annam    |    96 |
|   7 | Santhanu |    99 |
|   8 | Saranya  |    90 |
|   9 | Swetha   |   100 |
|  10 | Selva    |    98 |
### creating table called student_marks
```
create table student_marks(id int primary key auto_increment,name varchar(20),marks int);
```
### using subquery in Insert statement
```
insert into student_marks select*from book where marks >(select avg(marks) from book);
```
### Getting datas
```
select*from student_marks;
```
| id | name     | marks |
|----|----------|-------|
|  1 | Abisha   |    96 |
|  2 | Annam    |    96 |
|  7 | Santhanu |    99 |
|  8 | Saranya  |    90 |
|  9 | Swetha   |   100 |
| 10 | Selva    |    98 |

