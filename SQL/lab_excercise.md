```syntax
CREATE DATABASE Academy;
```
### Show databases
```syntax
show databases;
```
+--------------------+
| Database           |
+--------------------+
| Academy            |
| Example            |
| blazers            |
| information_schema |
| lab                |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
8 rows in set (0.02 sec) 
### Creating tables
```syntax
create table user(id int primary key auto_increment,name varchar(20));
```
```syntax
insert into user values(1,'Surya'),(2,'Chitra'),(3,'Revathi'),(4,'Lisha'),(5,'Dhaya'),(6,'Aswath'),(7,'Haiden'),(8,'Suguram');
```
```syntax
create table batches(id int primary key auto_increment,name varchar(20));
```
```syntax
insert into batches values(1,'HTML'),(2,'CSS'),(3,'JS'),(4,'ELS'),(5,'Tech'),(6,'HTML'),(7,'HTML'),(8,'HTML');
```
```syntax
create table courses(id int primary key auto_increment,name varchar(20));
```
```syntax
insert into courses values(1,'Batch1'),(2,'Batch2'),(3,'Batch2'),(4,'Batch1'),(5,'Batch2'),(6,'Batch1'),(7,'Batch1'),(8,'Batch1');

```
mysql> use Academy;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> show tables;
+-------------------+
| Tables_in_Academy |
+-------------------+
| batch_courses     |
| batch_users       |
| batches           |
| courses           |
| user              |
+-------------------+
5 rows in set (0.01 sec)

mysql> use blazers;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> show tables;
+-------------------+
| Tables_in_blazers |
+-------------------+
| constraints       |
| foreign_key       |
| marklist          |
| marks             |
| members           |
| student           |
+-------------------+
6 rows in set (0.01 sec)

mysql> select*from student;
+--------+-----------+-----+------------+---------+--------------+-----------+
| studid | Name      | Age | phone      | Academy | Address      | Language  |
+--------+-----------+-----+------------+---------+--------------+-----------+
|      1 | Abisha    |  19 | 9022334455 | FWSA    | Thirunelveli | English   |
|      2 | Aswath    |  19 | 9022334445 | FWSA    | Chennai      | Tamil     |
|      3 | Annamalai |  19 | 8877669900 | FWSA    | Madurai      | Malayalam |
|      4 | Haiden    |  19 | 9087654321 | FWSA    | Chennai      | Spanish   |
|      5 | Jerusheya |  19 | 9022334435 | FWSA    | Thirunelveli | Telungu   |
|      6 | Rishi     |  19 | 8877669922 | FWSA    | Thirupur     | Urdhu     |
|      7 | Riyas     |  19 | 9087654231 | FWSA    | Thirnelveli  | Bengali   |
|      8 | Santhanu  |  19 | 9022334435 | FWSA    | Theni        | French    |
|      9 | Saranya   |  19 | 8877669112 | FWSA    | Thirunelveli | Arabic    |
|     10 | Selva     |  19 | 9083354231 | FWSA    | Chennai      | Russian   |
|     11 | Swetha    |  19 | 9023445566 | FWSA    | Madurai      | Hindi     |
+--------+-----------+-----+------------+---------+--------------+-----------+
11 rows in set (0.00 sec)


mysql> update student set Age=18 where studid=1 and studid<6;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> use Academy;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> show tables;
+-------------------+
| Tables_in_Academy |
+-------------------+
| batch_courses     |
| batch_users       |
| batches           |
| courses           |
| user              |
+-------------------+
5 rows in set (0.00 sec)
```
select batch_users.id ,user.id,user.name,batches.name from batch_users join user on user.id=batch_users.id join batches on batches.id=batch_users.id;
```
+----+----+--------+--------+
| id | id | name   | name   |
+----+----+--------+--------+
|  1 |  1 | Surya  | Batch1 |
|  2 |  2 | Chitra | Batch2 |
+----+----+--------+--------+
2 rows in set (0.00 sec)
```
select batch_users.id ,user.name,batches.name from batch_users join user on user.id=batch_users.id join batches on batches.id=batch_users.id;
```
+----+--------+--------+
| id | name   | name   |
+----+--------+--------+
|  1 | Surya  | Batch1 |
|  2 | Chitra | Batch2 |
+----+--------+--------+
2 rows in set (0.00 sec)

