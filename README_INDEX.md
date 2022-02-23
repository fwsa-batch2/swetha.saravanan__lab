 sudo -u root mysql;
[sudo] password for swetham: 
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 8
Server version: 8.0.28-0ubuntu0.20.04.3 (Ubuntu)

Copyright (c) 2000, 2022, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> show databases;

| Database           |
| ------------------ |
| Example            |
| blazers            |
| information_schema |
| mysql              |
| performance_schema |
| sys                |

6 rows in set (0.01 sec)

mysql> use blazers;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> show tables;

| Tables_in_blazers |
| ----------------- |
| marklist          |
| marks             |
| members           |
| student           |

4 rows in set (0.00 sec)

mysql> use Example;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> show tables;

| Tables_in_Example |
| ----------------- |
| Book              |
| Nonclustered      |
| booklist          |
| clustered         |
| library           |
| student           |

6 rows in set (0.01 sec)

mysql> select*from Nonclustered;

| stud_id | stud_Name | stud_Age |
| ------- |----------|--------- |
|       1 | Swetha    |       17 |
|       2 | Selva     |       19 |
|       3 | Saranya   |       17 |
|       4 | Santhanu  |       19 |
|       5 | Rishi     |       19 |
|       6 | Riyas     |       19 |
|       7 | Jerusheya |       19 |
|       8 | Haiden    |       19 |
|       9 | Aswath    |       17 |
|      10 | Annamalai |       18 |
|      11 | Abisha    |       18 |

11 rows in set (0.01 sec)

mysql> create index nc_id on Nonclustered(stud_id,stud_Name, stud_Age);
ERROR 1061 (42000): Duplicate key name 'nc_id'
mysql> create index nc_xid on Nonclustered(stud_id,stud_Name, stud_Age);
Query OK, 0 rows affected (0.06 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> select*from Nonclustered;

| stud_id | stud_Name | stud_Age |
|-------- |---------- |--------- |
|       1 | Swetha    |       17 |
|       2 | Selva     |       19 |
|       3 | Saranya   |       17 |
|       4 | Santhanu  |       19 |
|       5 | Rishi     |       19 |
|       6 | Riyas     |       19 |
|       7 | Jerusheya |       19 |
|       8 | Haiden    |       19 |
|       9 | Aswath    |       17 |
|      10 | Annamalai |       18 |
|      11 | Abisha    |       18 |

11 rows in set (0.00 sec)

mysql> insert into Nonclustered values(0,'Shravan',19);
Query OK, 1 row affected (0.01 sec)

mysql> select*from Nonclustered;

| stud_id | stud_Name | stud_Age |
|-------- |---------- |--------- |
|       0 | Shravan   |       19 |
|       1 | Swetha    |       17 |
|       2 | Selva     |       19 |
|       3 | Saranya   |       17 |
|       4 | Santhanu  |       19 |
|       5 | Rishi     |       19 |
|       6 | Riyas     |       19 |
|       7 | Jerusheya |       19 |
|       8 | Haiden    |       19 |
|       9 | Aswath    |       17 |
|      10 | Annamalai |       18 |
|      11 | Abisha    |       18 |

12 rows in set (0.00 sec)

mysql> delete from Nonclustered where stud_id=0;
Query OK, 1 row affected (0.01 sec)

mysql> select*from Nonclustered;

| stud_id | stud_Name | stud_Age |
|---------|---------- |--------- |
|       1 | Swetha    |       17 |
|       2 | Selva     |       19 |
|       3 | Saranya   |       17 |
|       4 | Santhanu  |       19 |
|       5 | Rishi     |       19 |
|       6 | Riyas     |       19 |
|       7 | Jerusheya |       19 |
|       8 | Haiden    |       19 |
|       9 | Aswath    |       17 |
|      10 | Annamalai |       18 |
|      11 | Abisha    |       18 |

11 rows in set (0.00 sec)

mysql> show index from Nonclustered;

| Table        | Non_unique | Key_name | Seq_in_index | Column_name | Collation | Cardinality | Sub_part | Packed | Null | Index_type | Comment | Index_comment | Visible | Expression |
| ------------ |----------- |--------- |------------- |------------ |---------- |-------------|--------- |------- |----- |----------- |-------- |-------------- |-------- |----------- |
| Nonclustered |          1 | nc_name  |            1 | stud_Name   | A         |          11 |     NULL |   NULL |      | BTREE      |         |               | YES     | NULL       |
| Nonclustered |          1 | nc_id    |            1 | stud_Name   | A         |          11 |     NULL |   NULL |      | BTREE      |         |               | YES     | NULL       |
| Nonclustered |          1 | nc_xid   |            1 | stud_id     | A         |          11 |     NULL |   NULL |      | BTREE      |         |               | YES     | NULL       |
| Nonclustered |          1 | nc_xid   |            2 | stud_Name   | A         |          11 |     NULL |   NULL |      | BTREE      |         |               | YES     | NULL       |
| Nonclustered |          1 | nc_xid   |            3 | stud_Age    | A         |          11 |     NULL |   NULL | YES  | BTREE      |         |               | YES     | NULL       |

5 rows in set (0.02 sec)

mysql> alter table Nonclustered
    -> drop index nc_name;
Query OK, 0 rows affected (0.02 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> alter table Nonclustered drop index nc_id;
Query OK, 0 rows affected (0.02 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> show index from Nonclustered;

| Table        | Non_unique | Key_name | Seq_in_index | Column_name | Collation | Cardinality | Sub_part | Packed | Null | Index_type | Comment | Index_comment | Visible | Expression |
| ------------ |----------- |--------- |------------- |------------ |---------- |------------|--------- |------- |----- |----------- |-------- |-------------- |-------- |----------- |
| Nonclustered |          1 | nc_xid   |            1 | stud_id     | A         |          11 |     NULL |   NULL |      | BTREE      |         |               | YES     | NULL       |
| Nonclustered |          1 | nc_xid   |            2 | stud_Name   | A         |          11 |     NULL |   NULL |      | BTREE      |         |               | YES     | NULL       |
| Nonclustered |          1 | nc_xid   |            3 | stud_Age    | A         |          11 |     NULL |   NULL | YES  | BTREE      |         |               | YES     | NULL       |

3 rows in set (0.00 sec)

mysql> 
