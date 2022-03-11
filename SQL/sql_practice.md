### show databases
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
```
create database sql_practice;
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
| sql_practice       |
| subqueries         |
| sys                |
| views              |
```
use sql_practice;
```
### Write a SQL statement to create a simple table countries including columns country_id,country_name and region_id.
```
create table countries(country_id int,country_name varchar(20),region_id int);
```
### Write a SQL statement to create a simple table countries including columns country_id,country_name and region_id which is already exists.
```
create table if not exists countries(country_id int,country_name varchar(20),region_id int);
```

### Write a SQL statement to create the structure of a table dup_countries similar to countries
```
create table if not exists dup_countries like countries;
```
```
show tables;
```

| Tables_in_sql_practice |
|------------------------|
| countries              |
| dup_countries          |
### Write a SQL statement to create a duplicate copy of countries table including structure and data by name dup_countries. 
```
create table if not exists dup_countries1 as select*from countries;
```
```
show tables;
```

| Tables_in_sql_practice |
|------------------------|
| countries              |
| dup_countries          |
| dup_countries1         |
+------------------------+


```
select*from dup_countries1;
```

| country_id | country_name | region_id |
|------------|--------------|-----------|
|          1 | America      |         1 |