```
select batch_courses.id ,user.name,courses.name from batch_courses join user on user.id=batch_courses.id join courses on courses.id=batch_courses.id;
```
+----+--------+------+
| id | name   | name |
+----+--------+------+
|  1 | Surya  | HTML |
|  2 | Chitra | CSS  |
+----+--------+------+
2 rows in set (0.00 sec)

mysql> insert into user(name) values('Lisha'),('Dhaya');
Query OK, 2 rows affected (0.01 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> insert into batches(name) values('Batch2'),('Batch1'),('Batch2');
Query OK, 3 rows affected (0.01 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> insert into courses(name) values('ELS'),('Tech');
Query OK, 2 rows affected (0.01 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> select*from courses;
+----+------+
| id | name |
+----+------+
|  1 | HTML |
|  2 | CSS  |
|  3 | JS   |
|  4 | ELS  |
|  5 | Tech |
+----+------+
5 rows in set (0.00 sec)

mysql> select*from batches;
+----+--------+
| id | name   |
+----+--------+
|  1 | Batch1 |
|  2 | Batch2 |
|  3 | Batch2 |
|  4 | Batch1 |
|  5 | Batch2 |
+----+--------+
5 rows in set (0.00 sec)

mysql> select*from user;
+----+---------+
| id | name    |
+----+---------+
|  1 | Surya   |
|  2 | Chitra  |
|  3 | Revathi |
|  4 | Lisha   |
|  5 | Dhaya   |
+----+---------+
5 rows in set (0.00 sec)

```syntax
select batch_courses.id ,user.name,courses.name from batch_courses join user on user.id=batch_courses.id join courses on courses.id=batch_courses.id;
```
+----+--------+------+
| id | name   | name |
+----+--------+------+
|  1 | Surya  | HTML |
|  2 | Chitra | CSS  |
+----+--------+------+
2 rows in set (0.00 sec)
```
select batch_courses.id ,user.name,courses.name from user join batch_courses on user.id=batch_courses.id join courses on courses.id=batch_courses.id;
```
+----+--------+------+
| id | name   | name |
+----+--------+------+
|  1 | Surya  | HTML |
|  2 | Chitra | CSS  |
+----+--------+------+
2 rows in set (0.00 sec)

```syntax
select courses.id,courses.name,batches.id,batches.name,user.id,user.name from courses join batches on batches.id=courses.id join user on user.id=courses.id;
```
+----+------+----+--------+----+---------+
| id | name | id | name   | id | name    |
+----+------+----+--------+----+---------+
|  1 | HTML |  1 | Batch1 |  1 | Surya   |
|  2 | CSS  |  2 | Batch2 |  2 | Chitra  |
|  3 | JS   |  3 | Batch2 |  3 | Revathi |
|  4 | ELS  |  4 | Batch1 |  4 | Lisha   |
|  5 | Tech |  5 | Batch2 |  5 | Dhaya   |
+----+------+----+--------+----+---------+
5 rows in set (0.00 sec)
```
select courses.id,courses.name,batches.id,batches.name,user.id,user.name from courses join batches on batches.id=courses.id join user on user.id=courses.id where courses.name in(select name from courses where name='HTML');
```
+----+------+----+--------+----+-------+
| id | name | id | name   | id | name  |
+----+------+----+--------+----+-------+
|  1 | HTML |  1 | Batch1 |  1 | Surya |
+----+------+----+--------+----+-------+
1 row in set (0.00 sec)

mysql> insert into courses(name) values('HTML'),('HTML'),('HTML');
Query OK, 3 rows affected (0.01 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> insert into user(name) values('Aswath'),('Haiden'),('Suguram');
Query OK, 3 rows affected (0.00 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> insert into batches(name) values('Batch1'),('Batch1'),('Batch1');
Query OK, 3 rows affected (0.00 sec)
Records: 3  Duplicates: 0  Warnings: 0
```
select courses.id,courses.name,batches.id,batches.name,user.id,user.name from courses join batches on batches.id=courses.id join user on user.id=courses.id where courses.name in(select name from courses where name='HTML') and batches.name in(select name from batches where name='Batch1');
```
+----+------+----+--------+----+---------+
| id | name | id | name   | id | name    |
+----+------+----+--------+----+---------+
|  1 | HTML |  1 | Batch1 |  1 | Surya   |
|  6 | HTML |  6 | Batch1 |  6 | Aswath  |
|  7 | HTML |  7 | Batch1 |  7 | Haiden  |
|  8 | HTML |  8 | Batch1 |  8 | Suguram |
+----+------+----+--------+----+---------+
4 rows in set (0.00 sec)


