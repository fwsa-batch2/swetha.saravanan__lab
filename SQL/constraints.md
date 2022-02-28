## SQL CONSTRAINTS
```Syntax
show databases;
```

| Database           |
|------------------- |
| Example            |
| blazers            |
| information_schema |
| mysql              |
| performance_schema |
| sys                |

6 rows in set (0.01 sec)
```Using database
use blazers;
```
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
```Display tables
show tables;
```

| Tables_in_blazers |
| ------------------|
| marklist          |
| marks             |
| members           |
| student           |

4 rows in set (0.00 sec)

```Creating table
create table constraints(traveller_id int primary key auto_increment,Name varchar(20) not null, Age int not null,Phone bigint unique key not null,destination varchar(20) not null);
```
Query OK, 0 rows affected (0.06 sec)

mysql> insert into constraints values('Shravani',20,9988770064,'Switzerland');
ERROR 1136 (21S01): Column count doesn't match value count at row 1
mysql> insert into constraints(Name,Age,Phone,destination) values('Shravani',20,9988770064,'Switzerland');
Query OK, 1 row affected (0.01 sec)

mysql> insert into constraints(Name,Age,Phone,destination) values('Zaara',20,9988770564,'Newyork');
Query OK, 1 row affected (0.01 sec)

mysql> insert into constraints(Name,Age,Phone,destination) values('Suman',30,9388770564,'London');
Query OK, 1 row affected (0.01 sec)

mysql> insert into constraints(Name,Age,Phone,destination) values('Sujith',20,9384770564,'France');
Query OK, 1 row affected (0.01 sec)

mysql> insert into constraints(Name,Age,Phone,destination) values('Sumithra',21,9384370564,'Sydney');
Query OK, 1 row affected (0.01 sec)

mysql> insert into constraints(Name,Age,Phone,destination) values('Sameera',21,9384270564,'India');
Query OK, 1 row affected (0.00 sec)

mysql> insert into constraints(Name,Age,Phone,destination) values('Sarah',23,9384270764,'Beijing');
Query OK, 1 row affected (0.02 sec)

mysql> insert into constraints(Name,Age,Phone,destination) values('Gardener',19,9384170764,'China'),('Tulsa',19,9988773322,'California');
Query OK, 2 rows affected (0.00 sec)
Records: 2  Duplicates: 0  Warnings: 0
```Extract data from tables
select*from constraints;
```

| traveller_id | Name     | Age | Phone      | destination |
|--------------|----------|-----|------------|-------------|
|            1 | Shravan  |  21 | 9988770066 | Manali      |
|            2 | Shravani |  20 | 9988770064 | Switzerland |
|            3 | Zaara    |  20 | 9988770564 | Newyork     |
|            4 | Suman    |  30 | 9388770564 | London      |
|            5 | Sujith   |  20 | 9384770564 | France      |
|            6 | Sumithra |  21 | 9384370564 | Sydney      |
|            7 | Sameera  |  21 | 9384270564 | India       |
|            8 | Sarah    |  23 | 9384270764 | Beijing     |
|            9 | Gardener |  19 | 9384170764 | China       |
|           10 | Tulsa    |  19 | 9988773322 | California  |

10 rows in set (0.00 sec)
```Creating another table for foreign key
create table foreign_key(Passport_no varchar(10) not null,travel_id int, foreign key(travel_id) references constraints(traveller_id));
```
Query OK, 0 rows affected (0.04 sec)

```Describing the table
desc constraints;
```

| Field        | Type        | Null | Key | Default | Extra          |
|--------------|-------------|------|-----|---------|----------------|
| traveller_id | int         | NO   | PRI | NULL    | auto_increment |
| Name         | varchar(20) | NO   |     | NULL    |                |
| Age          | int         | NO   |     | NULL    |                |
| Phone        | bigint      | NO   | UNI | NULL    |                |
| destination  | varchar(20) | NO   |     | NULL    |                |

5 rows in set (0.00 sec)

mysql> insert into foreign_key values('A991122334',1);
Query OK, 1 row affected (0.01 sec)

mysql> insert into foreign_key values('A991122339',2);
Query OK, 1 row affected (0.01 sec)

mysql> insert into foreign_key values('A991122239',3);
Query OK, 1 row affected (0.01 sec)

mysql> insert into foreign_key values('A991132239',4);
Query OK, 1 row affected (0.01 sec)

mysql> insert into foreign_key values('A992132239',5);
Query OK, 1 row affected (0.01 sec)

mysql> insert into foreign_key values('A892132239',6);
Query OK, 1 row affected (0.01 sec)

mysql> insert into foreign_key values('A882132239',7);
Query OK, 1 row affected (0.01 sec)

mysql> insert into foreign_key values('A882162239',8);
Query OK, 1 row affected (0.01 sec)

mysql> insert into foreign_key values('A882162237',9);
Query OK, 1 row affected (0.01 sec)

mysql> insert into foreign_key values('A882165237',10);
Query OK, 1 row affected (0.01 sec)
```Extract data from foreign_key table
select*from foreign_key;
```

| Passport_no | travel_id |
|-------------|-----------|
| A991122334  |         1 |
| A991122339  |         2 |
| A991122239  |         3 |
| A991132239  |         4 |
| A992132239  |         5 |
| A892132239  |         6 |
| A882132239  |         7 |
| A882162239  |         8 |
| A882162237  |         9 |
| A882165237  |        10 |

10 rows in set (0.00 sec)
```Describing foreign_key table
desc foreign_key;
```

| Field       | Type        | Null | Key | Default | Extra |
|-------------|-------------|------|-----|---------|-------|
| Passport_no | varchar(10) | NO   |     | NULL    |       |
| travel_id   | int         | YES  | MUL | NULL    |       |

2 rows in set (0.00 sec)



