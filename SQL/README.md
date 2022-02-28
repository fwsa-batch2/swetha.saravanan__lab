# SQL_Queries
Lab excercises
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

mysql> show databases
      
| Database           |
|------------------- |
| Example            |
| blazers            |
| information_schema |
| mysql              |
| performance_schema |
| sys                |

6 rows in set (0.01 sec)

mysql> use Example;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> show tables;

| Tables_in_Example |
| ----------------- |
| Members           |
| booklist          |
| library           |

| id | Name     | Address | Age  |
|--- | -------- |-------- |----- |
|  1 | Swetha   | Madurai |   18 |
|  2 | Karthika | Madurai |   18 |
|  3 | Abi      | Madurai |   18 |
|  3 | Abi      | Madurai |   19 |

4 rows in set (0.00 sec)

mysql> select*from booklist;

| id | Name         | Author     |
|--- |------------- |----------- |
|  1 | Harry potter | JkRowlings |

1 row in set (0.00 sec)

mysql> select*from library;

| id   | place   |
|----- |-------- |
|    1 | Madurai |

1 row in set (0.00 sec)

mysql> use blazers;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> show tables;

| Tables_in_blazers |
| ----------------- |
| example           |
| marks             |
| members           |
| student           |

4 rows in set (0.01 sec)

mysql> select*from example;

| id | Name   |
|--- |------- |
|  1 | Swetha |
|  2 | NULL   |
|  3 | NULL   |

3 rows in set (0.00 sec)

mysql> select*from marks;

| examno | Name   | studno |
|------- |------- |------- |
|      1 | Abisha |      1 |

1 row in set (0.00 sec)

mysql> select*from members;

| SNo  | Name      | Age  | Gender |
|----- |---------- |----- |------- |
|    1 | Abisha    |   19 | Female |
|    2 | Annamalai |   19 | Male   |
|    3 | Aswath    |   18 | Male   |
|    4 | Haiden    |   19 | Male   |
|    5 | Jerusheya |   19 | Female |
|    6 | Rishi     |   19 | Male   |
|    7 | Santhanu  |   19 | Male   |
|    8 | Saranya   |   18 | Female |
|    9 | Riyaz     |   19 | Male   |
|   10 | Selva     |   19 | Male   |
|   11 | Swetha    |   18 | Female |

11 rows in set (0.00 sec)

mysql> select*from student;

| studid | Name      | Age | phone      | Academy | Address      |
|------- |---------- |---- |----------- |-------- |------------- |
|      1 | Abisha    |  19 | 9022334455 | FWSA    | Thirunelveli |
|      2 | Aswath    |  18 | 9022334445 | FWSA    | Chennai      |
|      3 | Annamalai |  19 | 8877669900 | FWSA    | Madurai      |
|      4 | Haiden    |  19 | 9087654321 | FWSA    | Chennai      |
|      5 | Jerusheya |  19 | 9022334435 | FWSA    | Thirunelveli |
|      6 | Rishi     |  19 | 8877669922 | FWSA    | Thirupur     |
|      7 | Riyas     |  19 | 9087654231 | FWSA    | Thirnelveli  |
|      8 | Santhanu  |  19 | 9022334435 | FWSA    | Theni        |
|      9 | Saranya   |  19 | 8877669112 | FWSA    | Thirunelveli |
|     10 | Selva     |  19 | 9083354231 | FWSA    | Chennai      |
|     11 | Swetha    |  18 | 9025336748 | FWSA    | Madurai      |

11 rows in set (0.00 sec)

mysql> select*from students where Address='Thirunelveli';
ERROR 1146 (42S02): Table 'blazers.students' doesn't exist
mysql> select*from student where Address='Thirunelveli';

| studid | Name      | Age | phone      | Academy | Address      |
|------- |---------- |---- |----------- |-------- |------------- |
|      1 | Abisha    |  19 | 9022334455 | FWSA    | Thirunelveli |
|      5 | Jerusheya |  19 | 9022334435 | FWSA    | Thirunelveli |
|      9 | Saranya   |  19 | 8877669112 | FWSA    | Thirunelveli |

3 rows in set (0.00 sec)

mysql> select*from student where Address='Thirunelveli'and Name='Jerusheya';

| studid | Name      | Age | phone      | Academy | Address      |
|------- |---------- |---- |----------- |-------- |------------- |
|      5 | Jerusheya |  19 | 9022334435 | FWSA    | Thirunelveli |

