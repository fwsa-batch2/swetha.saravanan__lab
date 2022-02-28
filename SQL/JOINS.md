## SQL JOINS
```Display databases
show databases;
```

| Database           |
| ------------------ |
| Example            |
| blazers            |
| information_schema |
| mysql              |
| performance_schema |
| sys                |

6 rows in set (0.01 sec)
```Using database
mysql> use Example;
```
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
```Display tables
show tables;
```

| Tables_in_Example |
| ----------------- |
| Book              |
| Nonclustered      |
| booklist          |
| clustered         |
| library           |
| student           |

6 rows in set (0.01 sec)
```Creating a table called studlist
create table studlist (stud_id int primary key, stud_name varchar(20) not null,stud_age int not null,stud_address varchar(20) not null);
```
Query OK, 0 rows affected (0.04 sec)
```Inserting the values
insert into studlist values (1, 'Shravan' , 18,'Delhi') ,(3,'Swetha',17,'TN'),(2,'Ash',17,'AP'),(4,'Shagi',19,'Kujarat'),(5,'Dinesh',21,'Kerala');
```
Query OK, 5 rows affected (0.01 sec)
Records: 5  Duplicates: 0  Warnings: 0
```Modify
alter table studlist rename column stud_address to stud_state;
```
Query OK, 0 rows affected (0.03 sec)
Records: 0  Duplicates: 0  Warnings: 0
```Extract data from studlist
select*from studlist;
```
| stud_id | stud_name | stud_age | stud_state |
|-------- |-----------| ---------| ---------- |
|       1 | Shravan   |       18 | Delhi      |
|       2 | Ash       |       17 | AP         |
|       3 | Swetha    |       17 | TN         |
|       4 | Shagi     |       19 | Kujarat    |
|       5 | Dinesh    |       21 | Kerala     |

5 rows in set (0.00 sec)
```Creating another table for joins
create table studlist_1(stud_id int primary key, stud_name varchar(20) not null,stud_age int not null,stud_state varchar(20) not null);
```
Query OK, 0 rows affected (0.04 sec)
```Inserting values
insert into studlist_1 values (1, 'Shravan' , 18,'Delhi') ,(6,'Smrithi',17,'Mumbai'),(7,'Zayn',19,'UP'),(8,'Zara',19,'West Bengal'),(9,'Dhilip',21,'Rajasthan');
```
Query OK, 5 rows affected (0.01 sec)
Records: 5  Duplicates: 0  Warnings: 0

mysql> select*from studlist_1;

| stud_id | stud_name | stud_age | stud_state  |
|---------| ----------|----------| ----------- |
|       1 | Shravan   |       18 | Delhi       |
|       6 | Smrithi   |       17 | Mumbai      |
|       7 | Zayn      |       19 | UP          |
|       8 | Zara      |       19 | West Bengal |
|       9 | Dhilip    |       21 | Rajasthan   |

5 rows in set (0.00 sec)
```In Inner join common values are appeared
select studlist.stud_id , studlist_1.stud_name,studlist.stud_age,studlist_1.stud_state from studlist inner join studlist_1  on studlist.stud_id=studlist_1.stud_id;
```

| stud_id | stud_name | stud_age | stud_state |
|---------|-----------|----------|----------- |
|       1 | Shravan   |       18 | Delhi      |

1 row in set (0.00 sec)
```In , Left join is only have the values of first table and common value
select studlist.stud_id , studlist_1.stud_name,studlist.stud_age,studlist_1.stud_state from studlist left join studlist_1  on studlist.stud_id=studlist_1.stud_id;
```

| stud_id | stud_name | stud_age | stud_state |
|---------|-----------|----------|----------- |
|       1 | Shravan   |       18 | Delhi      |
|       2 | NULL      |       17 | NULL       |
|       3 | NULL      |       17 | NULL       |
|       4 | NULL      |       19 | NULL       |
|       5 | NULL      |       21 | NULL       |

5 rows in set (0.01 sec)
```In , Right join is only have the values of second table and common value
select studlist.stud_id , studlist_1.stud_name,studlist.stud_age,studlist_1.stud_state from studlist right join studlist_1  on studlist.stud_id=studlist_1.stud_id;
```

| stud_id | stud_name | stud_age | stud_state  |
|---------|-----------|----------|------------ |
|       1 | Shravan   |       18 | Delhi       |
|    NULL | Smrithi   |     NULL | Mumbai      |
|    NULL | Zayn      |     NULL | UP          |
|    NULL | Zara      |     NULL | West Bengal |
|    NULL | Dhilip    |     NULL | Rajasthan   |

5 rows in set (0.00 sec)
```Cross join
select studlist.stud_id , studlist_1.stud_name,studlist.stud_age,studlist_1.stud_state from studlist cross  join studlist_1;
```

| stud_id | stud_name | stud_age | stud_state  |
|---------|-----------|----------|-------------|
|       5 | Shravan   |       21 | Delhi       |
|       4 | Shravan   |       19 | Delhi       |
|       3 | Shravan   |       17 | Delhi       |
|       2 | Shravan   |       17 | Delhi       |
|       1 | Shravan   |       18 | Delhi       |
|       5 | Smrithi   |       21 | Mumbai      |
|       4 | Smrithi   |       19 | Mumbai      |
|       3 | Smrithi   |       17 | Mumbai      |
|       2 | Smrithi   |       17 | Mumbai      |
|       1 | Smrithi   |       18 | Mumbai      |
|       5 | Zayn      |       21 | UP          |
|       4 | Zayn      |       19 | UP          |
|       3 | Zayn      |       17 | UP          |
|       2 | Zayn      |       17 | UP          |
|       1 | Zayn      |       18 | UP          |
|       5 | Zara      |       21 | West Bengal |
|       4 | Zara      |       19 | West Bengal |
|       3 | Zara      |       17 | West Bengal |
|       2 | Zara      |       17 | West Bengal |
|       1 | Zara      |       18 | West Bengal |
|       5 | Dhilip    |       21 | Rajasthan   |
|       4 | Dhilip    |       19 | Rajasthan   |
|       3 | Dhilip    |       17 | Rajasthan   |
|       2 | Dhilip    |       17 | Rajasthan   |
|       1 | Dhilip    |       18 | Rajasthan   |

25 rows in set (0.00 sec)



