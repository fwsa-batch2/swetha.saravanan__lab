## SQL INDEXES
# Display Databases
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
# Using DB
```Using DB
use blazers;
```
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
# Display tables
```Display tables
show tables;
```

| Tables_in_blazers |
| ----------------- |
| marklist          |
| marks             |
| members           |
| student           |

4 rows in set (0.00 sec)
# Using DB
```Using DB
use Example;
```
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
# Display tables
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
# Extract data from Nonclustered
```Extract data from Nonclustered
select*from Nonclustered;
```

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
# Creating an index
```Creating an index
create index nc_xid on Nonclustered(stud_id,stud_Name, stud_Age);
```
Query OK, 0 rows affected (0.06 sec)
Records: 0  Duplicates: 0  Warnings: 0
# `Retrive data
```Retrive data
select*from Nonclustered;
```

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
# Insert values
```Insert values
insert into Nonclustered values(0,'Shravan',19);
```
Query OK, 1 row affected (0.01 sec)
```Extract data
select*from Nonclustered;
```

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
# Delete
```deleting
delete from Nonclustered where stud_id=0;
```
Query OK, 1 row affected (0.01 sec)
# Extract data
```Extract data
select*from Nonclustered;
```

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
# List out the index
```List out the index
show index from Nonclustered;
```

| Table        | Non_unique | Key_name | Seq_in_index | Column_name | Collation | Cardinality | Sub_part | Packed | Null | Index_type | Comment | Index_comment | Visible | Expression |
| ------------ |----------- |--------- |------------- |------------ |---------- |-------------|--------- |------- |----- |----------- |-------- |-------------- |-------- |----------- |
| Nonclustered |          1 | nc_name  |            1 | stud_Name   | A         |          11 |     NULL |   NULL |      | BTREE      |         |               | YES     | NULL       |
| Nonclustered |          1 | nc_id    |            1 | stud_Name   | A         |          11 |     NULL |   NULL |      | BTREE      |         |               | YES     | NULL       |
| Nonclustered |          1 | nc_xid   |            1 | stud_id     | A         |          11 |     NULL |   NULL |      | BTREE      |         |               | YES     | NULL       |
| Nonclustered |          1 | nc_xid   |            2 | stud_Name   | A         |          11 |     NULL |   NULL |      | BTREE      |         |               | YES     | NULL       |
| Nonclustered |          1 | nc_xid   |            3 | stud_Age    | A         |          11 |     NULL |   NULL | YES  | BTREE      |         |               | YES     | NULL       |

5 rows in set (0.02 sec)
# Drop an index
```Drop an index
alter table Nonclustered drop index nc_name;
```
Query OK, 0 rows affected (0.02 sec)
Records: 0  Duplicates: 0  Warnings: 0
# Drop another index
```Drop another index
alter table Nonclustered drop index nc_id;
```
Query OK, 0 rows affected (0.02 sec)
Records: 0  Duplicates: 0  Warnings: 0
# List out the index
```List out the index
show index from Nonclustered;
```
| Table        | Non_unique | Key_name | Seq_in_index | Column_name | Collation | Cardinality | Sub_part | Packed | Null | Index_type | Comment | Index_comment | Visible | Expression |
| ------------ |----------- |--------- |------------- |------------ |---------- |------------|--------- |------- |----- |----------- |-------- |-------------- |-------- |----------- |
| Nonclustered |          1 | nc_xid   |            1 | stud_id     | A         |          11 |     NULL |   NULL |      | BTREE      |         |               | YES     | NULL       |
| Nonclustered |          1 | nc_xid   |            2 | stud_Name   | A         |          11 |     NULL |   NULL |      | BTREE      |         |               | YES     | NULL       |
| Nonclustered |          1 | nc_xid   |            3 | stud_Age    | A         |          11 |     NULL |   NULL | YES  | BTREE      |         |               | YES     | NULL       |

3 rows in set (0.00 sec)