1 row in set (0.00 sec)

mysql> select*from student where Address='Thirunelveli'or Name='Jerusheya';

| studid | Name      | Age | phone      | Academy | Address      |
|------- |---------- |---- |----------- |-------- |------------- |
|      1 | Abisha    |  19 | 9022334455 | FWSA    | Thirunelveli |
|      5 | Jerusheya |  19 | 9022334435 | FWSA    | Thirunelveli |
|      9 | Saranya   |  19 | 8877669112 | FWSA    | Thirunelveli |

3 rows in set (0.00 sec)

mysql> select*from student where not Address='Thirunelveli';

| studid | Name      | Age | phone      | Academy | Address     |
|------- |---------- |---- |----------- |-------- |------------ |
|      2 | Aswath    |  18 | 9022334445 | FWSA    | Chennai     |
|      3 | Annamalai |  19 | 8877669900 | FWSA    | Madurai     |
|      4 | Haiden    |  19 | 9087654321 | FWSA    | Chennai     |
|      6 | Rishi     |  19 | 8877669922 | FWSA    | Thirupur    |
|      7 | Riyas     |  19 | 9087654231 | FWSA    | Thirnelveli |
|      8 | Santhanu  |  19 | 9022334435 | FWSA    | Theni       |
|     10 | Selva     |  19 | 9083354231 | FWSA    | Chennai     |
|     11 | Swetha    |  18 | 9025336748 | FWSA    | Madurai     |

8 rows in set (0.00 sec)

mysql> select*from student where not Age=19;

| studid | Name   | Age | phone      | Academy | Address |
|------- |------- |---- |----------- |-------- |-------- |
|      2 | Aswath |  18 | 9022334445 | FWSA    | Chennai |
|     11 | Swetha |  18 | 9025336748 | FWSA    | Madurai |

2 rows in set (0.00 sec)

mysql> select*from student where Age=19;

| studid | Name      | Age | phone      | Academy | Address      |
|------- |---------- |---- |----------- |-------- |------------- |
|      1 | Abisha    |  19 | 9022334455 | FWSA    | Thirunelveli |
|      3 | Annamalai |  19 | 8877669900 | FWSA    | Madurai      |
|      4 | Haiden    |  19 | 9087654321 | FWSA    | Chennai      |
|      5 | Jerusheya |  19 | 9022334435 | FWSA    | Thirunelveli |
|      6 | Rishi     |  19 | 8877669922 | FWSA    | Thirupur     |
|      7 | Riyas     |  19 | 9087654231 | FWSA    | Thirnelveli  |
|      8 | Santhanu  |  19 | 9022334435 | FWSA    | Theni        |
|      9 | Saranya   |  19 | 8877669112 | FWSA    | Thirunelveli |
|     10 | Selva     |  19 | 9083354231 | FWSA    | Chennai      |

9 rows in set (0.00 sec)

mysql> select*from student order by Name desc;

| studid | Name      | Age | phone      | Academy | Address      |
|------- |---------- |---- |----------- |-------- |------------- |
|     11 | Swetha    |  18 | 9025336748 | FWSA    | Madurai      |
|     10 | Selva     |  19 | 9083354231 | FWSA    | Chennai      |
|      9 | Saranya   |  19 | 8877669112 | FWSA    | Thirunelveli |
|      8 | Santhanu  |  19 | 9022334435 | FWSA    | Theni        |
|      7 | Riyas     |  19 | 9087654231 | FWSA    | Thirnelveli  |
|      6 | Rishi     |  19 | 8877669922 | FWSA    | Thirupur     |
|      5 | Jerusheya |  19 | 9022334435 | FWSA    | Thirunelveli |
|      4 | Haiden    |  19 | 9087654321 | FWSA    | Chennai      |
|      2 | Aswath    |  18 | 9022334445 | FWSA    | Chennai      |
|      3 | Annamalai |  19 | 8877669900 | FWSA    | Madurai      |
|      1 | Abisha    |  19 | 9022334455 | FWSA    | Thirunelveli |

11 rows in set (0.00 sec)

mysql> select*from student order by Name asc;

