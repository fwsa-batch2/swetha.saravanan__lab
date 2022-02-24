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

mysql> use use mysql;
ERROR 1049 (42000): Unknown database 'use'
mysql> use mysql;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> show tables;

| Tables_in_mysql                                      |
| ---------------------------------------------------- |
| columns_priv                                         |
| component                                            |
| db                                                   |
| default_roles                                        |
| engine_cost                                          |
| func                                                 |
| general_log                                          |
| global_grants                                        |
| gtid_executed                                        |
| help_category                                        |
| help_keyword                                         |
| help_relation                                        |
| help_topic                                           |
| innodb_index_stats                                   |
| innodb_table_stats                                   |
| password_history                                     |
| plugin                                               |
| procs_priv                                           |
| proxies_priv                                         |
| replication_asynchronous_connection_failover         |
| replication_asynchronous_connection_failover_managed |
| replication_group_configuration_version              |
| replication_group_member_actions                     |
| role_edges                                           |
| server_cost                                          |
| servers                                              |
| slave_master_info                                    |
| slave_relay_log_info                                 |
| slave_worker_info                                    |
| slow_log                                             |
| tables_priv                                          |
| time_zone                                            |
| time_zone_leap_second                                |
| time_zone_name                                       |
| time_zone_transition                                 |
| time_zone_transition_type                            |
| user                                                 |

37 rows in set (0.00 sec)

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

mysql> create table studlist (stud_id int primary key, stud_name varchar(20) not null,stud_age int not null,stud_address varchar(20) not null);
Query OK, 0 rows affected (0.04 sec)

mysql> insert into studlist values (1, 'Shravan' , 18,'Delhi') ,(3,'Swetha',17,'TN'),(2,'Ash',17,'AP'),(4,'Shagi',19,'Kujarat'),(5,'Dinesh',21,'Kerala');
Query OK, 5 rows affected (0.01 sec)
Records: 5  Duplicates: 0  Warnings: 0

mysql> alter table studlist rename column stud_address to stud_state;
Query OK, 0 rows affected (0.03 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> select*from studlist;

| stud_id | stud_name | stud_age | stud_state |
|-------- |-----------| ---------| ---------- |
|       1 | Shravan   |       18 | Delhi      |
|       2 | Ash       |       17 | AP         |
|       3 | Swetha    |       17 | TN         |
|       4 | Shagi     |       19 | Kujarat    |
|       5 | Dinesh    |       21 | Kerala     |

5 rows in set (0.00 sec)

mysql> create table studlist_1(stud_id int primary key, stud_name varchar(20) not null,stud_age int not null,stud_state varchar(20) not null);
Query OK, 0 rows affected (0.04 sec)

mysql> insert into studlist_1 values (1, 'Shravan' , 18,'Delhi') ,(6,'Smrithi',17,'Mumbai'),(7,'Zayn',19,'UP'),(8,'Zara',19,'West Bengal'),(9,'Dhilip',21,'Rajasthan');
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

mysql> select studlist.stud_id , studlist_1.stud_name,studlist.stud_age,studlist_1.stud_state from studlist inner join studlist_1  on studlist.stud_id=studlist_1.stud_id;

| stud_id | stud_name | stud_age | stud_state |
|---------|-----------|----------|----------- |
|       1 | Shravan   |       18 | Delhi      |

1 row in set (0.00 sec)

mysql> select studlist.stud_id , studlist_1.stud_name,studlist.stud_age,studlist_1.stud_state from studlist left join studlist_1  on studlist.stud_id=studlist_1.stud_id;

| stud_id | stud_name | stud_age | stud_state |
|---------|-----------|----------|----------- |
|       1 | Shravan   |       18 | Delhi      |
|       2 | NULL      |       17 | NULL       |
|       3 | NULL      |       17 | NULL       |
|       4 | NULL      |       19 | NULL       |
|       5 | NULL      |       21 | NULL       |

5 rows in set (0.01 sec)

mysql> select studlist.stud_id , studlist_1.stud_name,studlist.stud_age,studlist_1.stud_state from studlist right join studlist_1  on studlist.stud_id=studlist_1.stud_id;

| stud_id | stud_name | stud_age | stud_state  |
|---------|-----------|----------|------------ |
|       1 | Shravan   |       18 | Delhi       |
|    NULL | Smrithi   |     NULL | Mumbai      |
|    NULL | Zayn      |     NULL | UP          |
|    NULL | Zara      |     NULL | West Bengal |
|    NULL | Dhilip    |     NULL | Rajasthan   |

5 rows in set (0.00 sec)

mysql> select studlist.stud_id , studlist_1.stud_name,studlist.stud_age,studlist_1.stud_state from studlist cross  join studlist_1;

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

mysql> 

