### Creating database
```syntax
CREATE DATABASE Academy;
```
### Show databases
```syntax
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
| sys                |

8 rows in set (0.02 sec) 

### using database
```syntax
use Academy;
```
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
### Creating tables
### table - user
```syntax
create table user(id int primary key auto_increment,name varchar(20));
```
```syntax
insert into user values(1,'Surya'),(2,'Chitra'),(3,'Revathi'),(4,'Lisha'),(5,'Dhaya'),(6,'Aswath'),(7,'Haiden'),(8,'Suguram');
```
### table - batches
```syntax
create table batches(id int primary key auto_increment,name varchar(20));
```
```syntax
insert into batches values(1,'HTML'),(2,'CSS'),(3,'JS'),(4,'ELS'),(5,'Tech'),(6,'HTML'),(7,'HTML'),(8,'HTML');
```
### table - courses
```syntax
create table courses(id int primary key auto_increment,name varchar(20));
```
```syntax
insert into courses values(1,'Batch1'),(2,'Batch2'),(3,'Batch2'),(4,'Batch1'),(5,'Batch2'),(6,'Batch1'),(7,'Batch1'),(8,'Batch1');
```
### table - batch_users
```syntax
create table batch_users(id int primary key auto_increment,batch_id int,foreign key(batch_id) references batches(id),user_id int,foreign key(user_id) references user(id));
```
```syntax
insert into batch_users values(1,1,1),(2,2,2),(3,3,3),(4,4,4),(5,5,5),(6,6,6),(7,7,7),(8,8,8);
```
### table - batch_courses
```syntax
create table batch_courses(id int primary key auto_increment,batch_id int,foreign key(batch_id) references batches(id),course_id int,foreign key(course_id) references courses(id));
```
```syntax
insert into batch_users values(1,1,1),(2,2,2),(3,3,3),(4,4,4),(5,5,5),(6,6,6),(7,7,7),(8,8,8);
```
### Display tables
```
show tables;
```

| Tables_in_Academy |
|-------------------|
| batch_courses     |
| batch_users       |
| batches           |
| courses           |
| user              |

5 rows in set (0.01 sec)

```syntax
select batch_users.id ,user.id,user.name,batches.name from batch_users join user on user.id=batch_users.id join batches on batches.id=batch_users.id;
```

| id | id | name    | name   |
|----|----|---------|--------|
|  1 |  1 | Surya   | Batch1 |
|  2 |  2 | Chitra  | Batch2 |
|  3 |  3 | Revathi | Batch2 |
|  4 |  4 | Lisha   | Batch1 |
|  5 |  5 | Dhaya   | Batch2 |
|  6 |  6 | Aswath  | Batch1 |
|  7 |  7 | Haiden  | Batch1 |
|  8 |  8 | Suguram | Batch1 |

8 rows in set (0.00 sec)

```
select batch_users.id ,user.name,batches.name from batch_users join user on user.id=batch_users.id join batches on batches.id=batch_users.id;
```

| id | name    | name   |
|----|---------|--------|
|  1 | Surya   | Batch1 |
|  2 | Chitra  | Batch2 |
|  3 | Revathi | Batch2 |
|  4 | Lisha   | Batch1 |
|  5 | Dhaya   | Batch2 |
|  6 | Aswath  | Batch1 |
|  7 | Haiden  | Batch1 |
|  8 | Suguram | Batch1 |

8 rows in set (0.00 sec)


```
select batch_courses.id ,user.name,courses.name from batch_courses join user on user.id=batch_courses.id join courses on courses.id=batch_courses.id;
```

| id | name    | name |
|----|---------|------|
|  1 | Surya   | HTML |
|  2 | Chitra  | CSS  |
|  3 | Revathi | JS   |
|  4 | Lisha   | ELS  |
|  5 | Dhaya   | Tech |
|  6 | Aswath  | HTML |
|  7 | Haiden  | HTML |
|  8 | Suguram | HTML |

8 rows in set (0.01 sec)
```
select courses.id,courses.name,batches.id,batches.name,user.id,user.name from courses join batches on batches.id=courses.id join user on user.id=courses.id;
```

| id | name | id | name   | id | name    |
|----|------|----|--------|----|---------|
|  1 | HTML |  1 | Batch1 |  1 | Surya   |
|  2 | CSS  |  2 | Batch2 |  2 | Chitra  |
|  3 | JS   |  3 | Batch2 |  3 | Revathi |
|  4 | ELS  |  4 | Batch1 |  4 | Lisha   |
|  5 | Tech |  5 | Batch2 |  5 | Dhaya   |
|  6 | HTML |  6 | Batch1 |  6 | Aswath  |
|  7 | HTML |  7 | Batch1 |  7 | Haiden  |
|  8 | HTML |  8 | Batch1 |  8 | Suguram |

8 rows in set (0.00 sec)

```
select courses.id,courses.name,batches.id,batches.name,user.id,user.name from courses join batches on batches.id=courses.id join user on user.id=courses.id where courses.name in(select name from courses where name='HTML') and batches.name in(select name from batches where name='Batch1');
```
| id | name | id | name   | id | name    |
|----|------|----|--------|----|---------|
|  1 | HTML |  1 | Batch1 |  1 | Surya   |
|  6 | HTML |  6 | Batch1 |  6 | Aswath  |
|  7 | HTML |  7 | Batch1 |  7 | Haiden  |
|  8 | HTML |  8 | Batch1 |  8 | Suguram |

4 rows in set (0.00 sec)