| studid | Name      | Age | phone      | Academy | Address      |
|------- |---------- |---- |----------- |-------- |------------- |
|      1 | Abisha    |  19 | 9022334455 | FWSA    | Thirunelveli |
|      3 | Annamalai |  19 | 8877669900 | FWSA    | Madurai      |
|      2 | Aswath    |  18 | 9022334445 | FWSA    | Chennai      |
|      4 | Haiden    |  19 | 9087654321 | FWSA    | Chennai      |
|      5 | Jerusheya |  19 | 9022334435 | FWSA    | Thirunelveli |
|      6 | Rishi     |  19 | 8877669922 | FWSA    | Thirupur     |
|      7 | Riyas     |  19 | 9087654231 | FWSA    | Thirnelveli  |
|      8 | Santhanu  |  19 | 9022334435 | FWSA    | Theni        |
|      9 | Saranya   |  19 | 8877669112 | FWSA    | Thirunelveli |
|     10 | Selva     |  19 | 9083354231 | FWSA    | Chennai      |
|     11 | Swetha    |  18 | 9025336748 | FWSA    | Madurai      |

11 rows in set (0.00 sec)

mysql> select*from student order by phone  asc;

| studid | Name      | Age | phone      | Academy | Address      |
|------- |---------- |---- |----------- |-------- |------------- |
|      9 | Saranya   |  19 | 8877669112 | FWSA    | Thirunelveli |
|      3 | Annamalai |  19 | 8877669900 | FWSA    | Madurai      |
|      6 | Rishi     |  19 | 8877669922 | FWSA    | Thirupur     |
|      5 | Jerusheya |  19 | 9022334435 | FWSA    | Thirunelveli |
|      8 | Santhanu  |  19 | 9022334435 | FWSA    | Theni        |
|      2 | Aswath    |  18 | 9022334445 | FWSA    | Chennai      |
|      1 | Abisha    |  19 | 9022334455 | FWSA    | Thirunelveli |
|     11 | Swetha    |  18 | 9025336748 | FWSA    | Madurai      |
|     10 | Selva     |  19 | 9083354231 | FWSA    | Chennai      |
|      7 | Riyas     |  19 | 9087654231 | FWSA    | Thirnelveli  |
|      4 | Haiden    |  19 | 9087654321 | FWSA    | Chennai      |

11 rows in set (0.00 sec)

mysql> select*from student order by phone desc;

| studid | Name      | Age | phone      | Academy | Address      |
|------- |---------- |---- |----------- |-------- |------------- |
|      4 | Haiden    |  19 | 9087654321 | FWSA    | Chennai      |
|      7 | Riyas     |  19 | 9087654231 | FWSA    | Thirnelveli  |
|     10 | Selva     |  19 | 9083354231 | FWSA    | Chennai      |
|     11 | Swetha    |  18 | 9025336748 | FWSA    | Madurai      |
|      1 | Abisha    |  19 | 9022334455 | FWSA    | Thirunelveli |
|      2 | Aswath    |  18 | 9022334445 | FWSA    | Chennai      |
|      5 | Jerusheya |  19 | 9022334435 | FWSA    | Thirunelveli |
|      8 | Santhanu  |  19 | 9022334435 | FWSA    | Theni        |
|      6 | Rishi     |  19 | 8877669922 | FWSA    | Thirupur     |
|      3 | Annamalai |  19 | 8877669900 | FWSA    | Madurai      |
|      9 | Saranya   |  19 | 8877669112 | FWSA    | Thirunelveli |

11 rows in set (0.00 sec)

mysql> select*from student order by Address asc;

| studid | Name      | Age | phone      | Academy | Address      |
|------- |---------- |---- |----------- |-------- |------------- |
|      2 | Aswath    |  18 | 9022334445 | FWSA    | Chennai      |
|      4 | Haiden    |  19 | 9087654321 | FWSA    | Chennai      |
|     10 | Selva     |  19 | 9083354231 | FWSA    | Chennai      |
|      3 | Annamalai |  19 | 8877669900 | FWSA    | Madurai      |
|     11 | Swetha    |  18 | 9025336748 | FWSA    | Madurai      |
|      8 | Santhanu  |  19 | 9022334435 | FWSA    | Theni        |
|      7 | Riyas     |  19 | 9087654231 | FWSA    | Thirnelveli  |
|      1 | Abisha    |  19 | 9022334455 | FWSA    | Thirunelveli |
|      5 | Jerusheya |  19 | 9022334435 | FWSA    | Thirunelveli |
|      9 | Saranya   |  19 | 8877669112 | FWSA    | Thirunelveli |
|      6 | Rishi     |  19 | 8877669922 | FWSA    | Thirupur     |

11 rows in set (0.00 sec)

mysql> select*from student order by Address desc;

| studid | Name      | Age | phone      | Academy | Address      |
|------- |---------- |---- |----------- |-------- |------------- |
|      6 | Rishi     |  19 | 8877669922 | FWSA    | Thirupur     |
|      1 | Abisha    |  19 | 9022334455 | FWSA    | Thirunelveli |
|      5 | Jerusheya |  19 | 9022334435 | FWSA    | Thirunelveli |
|      9 | Saranya   |  19 | 8877669112 | FWSA    | Thirunelveli |
|      7 | Riyas     |  19 | 9087654231 | FWSA    | Thirnelveli  |
|      8 | Santhanu  |  19 | 9022334435 | FWSA    | Theni        |
|      3 | Annamalai |  19 | 8877669900 | FWSA    | Madurai      |
|     11 | Swetha    |  18 | 9025336748 | FWSA    | Madurai      |
|      2 | Aswath    |  18 | 9022334445 | FWSA    | Chennai      |
|      4 | Haiden    |  19 | 9087654321 | FWSA    | Chennai      |
|     10 | Selva     |  19 | 9083354231 | FWSA    | Chennai      |

11 rows in set (0.00 sec)

mysql> select*from student;

| studid | Name      | Age | phone      | Academy | Address      |
|------- |---------- |---- |----------- |-------- |------------- |
|      1 | Abisha    |  19 | 9022334455 | FWSA    | Thirunelveli |
|      2 | Aswath    |  18 | 9022334445 | FWSA    | Chennai      |
|      3 | Annamalai |  19 | 8877669900 | FWSA    | Madurai      |
|      4 | Haiden    |  19 | 9087654321 | FWSA    | Chennai      |
|      5 | Jerusheya |  19 | 9022334435 | FWSA    | Thirunelveli |
|      6 | Rishi     |  19 | 8877669922 | FWSA    | Thirupur     |
|      7 | Riyas     |  19 | 9087654231 | FWSA    | Thirnelveli  |
|      8 | Santhanu  |  19 | 9022334435 | FWSA    | Theni        |
|      9 | Saranya   |  19 | 8877669112 | FWSA    | Thirunelveli |
|     10 | Selva     |  19 | 9083354231 | FWSA    | Chennai      |
|     11 | Swetha    |  18 | 9025336748 | FWSA    | Madurai      |

11 rows in set (0.00 sec)

mysql> alter table student
    -> modify Academy varchar(20);
Query OK, 0 rows affected (0.02 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> select*from student;

| studid | Name      | Age | phone      | Academy | Address      |
|------- |---------- |---- |----------- |-------- |------------- |
|      1 | Abisha    |  19 | 9022334455 | FWSA    | Thirunelveli |
|      2 | Aswath    |  18 | 9022334445 | FWSA    | Chennai      |
|      3 | Annamalai |  19 | 8877669900 | FWSA    | Madurai      |
|      4 | Haiden    |  19 | 9087654321 | FWSA    | Chennai      |
|      5 | Jerusheya |  19 | 9022334435 | FWSA    | Thirunelveli |
|      6 | Rishi     |  19 | 8877669922 | FWSA    | Thirupur     |
|      7 | Riyas     |  19 | 9087654231 | FWSA    | Thirnelveli  |
|      8 | Santhanu  |  19 | 9022334435 | FWSA    | Theni        |
|      9 | Saranya   |  19 | 8877669112 | FWSA    | Thirunelveli |
|     10 | Selva     |  19 | 9083354231 | FWSA    | Chennai      |
|     11 | Swetha    |  18 | 9025336748 | FWSA    | Madurai      |

11 rows in set (0.00 sec)

mysql> alter table student modify Academy default 'FWSA';
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'default 'FWSA'' at line 1
mysql> alter table student modify Academy varchar(20)  default 'FWSA';
Query OK, 0 rows affected (0.04 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> alter table student
    -> add Language varchar(20) not null;
Query OK, 0 rows affected (0.04 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> select*from student;

| studid | Name      | Age | phone      | Academy | Address      | Language |
|------- |---------- |---- |----------- |-------- |------------- |--------- |
|      1 | Abisha    |  19 | 9022334455 | FWSA    | Thirunelveli |          |
|      2 | Aswath    |  18 | 9022334445 | FWSA    | Chennai      |          |
|      3 | Annamalai |  19 | 8877669900 | FWSA    | Madurai      |          |
|      4 | Haiden    |  19 | 9087654321 | FWSA    | Chennai      |          |
|      5 | Jerusheya |  19 | 9022334435 | FWSA    | Thirunelveli |          |
|      6 | Rishi     |  19 | 8877669922 | FWSA    | Thirupur     |          |
|      7 | Riyas     |  19 | 9087654231 | FWSA    | Thirnelveli  |          |
|      8 | Santhanu  |  19 | 9022334435 | FWSA    | Theni        |          |
|      9 | Saranya   |  19 | 8877669112 | FWSA    | Thirunelveli |          |
|     10 | Selva     |  19 | 9083354231 | FWSA    | Chennai      |          |
|     11 | Swetha    |  18 | 9025336748 | FWSA    | Madurai      |          |

11 rows in set (0.00 sec)

mysql> update student
    -> set Language='English'
    -> where studid=1;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select*from student;

| studid | Name      | Age | phone      | Academy | Address      | Language |
|------- |---------- |---- |----------- |-------- |------------- |--------- |
|      1 | Abisha    |  19 | 9022334455 | FWSA    | Thirunelveli | English  |
|      2 | Aswath    |  18 | 9022334445 | FWSA    | Chennai      |          |
|      3 | Annamalai |  19 | 8877669900 | FWSA    | Madurai      |          |
|      4 | Haiden    |  19 | 9087654321 | FWSA    | Chennai      |          |
|      5 | Jerusheya |  19 | 9022334435 | FWSA    | Thirunelveli |          |
|      6 | Rishi     |  19 | 8877669922 | FWSA    | Thirupur     |          |
|      7 | Riyas     |  19 | 9087654231 | FWSA    | Thirnelveli  |          |
|      8 | Santhanu  |  19 | 9022334435 | FWSA    | Theni        |          |
|      9 | Saranya   |  19 | 8877669112 | FWSA    | Thirunelveli |          |
|     10 | Selva     |  19 | 9083354231 | FWSA    | Chennai      |          |
|     11 | Swetha    |  18 | 9025336748 | FWSA    | Madurai      |          |

11 rows in set (0.01 sec)

mysql> update student set Language='Tamil' where studid=2;
Query OK, 1 row affected (0.00 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update student set Language='Malayalam' where studid=3;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update student set Language='Spanish' where studid=4;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update student set Language='Telungu' where studid=5;
Query OK, 1 row affected (0.00 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update student set Language='Urdhu' where studid=6;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update student set Language='Bengali' where studid=7;
Query OK, 1 row affected (0.00 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update student set Language='French' where studid=8;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update student set Language='Arabic' where studid=9;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update student set Language='Russian' where studid=10;
Query OK, 1 row affected (0.00 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update student set Language='Hindi' where studid=11;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select*from student;

| studid | Name      | Age | phone      | Academy | Address      | Language  |
|------- |---------- |---- |----------- |-------- |------------- |---------- |
|      1 | Abisha    |  19 | 9022334455 | FWSA    | Thirunelveli | English   |
|      2 | Aswath    |  18 | 9022334445 | FWSA    | Chennai      | Tamil     |
|      3 | Annamalai |  19 | 8877669900 | FWSA    | Madurai      | Malayalam |
|      4 | Haiden    |  19 | 9087654321 | FWSA    | Chennai      | Spanish   |
|      5 | Jerusheya |  19 | 9022334435 | FWSA    | Thirunelveli | Telungu   |
|      6 | Rishi     |  19 | 8877669922 | FWSA    | Thirupur     | Urdhu     |
|      7 | Riyas     |  19 | 9087654231 | FWSA    | Thirnelveli  | Bengali   |
|      8 | Santhanu  |  19 | 9022334435 | FWSA    | Theni        | French    |
|      9 | Saranya   |  19 | 8877669112 | FWSA    | Thirunelveli | Arabic    |
|     10 | Selva     |  19 | 9083354231 | FWSA    | Chennai      | Russian   |
|     11 | Swetha    |  18 | 9025336748 | FWSA    | Madurai      | Hindi     |

11 rows in set (0.00 sec)

mysql> select count(Age) from student;

| count(Age) |
|----------- |
|         11 |

1 row in set (0.00 sec)

mysql> select avg(Age) from student;

| avg(Age) |
|--------- |
|  18.8182 |

1 row in set (0.00 sec)

mysql> select max(Age) from student;

| max(Age) |
|--------- |
|       19 |

1 row in set (0.00 sec)

mysql> select min(Age) from student;

| min(Age) |
|--------- |
|       18 |

1 row in set (0.00 sec)

mysql> select sum(Age) from student;

| sum(Age) |
|--------- |
|      207 |

1 row in set (0.00 sec)

mysql> select Name from student where like 'Ab';
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'like 'Ab'' at line 1
mysql> select Name from student where Name like 'Ab';
Empty set (0.00 sec)

mysql> select* from student where Name like 'Abisha';

| studid | Name   | Age | phone      | Academy | Address      | Language |
|------- |------- |---- |----------- |-------- |------------- |--------- |
|      1 | Abisha |  19 | 9022334455 | FWSA    | Thirunelveli | English  |

1 row in set (0.00 sec)

mysql> select* from student where Name like 'Ri';
Empty set (0.00 sec)

mysql> select* from student where Name like 'Ris';
Empty set (0.00 sec)

mysql> select* from student where Name like 'Ri%';

| studid | Name  | Age | phone      | Academy | Address     | Language |
|------- |------ |---- |----------- |-------- |------------ |--------- |
|      6 | Rishi |  19 | 8877669922 | FWSA    | Thirupur    | Urdhu    |
|      7 | Riyas |  19 | 9087654231 | FWSA    | Thirnelveli | Bengali  |

2 rows in set (0.00 sec)

mysql> select* from student where Name like 'sa%';

| studid | Name     | Age | phone      | Academy | Address      | Language |
|------- |--------- |---- |----------- |-------- |------------- |--------- |
|      8 | Santhanu |  19 | 9022334435 | FWSA    | Theni        | French   |
|      9 | Saranya  |  19 | 8877669112 | FWSA    | Thirunelveli | Arabic   |

2 rows in set (0.00 sec)

mysql> select* from student where Name like '%tha';

| studid | Name   | Age | phone      | Academy | Address | Language |
|------- |------- |---- |----------- |-------- |-------- |--------- |
|     11 | Swetha |  18 | 9025336748 | FWSA    | Madurai | Hindi    |

1 row in set (0.00 sec)

mysql> select* from student where Name like '%a';

| studid | Name      | Age | phone      | Academy | Address      | Language |
|------- |---------- |---- |----------- |-------- |------------- |--------- |
|      1 | Abisha    |  19 | 9022334455 | FWSA    | Thirunelveli | English  |
|      5 | Jerusheya |  19 | 9022334435 | FWSA    | Thirunelveli | Telungu  |
|      9 | Saranya   |  19 | 8877669112 | FWSA    | Thirunelveli | Arabic   |
|     10 | Selva     |  19 | 9083354231 | FWSA    | Chennai      | Russian  |
|     11 | Swetha    |  18 | 9025336748 | FWSA    | Madurai      | Hindi    |

5 rows in set (0.00 sec)

mysql> select* from student where Name like '%u';

| studid | Name     | Age | phone      | Academy | Address | Language |
|------- |--------- |---- |----------- |-------- |-------- |--------- |
|      8 | Santhanu |  19 | 9022334435 | FWSA    | Theni   | French   |

1 row in set (0.00 sec)

mysql> select* from student where Name like '%i';

| studid | Name      | Age | phone      | Academy | Address  | Language  |
|------- |---------- |---- |----------- |-------- |--------- |---------- |
|      3 | Annamalai |  19 | 8877669900 | FWSA    | Madurai  | Malayalam |
|      6 | Rishi     |  19 | 8877669922 | FWSA    | Thirupur | Urdhu     |

2 rows in set (0.00 sec)

mysql> select* from student where Name like '%z';
Empty set (0.00 sec)

mysql> select* from student where Name like '%s';

| studid | Name  | Age | phone      | Academy | Address     | Language |
|------- |------ |---- |----------- |-------- |------------ |--------- |
|      7 | Riyas |  19 | 9087654231 | FWSA    | Thirnelveli | Bengali  |

1 row in set (0.00 sec)

