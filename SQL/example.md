 sudo -u root mysql;
[sudo] password for swetham: 
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 8
Server version: 8.0.28 MySQL Community Server - GPL

Copyright (c) 2000, 2022, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| Academy            |
| Example            |
| FANTASTIC_JOURNEYS |
| blazers            |
| information_schema |
| lab                |
| mysql              |
| performance_schema |
| sql_practice       |
| subqueries         |
| sys                |
| views              |
+--------------------+
12 rows in set (0.02 sec)

mysql> use FANTASTIC_JOURNEYS;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> SHOW TABLES;
+------------------------------+
| Tables_in_FANTASTIC_JOURNEYS |
+------------------------------+
| Booking                      |
| Contact                      |
| Payments                     |
| Plan_trip                    |
| Reviews                      |
| Roles                        |
| Status                       |
| User                         |
| User_login                   |
+------------------------------+
9 rows in set (0.00 sec)

mysql> desc Roles;
+---------+--------------+------+-----+---------+----------------+
| Field   | Type         | Null | Key | Default | Extra          |
+---------+--------------+------+-----+---------+----------------+
| Role_id | int          | NO   | PRI | NULL    | auto_increment |
| user_id | int          | NO   | MUL | NULL    |                |
| Role    | varchar(100) | NO   |     | NULL    |                |
+---------+--------------+------+-----+---------+----------------+
3 rows in set (0.01 sec)

mysql> alter table Roles drop column user_id;
ERROR 1828 (HY000): Cannot drop column 'user_id': needed in a foreign key constraint 'Roles_ibfk_1'
mysql> alter table Roles drop foreign key 'Roles_ibfk_1';
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''Roles_ibfk_1'' at line 1
mysql> alter table Roles drop constraint 'Roles_ibfk_1';
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''Roles_ibfk_1'' at line 1
mysql> alter table Roles drop constraints 'Roles_ibfk_1';
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''Roles_ibfk_1'' at line 1
mysql> alter table Roles drop constraint 'Roles_ibfk_1';
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''Roles_ibfk_1'' at line 1
mysql> alter table Roles drop constraint 'Roles_ibfk_1';
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''Roles_ibfk_1'' at line 1
mysql> alter table Roles drop constraint user_id;
ERROR 3940 (HY000): Constraint 'user_id' does not exist.
mysql> alter table Status drop constraint 'Roles_ibfk_1';
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''Roles_ibfk_1'' at line 1
mysql> alter table User drop constraint 'Roles_ibfk_1';
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''Roles_ibfk_1'' at line 1
mysql> alter table User drop constraint 'Roles_ibfk_1';
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''Roles_ibfk_1'' at line 1
mysql> use information_schema;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> show tables;
+---------------------------------------+
| Tables_in_information_schema          |
+---------------------------------------+
| ADMINISTRABLE_ROLE_AUTHORIZATIONS     |
| APPLICABLE_ROLES                      |
| CHARACTER_SETS                        |
| CHECK_CONSTRAINTS                     |
| COLLATIONS                            |
| COLLATION_CHARACTER_SET_APPLICABILITY |
| COLUMNS                               |
| COLUMNS_EXTENSIONS                    |
| COLUMN_PRIVILEGES                     |
| COLUMN_STATISTICS                     |
| ENABLED_ROLES                         |
| ENGINES                               |
| EVENTS                                |
| FILES                                 |
| INNODB_BUFFER_PAGE                    |
| INNODB_BUFFER_PAGE_LRU                |
| INNODB_BUFFER_POOL_STATS              |
| INNODB_CACHED_INDEXES                 |
| INNODB_CMP                            |
| INNODB_CMPMEM                         |
| INNODB_CMPMEM_RESET                   |
| INNODB_CMP_PER_INDEX                  |
| INNODB_CMP_PER_INDEX_RESET            |
| INNODB_CMP_RESET                      |
| INNODB_COLUMNS                        |
| INNODB_DATAFILES                      |
| INNODB_FIELDS                         |
| INNODB_FOREIGN                        |
| INNODB_FOREIGN_COLS                   |
| INNODB_FT_BEING_DELETED               |
| INNODB_FT_CONFIG                      |
| INNODB_FT_DEFAULT_STOPWORD            |
| INNODB_FT_DELETED                     |
| INNODB_FT_INDEX_CACHE                 |
| INNODB_FT_INDEX_TABLE                 |
| INNODB_INDEXES                        |
| INNODB_METRICS                        |
| INNODB_SESSION_TEMP_TABLESPACES       |
| INNODB_TABLES                         |
| INNODB_TABLESPACES                    |
| INNODB_TABLESPACES_BRIEF              |
| INNODB_TABLESTATS                     |
| INNODB_TEMP_TABLE_INFO                |
| INNODB_TRX                            |
| INNODB_VIRTUAL                        |
| KEYWORDS                              |
| KEY_COLUMN_USAGE                      |
| OPTIMIZER_TRACE                       |
| PARAMETERS                            |
| PARTITIONS                            |
| PLUGINS                               |
| PROCESSLIST                           |
| PROFILING                             |
| REFERENTIAL_CONSTRAINTS               |
| RESOURCE_GROUPS                       |
| ROLE_COLUMN_GRANTS                    |
| ROLE_ROUTINE_GRANTS                   |
| ROLE_TABLE_GRANTS                     |
| ROUTINES                              |
| SCHEMATA                              |
| SCHEMATA_EXTENSIONS                   |
| SCHEMA_PRIVILEGES                     |
| STATISTICS                            |
| ST_GEOMETRY_COLUMNS                   |
| ST_SPATIAL_REFERENCE_SYSTEMS          |
| ST_UNITS_OF_MEASURE                   |
| TABLES                                |
| TABLESPACES                           |
| TABLESPACES_EXTENSIONS                |
| TABLES_EXTENSIONS                     |
| TABLE_CONSTRAINTS                     |
| TABLE_CONSTRAINTS_EXTENSIONS          |
| TABLE_PRIVILEGES                      |
| TRIGGERS                              |
| USER_ATTRIBUTES                       |
| USER_PRIVILEGES                       |
| VIEWS                                 |
| VIEW_ROUTINE_USAGE                    |
| VIEW_TABLE_USAGE                      |
+---------------------------------------+
79 rows in set (0.00 sec)

mysql> select*from TABLE_CONSTRAINTS;
+--------------------+--------------------+----------------------+--------------------+------------------------------------------------------+-----------------+----------+
| CONSTRAINT_CATALOG | CONSTRAINT_SCHEMA  | CONSTRAINT_NAME      | TABLE_SCHEMA       | TABLE_NAME                                           | CONSTRAINT_TYPE | ENFORCED |
+--------------------+--------------------+----------------------+--------------------+------------------------------------------------------+-----------------+----------+
| def                | mysql              | PRIMARY              | mysql              | innodb_table_stats                                   | PRIMARY KEY     | YES      |
| def                | mysql              | PRIMARY              | mysql              | innodb_index_stats                                   | PRIMARY KEY     | YES      |
| def                | mysql              | PRIMARY              | mysql              | replication_group_configuration_version              | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | cond_instances                                       | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | error_log                                            | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | events_waits_current                                 | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | events_waits_history                                 | PRIMARY KEY     | YES      |
| def                | performance_schema | HOST                 | performance_schema | events_waits_summary_by_host_by_event_name           | UNIQUE          | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | events_waits_summary_by_instance                     | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | events_waits_summary_by_thread_by_event_name         | PRIMARY KEY     | YES      |
| def                | performance_schema | USER                 | performance_schema | events_waits_summary_by_user_by_event_name           | UNIQUE          | YES      |
| def                | performance_schema | ACCOUNT              | performance_schema | events_waits_summary_by_account_by_event_name        | UNIQUE          | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | events_waits_summary_global_by_event_name            | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | file_instances                                       | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | file_summary_by_event_name                           | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | file_summary_by_instance                             | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | host_cache                                           | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | mutex_instances                                      | PRIMARY KEY     | YES      |
| def                | performance_schema | OBJECT               | performance_schema | objects_summary_global_by_type                       | UNIQUE          | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | processlist                                          | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | rwlock_instances                                     | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | setup_actors                                         | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | setup_consumers                                      | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | setup_instruments                                    | PRIMARY KEY     | YES      |
| def                | performance_schema | OBJECT               | performance_schema | setup_objects                                        | UNIQUE          | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | setup_threads                                        | PRIMARY KEY     | YES      |
| def                | performance_schema | OBJECT               | performance_schema | table_io_waits_summary_by_index_usage                | UNIQUE          | YES      |
| def                | performance_schema | OBJECT               | performance_schema | table_io_waits_summary_by_table                      | UNIQUE          | YES      |
| def                | performance_schema | OBJECT               | performance_schema | table_lock_waits_summary_by_table                    | UNIQUE          | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | threads                                              | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | events_stages_current                                | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | events_stages_history                                | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | events_stages_summary_by_thread_by_event_name        | PRIMARY KEY     | YES      |
| def                | performance_schema | ACCOUNT              | performance_schema | events_stages_summary_by_account_by_event_name       | UNIQUE          | YES      |
| def                | performance_schema | USER                 | performance_schema | events_stages_summary_by_user_by_event_name          | UNIQUE          | YES      |
| def                | performance_schema | HOST                 | performance_schema | events_stages_summary_by_host_by_event_name          | UNIQUE          | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | events_stages_summary_global_by_event_name           | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | events_statements_current                            | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | events_statements_history                            | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | events_statements_summary_by_thread_by_event_name    | PRIMARY KEY     | YES      |
| def                | performance_schema | ACCOUNT              | performance_schema | events_statements_summary_by_account_by_event_name   | UNIQUE          | YES      |
| def                | performance_schema | USER                 | performance_schema | events_statements_summary_by_user_by_event_name      | UNIQUE          | YES      |
| def                | performance_schema | HOST                 | performance_schema | events_statements_summary_by_host_by_event_name      | UNIQUE          | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | events_statements_summary_global_by_event_name       | PRIMARY KEY     | YES      |
| def                | performance_schema | SCHEMA_NAME          | performance_schema | events_statements_summary_by_digest                  | UNIQUE          | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | events_statements_summary_by_program                 | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | events_statements_histogram_global                   | PRIMARY KEY     | YES      |
| def                | performance_schema | SCHEMA_NAME          | performance_schema | events_statements_histogram_by_digest                | UNIQUE          | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | events_transactions_current                          | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | events_transactions_history                          | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | events_transactions_summary_by_thread_by_event_name  | PRIMARY KEY     | YES      |
| def                | performance_schema | ACCOUNT              | performance_schema | events_transactions_summary_by_account_by_event_name | UNIQUE          | YES      |
| def                | performance_schema | USER                 | performance_schema | events_transactions_summary_by_user_by_event_name    | UNIQUE          | YES      |
| def                | performance_schema | HOST                 | performance_schema | events_transactions_summary_by_host_by_event_name    | UNIQUE          | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | events_transactions_summary_global_by_event_name     | PRIMARY KEY     | YES      |
| def                | performance_schema | USER                 | performance_schema | events_errors_summary_by_user_by_error               | UNIQUE          | YES      |
| def                | performance_schema | HOST                 | performance_schema | events_errors_summary_by_host_by_error               | UNIQUE          | YES      |
| def                | performance_schema | ACCOUNT              | performance_schema | events_errors_summary_by_account_by_error            | UNIQUE          | YES      |
| def                | performance_schema | THREAD_ID            | performance_schema | events_errors_summary_by_thread_by_error             | UNIQUE          | YES      |
| def                | performance_schema | ERROR_NUMBER         | performance_schema | events_errors_summary_global_by_error                | UNIQUE          | YES      |
| def                | performance_schema | USER                 | performance_schema | users                                                | UNIQUE          | YES      |
| def                | performance_schema | ACCOUNT              | performance_schema | accounts                                             | UNIQUE          | YES      |
| def                | performance_schema | HOST                 | performance_schema | hosts                                                | UNIQUE          | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | socket_instances                                     | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | socket_summary_by_instance                           | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | socket_summary_by_event_name                         | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | session_connect_attrs                                | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | session_account_connect_attrs                        | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | memory_summary_global_by_event_name                  | PRIMARY KEY     | YES      |
| def                | performance_schema | ACCOUNT              | performance_schema | memory_summary_by_account_by_event_name              | UNIQUE          | YES      |
| def                | performance_schema | HOST                 | performance_schema | memory_summary_by_host_by_event_name                 | UNIQUE          | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | memory_summary_by_thread_by_event_name               | PRIMARY KEY     | YES      |
| def                | performance_schema | USER                 | performance_schema | memory_summary_by_user_by_event_name                 | UNIQUE          | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | table_handles                                        | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | metadata_locks                                       | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | data_locks                                           | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | replication_connection_configuration                 | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | replication_connection_status                        | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | replication_applier_configuration                    | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | replication_applier_status                           | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | replication_applier_status_by_coordinator            | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | replication_applier_status_by_worker                 | PRIMARY KEY     | YES      |
| def                | performance_schema | OWNER_THREAD_ID      | performance_schema | prepared_statements_instances                        | UNIQUE          | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | prepared_statements_instances                        | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | user_variables_by_thread                             | PRIMARY KEY     | YES      |
| def                | performance_schema | ACCOUNT              | performance_schema | status_by_account                                    | UNIQUE          | YES      |
| def                | performance_schema | HOST                 | performance_schema | status_by_host                                       | UNIQUE          | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | status_by_thread                                     | PRIMARY KEY     | YES      |
| def                | performance_schema | USER                 | performance_schema | status_by_user                                       | UNIQUE          | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | global_status                                        | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | session_status                                       | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | variables_by_thread                                  | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | global_variables                                     | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | session_variables                                    | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | persisted_variables                                  | PRIMARY KEY     | YES      |
| def                | performance_schema | PRIMARY              | performance_schema | user_defined_functions                               | PRIMARY KEY     | YES      |
| def                | mysql              | PRIMARY              | mysql              | component                                            | PRIMARY KEY     | YES      |
| def                | mysql              | PRIMARY              | mysql              | columns_priv                                         | PRIMARY KEY     | YES      |
| def                | mysql              | PRIMARY              | mysql              | db                                                   | PRIMARY KEY     | YES      |
| def                | mysql              | PRIMARY              | mysql              | default_roles                                        | PRIMARY KEY     | YES      |
| def                | mysql              | PRIMARY              | mysql              | engine_cost                                          | PRIMARY KEY     | YES      |
| def                | mysql              | PRIMARY              | mysql              | global_grants                                        | PRIMARY KEY     | YES      |
| def                | mysql              | name                 | mysql              | help_category                                        | UNIQUE          | YES      |
| def                | mysql              | PRIMARY              | mysql              | help_category                                        | PRIMARY KEY     | YES      |
| def                | mysql              | name                 | mysql              | help_keyword                                         | UNIQUE          | YES      |
| def                | mysql              | PRIMARY              | mysql              | help_keyword                                         | PRIMARY KEY     | YES      |
| def                | mysql              | PRIMARY              | mysql              | help_relation                                        | PRIMARY KEY     | YES      |
| def                | mysql              | name                 | mysql              | help_topic                                           | UNIQUE          | YES      |
| def                | mysql              | PRIMARY              | mysql              | help_topic                                           | PRIMARY KEY     | YES      |
| def                | mysql              | PRIMARY              | mysql              | plugin                                               | PRIMARY KEY     | YES      |
| def                | mysql              | PRIMARY              | mysql              | password_history                                     | PRIMARY KEY     | YES      |
| def                | mysql              | PRIMARY              | mysql              | proxies_priv                                         | PRIMARY KEY     | YES      |
| def                | mysql              | PRIMARY              | mysql              | role_edges                                           | PRIMARY KEY     | YES      |
| def                | mysql              | PRIMARY              | mysql              | servers                                              | PRIMARY KEY     | YES      |
| def                | mysql              | PRIMARY              | mysql              | server_cost                                          | PRIMARY KEY     | YES      |
| def                | mysql              | PRIMARY              | mysql              | replication_asynchronous_connection_failover         | PRIMARY KEY     | YES      |
| def                | mysql              | PRIMARY              | mysql              | replication_asynchronous_connection_failover_managed | PRIMARY KEY     | YES      |
| def                | mysql              | PRIMARY              | mysql              | replication_group_member_actions                     | PRIMARY KEY     | YES      |
| def                | mysql              | PRIMARY              | mysql              | tables_priv                                          | PRIMARY KEY     | YES      |
| def                | mysql              | PRIMARY              | mysql              | time_zone_name                                       | PRIMARY KEY     | YES      |
| def                | mysql              | PRIMARY              | mysql              | time_zone_leap_second                                | PRIMARY KEY     | YES      |
| def                | mysql              | PRIMARY              | mysql              | time_zone_transition                                 | PRIMARY KEY     | YES      |
| def                | mysql              | PRIMARY              | mysql              | time_zone_transition_type                            | PRIMARY KEY     | YES      |
| def                | mysql              | PRIMARY              | mysql              | func                                                 | PRIMARY KEY     | YES      |
| def                | mysql              | PRIMARY              | mysql              | gtid_executed                                        | PRIMARY KEY     | YES      |
| def                | mysql              | PRIMARY              | mysql              | slave_master_info                                    | PRIMARY KEY     | YES      |
| def                | mysql              | PRIMARY              | mysql              | slave_worker_info                                    | PRIMARY KEY     | YES      |
| def                | mysql              | PRIMARY              | mysql              | slave_relay_log_info                                 | PRIMARY KEY     | YES      |
| def                | mysql              | PRIMARY              | mysql              | procs_priv                                           | PRIMARY KEY     | YES      |
| def                | mysql              | PRIMARY              | mysql              | user                                                 | PRIMARY KEY     | YES      |
| def                | mysql              | PRIMARY              | mysql              | time_zone                                            | PRIMARY KEY     | YES      |
| def                | sys                | PRIMARY              | sys                | sys_config                                           | PRIMARY KEY     | YES      |
| def                | Example            | PRIMARY              | Example            | booklist                                             | PRIMARY KEY     | YES      |
| def                | Example            | library_ibfk_1       | Example            | library                                              | FOREIGN KEY     | YES      |
| def                | blazers            | examno               | blazers            | marks                                                | UNIQUE          | YES      |
| def                | blazers            | marks_ibfk_1         | blazers            | marks                                                | FOREIGN KEY     | YES      |
| def                | blazers            | PRIMARY              | blazers            | student                                              | PRIMARY KEY     | YES      |
| def                | blazers            | marklist_ibfk_1      | blazers            | marklist                                             | FOREIGN KEY     | YES      |
| def                | Example            | PRIMARY              | Example            | student                                              | PRIMARY KEY     | YES      |
| def                | Example            | PRIMARY              | Example            | studlist                                             | PRIMARY KEY     | YES      |
| def                | Example            | PRIMARY              | Example            | studlist_1                                           | PRIMARY KEY     | YES      |
| def                | Example            | PRIMARY              | Example            | teacher                                              | PRIMARY KEY     | YES      |
| def                | blazers            | Phone                | blazers            | constraints                                          | UNIQUE          | YES      |
| def                | blazers            | PRIMARY              | blazers            | constraints                                          | PRIMARY KEY     | YES      |
| def                | blazers            | foreign_key_ibfk_1   | blazers            | foreign_key                                          | FOREIGN KEY     | YES      |
| def                | lab                | PRIMARY              | lab                | student_class                                        | PRIMARY KEY     | YES      |
| def                | lab                | student_class_ibfk_1 | lab                | student_class                                        | FOREIGN KEY     | YES      |
| def                | lab                | student_class_chk_1  | lab                | student_class                                        | CHECK           | YES      |
| def                | lab                | student_class_chk_2  | lab                | student_class                                        | CHECK           | YES      |
| def                | lab                | Email                | lab                | students                                             | UNIQUE          | YES      |
| def                | lab                | PRIMARY              | lab                | students                                             | PRIMARY KEY     | YES      |
| def                | lab                | students_chk_1       | lab                | students                                             | CHECK           | YES      |
| def                | Academy            | PRIMARY              | Academy            | user                                                 | PRIMARY KEY     | YES      |
| def                | Academy            | PRIMARY              | Academy            | batches                                              | PRIMARY KEY     | YES      |
| def                | Academy            | PRIMARY              | Academy            | courses                                              | PRIMARY KEY     | YES      |
| def                | Academy            | PRIMARY              | Academy            | batch_users                                          | PRIMARY KEY     | YES      |
| def                | Academy            | batch_users_ibfk_1   | Academy            | batch_users                                          | FOREIGN KEY     | YES      |
| def                | Academy            | batch_users_ibfk_2   | Academy            | batch_users                                          | FOREIGN KEY     | YES      |
| def                | Academy            | PRIMARY              | Academy            | batch_courses                                        | PRIMARY KEY     | YES      |
| def                | Academy            | batch_courses_ibfk_1 | Academy            | batch_courses                                        | FOREIGN KEY     | YES      |
| def                | Academy            | batch_courses_ibfk_2 | Academy            | batch_courses                                        | FOREIGN KEY     | YES      |
| def                | views              | PRIMARY              | views              | register                                             | PRIMARY KEY     | YES      |
| def                | subqueries         | PRIMARY              | subqueries         | score                                                | PRIMARY KEY     | YES      |
| def                | subqueries         | PRIMARY              | subqueries         | student_marks                                        | PRIMARY KEY     | YES      |
| def                | FANTASTIC_JOURNEYS | Email                | FANTASTIC_JOURNEYS | User                                                 | UNIQUE          | YES      |
| def                | FANTASTIC_JOURNEYS | Password             | FANTASTIC_JOURNEYS | User                                                 | UNIQUE          | YES      |
| def                | FANTASTIC_JOURNEYS | Phone_no             | FANTASTIC_JOURNEYS | User                                                 | UNIQUE          | YES      |
| def                | FANTASTIC_JOURNEYS | PRIMARY              | FANTASTIC_JOURNEYS | User                                                 | PRIMARY KEY     | YES      |
| def                | FANTASTIC_JOURNEYS | PRIMARY              | FANTASTIC_JOURNEYS | Contact                                              | PRIMARY KEY     | YES      |
| def                | FANTASTIC_JOURNEYS | Contact_ibfk_1       | FANTASTIC_JOURNEYS | Contact                                              | FOREIGN KEY     | YES      |
| def                | FANTASTIC_JOURNEYS | PRIMARY              | FANTASTIC_JOURNEYS | Reviews                                              | PRIMARY KEY     | YES      |
| def                | FANTASTIC_JOURNEYS | Reviews_ibfk_1       | FANTASTIC_JOURNEYS | Reviews                                              | FOREIGN KEY     | YES      |
| def                | FANTASTIC_JOURNEYS | PRIMARY              | FANTASTIC_JOURNEYS | Plan_trip                                            | PRIMARY KEY     | YES      |
| def                | FANTASTIC_JOURNEYS | Plan_trip_ibfk_1     | FANTASTIC_JOURNEYS | Plan_trip                                            | FOREIGN KEY     | YES      |
| def                | FANTASTIC_JOURNEYS | Plan_trip_chk_1      | FANTASTIC_JOURNEYS | Plan_trip                                            | CHECK           | YES      |
| def                | FANTASTIC_JOURNEYS | Plan_trip_chk_2      | FANTASTIC_JOURNEYS | Plan_trip                                            | CHECK           | YES      |
| def                | FANTASTIC_JOURNEYS | PRIMARY              | FANTASTIC_JOURNEYS | Booking                                              | PRIMARY KEY     | YES      |
| def                | FANTASTIC_JOURNEYS | Booking_ibfk_1       | FANTASTIC_JOURNEYS | Booking                                              | FOREIGN KEY     | YES      |
| def                | FANTASTIC_JOURNEYS | Booking_chk_1        | FANTASTIC_JOURNEYS | Booking                                              | CHECK           | YES      |
| def                | FANTASTIC_JOURNEYS | Account_no           | FANTASTIC_JOURNEYS | Payments                                             | UNIQUE          | YES      |
| def                | FANTASTIC_JOURNEYS | PRIMARY              | FANTASTIC_JOURNEYS | Payments                                             | PRIMARY KEY     | YES      |
| def                | FANTASTIC_JOURNEYS | Payments_ibfk_1      | FANTASTIC_JOURNEYS | Payments                                             | FOREIGN KEY     | YES      |
| def                | FANTASTIC_JOURNEYS | PRIMARY              | FANTASTIC_JOURNEYS | Roles                                                | PRIMARY KEY     | YES      |
| def                | FANTASTIC_JOURNEYS | Roles_ibfk_1         | FANTASTIC_JOURNEYS | Roles                                                | FOREIGN KEY     | YES      |
| def                | FANTASTIC_JOURNEYS | Status_ibfk_1        | FANTASTIC_JOURNEYS | Status                                               | FOREIGN KEY     | YES      |
| def                | FANTASTIC_JOURNEYS | Status_ibfk_2        | FANTASTIC_JOURNEYS | Status                                               | FOREIGN KEY     | YES      |
| def                | FANTASTIC_JOURNEYS | Status_chk_1         | FANTASTIC_JOURNEYS | Status                                               | CHECK           | YES      |
+--------------------+--------------------+----------------------+--------------------+------------------------------------------------------+-----------------+----------+
187 rows in set (0.02 sec)

mysql> use FANTASTIC_JOURNEYS;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> show tables;
+------------------------------+
| Tables_in_FANTASTIC_JOURNEYS |
+------------------------------+
| Booking                      |
| Contact                      |
| Payments                     |
| Plan_trip                    |
| Reviews                      |
| Roles                        |
| Status                       |
| User                         |
| User_login                   |
+------------------------------+
9 rows in set (0.00 sec)

mysql> drop table Roles;
ERROR 3730 (HY000): Cannot drop table 'Roles' referenced by a foreign key constraint 'Status_ibfk_2' on table 'Status'.
mysql> alter table Status drop constraint 'Status_ibfk_2';
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''Status_ibfk_2'' at line 1
mysql> alter table Status drop constraint Status_ibfk_2;
Query OK, 0 rows affected (0.02 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> drop table Roles;
Query OK, 0 rows affected (0.03 sec)

mysql> CREATE TABLE Roles(id int primary key auto_increment,Name varchar(100) not null,Desc varchar(100) not null);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'Desc varchar(100) not null)' at line 1
mysql> CREATE TABLE Roles(id int primary key auto_increment,Name varchar(100) not null,desc varchar(100) not null);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'desc varchar(100) not null)' at line 1
mysql> CREATE TABLE Roles(id int primary key auto_increment,Name varchar(100) not null,Role varchar(100) not null);
Query OK, 0 rows affected (0.05 sec)

mysql> DESC Status;
+------------+-------------+------+-----+---------+-------+
| Field      | Type        | Null | Key | Default | Extra |
+------------+-------------+------+-----+---------+-------+
| Book_id    | int         | NO   | MUL | NULL    |       |
| status     | varchar(20) | NO   |     | NULL    |       |
| Support_id | int         | YES  | MUL | NULL    |       |
+------------+-------------+------+-----+---------+-------+
3 rows in set (0.01 sec)

mysql> alter table Status modify foreign key(Support_id) references Roles(id);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'foreign key(Support_id) references Roles(id)' at line 1
mysql> alter table Status add foreign key(Support_id) references Roles(id);
ERROR 1452 (23000): Cannot add or update a child row: a foreign key constraint fails (`FANTASTIC_JOURNEYS`.`#sql-3ba_8`, CONSTRAINT `Status_ibfk_2` FOREIGN KEY (`Support_id`) REFERENCES `Roles` (`id`))
mysql> alter table Status drop column Support_id;
Query OK, 0 rows affected (0.11 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> select*from Status;
+---------+--------+
| Book_id | status |
+---------+--------+
|       1 | Booked |
|       2 | Booked |
|       3 | Booked |
|       4 | Booked |
|       5 | Booked |
|       6 | Booked |
|       7 | Booked |
|       8 | Booked |
|       9 | Booked |
|      10 | Booked |
+---------+--------+
10 rows in set (0.00 sec)

mysql> insert into Roles values(1,'Admin','Can update website');
Query OK, 1 row affected (0.01 sec)

mysql> insert into Roles values(1,'Guide','Guiding travelers');
ERROR 1062 (23000): Duplicate entry '1' for key 'Roles.PRIMARY'
mysql> insert into Roles values(2,'Guide','Guiding travelers');
Query OK, 1 row affected (0.01 sec)

mysql> select*from Roles;
+----+-------+--------------------+
| id | Name  | Role               |
+----+-------+--------------------+
|  1 | Admin | Can update website |
|  2 | Guide | Guiding travelers  |
+----+-------+--------------------+
2 rows in set (0.00 sec)

mysql> insert into Roles values(3,'User','View the websites');
Query OK, 1 row affected (0.01 sec)

mysql> select*from User;
+----+-----------+----------------------------+------------+----------+
| ID | Name      | Email                      | Phone_no   | Password |
+----+-----------+----------------------------+------------+----------+
|  1 | Swetha    | swethakarthika16@gmail.com | 9025336748 | 12345#Sm |
|  2 | Abisha    | abisha@gmail.com           | 9087654321 | abi1234@ |
|  3 | Jerusheya | jerusheya@gmail.com        | 9077654321 | jeru234@ |
|  4 | Aswath    | aswath@gmail.com           | 9067654321 | aswath4$ |
|  5 | Haiden    | haiden@gmail.com           | 9057654321 | haiden5$ |
|  6 | Saranya   | saran@gmail.com            | 9047654321 | saran20$ |
|  7 | Rishi     | rishi@gmail.com            | 9037654321 | rishi13@ |
|  8 | Selva     | selva@gmail.com            | 9017654321 | selva32@ |
|  9 | Santhanu  | santhanu@gmail.com         | 9027654321 | santa15* |
| 10 | Riyaz     | riyaz@gmail.com            | 9016654321 | riyaz32@ |
| 11 | Zendya    | zendya@gmail.com           | 8906543211 | admin123 |
| 12 | Zayn      | zayn@gmail.com             | 8907654321 | admin321 |
| 13 | Justin    | justin@gmail.com           | 8903212323 | admin231 |
| 14 | John      | john@gmail.com             | 8906143211 | admin124 |
| 15 | Ronaldo   | cr7@gmail.com              | 8909654321 | admin434 |
| 16 | Thomas    | thomas@gmail.com           | 8903212123 | admin254 |
| 17 | Helen     | helen@gmail.com            | 8877009911 | admin@23 |
| 18 | Gardener  | garden@gmail.com           | 9012334532 | admin@12 |
+----+-----------+----------------------------+------------+----------+
18 rows in set (0.00 sec)

mysql> alter table User add column Role_id int not null;
Query OK, 0 rows affected (0.06 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> select*from User;
+----+-----------+----------------------------+------------+----------+---------+
| ID | Name      | Email                      | Phone_no   | Password | Role_id |
+----+-----------+----------------------------+------------+----------+---------+
|  1 | Swetha    | swethakarthika16@gmail.com | 9025336748 | 12345#Sm |       0 |
|  2 | Abisha    | abisha@gmail.com           | 9087654321 | abi1234@ |       0 |
|  3 | Jerusheya | jerusheya@gmail.com        | 9077654321 | jeru234@ |       0 |
|  4 | Aswath    | aswath@gmail.com           | 9067654321 | aswath4$ |       0 |
|  5 | Haiden    | haiden@gmail.com           | 9057654321 | haiden5$ |       0 |
|  6 | Saranya   | saran@gmail.com            | 9047654321 | saran20$ |       0 |
|  7 | Rishi     | rishi@gmail.com            | 9037654321 | rishi13@ |       0 |
|  8 | Selva     | selva@gmail.com            | 9017654321 | selva32@ |       0 |
|  9 | Santhanu  | santhanu@gmail.com         | 9027654321 | santa15* |       0 |
| 10 | Riyaz     | riyaz@gmail.com            | 9016654321 | riyaz32@ |       0 |
| 11 | Zendya    | zendya@gmail.com           | 8906543211 | admin123 |       0 |
| 12 | Zayn      | zayn@gmail.com             | 8907654321 | admin321 |       0 |
| 13 | Justin    | justin@gmail.com           | 8903212323 | admin231 |       0 |
| 14 | John      | john@gmail.com             | 8906143211 | admin124 |       0 |
| 15 | Ronaldo   | cr7@gmail.com              | 8909654321 | admin434 |       0 |
| 16 | Thomas    | thomas@gmail.com           | 8903212123 | admin254 |       0 |
| 17 | Helen     | helen@gmail.com            | 8877009911 | admin@23 |       0 |
| 18 | Gardener  | garden@gmail.com           | 9012334532 | admin@12 |       0 |
+----+-----------+----------------------------+------------+----------+---------+
18 rows in set (0.00 sec)

mysql> update table User set Role_id=3 where ID<12;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'table User set Role_id=3 where ID<12' at line 1
mysql> alter table User add foreign key(Role_id) references Roles(id);
ERROR 1452 (23000): Cannot add or update a child row: a foreign key constraint fails (`FANTASTIC_JOURNEYS`.`#sql-3ba_8`, CONSTRAINT `User_ibfk_1` FOREIGN KEY (`Role_id`) REFERENCES `Roles` (`id`))
mysql> desc User;
+----------+--------------+------+-----+---------+----------------+
| Field    | Type         | Null | Key | Default | Extra          |
+----------+--------------+------+-----+---------+----------------+
| ID       | int          | NO   | PRI | NULL    | auto_increment |
| Name     | varchar(100) | NO   |     | NULL    |                |
| Email    | varchar(100) | NO   | UNI | NULL    |                |
| Phone_no | bigint       | NO   | UNI | NULL    |                |
| Password | varchar(100) | NO   | UNI | NULL    |                |
| Role_id  | int          | NO   |     | NULL    |                |
+----------+--------------+------+-----+---------+----------------+
6 rows in set (0.01 sec)

mysql> alter table User add foreign key(Role_id) references Roles(id);
ERROR 1452 (23000): Cannot add or update a child row: a foreign key constraint fails (`FANTASTIC_JOURNEYS`.`#sql-3ba_8`, CONSTRAINT `User_ibfk_1` FOREIGN KEY (`Role_id`) REFERENCES `Roles` (`id`))
mysql> update User set Role_id=3 where ID<12;
Query OK, 11 rows affected (0.01 sec)
Rows matched: 11  Changed: 11  Warnings: 0

mysql> select*from User;
+----+-----------+----------------------------+------------+----------+---------+
| ID | Name      | Email                      | Phone_no   | Password | Role_id |
+----+-----------+----------------------------+------------+----------+---------+
|  1 | Swetha    | swethakarthika16@gmail.com | 9025336748 | 12345#Sm |       3 |
|  2 | Abisha    | abisha@gmail.com           | 9087654321 | abi1234@ |       3 |
|  3 | Jerusheya | jerusheya@gmail.com        | 9077654321 | jeru234@ |       3 |
|  4 | Aswath    | aswath@gmail.com           | 9067654321 | aswath4$ |       3 |
|  5 | Haiden    | haiden@gmail.com           | 9057654321 | haiden5$ |       3 |
|  6 | Saranya   | saran@gmail.com            | 9047654321 | saran20$ |       3 |
|  7 | Rishi     | rishi@gmail.com            | 9037654321 | rishi13@ |       3 |
|  8 | Selva     | selva@gmail.com            | 9017654321 | selva32@ |       3 |
|  9 | Santhanu  | santhanu@gmail.com         | 9027654321 | santa15* |       3 |
| 10 | Riyaz     | riyaz@gmail.com            | 9016654321 | riyaz32@ |       3 |
| 11 | Zendya    | zendya@gmail.com           | 8906543211 | admin123 |       3 |
| 12 | Zayn      | zayn@gmail.com             | 8907654321 | admin321 |       0 |
| 13 | Justin    | justin@gmail.com           | 8903212323 | admin231 |       0 |
| 14 | John      | john@gmail.com             | 8906143211 | admin124 |       0 |
| 15 | Ronaldo   | cr7@gmail.com              | 8909654321 | admin434 |       0 |
| 16 | Thomas    | thomas@gmail.com           | 8903212123 | admin254 |       0 |
| 17 | Helen     | helen@gmail.com            | 8877009911 | admin@23 |       0 |
| 18 | Gardener  | garden@gmail.com           | 9012334532 | admin@12 |       0 |
+----+-----------+----------------------------+------------+----------+---------+
18 rows in set (0.00 sec)

mysql> update User set Role_id=2 where ID<17;
Query OK, 16 rows affected (0.01 sec)
Rows matched: 16  Changed: 16  Warnings: 0

mysql> select*from User;
+----+-----------+----------------------------+------------+----------+---------+
| ID | Name      | Email                      | Phone_no   | Password | Role_id |
+----+-----------+----------------------------+------------+----------+---------+
|  1 | Swetha    | swethakarthika16@gmail.com | 9025336748 | 12345#Sm |       2 |
|  2 | Abisha    | abisha@gmail.com           | 9087654321 | abi1234@ |       2 |
|  3 | Jerusheya | jerusheya@gmail.com        | 9077654321 | jeru234@ |       2 |
|  4 | Aswath    | aswath@gmail.com           | 9067654321 | aswath4$ |       2 |
|  5 | Haiden    | haiden@gmail.com           | 9057654321 | haiden5$ |       2 |
|  6 | Saranya   | saran@gmail.com            | 9047654321 | saran20$ |       2 |
|  7 | Rishi     | rishi@gmail.com            | 9037654321 | rishi13@ |       2 |
|  8 | Selva     | selva@gmail.com            | 9017654321 | selva32@ |       2 |
|  9 | Santhanu  | santhanu@gmail.com         | 9027654321 | santa15* |       2 |
| 10 | Riyaz     | riyaz@gmail.com            | 9016654321 | riyaz32@ |       2 |
| 11 | Zendya    | zendya@gmail.com           | 8906543211 | admin123 |       2 |
| 12 | Zayn      | zayn@gmail.com             | 8907654321 | admin321 |       2 |
| 13 | Justin    | justin@gmail.com           | 8903212323 | admin231 |       2 |
| 14 | John      | john@gmail.com             | 8906143211 | admin124 |       2 |
| 15 | Ronaldo   | cr7@gmail.com              | 8909654321 | admin434 |       2 |
| 16 | Thomas    | thomas@gmail.com           | 8903212123 | admin254 |       2 |
| 17 | Helen     | helen@gmail.com            | 8877009911 | admin@23 |       0 |
| 18 | Gardener  | garden@gmail.com           | 9012334532 | admin@12 |       0 |
+----+-----------+----------------------------+------------+----------+---------+
18 rows in set (0.00 sec)

mysql> update User set Role_id=2 where ID<19;
Query OK, 2 rows affected (0.01 sec)
Rows matched: 18  Changed: 2  Warnings: 0

mysql> select*from User;
+----+-----------+----------------------------+------------+----------+---------+
| ID | Name      | Email                      | Phone_no   | Password | Role_id |
+----+-----------+----------------------------+------------+----------+---------+
|  1 | Swetha    | swethakarthika16@gmail.com | 9025336748 | 12345#Sm |       2 |
|  2 | Abisha    | abisha@gmail.com           | 9087654321 | abi1234@ |       2 |
|  3 | Jerusheya | jerusheya@gmail.com        | 9077654321 | jeru234@ |       2 |
|  4 | Aswath    | aswath@gmail.com           | 9067654321 | aswath4$ |       2 |
|  5 | Haiden    | haiden@gmail.com           | 9057654321 | haiden5$ |       2 |
|  6 | Saranya   | saran@gmail.com            | 9047654321 | saran20$ |       2 |
|  7 | Rishi     | rishi@gmail.com            | 9037654321 | rishi13@ |       2 |
|  8 | Selva     | selva@gmail.com            | 9017654321 | selva32@ |       2 |
|  9 | Santhanu  | santhanu@gmail.com         | 9027654321 | santa15* |       2 |
| 10 | Riyaz     | riyaz@gmail.com            | 9016654321 | riyaz32@ |       2 |
| 11 | Zendya    | zendya@gmail.com           | 8906543211 | admin123 |       2 |
| 12 | Zayn      | zayn@gmail.com             | 8907654321 | admin321 |       2 |
| 13 | Justin    | justin@gmail.com           | 8903212323 | admin231 |       2 |
| 14 | John      | john@gmail.com             | 8906143211 | admin124 |       2 |
| 15 | Ronaldo   | cr7@gmail.com              | 8909654321 | admin434 |       2 |
| 16 | Thomas    | thomas@gmail.com           | 8903212123 | admin254 |       2 |
| 17 | Helen     | helen@gmail.com            | 8877009911 | admin@23 |       2 |
| 18 | Gardener  | garden@gmail.com           | 9012334532 | admin@12 |       2 |
+----+-----------+----------------------------+------------+----------+---------+
18 rows in set (0.00 sec)

mysql> update User set Role_id=2 where ID<12;
Query OK, 0 rows affected (0.00 sec)
Rows matched: 11  Changed: 0  Warnings: 0

mysql> update User set Role_id=1 where ID<12;
Query OK, 11 rows affected (0.01 sec)
Rows matched: 11  Changed: 11  Warnings: 0

mysql> update User set Role_id=2 where ID<17;
Query OK, 11 rows affected (0.01 sec)
Rows matched: 16  Changed: 11  Warnings: 0

mysql> update User set Role_id=1 where ID<12;
Query OK, 11 rows affected (0.01 sec)
Rows matched: 11  Changed: 11  Warnings: 0

mysql> update User set Role_id=2 where ID>12 and ID<17 ;
Query OK, 0 rows affected (0.00 sec)
Rows matched: 4  Changed: 0  Warnings: 0

mysql> select*from User;
+----+-----------+----------------------------+------------+----------+---------+
| ID | Name      | Email                      | Phone_no   | Password | Role_id |
+----+-----------+----------------------------+------------+----------+---------+
|  1 | Swetha    | swethakarthika16@gmail.com | 9025336748 | 12345#Sm |       1 |
|  2 | Abisha    | abisha@gmail.com           | 9087654321 | abi1234@ |       1 |
|  3 | Jerusheya | jerusheya@gmail.com        | 9077654321 | jeru234@ |       1 |
|  4 | Aswath    | aswath@gmail.com           | 9067654321 | aswath4$ |       1 |
|  5 | Haiden    | haiden@gmail.com           | 9057654321 | haiden5$ |       1 |
|  6 | Saranya   | saran@gmail.com            | 9047654321 | saran20$ |       1 |
|  7 | Rishi     | rishi@gmail.com            | 9037654321 | rishi13@ |       1 |
|  8 | Selva     | selva@gmail.com            | 9017654321 | selva32@ |       1 |
|  9 | Santhanu  | santhanu@gmail.com         | 9027654321 | santa15* |       1 |
| 10 | Riyaz     | riyaz@gmail.com            | 9016654321 | riyaz32@ |       1 |
| 11 | Zendya    | zendya@gmail.com           | 8906543211 | admin123 |       1 |
| 12 | Zayn      | zayn@gmail.com             | 8907654321 | admin321 |       2 |
| 13 | Justin    | justin@gmail.com           | 8903212323 | admin231 |       2 |
| 14 | John      | john@gmail.com             | 8906143211 | admin124 |       2 |
| 15 | Ronaldo   | cr7@gmail.com              | 8909654321 | admin434 |       2 |
| 16 | Thomas    | thomas@gmail.com           | 8903212123 | admin254 |       2 |
| 17 | Helen     | helen@gmail.com            | 8877009911 | admin@23 |       2 |
| 18 | Gardener  | garden@gmail.com           | 9012334532 | admin@12 |       2 |
+----+-----------+----------------------------+------------+----------+---------+
18 rows in set (0.00 sec)

mysql> update User set Role_id=3 where ID<11;
Query OK, 10 rows affected (0.01 sec)
Rows matched: 10  Changed: 10  Warnings: 0

mysql> select*from User;
+----+-----------+----------------------------+------------+----------+---------+
| ID | Name      | Email                      | Phone_no   | Password | Role_id |
+----+-----------+----------------------------+------------+----------+---------+
|  1 | Swetha    | swethakarthika16@gmail.com | 9025336748 | 12345#Sm |       3 |
|  2 | Abisha    | abisha@gmail.com           | 9087654321 | abi1234@ |       3 |
|  3 | Jerusheya | jerusheya@gmail.com        | 9077654321 | jeru234@ |       3 |
|  4 | Aswath    | aswath@gmail.com           | 9067654321 | aswath4$ |       3 |
|  5 | Haiden    | haiden@gmail.com           | 9057654321 | haiden5$ |       3 |
|  6 | Saranya   | saran@gmail.com            | 9047654321 | saran20$ |       3 |
|  7 | Rishi     | rishi@gmail.com            | 9037654321 | rishi13@ |       3 |
|  8 | Selva     | selva@gmail.com            | 9017654321 | selva32@ |       3 |
|  9 | Santhanu  | santhanu@gmail.com         | 9027654321 | santa15* |       3 |
| 10 | Riyaz     | riyaz@gmail.com            | 9016654321 | riyaz32@ |       3 |
| 11 | Zendya    | zendya@gmail.com           | 8906543211 | admin123 |       1 |
| 12 | Zayn      | zayn@gmail.com             | 8907654321 | admin321 |       2 |
| 13 | Justin    | justin@gmail.com           | 8903212323 | admin231 |       2 |
| 14 | John      | john@gmail.com             | 8906143211 | admin124 |       2 |
| 15 | Ronaldo   | cr7@gmail.com              | 8909654321 | admin434 |       2 |
| 16 | Thomas    | thomas@gmail.com           | 8903212123 | admin254 |       2 |
| 17 | Helen     | helen@gmail.com            | 8877009911 | admin@23 |       2 |
| 18 | Gardener  | garden@gmail.com           | 9012334532 | admin@12 |       2 |
+----+-----------+----------------------------+------------+----------+---------+
18 rows in set (0.00 sec)

mysql> update User set Role_id=2 where ID>10 and ID<17 ;
Query OK, 1 row affected (0.01 sec)
Rows matched: 6  Changed: 1  Warnings: 0

mysql> select*from User;
+----+-----------+----------------------------+------------+----------+---------+
| ID | Name      | Email                      | Phone_no   | Password | Role_id |
+----+-----------+----------------------------+------------+----------+---------+
|  1 | Swetha    | swethakarthika16@gmail.com | 9025336748 | 12345#Sm |       3 |
|  2 | Abisha    | abisha@gmail.com           | 9087654321 | abi1234@ |       3 |
|  3 | Jerusheya | jerusheya@gmail.com        | 9077654321 | jeru234@ |       3 |
|  4 | Aswath    | aswath@gmail.com           | 9067654321 | aswath4$ |       3 |
|  5 | Haiden    | haiden@gmail.com           | 9057654321 | haiden5$ |       3 |
|  6 | Saranya   | saran@gmail.com            | 9047654321 | saran20$ |       3 |
|  7 | Rishi     | rishi@gmail.com            | 9037654321 | rishi13@ |       3 |
|  8 | Selva     | selva@gmail.com            | 9017654321 | selva32@ |       3 |
|  9 | Santhanu  | santhanu@gmail.com         | 9027654321 | santa15* |       3 |
| 10 | Riyaz     | riyaz@gmail.com            | 9016654321 | riyaz32@ |       3 |
| 11 | Zendya    | zendya@gmail.com           | 8906543211 | admin123 |       2 |
| 12 | Zayn      | zayn@gmail.com             | 8907654321 | admin321 |       2 |
| 13 | Justin    | justin@gmail.com           | 8903212323 | admin231 |       2 |
| 14 | John      | john@gmail.com             | 8906143211 | admin124 |       2 |
| 15 | Ronaldo   | cr7@gmail.com              | 8909654321 | admin434 |       2 |
| 16 | Thomas    | thomas@gmail.com           | 8903212123 | admin254 |       2 |
| 17 | Helen     | helen@gmail.com            | 8877009911 | admin@23 |       2 |
| 18 | Gardener  | garden@gmail.com           | 9012334532 | admin@12 |       2 |
+----+-----------+----------------------------+------------+----------+---------+
18 rows in set (0.00 sec)

mysql> update User set Role_id=2 where ID>16 and ID<19 ;
Query OK, 0 rows affected (0.00 sec)
Rows matched: 2  Changed: 0  Warnings: 0

mysql> select*from User;
+----+-----------+----------------------------+------------+----------+---------+
| ID | Name      | Email                      | Phone_no   | Password | Role_id |
+----+-----------+----------------------------+------------+----------+---------+
|  1 | Swetha    | swethakarthika16@gmail.com | 9025336748 | 12345#Sm |       3 |
|  2 | Abisha    | abisha@gmail.com           | 9087654321 | abi1234@ |       3 |
|  3 | Jerusheya | jerusheya@gmail.com        | 9077654321 | jeru234@ |       3 |
|  4 | Aswath    | aswath@gmail.com           | 9067654321 | aswath4$ |       3 |
|  5 | Haiden    | haiden@gmail.com           | 9057654321 | haiden5$ |       3 |
|  6 | Saranya   | saran@gmail.com            | 9047654321 | saran20$ |       3 |
|  7 | Rishi     | rishi@gmail.com            | 9037654321 | rishi13@ |       3 |
|  8 | Selva     | selva@gmail.com            | 9017654321 | selva32@ |       3 |
|  9 | Santhanu  | santhanu@gmail.com         | 9027654321 | santa15* |       3 |
| 10 | Riyaz     | riyaz@gmail.com            | 9016654321 | riyaz32@ |       3 |
| 11 | Zendya    | zendya@gmail.com           | 8906543211 | admin123 |       2 |
| 12 | Zayn      | zayn@gmail.com             | 8907654321 | admin321 |       2 |
| 13 | Justin    | justin@gmail.com           | 8903212323 | admin231 |       2 |
| 14 | John      | john@gmail.com             | 8906143211 | admin124 |       2 |
| 15 | Ronaldo   | cr7@gmail.com              | 8909654321 | admin434 |       2 |
| 16 | Thomas    | thomas@gmail.com           | 8903212123 | admin254 |       2 |
| 17 | Helen     | helen@gmail.com            | 8877009911 | admin@23 |       2 |
| 18 | Gardener  | garden@gmail.com           | 9012334532 | admin@12 |       2 |
+----+-----------+----------------------------+------------+----------+---------+
18 rows in set (0.01 sec)

mysql> update User set Role_id=1 where ID>16 ;
Query OK, 2 rows affected (0.01 sec)
Rows matched: 2  Changed: 2  Warnings: 0

mysql> select*from User;
+----+-----------+----------------------------+------------+----------+---------+
| ID | Name      | Email                      | Phone_no   | Password | Role_id |
+----+-----------+----------------------------+------------+----------+---------+
|  1 | Swetha    | swethakarthika16@gmail.com | 9025336748 | 12345#Sm |       3 |
|  2 | Abisha    | abisha@gmail.com           | 9087654321 | abi1234@ |       3 |
|  3 | Jerusheya | jerusheya@gmail.com        | 9077654321 | jeru234@ |       3 |
|  4 | Aswath    | aswath@gmail.com           | 9067654321 | aswath4$ |       3 |
|  5 | Haiden    | haiden@gmail.com           | 9057654321 | haiden5$ |       3 |
|  6 | Saranya   | saran@gmail.com            | 9047654321 | saran20$ |       3 |
|  7 | Rishi     | rishi@gmail.com            | 9037654321 | rishi13@ |       3 |
|  8 | Selva     | selva@gmail.com            | 9017654321 | selva32@ |       3 |
|  9 | Santhanu  | santhanu@gmail.com         | 9027654321 | santa15* |       3 |
| 10 | Riyaz     | riyaz@gmail.com            | 9016654321 | riyaz32@ |       3 |
| 11 | Zendya    | zendya@gmail.com           | 8906543211 | admin123 |       2 |
| 12 | Zayn      | zayn@gmail.com             | 8907654321 | admin321 |       2 |
| 13 | Justin    | justin@gmail.com           | 8903212323 | admin231 |       2 |
| 14 | John      | john@gmail.com             | 8906143211 | admin124 |       2 |
| 15 | Ronaldo   | cr7@gmail.com              | 8909654321 | admin434 |       2 |
| 16 | Thomas    | thomas@gmail.com           | 8903212123 | admin254 |       2 |
| 17 | Helen     | helen@gmail.com            | 8877009911 | admin@23 |       1 |
| 18 | Gardener  | garden@gmail.com           | 9012334532 | admin@12 |       1 |
+----+-----------+----------------------------+------------+----------+---------+
18 rows in set (0.00 sec)

mysql> alter table User add foreign key(Role_id) references Roles(id);
Query OK, 18 rows affected (0.16 sec)
Records: 18  Duplicates: 0  Warnings: 0

mysql> desc User;
+----------+--------------+------+-----+---------+----------------+
| Field    | Type         | Null | Key | Default | Extra          |
+----------+--------------+------+-----+---------+----------------+
| ID       | int          | NO   | PRI | NULL    | auto_increment |
| Name     | varchar(100) | NO   |     | NULL    |                |
| Email    | varchar(100) | NO   | UNI | NULL    |                |
| Phone_no | bigint       | NO   | UNI | NULL    |                |
| Password | varchar(100) | NO   | UNI | NULL    |                |
| Role_id  | int          | NO   | MUL | NULL    |                |
+----------+--------------+------+-----+---------+----------------+
6 rows in set (0.01 sec)

mysql> drop table User_login;
ERROR 1051 (42S02): Unknown table 'FANTASTIC_JOURNEYS.User_login'
mysql> RENAME TABLE Contact to Query;
Query OK, 0 rows affected (0.04 sec)

mysql> desc Query;
+------------+--------------+------+-----+---------+----------------+
| Field      | Type         | Null | Key | Default | Extra          |
+------------+--------------+------+-----+---------+----------------+
| contact_id | int          | NO   | PRI | NULL    | auto_increment |
| user_id    | int          | NO   | MUL | NULL    |                |
| Email      | varchar(100) | NO   |     | NULL    |                |
| Queries    | text         | NO   |     | NULL    |                |
+------------+--------------+------+-----+---------+----------------+
4 rows in set (0.00 sec)

mysql> alter table Query drop column Email;
Query OK, 0 rows affected (0.11 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> CREATE VIEW Admin_details AS SELECT * FROM User WHERE Password LIKE 'admin%';
Query OK, 0 rows affected (0.02 sec)

mysql> SELECT*FROM Admin_details;
+----+----------+------------------+------------+----------+---------+
| ID | Name     | Email            | Phone_no   | Password | Role_id |
+----+----------+------------------+------------+----------+---------+
| 18 | Gardener | garden@gmail.com | 9012334532 | admin@12 |       1 |
| 17 | Helen    | helen@gmail.com  | 8877009911 | admin@23 |       1 |
| 11 | Zendya   | zendya@gmail.com | 8906543211 | admin123 |       2 |
| 14 | John     | john@gmail.com   | 8906143211 | admin124 |       2 |
| 13 | Justin   | justin@gmail.com | 8903212323 | admin231 |       2 |
| 16 | Thomas   | thomas@gmail.com | 8903212123 | admin254 |       2 |
| 12 | Zayn     | zayn@gmail.com   | 8907654321 | admin321 |       2 |
| 15 | Ronaldo  | cr7@gmail.com    | 8909654321 | admin434 |       2 |
+----+----------+------------------+------------+----------+---------+
8 rows in set (0.00 sec)

mysql> alter table Status add column Support_id int not null;
Query OK, 0 rows affected (0.04 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> alter table Status add foreign key(Support_id) references Admin_details(ID);
ERROR 1824 (HY000): Failed to open the referenced table 'Admin_details'
mysql> drop table Admin_details;
ERROR 1051 (42S02): Unknown table 'FANTASTIC_JOURNEYS.Admin_details'
mysql> drop view Admin_details;
Query OK, 0 rows affected (0.02 sec)

mysql> CREATE TABLE Support(ID int primary key auto_increment, user_id int not null,foreign_key(user_id) references User(ID));
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '(user_id) references User(ID))' at line 1
mysql> CREATE TABLE Support(ID int primary key auto_increment, user_id int not null,foreign key(user_id) references User(ID));
Query OK, 0 rows affected (0.06 sec)

mysql> desc Roles;
+-------+--------------+------+-----+---------+----------------+
| Field | Type         | Null | Key | Default | Extra          |
+-------+--------------+------+-----+---------+----------------+
| id    | int          | NO   | PRI | NULL    | auto_increment |
| Name  | varchar(100) | NO   |     | NULL    |                |
| Role  | varchar(100) | NO   |     | NULL    |                |
+-------+--------------+------+-----+---------+----------------+
3 rows in set (0.01 sec)

mysql> alter table Roles modify column id tinyint;
ERROR 3780 (HY000): Referencing column 'Role_id' and referenced column 'id' in foreign key constraint 'User_ibfk_1' are incompatible.
mysql> alter table Roles alter column id tinyint primary key auto_increment;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'tinyint primary key auto_increment' at line 1
mysql> alter table Roles alter column id tinyint primary key auto_increment;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'tinyint primary key auto_increment' at line 1
mysql> alter table Roles alter column id tinyint;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'tinyint' at line 1
mysql> alter table Roles modify id tinyint primary key auto_increment;
ERROR 1068 (42000): Multiple primary key defined
mysql> alter table Roles modify id tinyint;
ERROR 3780 (HY000): Referencing column 'Role_id' and referenced column 'id' in foreign key constraint 'User_ibfk_1' are incompatible.
mysql> alter table User drop constraint User_ibfk_1;
Query OK, 0 rows affected (0.03 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> alter table Roles modify id tinyint;
Query OK, 3 rows affected (0.10 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> alter table User add foreign key(Role_id) references Roles(id);
ERROR 3780 (HY000): Referencing column 'Role_id' and referenced column 'id' in foreign key constraint 'User_ibfk_1' are incompatible.
mysql> desc Roles;
+-------+--------------+------+-----+---------+-------+
| Field | Type         | Null | Key | Default | Extra |
+-------+--------------+------+-----+---------+-------+
| id    | tinyint      | NO   | PRI | NULL    |       |
| Name  | varchar(100) | NO   |     | NULL    |       |
| Role  | varchar(100) | NO   |     | NULL    |       |
+-------+--------------+------+-----+---------+-------+
3 rows in set (0.00 sec)

mysql> alter table User add constraint foreign key(Role_id) references Roles(id);
ERROR 3780 (HY000): Referencing column 'Role_id' and referenced column 'id' in foreign key constraint 'User_ibfk_1' are incompatible.
mysql> desc User;
+----------+--------------+------+-----+---------+----------------+
| Field    | Type         | Null | Key | Default | Extra          |
+----------+--------------+------+-----+---------+----------------+
| ID       | int          | NO   | PRI | NULL    | auto_increment |
| Name     | varchar(100) | NO   |     | NULL    |                |
| Email    | varchar(100) | NO   | UNI | NULL    |                |
| Phone_no | bigint       | NO   | UNI | NULL    |                |
| Password | varchar(100) | NO   | UNI | NULL    |                |
| Role_id  | int          | NO   | MUL | NULL    |                |
+----------+--------------+------+-----+---------+----------------+
6 rows in set (0.00 sec)

mysql> select*from Status;
+---------+--------+------------+
| Book_id | status | Support_id |
+---------+--------+------------+
|       1 | Booked |          0 |
|       2 | Booked |          0 |
|       3 | Booked |          0 |
|       4 | Booked |          0 |
|       5 | Booked |          0 |
|       6 | Booked |          0 |
|       7 | Booked |          0 |
|       8 | Booked |          0 |
|       9 | Booked |          0 |
|      10 | Booked |          0 |
+---------+--------+------------+
10 rows in set (0.00 sec)

mysql> desc Status;
+------------+-------------+------+-----+---------+-------+
| Field      | Type        | Null | Key | Default | Extra |
+------------+-------------+------+-----+---------+-------+
| Book_id    | int         | NO   | MUL | NULL    |       |
| status     | varchar(20) | NO   |     | NULL    |       |
| Support_id | int         | NO   |     | NULL    |       |
+------------+-------------+------+-----+---------+-------+
3 rows in set (0.00 sec)

mysql> alter table Support modify ID tinyint;
Query OK, 0 rows affected (0.11 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> alter table Status add foreign key(Support_id) references Support(ID);
ERROR 3780 (HY000): Referencing column 'Support_id' and referenced column 'ID' in foreign key constraint 'Status_ibfk_2' are incompatible.
mysql> alter table Status add foreign key(Support_id) references Support(ID);
ERROR 3780 (HY000): Referencing column 'Support_id' and referenced column 'ID' in foreign key constraint 'Status_ibfk_2' are incompatible.
mysql> alter table Status drop foreign key Status_ibfk_2;
ERROR 1091 (42000): Can't DROP 'Status_ibfk_2'; check that column/key exists
mysql> alter table Status drop constraint Status_ibfk_2;
ERROR 3940 (HY000): Constraint 'Status_ibfk_2' does not exist.
mysql> alter table Status drop constraint 'Status_ibfk_2';
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''Status_ibfk_2'' at line 1
mysql> drop table Status;
Query OK, 0 rows affected (0.04 sec)

mysql> CREATE TABLE Status(Id int primary key auto_increment,status varchar(50) not null,Support_id int,foreign key(Support_id) references Support(ID));
ERROR 3780 (HY000): Referencing column 'Support_id' and referenced column 'ID' in foreign key constraint 'Status_ibfk_1' are incompatible.
mysql> desc Support;
+---------+---------+------+-----+---------+-------+
| Field   | Type    | Null | Key | Default | Extra |
+---------+---------+------+-----+---------+-------+
| ID      | tinyint | NO   | PRI | NULL    |       |
| user_id | int     | NO   | MUL | NULL    |       |
+---------+---------+------+-----+---------+-------+
2 rows in set (0.01 sec)

mysql> CREATE TABLE Status(Id int primary key auto_increment,status varchar(50) not null,Support_id int not null,foreign key(Support_id) references Support(ID));
ERROR 3780 (HY000): Referencing column 'Support_id' and referenced column 'ID' in foreign key constraint 'Status_ibfk_1' are incompatible.
mysql> CREATE TABLE Status(Id int primary key auto_increment,status varchar(50) not null,Support_id int not null,foreign key(Support_id) references Support(ID));
ERROR 3780 (HY000): Referencing column 'Support_id' and referenced column 'ID' in foreign key constraint 'Status_ibfk_1' are incompatible.
mysql> alter table Support drop column ID;
Query OK, 0 rows affected (0.10 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> alter table Support add column id int primary key auto_increment before user_id;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'before user_id' at line 1
mysql> alter table Support add column id int primary key auto_increment;
Query OK, 0 rows affected (0.08 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> alter table Support modify column id before user_id;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'before user_id' at line 1
mysql> sudo -u root mysql;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'sudo -u root mysql' at line 1
mysql> [sudo] password for swetham: 
    -> Welcome to the MySQL monitor.  Commands end with ; or \g.
lERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '[sudo] password for swetham: 
Welcome to the MySQL monitor.  Commands end with' at line 1
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'or' at line 1
    -> Your MySQL connection id is 8
_s    -> Server version: 8.0.28 MySQL Community Server - GPL
    -> 
    -> Copyright (c) 2000, 2022, Oracle and/or its affiliates.
    -> 
    -> Oracle is a registered trademark of Oracle Corporation and/or its
    -> affiliates. Other names may be trademarks of their respective
    -> owners.
    -> 
    -> Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.
    -> 
    -> mysql> show databases;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '.
Your MySQL connection id is 8
Server version: 8.0.28 MySQL Community Server - ' at line 1
mysql> +--------------------+
    -> | Database           |
    -> +--------------------+
    -> | Academy            |
    -> | Example            |
    -> | FANTASTIC_JOURNEYS |
    -> | blazers            |
    -> | information_schema |
    -> | lab                |
    -> | mysql              |
    -> | performance_schema |
    -> | sql_practice       |
    -> | subqueries         |
    -> | sys                |
    -> | views              |
    -> +--------------------+
    -> 12 rows in set (0.02 sec)
    -> 
    -> mysql> use FANTASTIC_JOURNEYS;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '+--------------------+
| Database           |
+--------------------+
| Academy  ' at line 1
mysql> Reading table information for completion of table and column names
    -> You can turn off this feature to get a quicker startup with -A
    -> 
    -> Database changed
    -> mysql> SHOW TABLES;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'Reading table information for completion of table and column names
You can turn ' at line 1
mysql> +------------------------------+
    -> | Tables_in_FANTASTIC_JOURNEYS |
    -> +------------------------------+
    -> | Booking                      |
    -> | Contact                      |
    -> | Payments                     |
    -> | Plan_trip                    |
    -> | Reviews                      |
    -> | Roles                        |
    -> | Status                       |
    -> | User                         |
    -> | User_login                   |
     -> +------------------------------+
    -> 9 rows in set (0.00 sec)
N    -> 
    -> mysql> desc Roles;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '+------------------------------+
| Tables_in_FANTASTIC_JOURNEYS |
+-------------' at line 1
mysql>       +---------+--------------+------+-----+---------+----------------+
    -> | Field   | Type         | Null | Key | Default | Extra          |
    -> +---------+--------------+------+-----+---------+----------------+
    -> | Role_id | int          | NO   | PRI | NULL    | auto_increment |
    -> | user_id | int          | NO   | MUL | NULL    |                |
    -> | Role    | varchar(100) | NO   |     | NULL    |                |
    -> +---------+--------------+------+-----+---------+----------------+
    -> 3 rows in set (0.01 sec)
ES    -> 
    -> mysql> alter table Roles drop column user_id;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '+---------+--------------+------+-----+---------+----------------+
| Field   | T' at line 1
mysql> ERROR 1828 (HY000): Cannot drop column 'user_id': needed in a foreign key constraint 'Roles_ibfk_1'
    -> mysql> alter table Roles drop foreign key 'Roles_ibfk_1';
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'ERROR 1828 (HY000): Cannot drop column 'user_id': needed in a foreign key constr' at line 1
mysql> ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''Roles_ibfk_1'' at line 1
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'ERROR 1064 (42000): You have an error in your SQL syntax' at line 1
    -> mysql> alter table Roles drop constraint 'Roles_ibfk_1';
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'the manual that corresponds to your MySQL server version for the right syntax to' at line 1
mysql> ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''Roles_ibfk_1'' at line 1
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'ERROR 1064 (42000): You have an error in your SQL syntax' at line 1
    -> mysql> alter table Roles drop constraints 'Roles_ibfk_1';
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'the manual that corresponds to your MySQL server version for the right syntax to' at line 1
mysql> ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''Roles_ibfk_1'' at line 1
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'ERROR 1064 (42000): You have an error in your SQL syntax' at line 1
    -> mysql> alter table Roles drop constraint 'Roles_ibfk_1';
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'the manual that corresponds to your MySQL server version for the right syntax to' at line 1
mysql> ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''Roles_ibfk_1'' at line 1
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'ERROR 1064 (42000): You have an error in your SQL syntax' at line 1
    -> mysql> alter table Roles drop constraint 'Roles_ibfk_1';
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'the manual that corresponds to your MySQL server version for the right syntax to' at line 1
mysql> ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''Roles_ibfk_1'' at line 1
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'ERROR 1064 (42000): You have an error in your SQL syntax' at line 1
    -> mysql> alter table Roles drop constraint user_id;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'the manual that corresponds to your MySQL server version for the right syntax to' at line 1
mysql> ERROR 3940 (HY000): Constraint 'user_id' does not exist.
    -> mysql> alter table Status drop constraint 'Roles_ibfk_1';
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'ERROR 3940 (HY000): Constraint 'user_id' does not exist.
mysql> alter table Stat' at line 1
mysql> ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''Roles_ibfk_1'' at line 1
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'ERROR 1064 (42000): You have an error in your SQL syntax' at line 1
    -> mysql> alter table User drop constraint 'Roles_ibfk_1';
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'the manual that corresponds to your MySQL server version for the right syntax to' at line 1
mysql> ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''Roles_ibfk_1'' at line 1
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'ERROR 1064 (42000): You have an error in your SQL syntax' at line 1
    -> mysql> alter table User drop constraint 'Roles_ibfk_1';
--ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'the manual that corresponds to your MySQL server version for the right syntax to' at line 1
mysql> ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''Roles_ibfk_1'' at line 1
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'ERROR 1064 (42000): You have an error in your SQL syntax' at line 1
    -> mysql> use information_schema;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'the manual that corresponds to your MySQL server version for the right syntax to' at line 1
mysql> Reading table information for completion of table and column names
    -> You can turn off this feature to get a quicker startup with -A
    -> 
    -> Database changed
    -> mysql> show tables;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'Reading table information for completion of table and column names
You can turn ' at line 1
mysql> +---------------------------------------+
    -> | Tables_in_information_schema          |
    -> +---------------------------------------+
    -> | ADMINISTRABLE_ROLE_AUTHORIZATIONS     |
    -> | APPLICABLE_ROLES                      |
    -> | CHARACTER_SETS                        |
    -> | CHECK_CONSTRAINTS                     |
    -> | COLLATIONS                            |
    -> | COLLATION_CHARACTER_SET_APPLICABILITY |
    -> | COLUMNS                               |
    -> | COLUMNS_EXTENSIONS                    |
    -> | COLUMN_PRIVILEGES                     |
    -> | COLUMN_STATISTICS                     |
    -> | ENABLED_ROLES                         |
    -> | ENGINES                               |
    -> | EVENTS                                |
    -> | FILES                                 |
    -> | INNODB_BUFFER_PAGE                    |
    -> | INNODB_BUFFER_PAGE_LRU                |
    -> | INNODB_BUFFER_POOL_STATS              |
    -> | INNODB_CACHED_INDEXES                 |
    -> | INNODB_CMP                            |
    -> | INNODB_CMPMEM                         |
    -> | INNODB_CMPMEM_RESET                   |
    -> | INNODB_CMP_PER_INDEX                  |
    -> | INNODB_CMP_PER_INDEX_RESET            |
    -> | INNODB_CMP_RESET                      |
    -> | INNODB_COLUMNS                        |
    -> | INNODB_DATAFILES                      |
    -> | INNODB_FIELDS                         |
    -> | INNODB_FOREIGN                        |
    -> | INNODB_FOREIGN_COLS                   |
    -> | INNODB_FT_BEING_DELETED               |
    -> | INNODB_FT_CONFIG                      |
    -> | INNODB_FT_DEFAULT_STOPWORD            |
    -> | INNODB_FT_DELETED                     |
    -> | INNODB_FT_INDEX_CACHE                 |
    -> | INNODB_FT_INDEX_TABLE                 |
    -> | INNODB_INDEXES                        |
d    -> | INNODB_METRICS                        |
    -> | INNODB_SESSION_TEMP_TABLESPACES       |
    -> | INNODB_TABLES                         |
    -> | INNODB_TABLESPACES                    |
    -> | INNODB_TABLESPACES_BRIEF              |
    -> | INNODB_TABLESTATS                     |
    -> | INNODB_TEMP_TABLE_INFO                |
    -> | INNODB_TRX                            |
    -> | INNODB_VIRTUAL                        |
    -> | KEYWORDS                              |
    -> | KEY_COLUMN_USAGE                      |
    -> | OPTIMIZER_TRACE                       |
    -> | PARAMETERS                            |
    -> | PARTITIONS                            |
    -> | PLUGINS                               |
    -> | PROCESSLIST                           |
    -> | PROFILING                             |
    -> | REFERENTIAL_CONSTRAINTS               |
    -> | RESOURCE_GROUPS                       |
    -> | ROLE_COLUMN_GRANTS                    |
    -> | ROLE_ROUTINE_GRANTS                   |
    -> | ROLE_TABLE_GRANTS                     |
    -> | ROUTINES                              |
    -> | SCHEMATA                              |
    -> | SCHEMATA_EXTENSIONS                   |
      -> | SCHEMA_PRIVILEGES                     |
    -> | STATISTICS                            |
    -> | ST_GEOMETRY_COLUMNS                   |
    -> | ST_SPATIAL_REFERENCE_SYSTEMS          |
    -> | ST_UNITS_OF_MEASURE                   |
    -> | TABLES                                |
    -> | TABLESPACES                           |
    -> | TABLESPACES_EXTENSIONS                |
    -> | TABLES_EXTENSIONS                     |
    -> | TABLE_CONSTRAINTS                     |
    -> | TABLE_CONSTRAINTS_EXTENSIONS          |
    -> | TABLE_PRIVILEGES                      |
    -> | TRIGGERS                              |
    -> | USER_ATTRIBUTES                       |
    -> | USER_PRIVILEGES                       |
    -> | VIEWS                                 |
    -> | VIEW_ROUTINE_USAGE                    |
    -> | VIEW_TABLE_USAGE                      |
    -> +---------------------------------------+
    -> 79 rows in set (0.00 sec)
    -> 
    -> mysql> select*from TABLE_CONSTRAINTS;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '+---------------------------------------+
| Tables_in_information_schema        ' at line 1
mysql> +--------------------+--------------------+----------------------+--------------------+------------------------------------------------------+-----------------+----------+
    -> | CONSTRAINT_CATALOG | CONSTRAINT_SCHEMA  | CONSTRAINT_NAME      | TABLE_SCHEMA       | TABLE_NAME                                           | CONSTRAINT_TYPE | ENFORCED |
    -> +--------------------+--------------------+----------------------+--------------------+------------------------------------------------------+-----------------+----------+
    -> | def                | mysql              | PRIMARY              | mysql              | innodb_table_stats                                   | PRIMARY KEY     | YES      |
    -> | def                | mysql              | PRIMARY              | mysql              | innodb_index_stats                                   | PRIMARY KEY     | YES      |
    -> | def                | mysql              | PRIMARY              | mysql              | replication_group_configuration_version              | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | cond_instances                                       | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | error_log                                            | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | events_waits_current                                 | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | events_waits_history                                 | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | HOST                 | performance_schema | events_waits_summary_by_host_by_event_name           | UNIQUE          | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | events_waits_summary_by_instance                     | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | events_waits_summary_by_thread_by_event_name         | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | USER                 | performance_schema | events_waits_summary_by_user_by_event_name           | UNIQUE          | YES      |
    -> | def                | performance_schema | ACCOUNT              | performance_schema | events_waits_summary_by_account_by_event_name        | UNIQUE          | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | events_waits_summary_global_by_event_name            | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | file_instances                                       | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | file_summary_by_event_name                           | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | file_summary_by_instance                             | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | host_cache                                           | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | mutex_instances                                      | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | OBJECT               | performance_schema | objects_summary_global_by_type                       | UNIQUE          | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | processlist                                          | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | rwlock_instances                                     | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | setup_actors                                         | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | setup_consumers                                      | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | setup_instruments                                    | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | OBJECT               | performance_schema | setup_objects                                        | UNIQUE          | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | setup_threads                                        | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | OBJECT               | performance_schema | table_io_waits_summary_by_index_usage                | UNIQUE          | YES      |
    -> | def                | performance_schema | OBJECT               | performance_schema | table_io_waits_summary_by_table                      | UNIQUE          | YES      |
    -> | def                | performance_schema | OBJECT               | performance_schema | table_lock_waits_summary_by_table                    | UNIQUE          | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | threads                                              | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | events_stages_current                                | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | events_stages_history                                | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | events_stages_summary_by_thread_by_event_name        | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | ACCOUNT              | performance_schema | events_stages_summary_by_account_by_event_name       | UNIQUE          | YES      |
    -> | def                | performance_schema | USER                 | performance_schema | events_stages_summary_by_user_by_event_name          | UNIQUE          | YES      |
    -> | def                | performance_schema | HOST                 | performance_schema | events_stages_summary_by_host_by_event_name          | UNIQUE          | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | events_stages_summary_global_by_event_name           | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | events_statements_current                            | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | events_statements_history                            | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | events_statements_summary_by_thread_by_event_name    | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | ACCOUNT              | performance_schema | events_statements_summary_by_account_by_event_name   | UNIQUE          | YES      |
    -> | def                | performance_schema | USER                 | performance_schema | events_statements_summary_by_user_by_event_name      | UNIQUE          | YES      |
    -> | def                | performance_schema | HOST                 | performance_schema | events_statements_summary_by_host_by_event_name      | UNIQUE          | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | events_statements_summary_global_by_event_name       | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | SCHEMA_NAME          | performance_schema | events_statements_summary_by_digest                  | UNIQUE          | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | events_statements_summary_by_program                 | PRIMARY KEY     | YES      |
      -> | def                | performance_schema | PRIMARY              | performance_schema | events_statements_histogram_global                   | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | SCHEMA_NAME          | performance_schema | events_statements_histogram_by_digest                | UNIQUE          | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | events_transactions_current                          | PRIMARY KEY     | YES      |
     -> | def                | performance_schema | PRIMARY              | performance_schema | events_transactions_history                          | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | events_transactions_summary_by_thread_by_event_name  | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | ACCOUNT              | performance_schema | events_transactions_summary_by_account_by_event_name | UNIQUE          | YES      |
    -> | def                | performance_schema | USER                 | performance_schema | events_transactions_summary_by_user_by_event_name    | UNIQUE          | YES      |
    -> | def                | performance_schema | HOST                 | performance_schema | events_transactions_summary_by_host_by_event_name    | UNIQUE          | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | events_transactions_summary_global_by_event_name     | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | USER                 | performance_schema | events_errors_summary_by_user_by_error               | UNIQUE          | YES      |
    -> | def                | performance_schema | HOST                 | performance_schema | events_errors_summary_by_host_by_error               | UNIQUE          | YES      |
    -> | def                | performance_schema | ACCOUNT              | performance_schema | events_errors_summary_by_account_by_error            | UNIQUE          | YES      |
    -> | def                | performance_schema | THREAD_ID            | performance_schema | events_errors_summary_by_thread_by_error             | UNIQUE          | YES      |
    -> | def                | performance_schema | ERROR_NUMBER         | performance_schema | events_errors_summary_global_by_error                | UNIQUE          | YES      |
    -> | def                | performance_schema | USER                 | performance_schema | users                                                | UNIQUE          | YES      |
    -> | def                | performance_schema | ACCOUNT              | performance_schema | accounts                                             | UNIQUE          | YES      |
    -> | def                | performance_schema | HOST                 | performance_schema | hosts                                                | UNIQUE          | YES      |
     -> | def                | performance_schema | PRIMARY              | performance_schema | socket_instances                                     | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | socket_summary_by_instance                           | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | socket_summary_by_event_name                         | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | session_connect_attrs                                | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | session_account_connect_attrs                        | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | memory_summary_global_by_event_name                  | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | ACCOUNT              | performance_schema | memory_summary_by_account_by_event_name              | UNIQUE          | YES      |
    -> | def                | performance_schema | HOST                 | performance_schema | memory_summary_by_host_by_event_name                 | UNIQUE          | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | memory_summary_by_thread_by_event_name               | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | USER                 | performance_schema | memory_summary_by_user_by_event_name                 | UNIQUE          | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | table_handles                                        | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | metadata_locks                                       | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | data_locks                                           | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | replication_connection_configuration                 | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | replication_connection_status                        | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | replication_applier_configuration                    | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | replication_applier_status                           | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | replication_applier_status_by_coordinator            | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | replication_applier_status_by_worker                 | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | OWNER_THREAD_ID      | performance_schema | prepared_statements_instances                        | UNIQUE          | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | prepared_statements_instances                        | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | user_variables_by_thread                             | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | ACCOUNT              | performance_schema | status_by_account                                    | UNIQUE          | YES      |
    -> | def                | performance_schema | HOST                 | performance_schema | status_by_host                                       | UNIQUE          | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | status_by_thread                                     | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | USER                 | performance_schema | status_by_user                                       | UNIQUE          | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | global_status                                        | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | session_status                                       | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | variables_by_thread                                  | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | global_variables                                     | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | session_variables                                    | PRIMARY KEY     | YES      |
     -> | def                | performance_schema | PRIMARY              | performance_schema | persisted_variables                                  | PRIMARY KEY     | YES      |
    -> | def                | performance_schema | PRIMARY              | performance_schema | user_defined_functions                               | PRIMARY KEY     | YES      |
    -> | def                | mysql              | PRIMARY              | mysql              | component                                            | PRIMARY KEY     | YES      |
    -> | def                | mysql              | PRIMARY              | mysql              | columns_priv                                         | PRIMARY KEY     | YES      |
    -> | def                | mysql              | PRIMARY              | mysql              | db                                                   | PRIMARY KEY     | YES      |
     -> | def                | mysql              | PRIMARY              | mysql              | default_roles                                        | PRIMARY KEY     | YES      |
    -> | def                | mysql              | PRIMARY              | mysql              | engine_cost                                          | PRIMARY KEY     | YES      |
    -> | def                | mysql              | PRIMARY              | mysql              | global_grants                                        | PRIMARY KEY     | YES      |
    -> | def                | mysql              | name                 | mysql              | help_category                                        | UNIQUE          | YES      |
    -> | def                | mysql              | PRIMARY              | mysql              | help_category                                        | PRIMARY KEY     | YES      |
    -> | def                | mysql              | name                 | mysql              | help_keyword                                         | UNIQUE          | YES      |
    -> | def                | mysql              | PRIMARY              | mysql              | help_keyword                                         | PRIMARY KEY     | YES      |
    -> | def                | mysql              | PRIMARY              | mysql              | help_relation                                        | PRIMARY KEY     | YES      |
    -> | def                | mysql              | name                 | mysql              | help_topic                                           | UNIQUE          | YES      |
    -> | def                | mysql              | PRIMARY              | mysql              | help_topic                                           | PRIMARY KEY     | YES      |
    -> | def                | mysql              | PRIMARY              | mysql              | plugin                                               | PRIMARY KEY     | YES      |
    -> | def                | mysql              | PRIMARY              | mysql              | password_history                                     | PRIMARY KEY     | YES      |
    -> | def                | mysql              | PRIMARY              | mysql              | proxies_priv                                         | PRIMARY KEY     | YES      |
    -> | def                | mysql              | PRIMARY              | mysql              | role_edges                                           | PRIMARY KEY     | YES      |
    -> | def                | mysql              | PRIMARY              | mysql              | servers                                              | PRIMARY KEY     | YES      |
    -> | def                | mysql              | PRIMARY              | mysql              | server_cost                                          | PRIMARY KEY     | YES      |
            -> | def                | mysql              | PRIMARY              | mysql              | replication_asynchronous_connection_failover         | PRIMARY KEY     | YES      |
    -> | def                | mysql              | PRIMARY              | mysql              | replication_asynchronous_connection_failover_managed | PRIMARY KEY     | YES      |
    -> | def                | mysql              | PRIMARY              | mysql              | replication_group_member_actions                     | PRIMARY KEY     | YES      |
    -> | def                | mysql              | PRIMARY              | mysql              | tables_priv                                          | PRIMARY KEY     | YES      |
                    -> | def                | mysql              | PRIMARY              | mysql              | time_zone_name                                       | PRIMARY KEY     | YES      |
    -> | def                | mysql              | PRIMARY              | mysql              | time_zone_leap_second                                | PRIMARY KEY     | YES      |
    -> | def                | mysql              | PRIMARY              | mysql              | time_zone_transition                                 | PRIMARY KEY     | YES      |
    -> | def                | mysql              | PRIMARY              | mysql              | time_zone_transition_type                            | PRIMARY KEY     | YES      |
    -> | def                | mysql              | PRIMARY              | mysql              | func                                                 | PRIMARY KEY     | YES      |
    -> | def                | mysql              | PRIMARY              | mysql              | gtid_executed                                        | PRIMARY KEY     | YES      |
    -> | def                | mysql              | PRIMARY              | mysql              | slave_master_info                                    | PRIMARY KEY     | YES      |
    -> | def                | mysql              | PRIMARY              | mysql              | slave_worker_info                                    | PRIMARY KEY     | YES      |
    -> | def                | mysql              | PRIMARY              | mysql              | slave_relay_log_info                                 | PRIMARY KEY     | YES      |
     -> | def                | mysql              | PRIMARY              | mysql              | procs_priv                                           | PRIMARY KEY     | YES      |
    -> | def                | mysql              | PRIMARY              | mysql              | user                                                 | PRIMARY KEY     | YES      |
    -> | def                | mysql              | PRIMARY              | mysql              | time_zone                                            | PRIMARY KEY     | YES      |
    -> | def                | sys                | PRIMARY              | sys                | sys_config                                           | PRIMARY KEY     | YES      |
    -> | def                | Example            | PRIMARY              | Example            | booklist                                             | PRIMARY KEY     | YES      |
    -> | def                | Example            | library_ibfk_1       | Example            | library                                              | FOREIGN KEY     | YES      |
    -> | def                | blazers            | examno               | blazers            | marks                                                | UNIQUE          | YES      |
    -> | def                | blazers            | marks_ibfk_1         | blazers            | marks                                                | FOREIGN KEY     | YES      |
    -> | def                | blazers            | PRIMARY              | blazers            | student                                              | PRIMARY KEY     | YES      |
    -> | def                | blazers            | marklist_ibfk_1      | blazers            | marklist                                             | FOREIGN KEY     | YES      |
    -> | def                | Example            | PRIMARY              | Example            | student                                              | PRIMARY KEY     | YES      |
    -> | def                | Example            | PRIMARY              | Example            | studlist                                             | PRIMARY KEY     | YES      |
    -> | def                | Example            | PRIMARY              | Example            | studlist_1                                           | PRIMARY KEY     | YES      |
    -> | def                | Example            | PRIMARY              | Example            | teacher                                              | PRIMARY KEY     | YES      |
    -> | def                | blazers            | Phone                | blazers            | constraints                                          | UNIQUE          | YES      |
    -> | def                | blazers            | PRIMARY              | blazers            | constraints                                          | PRIMARY KEY     | YES      |
    -> | def                | blazers            | foreign_key_ibfk_1   | blazers            | foreign_key                                          | FOREIGN KEY     | YES      |
    -> | def                | lab                | PRIMARY              | lab                | student_class                                        | PRIMARY KEY     | YES      |
    -> | def                | lab                | student_class_ibfk_1 | lab                | student_class                                        | FOREIGN KEY     | YES      |
    -> | def                | lab                | student_class_chk_1  | lab                | student_class                                        | CHECK           | YES      |
    -> | def                | lab                | student_class_chk_2  | lab                | student_class                                        | CHECK           | YES      |
    -> | def                | lab                | Email                | lab                | students                                             | UNIQUE          | YES      |
    -> | def                | lab                | PRIMARY              | lab                | students                                             | PRIMARY KEY     | YES      |
    -> | def                | lab                | students_chk_1       | lab                | students                                             | CHECK           | YES      |
    -> | def                | Academy            | PRIMARY              | Academy            | user                                                 | PRIMARY KEY     | YES      |
    -> | def                | Academy            | PRIMARY              | Academy            | batches                                              | PRIMARY KEY     | YES      |
    -> | def                | Academy            | PRIMARY              | Academy            | courses                                              | PRIMARY KEY     | YES      |
    -> | def                | Academy            | PRIMARY              | Academy            | batch_users                                          | PRIMARY KEY     | YES      |
     -> | def                | Academy            | batch_users_ibfk_1   | Academy            | batch_users                                          | FOREIGN KEY     | YES      |
    -> | def                | Academy            | batch_users_ibfk_2   | Academy            | batch_users                                          | FOREIGN KEY     | YES      |
     -> | def                | Academy            | PRIMARY              | Academy            | batch_courses                                        | PRIMARY KEY     | YES      |
    -> | def                | Academy            | batch_courses_ibfk_1 | Academy            | batch_courses                                        | FOREIGN KEY     | YES      |
    -> | def                | Academy            | batch_courses_ibfk_2 | Academy            | batch_courses                                        | FOREIGN KEY     | YES      |
    -> | def                | views              | PRIMARY              | views              | register                                             | PRIMARY KEY     | YES      |
    -> | def                | subqueries         | PRIMARY              | subqueries         | score                                                | PRIMARY KEY     | YES      |
    -> | def                | subqueries         | PRIMARY              | subqueries         | student_marks                                        | PRIMARY KEY     | YES      |
    -> | def                | FANTASTIC_JOURNEYS | Email                | FANTASTIC_JOURNEYS | User                                                 | UNIQUE          | YES      |
    -> | def                | FANTASTIC_JOURNEYS | Password             | FANTASTIC_JOURNEYS | User                                                 | UNIQUE          | YES      |
    -> | def                | FANTASTIC_JOURNEYS | Phone_no             | FANTASTIC_JOURNEYS | User                                                 | UNIQUE          | YES      |
      -> | def                | FANTASTIC_JOURNEYS | PRIMARY              | FANTASTIC_JOURNEYS | User                                                 | PRIMARY KEY     | YES      |
    -> | def                | FANTASTIC_JOURNEYS | PRIMARY              | FANTASTIC_JOURNEYS | Contact                                              | PRIMARY KEY     | YES      |
    -> | def                | FANTASTIC_JOURNEYS | Contact_ibfk_1       | FANTASTIC_JOURNEYS | Contact                                              | FOREIGN KEY     | YES      |
     -> | def                | FANTASTIC_JOURNEYS | PRIMARY              | FANTASTIC_JOURNEYS | Reviews                                              | PRIMARY KEY     | YES      |
    -> | def                | FANTASTIC_JOURNEYS | Reviews_ibfk_1       | FANTASTIC_JOURNEYS | Reviews                                              | FOREIGN KEY     | YES      |
    -> | def                | FANTASTIC_JOURNEYS | PRIMARY              | FANTASTIC_JOURNEYS | Plan_trip                                            | PRIMARY KEY     | YES      |
    -> | def                | FANTASTIC_JOURNEYS | Plan_trip_ibfk_1     | FANTASTIC_JOURNEYS | Plan_trip                                            | FOREIGN KEY     | YES      |
    -> | def                | FANTASTIC_JOURNEYS | Plan_trip_chk_1      | FANTASTIC_JOURNEYS | Plan_trip                                            | CHECK           | YES      |
    -> | def                | FANTASTIC_JOURNEYS | Plan_trip_chk_2      | FANTASTIC_JOURNEYS | Plan_trip                                            | CHECK           | YES      |
    -> | def                | FANTASTIC_JOURNEYS | PRIMARY              | FANTASTIC_JOURNEYS | Booking                                              | PRIMARY KEY     | YES      |
    -> | def                | FANTASTIC_JOURNEYS | Booking_ibfk_1       | FANTASTIC_JOURNEYS | Booking                                              | FOREIGN KEY     | YES      |
    -> | def                | FANTASTIC_JOURNEYS | Booking_chk_1        | FANTASTIC_JOURNEYS | Booking                                              | CHECK           | YES      |
    -> | def                | FANTASTIC_JOURNEYS | Account_no           | FANTASTIC_JOURNEYS | Payments                                             | UNIQUE          | YES      |
    -> | def                | FANTASTIC_JOURNEYS | PRIMARY              | FANTASTIC_JOURNEYS | Payments                                             | PRIMARY KEY     | YES      |
    -> | def                | FANTASTIC_JOURNEYS | Payments_ibfk_1      | FANTASTIC_JOURNEYS | Payments                                             | FOREIGN KEY     | YES      |
    -> | def                | FANTASTIC_JOURNEYS | PRIMARY              | FANTASTIC_JOURNEYS | Roles                                                | PRIMARY KEY     | YES      |
    -> | def                | FANTASTIC_JOURNEYS | Roles_ibfk_1         | FANTASTIC_JOURNEYS | Roles                                                | FOREIGN KEY     | YES      |
    -> | def                | FANTASTIC_JOURNEYS | Status_ibfk_1        | FANTASTIC_JOURNEYS | Status                                               | FOREIGN KEY     | YES      |
    -> | def                | FANTASTIC_JOURNEYS | Status_ibfk_2        | FANTASTIC_JOURNEYS | Status                                               | FOREIGN KEY     | YES      |
    -> | def                | FANTASTIC_JOURNEYS | Status_chk_1         | FANTASTIC_JOURNEYS | Status                                               | CHECK           | YES      |
    -> +--------------------+--------------------+----------------------+--------------------+------------------------------------------------------+-----------------+----------+
    -> 187 rows in set (0.02 sec)
    -> 
    -> mysql> use FANTASTIC_JOURNEYS;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '+--------------------+--------------------+----------------------+--------------' at line 1
mysql> Reading table information for completion of table and column names
    -> You can turn off this feature to get a quicker startup with -A
    -> 
    -> Database changed
    -> mysql> show tables;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'Reading table information for completion of table and column names
You can turn ' at line 1
mysql> +------------------------------+
    -> | Tables_in_FANTASTIC_JOURNEYS |
    -> +------------------------------+
    -> | Booking                      |
    -> | Contact                      |
    -> | Payments                     |
    -> | Plan_trip                    |
4    -> | Reviews                      |
    -> | Roles                        |
    -> | Status                       |
    -> | User                         |
    -> | User_login                   |
    -> +------------------------------+
    -> 9 rows in set (0.00 sec)
    -> 
    -> mysql> drop table Roles;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '+------------------------------+
| Tables_in_FANTASTIC_JOURNEYS |
+-------------' at line 1
mysql> ERROR 3730 (HY000): Cannot drop table 'Roles' referenced by a foreign key constraint 'Status_ibfk_2' on table 'Status'.
    -> mysql> alter table Status drop constraint 'Status_ibfk_2';
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'ERROR 3730 (HY000): Cannot drop table 'Roles' referenced by a foreign key constr' at line 1
mysql> ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''Status_ibfk_2'' at line 1
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'ERROR 1064 (42000): You have an error in your SQL syntax' at line 1
    -> mysql> alter table Status drop constraint Status_ibfk_2;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'the manual that corresponds to your MySQL server version for the right syntax to' at line 1
mysql> Query OK, 0 rows affected (0.02 sec)
8    -> Records: 0  Duplicates: 0  Warnings: 0
    -> 
    -> mysql> drop table Roles;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'Query OK, 0 rows affected (0.02 sec)
Records: 0  Duplicates: 0  Warnings: 0

mys' at line 1
mysql> Query OK, 0 rows affected (0.03 sec)
    -> 
    -> mysql> CREATE TABLE Roles(id int primary key auto_increment,Name varchar(100) not null,Desc varchar(100) not null);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'Query OK, 0 rows affected (0.03 sec)

mysql> CREATE TABLE Roles(id int primary k' at line 1
mysql> ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'Desc varchar(100) not null)' at line 1
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'ERROR 1064 (42000): You have an error in your SQL syntax' at line 1
    -> mysql> CREATE TABLE Roles(id int primary key auto_increment,Name varchar(100) not null,desc varchar(100) not null);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'the manual that corresponds to your MySQL server version for the right syntax to' at line 1
mysql> ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'desc varchar(100) not null)' at line 1
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'ERROR 1064 (42000): You have an error in your SQL syntax' at line 1
    -> mysql> CREATE TABLE Roles(id int primary key auto_increment,Name varchar(100) not null,Role varchar(100) not null);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'the manual that corresponds to your MySQL server version for the right syntax to' at line 1
mysql> Query OK, 0 rows affected (0.05 sec)
    -> 
    -> mysql> DESC Status;
 ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'Query OK, 0 rows affected (0.05 sec)

mysql> DESC Status' at line 1
mysql> +------------+-------------+------+-----+---------+-------+
    -> | Field      | Type        | Null | Key | Default | Extra |
    -> +------------+-------------+------+-----+---------+-------+
    -> | Book_id    | int         | NO   | MUL | NULL    |       |
h    -> | status     | varchar(20) | NO   |     | NULL    |       |
    -> | Support_id | int         | YES  | MUL | NULL    |       |
    -> +------------+-------------+------+-----+---------+-------+
    -> 3 rows in set (0.01 sec)
    -> 
    -> mysql> alter table Status modify foreign key(Support_id) references Roles(id);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '+------------+-------------+------+-----+---------+-------+
| Field      | Type ' at line 1
mysql> ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'foreign key(Support_id) references Roles(id)' at line 1
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'ERROR 1064 (42000): You have an error in your SQL syntax' at line 1
    -> mysql> alter table Status add foreign key(Support_id) references Roles(id);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'the manual that corresponds to your MySQL server version for the right syntax to' at line 1
mysql> ERROR 1452 (23000): Cannot add or update a child row: a foreign key constraint fails (`FANTASTIC_JOURNEYS`.`#sql-3ba_8`, CONSTRAINT `Status_ibfk_2` FOREIGN KEY (`Support_id`) REFERENCES `Roles` (`id`))
    -> mysql> alter table Status drop column Support_id;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'ERROR 1452 (23000): Cannot add or update a child row: a foreign key constraint f' at line 1
mysql> Query OK, 0 rows affected (0.11 sec)
    -> Records: 0  Duplicates: 0  Warnings: 0
    -> 
    -> mysql> select*from Status;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'Query OK, 0 rows affected (0.11 sec)
Records: 0  Duplicates: 0  Warnings: 0

mys' at line 1
mysql> +---------+--------+
    -> | Book_id | status |
    -> +---------+--------+
    -> |       1 | Booked |
    -> |       2 | Booked |
    -> |       3 | Booked |
    -> |       4 | Booked |
    -> |       5 | Booked |
    -> |       6 | Booked |
    -> |       7 | Booked |
    -> |       8 | Booked |
    -> |       9 | Booked |
    -> |      10 | Booked |
    -> +---------+--------+
    -> 10 rows in set (0.00 sec)
    -> 
    -> mysql> insert into Roles values(1,'Admin','Can update website');
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '+---------+--------+
| Book_id | status |
+---------+--------+
|       1 | Booke' at line 1
mysql> Query OK, 1 row affected (0.01 sec)
    -> 
    -> mysql> insert into Roles values(1,'Guide','Guiding travelers');
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'Query OK, 1 row affected (0.01 sec)

mysql> insert into Roles values(1,'Guide','' at line 1
mysql> ERROR 1062 (23000): Duplicate entry '1' for key 'Roles.PRIMARY'
    -> mysql> insert into Roles values(2,'Guide','Guiding travelers');
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'ERROR 1062 (23000): Duplicate entry '1' for key 'Roles.PRIMARY'
mysql> insert in' at line 1
mysql> Query OK, 1 row affected (0.01 sec)
    -> 
    -> mysql> select*from Roles;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'Query OK, 1 row affected (0.01 sec)

mysql> select*from Roles' at line 1
mysql> +----+-------+--------------------+
    -> | id | Name  | Role               |
    -> +----+-------+--------------------+
    -> |  1 | Admin | Can update website |
    -> |  2 | Guide | Guiding travelers  |
    -> +----+-------+--------------------+
    -> 2 rows in set (0.00 sec)
    -> 
    -> mysql> insert into Roles values(3,'User','View the websites');
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '+----+-------+--------------------+
| id | Name  | Role               |
+----+--' at line 1
mysql> Query OK, 1 row affected (0.01 sec)
    -> 
    -> mysql> select*from User;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'Query OK, 1 row affected (0.01 sec)

mysql> select*from User' at line 1
mysql> +----+-----------+----------------------------+------------+----------+
    -> | ID | Name      | Email                      | Phone_no   | Password |
    -> +----+-----------+----------------------------+------------+----------+
-    -> |  1 | Swetha    | swethakarthika16@gmail.com | 9025336748 | 12345#Sm |
R    -> |  2 | Abisha    | abisha@gmail.com           | 9087654321 | abi1234@ |
    -> |  3 | Jerusheya | jerusheya@gmail.com        | 9077654321 | jeru234@ |
L    -> |  4 | Aswath    | aswath@gmail.com           | 9067654321 | aswath4$ |
    -> |  5 | Haiden    | haiden@gmail.com           | 9057654321 | haiden5$ |
    -> |  6 | Saranya   | saran@gmail.com            | 9047654321 | saran20$ |
    -> |  7 | Rishi     | rishi@gmail.com            | 9037654321 | rishi13@ |
    -> |  8 | Selva     | selva@gmail.com            | 9017654321 | selva32@ |
    -> |  9 | Santhanu  | santhanu@gmail.com         | 9027654321 | santa15* |
    -> | 10 | Riyaz     | riyaz@gmail.com            | 9016654321 | riyaz32@ |
    -> | 11 | Zendya    | zendya@gmail.com           | 8906543211 | admin123 |
    -> | 12 | Zayn      | zayn@gmail.com             | 8907654321 | admin321 |
    -> | 13 | Justin    | justin@gmail.com           | 8903212323 | admin231 |
    -> | 14 | John      | john@gmail.com             | 8906143211 | admin124 |
    -> | 15 | Ronaldo   | cr7@gmail.com              | 8909654321 | admin434 |
    -> | 16 | Thomas    | thomas@gmail.com           | 8903212123 | admin254 |
    -> | 17 | Helen     | helen@gmail.com            | 8877009911 | admin@23 |
    -> | 18 | Gardener  | garden@gmail.com           | 9012334532 | admin@12 |
    -> +----+-----------+----------------------------+------------+----------+
    -> 18 rows in set (0.00 sec)
    -> 
    -> mysql> alter table User add column Role_id int not null;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '+----+-----------+----------------------------+------------+----------+
| ID | N' at line 1
mysql> Query OK, 0 rows affected (0.06 sec)
    -> Records: 0  Duplicates: 0  Warnings: 0
 |           -> 
    -> mysql> select*from User;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'Query OK, 0 rows affected (0.06 sec)
Records: 0  Duplicates: 0  Warnings: 0

mys' at line 1
mysql> +----+-----------+----------------------------+------------+----------+---------+
    -> | ID | Name      | Email                      | Phone_no   | Password | Role_id |
    -> +----+-----------+----------------------------+------------+----------+---------+
    -> |  1 | Swetha    | swethakarthika16@gmail.com | 9025336748 | 12345#Sm |       0 |
    -> |  2 | Abisha    | abisha@gmail.com           | 9087654321 | abi1234@ |       0 |
    -> |  3 | Jerusheya | jerusheya@gmail.com        | 9077654321 | jeru234@ |       0 |
    -> |  4 | Aswath    | aswath@gmail.com           | 9067654321 | aswath4$ |       0 |
    -> |  5 | Haiden    | haiden@gmail.com           | 9057654321 | haiden5$ |       0 |
    -> |  6 | Saranya   | saran@gmail.com            | 9047654321 | saran20$ |       0 |
    -> |  7 | Rishi     | rishi@gmail.com            | 9037654321 | rishi13@ |       0 |
    -> |  8 | Selva     | selva@gmail.com            | 9017654321 | selva32@ |       0 |
    -> |  9 | Santhanu  | santhanu@gmail.com         | 9027654321 | santa15* |       0 |
    -> | 10 | Riyaz     | riyaz@gmail.com            | 9016654321 | riyaz32@ |       0 |
    -> | 11 | Zendya    | zendya@gmail.com           | 8906543211 | admin123 |       0 |
    -> | 12 | Zayn      | zayn@gmail.com             | 8907654321 | admin321 |       0 |
    -> | 13 | Justin    | justin@gmail.com           | 8903212323 | admin231 |       0 |
    -> | 14 | John      | john@gmail.com             | 8906143211 | admin124 |       0 |
    -> | 15 | Ronaldo   | cr7@gmail.com              | 8909654321 | admin434 |       0 |
    -> | 16 | Thomas    | thomas@gmail.com           | 8903212123 | admin254 |       0 |
    -> | 17 | Helen     | helen@gmail.com            | 8877009911 | admin@23 |       0 |
    -> | 18 | Gardener  | garden@gmail.com           | 9012334532 | admin@12 |       0 |
    -> +----+-----------+----------------------------+------------+----------+---------+
    -> 18 rows in set (0.00 sec)
    -> 
    -> mysql> update table User set Role_id=3 where ID<12;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '+----+-----------+----------------------------+------------+----------+---------' at line 1
mysql> ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'table User set Role_id=3 where ID<12' at line 1
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'ERROR 1064 (42000): You have an error in your SQL syntax' at line 1
    -> mysql> alter table User add foreign key(Role_id) references Roles(id);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'the manual that corresponds to your MySQL server version for the right syntax to' at line 1
mysql> ERROR 1452 (23000): Cannot add or update a child row: a foreign key constraint fails (`FANTASTIC_JOURNEYS`.`#sql-3ba_8`, CONSTRAINT `User_ibfk_1` FOREIGN KEY (`Role_id`) REFERENCES `Roles` (`id`)) 
    -> mysql> desc User;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'ERROR 1452 (23000): Cannot add or update a child row: a foreign key constraint f' at line 1
mysql> +----------+--------------+------+-----+---------+----------------+
    -> | Field    | Type         | Null | Key | Default | Extra          |
    -> +----------+--------------+------+-----+---------+----------------+
    -> | ID       | int          | NO   | PRI | NULL    | auto_increment |
    -> | Name     | varchar(100) | NO   |     | NULL    |                |
    -> | Email    | varchar(100) | NO   | UNI | NULL    |                |
    -> | Phone_no | bigint       | NO   | UNI | NULL    |                |
    -> | Password | varchar(100) | NO   | UNI | NULL    |                |
    -> | Role_id  | int          | NO   |     | NULL    |                |
    -> +----------+--------------+------+-----+---------+----------------+
    -> 6 rows in set (0.01 sec)
    -> 
    -> mysql> alter table User add foreign key(Role_id) references Roles(id);
-ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '+----------+--------------+------+-----+---------+----------------+
| Field    |' at line 1
mysql> ERROR 1452 (23000): Cannot add or update a child row: a foreign key constraint fails (`FANTASTIC_JOURNEYS`.`#sql-3ba_8`, CONSTRAINT `User_ibfk_1` FOREIGN KEY (`Role_id`) REFERENCES `Roles` (`id`)) 
    -> mysql> update User set Role_id=3 where ID<12;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'ERROR 1452 (23000): Cannot add or update a child row: a foreign key constraint f' at line 1
mysql> Query OK, 11 rows affected (0.01 sec)
    -> Rows matched: 11  Changed: 11  Warnings: 0
    -> 
    -> mysql> select*from User;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'Query OK, 11 rows affected (0.01 sec)
Rows matched: 11  Changed: 11  Warnings: 0' at line 1
mysql> +----+-----------+----------------------------+------------+----------+---------+
    -> | ID | Name      | Email                      | Phone_no   | Password | Role_id |
    -> +----+-----------+----------------------------+------------+----------+---------+
    -> |  1 | Swetha    | swethakarthika16@gmail.com | 9025336748 | 12345#Sm |       3 |
    -> |  2 | Abisha    | abisha@gmail.com           | 9087654321 | abi1234@ |       3 |
    -> |  3 | Jerusheya | jerusheya@gmail.com        | 9077654321 | jeru234@ |       3 |
    -> |  4 | Aswath    | aswath@gmail.com           | 9067654321 | aswath4$ |       3 |
    -> |  5 | Haiden    | haiden@gmail.com           | 9057654321 | haiden5$ |       3 |
    -> |  6 | Saranya   | saran@gmail.com            | 9047654321 | saran20$ |       3 |
    -> |  7 | Rishi     | rishi@gmail.com            | 9037654321 | rishi13@ |       3 |
|    -> |  8 | Selva     | selva@gmail.com            | 9017654321 | selva32@ |       3 |
    -> |  9 | Santhanu  | santhanu@gmail.com         | 9027654321 | santa15* |       3 |
    -> | 10 | Riyaz     | riyaz@gmail.com            | 9016654321 | riyaz32@ |       3 |
    -> | 11 | Zendya    | zendya@gmail.com           | 8906543211 | admin123 |       3 |
    -> | 12 | Zayn      | zayn@gmail.com             | 8907654321 | admin321 |       0 |
    -> | 13 | Justin    | justin@gmail.com           | 8903212323 | admin231 |       0 |
    -> | 14 | John      | john@gmail.com             | 8906143211 | admin124 |       0 |
    -> | 15 | Ronaldo   | cr7@gmail.com              | 8909654321 | admin434 |       0 |
    -> | 16 | Thomas    | thomas@gmail.com           | 8903212123 | admin254 |       0 |
    -> | 17 | Helen     | helen@gmail.com            | 8877009911 | admin@23 |       0 |
    -> | 18 | Gardener  | garden@gmail.com           | 9012334532 | admin@12 |       0 |
    -> +----+-----------+----------------------------+------------+----------+---------+
    -> 18 rows in set (0.00 sec)
    -> 
    -> mysql> update User set Role_id=2 where ID<17;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '+----+-----------+----------------------------+------------+----------+---------' at line 1
mysql> Query OK, 16 rows affected (0.01 sec)
    -> Rows matched: 16  Changed: 16  Warnings: 0
    -> 
    -> mysql> select*from User;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'Query OK, 16 rows affected (0.01 sec)
Rows matched: 16  Changed: 16  Warnings: 0' at line 1
mysql> +----+-----------+----------------------------+------------+----------+---------+
    -> | ID | Name      | Email                      | Phone_no   | Password | Role_id |
    -> +----+-----------+----------------------------+------------+----------+---------+
    -> |  1 | Swetha    | swethakarthika16@gmail.com | 9025336748 | 12345#Sm |       2 |
    -> |  2 | Abisha    | abisha@gmail.com           | 9087654321 | abi1234@ |       2 |
    -> |  3 | Jerusheya | jerusheya@gmail.com        | 9077654321 | jeru234@ |       2 |
    -> |  4 | Aswath    | aswath@gmail.com           | 9067654321 | aswath4$ |       2 |
    -> |  5 | Haiden    | haiden@gmail.com           | 9057654321 | haiden5$ |       2 |
    -> |  6 | Saranya   | saran@gmail.com            | 9047654321 | saran20$ |       2 |
    -> |  7 | Rishi     | rishi@gmail.com            | 9037654321 | rishi13@ |       2 |
    -> |  8 | Selva     | selva@gmail.com            | 9017654321 | selva32@ |       2 |
    -> |  9 | Santhanu  | santhanu@gmail.com         | 9027654321 | santa15* |       2 |
    -> | 10 | Riyaz     | riyaz@gmail.com            | 9016654321 | riyaz32@ |       2 |
    -> | 11 | Zendya    | zendya@gmail.com           | 8906543211 | admin123 |       2 |
    -> | 12 | Zayn      | zayn@gmail.com             | 8907654321 | admin321 |       2 |
    -> | 13 | Justin    | justin@gmail.com           | 8903212323 | admin231 |       2 |
    -> | 14 | John      | john@gmail.com             | 8906143211 | admin124 |       2 |
    -> | 15 | Ronaldo   | cr7@gmail.com              | 8909654321 | admin434 |       2 |
    -> | 16 | Thomas    | thomas@gmail.com           | 8903212123 | admin254 |       2 |
    -> | 17 | Helen     | helen@gmail.com            | 8877009911 | admin@23 |       0 |
    -> | 18 | Gardener  | garden@gmail.com           | 9012334532 | admin@12 |       0 |
    -> +----+-----------+----------------------------+------------+----------+---------+
    -> 18 rows in set (0.00 sec)
    -> 
    -> mysql> update User set Role_id=2 where ID<19;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '+----+-----------+----------------------------+------------+----------+---------' at line 1
mysql> Query OK, 2 rows affected (0.01 sec)
    -> Rows matched: 18  Changed: 2  Warnings: 0
    -> 
    -> mysql> select*from User;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'Query OK, 2 rows affected (0.01 sec)
Rows matched: 18  Changed: 2  Warnings: 0

' at line 1
mysql> +----+-----------+----------------------------+------------+----------+---------+
om    -> | ID | Name      | Email                      | Phone_no   | Password | Role_id |
    -> +----+-----------+----------------------------+------------+----------+---------+
    -> |  1 | Swetha    | swethakarthika16@gmail.com | 9025336748 | 12345#Sm |       2 |
    -> |  2 | Abisha    | abisha@gmail.com           | 9087654321 | abi1234@ |       2 |
    -> |  3 | Jerusheya | jerusheya@gmail.com        | 9077654321 | jeru234@ |       2 |
    -> |  4 | Aswath    | aswath@gmail.com           | 9067654321 | aswath4$ |       2 |
    -> |  5 | Haiden    | haiden@gmail.com           | 9057654321 | haiden5$ |       2 |
    -> |  6 | Saranya   | saran@gmail.com            | 9047654321 | saran20$ |       2 |
    -> |  7 | Rishi     | rishi@gmail.com            | 9037654321 | rishi13@ |       2 |
    -> |  8 | Selva     | selva@gmail.com            | 9017654321 | selva32@ |       2 |
    -> |  9 | Santhanu  | santhanu@gmail.com         | 9027654321 | santa15* |       2 |
    -> | 10 | Riyaz     | riyaz@gmail.com            | 9016654321 | riyaz32@ |       2 |
    -> | 11 | Zendya    | zendya@gmail.com           | 8906543211 | admin123 |       2 |
    -> | 12 | Zayn      | zayn@gmail.com             | 8907654321 | admin321 |       2 |
    -> | 13 | Justin    | justin@gmail.com           | 8903212323 | admin231 |       2 |
    -> | 14 | John      | john@gmail.com             | 8906143211 | admin124 |       2 |
    -> | 15 | Ronaldo   | cr7@gmail.com              | 8909654321 | admin434 |       2 |
    -> | 16 | Thomas    | thomas@gmail.com           | 8903212123 | admin254 |       2 |
    -> | 17 | Helen     | helen@gmail.com            | 8877009911 | admin@23 |       2 |
    -> | 18 | Gardener  | garden@gmail.com           | 9012334532 | admin@12 |       2 |
    -> +----+-----------+----------------------------+------------+----------+---------+
    -> 18 rows in set (0.00 sec)
    -> 
    -> mysql> update User set Role_id=2 where ID<12;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '+----+-----------+----------------------------+------------+----------+---------' at line 1
mysql> Query OK, 0 rows affected (0.00 sec)
    -> Rows matched: 11  Changed: 0  Warnings: 0
    -> 
    -> mysql> update User set Role_id=1 where ID<12;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'Query OK, 0 rows affected (0.00 sec)
Rows matched: 11  Changed: 0  Warnings: 0

' at line 1
mysql> Query OK, 11 rows affected (0.01 sec)
    -> Rows matched: 11  Changed: 11  Warnings: 0
    -> 
    -> mysql> update User set Role_id=2 where ID<17;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'Query OK, 11 rows affected (0.01 sec)
Rows matched: 11  Changed: 11  Warnings: 0' at line 1
mysql> Query OK, 11 rows affected (0.01 sec)
    -> Rows matched: 16  Changed: 11  Warnings: 0
    -> 
    -> mysql> update User set Role_id=1 where ID<12;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'Query OK, 11 rows affected (0.01 sec)
Rows matched: 16  Changed: 11  Warnings: 0' at line 1
mysql> Query OK, 11 rows affected (0.01 sec)
    -> Rows matched: 11  Changed: 11  Warnings: 0
    -> 
    -> mysql> update User set Role_id=2 where ID>12 and ID<17 ;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'Query OK, 11 rows affected (0.01 sec)
Rows matched: 11  Changed: 11  Warnings: 0' at line 1
mysql> Query OK, 0 rows affected (0.00 sec)
    -> Rows matched: 4  Changed: 0  Warnings: 0
     -> 
    -> mysql> select*from User;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'Query OK, 0 rows affected (0.00 sec)
Rows matched: 4  Changed: 0  Warnings: 0

m' at line 1
mysql> +----+-----------+----------------------------+------------+----------+---------+
    -> | ID | Name      | Email                      | Phone_no   | Password | Role_id |
    -> +----+-----------+----------------------------+------------+----------+---------+
    -> |  1 | Swetha    | swethakarthika16@gmail.com | 9025336748 | 12345#Sm |       1 |
    -> |  2 | Abisha    | abisha@gmail.com           | 9087654321 | abi1234@ |       1 |
    -> |  3 | Jerusheya | jerusheya@gmail.com        | 9077654321 | jeru234@ |       1 |
    -> |  4 | Aswath    | aswath@gmail.com           | 9067654321 | aswath4$ |       1 |
    -> |  5 | Haiden    | haiden@gmail.com           | 9057654321 | haiden5$ |       1 |
    -> |  6 | Saranya   | saran@gmail.com            | 9047654321 | saran20$ |       1 |
    -> |  7 | Rishi     | rishi@gmail.com            | 9037654321 | rishi13@ |       1 |
    -> |  8 | Selva     | selva@gmail.com            | 9017654321 | selva32@ |       1 |
    -> |  9 | Santhanu  | santhanu@gmail.com         | 9027654321 | santa15* |       1 |
    -> | 10 | Riyaz     | riyaz@gmail.com            | 9016654321 | riyaz32@ |       1 |
    -> | 11 | Zendya    | zendya@gmail.com           | 8906543211 | admin123 |       1 |
    -> | 12 | Zayn      | zayn@gmail.com             | 8907654321 | admin321 |       2 |
    -> | 13 | Justin    | justin@gmail.com           | 8903212323 | admin231 |       2 |
    -> | 14 | John      | john@gmail.com             | 8906143211 | admin124 |       2 |
    -> | 15 | Ronaldo   | cr7@gmail.com              | 8909654321 | admin434 |       2 |
    -> | 16 | Thomas    | thomas@gmail.com           | 8903212123 | admin254 |       2 |
    -> | 17 | Helen     | helen@gmail.com            | 8877009911 | admin@23 |       2 |
    -> | 18 | Gardener  | garden@gmail.com           | 9012334532 | admin@12 |       2 |
    -> +----+-----------+----------------------------+------------+----------+---------+
    -> 18 rows in set (0.00 sec)
    -> 
    -> mysql> update User set Role_id=3 where ID<11;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '+----+-----------+----------------------------+------------+----------+---------' at line 1
mysql> Query OK, 10 rows affected (0.01 sec)
    -> Rows matched: 10  Changed: 10  Warnings: 0
    -> 
    -> mysql> select*from User;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'Query OK, 10 rows affected (0.01 sec)
Rows matched: 10  Changed: 10  Warnings: 0' at line 1
mysql> +----+-----------+----------------------------+------------+----------+---------+
    -> | ID | Name      | Email                      | Phone_no   | Password | Role_id |
    -> +----+-----------+----------------------------+------------+----------+---------+
    -> |  1 | Swetha    | swethakarthika16@gmail.com | 9025336748 | 12345#Sm |       3 |
    -> |  2 | Abisha    | abisha@gmail.com           | 9087654321 | abi1234@ |       3 |
    -> |  3 | Jerusheya | jerusheya@gmail.com        | 9077654321 | jeru234@ |       3 |
i    -> |  4 | Aswath    | aswath@gmail.com           | 9067654321 | aswath4$ |       3 |
    -> |  5 | Haiden    | haiden@gmail.com           | 9057654321 | haiden5$ |       3 |
    -> |  6 | Saranya   | saran@gmail.com            | 9047654321 | saran20$ |       3 |
    -> |  7 | Rishi     | rishi@gmail.com            | 9037654321 | rishi13@ |       3 |
    -> |  8 | Selva     | selva@gmail.com            | 9017654321 | selva32@ |       3 |
    -> |  9 | Santhanu  | santhanu@gmail.com         | 9027654321 | santa15* |       3 |
    -> | 10 | Riyaz     | riyaz@gmail.com            | 9016654321 | riyaz32@ |       3 |
    -> | 11 | Zendya    | zendya@gmail.com           | 8906543211 | admin123 |       1 |
    -> | 12 | Zayn      | zayn@gmail.com             | 8907654321 | admin321 |       2 |
    -> | 13 | Justin    | justin@gmail.com           | 8903212323 | admin231 |       2 |
    -> | 14 | John      | john@gmail.com             | 8906143211 | admin124 |       2 |
    -> | 15 | Ronaldo   | cr7@gmail.com              | 8909654321 | admin434 |       2 |
    -> | 16 | Thomas    | thomas@gmail.com           | 8903212123 | admin254 |       2 |
    -> | 17 | Helen     | helen@gmail.com            | 8877009911 | admin@23 |       2 |
    -> | 18 | Gardener  | garden@gmail.com           | 9012334532 | admin@12 |       2 |
    -> +----+-----------+----------------------------+------------+----------+---------+
    -> 18 rows in set (0.00 sec)
    -> 
    -> mysql> update User set Role_id=2 where ID>10 and ID<17 ;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '+----+-----------+----------------------------+------------+----------+---------' at line 1
mysql> Query OK, 1 row affected (0.01 sec)
    -> Rows matched: 6  Changed: 1  Warnings: 0
    -> 
    -> mysql> select*from User;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'Query OK, 1 row affected (0.01 sec)
Rows matched: 6  Changed: 1  Warnings: 0

my' at line 1
mysql> +----+-----------+----------------------------+------------+----------+---------+
    -> | ID | Name      | Email                      | Phone_no   | Password | Role_id |
    -> +----+-----------+----------------------------+------------+----------+---------+
    -> |  1 | Swetha    | swethakarthika16@gmail.com | 9025336748 | 12345#Sm |       3 |
    -> |  2 | Abisha    | abisha@gmail.com           | 9087654321 | abi1234@ |       3 |
     -> |  3 | Jerusheya | jerusheya@gmail.com        | 9077654321 | jeru234@ |       3 |
    -> |  4 | Aswath    | aswath@gmail.com           | 9067654321 | aswath4$ |       3 |
    -> |  5 | Haiden    | haiden@gmail.com           | 9057654321 | haiden5$ |       3 |
    -> |  6 | Saranya   | saran@gmail.com            | 9047654321 | saran20$ |       3 |
    -> |  7 | Rishi     | rishi@gmail.com            | 9037654321 | rishi13@ |       3 |
    -> |  8 | Selva     | selva@gmail.com            | 9017654321 | selva32@ |       3 |
    -> |  9 | Santhanu  | santhanu@gmail.com         | 9027654321 | santa15* |       3 |
    -> | 10 | Riyaz     | riyaz@gmail.com            | 9016654321 | riyaz32@ |       3 |
    -> | 11 | Zendya    | zendya@gmail.com           | 8906543211 | admin123 |       2 |
    -> | 12 | Zayn      | zayn@gmail.com             | 8907654321 | admin321 |       2 |
    -> | 13 | Justin    | justin@gmail.com           | 8903212323 | admin231 |       2 |
    -> | 14 | John      | john@gmail.com             | 8906143211 | admin124 |       2 |
    -> | 15 | Ronaldo   | cr7@gmail.com              | 8909654321 | admin434 |       2 |
    -> | 16 | Thomas    | thomas@gmail.com           | 8903212123 | admin254 |       2 |
    -> | 17 | Helen     | helen@gmail.com            | 8877009911 | admin@23 |       2 |
    -> | 18 | Gardener  | garden@gmail.com           | 9012334532 | admin@12 |       2 |
    -> +----+-----------+----------------------------+------------+----------+---------+
    -> 18 rows in set (0.00 sec)
    -> 
    -> mysql> update User set Role_id=2 where ID>16 and ID<19 ;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '+----+-----------+----------------------------+------------+----------+---------' at line 1
mysql> Query OK, 0 rows affected (0.00 sec)
    -> Rows matched: 2  Changed: 0  Warnings: 0
    -> 
    -> mysql> select*from User;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'Query OK, 0 rows affected (0.00 sec)
Rows matched: 2  Changed: 0  Warnings: 0

m' at line 1
mysql> +----+-----------+----------------------------+------------+----------+---------+
    -> | ID | Name      | Email                      | Phone_no   | Password | Role_id |
    -> +----+-----------+----------------------------+------------+----------+---------+
    -> |  1 | Swetha    | swethakarthika16@gmail.com | 9025336748 | 12345#Sm |       3 |
    -> |  2 | Abisha    | abisha@gmail.com           | 9087654321 | abi1234@ |       3 |
     -> |  3 | Jerusheya | jerusheya@gmail.com        | 9077654321 | jeru234@ |       3 |
    -> |  4 | Aswath    | aswath@gmail.com           | 9067654321 | aswath4$ |       3 |
    -> |  5 | Haiden    | haiden@gmail.com           | 9057654321 | haiden5$ |       3 |
    -> |  6 | Saranya   | saran@gmail.com            | 9047654321 | saran20$ |       3 |
    -> |  7 | Rishi     | rishi@gmail.com            | 9037654321 | rishi13@ |       3 |
    -> |  8 | Selva     | selva@gmail.com            | 9017654321 | selva32@ |       3 |
    -> |  9 | Santhanu  | santhanu@gmail.com         | 9027654321 | santa15* |       3 |
    -> | 10 | Riyaz     | riyaz@gmail.com            | 9016654321 | riyaz32@ |       3 |
u    -> | 11 | Zendya    | zendya@gmail.com           | 8906543211 | admin123 |       2 |
    -> | 12 | Zayn      | zayn@gmail.com             | 8907654321 | admin321 |       2 |
    -> | 13 | Justin    | justin@gmail.com           | 8903212323 | admin231 |       2 |
    -> | 14 | John      | john@gmail.com             | 8906143211 | admin124 |       2 |
    -> | 15 | Ronaldo   | cr7@gmail.com              | 8909654321 | admin434 |       2 |
    -> | 16 | Thomas    | thomas@gmail.com           | 8903212123 | admin254 |       2 |
    -> | 17 | Helen     | helen@gmail.com            | 8877009911 | admin@23 |       2 |
    -> | 18 | Gardener  | garden@gmail.com           | 9012334532 | admin@12 |       2 |
    -> +----+-----------+----------------------------+------------+----------+---------+
    -> 18 rows in set (0.01 sec)
-    -> 
    -> mysql> update User set Role_id=1 where ID>16 ;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '+----+-----------+----------------------------+------------+----------+---------' at line 1
mysql> Query OK, 2 rows affected (0.01 sec)
    -> Rows matched: 2  Changed: 2  Warnings: 0
    -> 
    -> mysql> select*from User;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'Query OK, 2 rows affected (0.01 sec)
Rows matched: 2  Changed: 2  Warnings: 0

m' at line 1
mysql> +----+-----------+----------------------------+------------+----------+---------+
    -> | ID | Name      | Email                      | Phone_no   | Password | Role_id |
     -> +----+-----------+----------------------------+------------+----------+---------+
    -> |  1 | Swetha    | swethakarthika16@gmail.com | 9025336748 | 12345#Sm |       3 |
    -> |  2 | Abisha    | abisha@gmail.com           | 9087654321 | abi1234@ |       3 |
    -> |  3 | Jerusheya | jerusheya@gmail.com        | 9077654321 | jeru234@ |       3 |
    -> |  4 | Aswath    | aswath@gmail.com           | 9067654321 | aswath4$ |       3 |
    -> |  5 | Haiden    | haiden@gmail.com           | 9057654321 | haiden5$ |       3 |
u    -> |  6 | Saranya   | saran@gmail.com            | 9047654321 | saran20$ |       3 |
    -> |  7 | Rishi     | rishi@gmail.com            | 9037654321 | rishi13@ |       3 |
l    -> |  8 | Selva     | selva@gmail.com            | 9017654321 | selva32@ |       3 |
    -> |  9 | Santhanu  | santhanu@gmail.com         | 9027654321 | santa15* |       3 |
    -> | 10 | Riyaz     | riyaz@gmail.com            | 9016654321 | riyaz32@ |       3 |
    -> | 11 | Zendya    | zendya@gmail.com           | 8906543211 | admin123 |       2 |
    -> | 12 | Zayn      | zayn@gmail.com             | 8907654321 | admin321 |       2 |
    -> | 13 | Justin    | justin@gmail.com           | 8903212323 | admin231 |       2 |
s    -> | 14 | John      | john@gmail.com             | 8906143211 | admin124 |       2 |
    -> | 15 | Ronaldo   | cr7@gmail.com              | 8909654321 | admin434 |       2 |
    -> | 16 | Thomas    | thomas@gmail.com           | 8903212123 | admin254 |       2 |
    -> | 17 | Helen     | helen@gmail.com            | 8877009911 | admin@23 |       1 |
    -> | 18 | Gardener  | garden@gmail.com           | 9012334532 | admin@12 |       1 |
|    -> +----+-----------+----------------------------+------------+----------+---------+
    -> 18 rows in set (0.00 sec)
    -> 
    -> mysql> alter table User add foreign key(Role_id) references Roles(id);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '+----+-----------+----------------------------+------------+----------+---------' at line 1
mysql> Query OK, 18 rows affected (0.16 sec)
    -> Records: 18  Duplicates: 0  Warnings: 0
    -> 
    -> mysql> desc User;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'Query OK, 18 rows affected (0.16 sec)
Records: 18  Duplicates: 0  Warnings: 0

m' at line 1
mysql> +----------+--------------+------+-----+---------+----------------+
    -> | Field    | Type         | Null | Key | Default | Extra          |
    -> +----------+--------------+------+-----+---------+----------------+
    -> | ID       | int          | NO   | PRI | NULL    | auto_increment |
    -> | Name     | varchar(100) | NO   |     | NULL    |                |
    -> | Email    | varchar(100) | NO   | UNI | NULL    |                |
    -> | Phone_no | bigint       | NO   | UNI | NULL    |                |
    -> | Password | varchar(100) | NO   | UNI | NULL    |                |
    -> | Role_id  | int          | NO   | MUL | NULL    |                |
    -> +----------+--------------+------+-----+---------+----------------+
    -> 6 rows in set (0.01 sec)
    -> 
    -> mysql> drop table User_login;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '+----------+--------------+------+-----+---------+----------------+
| Field    |' at line 1
mysql> ERROR 1051 (42S02): Unknown table 'FANTASTIC_JOURNEYS.User_login'
    -> mysql> RENAME TABLE Contact to Query;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'ERROR 1051 (42S02): Unknown table 'FANTASTIC_JOURNEYS.User_login'
mysql> RENAME ' at line 1
mysql> Query OK, 0 rows affected (0.04 sec)
    -> 
    -> mysql> desc Query;
 ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'Query OK, 0 rows affected (0.04 sec)

mysql> desc Query' at line 1
mysql> +------------+--------------+------+-----+---------+----------------+
    -> | Field      | Type         | Null | Key | Default | Extra          |
    -> +------------+--------------+------+-----+---------+----------------+
    -> | contact_id | int          | NO   | PRI | NULL    | auto_increment |
    -> | user_id    | int          | NO   | MUL | NULL    |                |
    -> | Email      | varchar(100) | NO   |     | NULL    |                |
    -> | Queries    | text         | NO   |     | NULL    |                |
    -> +------------+--------------+------+-----+---------+----------------+
    -> 4 rows in set (0.00 sec)
    -> 
     -> mysql> alter table Query drop column Email;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '+------------+--------------+------+-----+---------+----------------+
| Field   ' at line 1
mysql> Query OK, 0 rows affected (0.11 sec)
    -> Records: 0  Duplicates: 0  Warnings: 0
    -> 
    -> mysql> CREATE VIEW Admin_details AS SELECT * FROM User WHERE Password LIKE 'admin%';
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'Query OK, 0 rows affected (0.11 sec)
Records: 0  Duplicates: 0  Warnings: 0

mys' at line 1
mysql> Query OK, 0 rows affected (0.02 sec)
    -> 
    -> mysql> SELECT*FROM Admin_details;
-ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'Query OK, 0 rows affected (0.02 sec)

mysql> SELECT*FROM Admin_details' at line 1
mysql> +----+----------+------------------+------------+----------+---------+
    -> | ID | Name     | Email            | Phone_no   | Password | Role_id |
-    -> +----+----------+------------------+------------+----------+---------+
    -> | 18 | Gardener | garden@gmail.com | 9012334532 | admin@12 |       1 |
    -> | 17 | Helen    | helen@gmail.com  | 8877009911 | admin@23 |       1 |
    -> | 11 | Zendya   | zendya@gmail.com | 8906543211 | admin123 |       2 |
    -> | 14 | John     | john@gmail.com   | 8906143211 | admin124 |       2 |
    -> | 13 | Justin   | justin@gmail.com | 8903212323 | admin231 |       2 |
    -> | 16 | Thomas   | thomas@gmail.com | 8903212123 | admin254 |       2 |
    -> | 12 | Zayn     | zayn@gmail.com   | 8907654321 | admin321 |       2 |
    -> | 15 | Ronaldo  | cr7@gmail.com    | 8909654321 | admin434 |       2 |
    -> +----+----------+------------------+------------+----------+---------+
    -> 8 rows in set (0.00 sec)
    -> 
    -> mysql> alter table Status add column Support_id int not null;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '+----+----------+------------------+------------+----------+---------+
| ID | Na' at line 1
mysql> Query OK, 0 rows affected (0.04 sec)
    -> Records: 0  Duplicates: 0  Warnings: 0
    -> 
    -> mysql> alter table Status add foreign key(Support_id) references Admin_details(ID);
 ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'Query OK, 0 rows affected (0.04 sec)
Records: 0  Duplicates: 0  Warnings: 0

mys' at line 1
mysql> ERROR 1824 (HY000): Failed to open the referenced table 'Admin_details'
    -> mysql> drop table Admin_details;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'ERROR 1824 (HY000): Failed to open the referenced table 'Admin_details'
mysql> d' at line 1
mysql> ERROR 1051 (42S02): Unknown table 'FANTASTIC_JOURNEYS.Admin_details'
    -> mysql> drop view Admin_details;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'ERROR 1051 (42S02): Unknown table 'FANTASTIC_JOURNEYS.Admin_details'
mysql> drop' at line 1
mysql> Query OK, 0 rows affected (0.02 sec)
    -> 
    -> mysql> CREATE TABLE Support(ID int primary key auto_increment, user_id int not null,foreign_key(user_id) references User(ID));
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'Query OK, 0 rows affected (0.02 sec)

mysql> CREATE TABLE Support(ID int primary' at line 1
mysql> ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '(user_id) references User(ID))' at line 1 
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'ERROR 1064 (42000): You have an error in your SQL syntax' at line 1
    -> mysql> CREATE TABLE Support(ID int primary key auto_increment, user_id int not null,foreign key(user_id) references User(ID));
 ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'the manual that corresponds to your MySQL server version for the right syntax to' at line 1
mysql> Query OK, 0 rows affected (0.06 sec)
    -> 
    -> mysql> desc Roles;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'Query OK, 0 rows affected (0.06 sec)

mysql> desc Roles' at line 1
mysql> +-------+--------------+------+-----+---------+----------------+
    -> | Field | Type         | Null | Key | Default | Extra          |
    -> +-------+--------------+------+-----+---------+----------------+
    -> | id    | int          | NO   | PRI | NULL    | auto_increment |
    -> | Name  | varchar(100) | NO   |     | NULL    |                |
    -> | Role  | varchar(100) | NO   |     | NULL    |                |
    -> +-------+--------------+------+-----+---------+----------------+
    -> 3 rows in set (0.01 sec)
    -> 
    -> mysql> alter table Roles modify column id tinyint;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '+-------+--------------+------+-----+---------+----------------+
| Field | Type ' at line 1
mysql> ERROR 3780 (HY000): Referencing column 'Role_id' and referenced column 'id' in foreign key constraint 'User_ibfk_1' are incompatible.
    -> mysql> alter table Roles alter column id tinyint primary key auto_increment;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'ERROR 3780 (HY000): Referencing column 'Role_id' and referenced column 'id' in f' at line 1
mysql> ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'tinyint primary key auto_increment' at line 1
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'ERROR 1064 (42000): You have an error in your SQL syntax' at line 1
    -> mysql> alter table Roles alter column id tinyint primary key auto_increment;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'the manual that corresponds to your MySQL server version for the right syntax to' at line 1
mysql> ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'tinyint primary key auto_increment' at line 1
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'ERROR 1064 (42000): You have an error in your SQL syntax' at line 1
    -> mysql> alter table Roles alter column id tinyint;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'the manual that corresponds to your MySQL server version for the right syntax to' at line 1
mysql> ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'tinyint' at line 1
oERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'ERROR 1064 (42000): You have an error in your SQL syntax' at line 1
    -> mysql> alter table Roles modify id tinyint primary key auto_increment;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'the manual that corresponds to your MySQL server version for the right syntax to' at line 1
mysql> ERROR 1068 (42000): Multiple primary key defined
    -> mysql> alter table Roles modify id tinyint;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'ERROR 1068 (42000): Multiple primary key defined
mysql> alter table Roles modify' at line 1
mysql> ERROR 3780 (HY000): Referencing column 'Role_id' and referenced column 'id' in foreign key constraint 'User_ibfk_1' are incompatible.
    -> mysql> alter table User drop constraint User_ibfk_1;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'ERROR 3780 (HY000): Referencing column 'Role_id' and referenced column 'id' in f' at line 1
mysql> Query OK, 0 rows affected (0.03 sec)
    -> Records: 0  Duplicates: 0  Warnings: 0
    -> 
    -> mysql> alter table Roles modify id tinyint;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'Query OK, 0 rows affected (0.03 sec)
Records: 0  Duplicates: 0  Warnings: 0

mys' at line 1
mysql> Query OK, 3 rows affected (0.10 sec)
    -> Records: 3  Duplicates: 0  Warnings: 0
    -> 
    -> mysql> alter table User add foreign key(Role_id) references Roles(id);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'Query OK, 3 rows affected (0.10 sec)
Records: 3  Duplicates: 0  Warnings: 0

mys' at line 1
mysql> ERROR 3780 (HY000): Referencing column 'Role_id' and referenced column 'id' in foreign key constraint 'User_ibfk_1' are incompatible.
    -> mysql> desc Roles;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'ERROR 3780 (HY000): Referencing column 'Role_id' and referenced column 'id' in f' at line 1
mysql> +-------+--------------+------+-----+---------+-------+
    -> | Field | Type         | Null | Key | Default | Extra |
    -> +-------+--------------+------+-----+---------+-------+
    -> | id    | tinyint      | NO   | PRI | NULL    |       |
    -> | Name  | varchar(100) | NO   |     | NULL    |       |
r    -> | Role  | varchar(100) | NO   |     | NULL    |       |
    -> +-------+--------------+------+-----+---------+-------+
    -> 3 rows in set (0.00 sec)
nt,status varchar(50) not    -> 
    -> mysql> alter table User add constraint foreign key(Role_id) references Roles(id);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '+-------+--------------+------+-----+---------+-------+
| Field | Type         |' at line 1
mysql> ERROR 3780 (HY000): Referencing column 'Role_id' and referenced column 'id' in foreign key constraint 'User_ibfk_1' are incompatible.
    -> mysql> desc User;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'ERROR 3780 (HY000): Referencing column 'Role_id' and referenced column 'id' in f' at line 1
mysql> +----------+--------------+------+-----+---------+----------------+
    -> | Field    | Type         | Null | Key | Default | Extra          |
    -> +----------+--------------+------+-----+---------+----------------+
    -> | ID       | int          | NO   | PRI | NULL    | auto_increment |
    -> | Name     | varchar(100) | NO   |     | NULL    |                |
    -> | Email    | varchar(100) | NO   | UNI | NULL    |                |
    -> | Phone_no | bigint       | NO   | UNI | NULL    |                |
    -> | Password | varchar(100) | NO   | UNI | NULL    |                |
    -> | Role_id  | int          | NO   | MUL | NULL    |                |
    -> +----------+--------------+------+-----+---------+----------------+
    -> 6 rows in set (0.00 sec)
    -> 
    -> mysql> select*from Status;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '+----------+--------------+------+-----+---------+----------------+
| Field    |' at line 1
mysql> +---------+--------+------------+
    -> | Book_id | status | Support_id |
    -> +---------+--------+------------+
    -> |       1 | Booked |          0 |
    -> |       2 | Booked |          0 |
    -> |       3 | Booked |          0 |
    -> |       4 | Booked |          0 |
    -> |       5 | Booked |          0 |
    -> |       6 | Booked |          0 |
    -> |       7 | Booked |          0 |
    -> |       8 | Booked |          0 |
    -> |       9 | Booked |          0 |
    -> |      10 | Booked |          0 |
    -> +---------+--------+------------+
    -> 10 rows in set (0.00 sec)
    -> 
    -> mysql> desc Status;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '+---------+--------+------------+
| Book_id | status | Support_id |
+---------+-' at line 1
mysql> +------------+-------------+------+-----+---------+-------+
    -> | Field      | Type        | Null | Key | Default | Extra |
    -> +------------+-------------+------+-----+---------+-------+
    -> | Book_id    | int         | NO   | MUL | NULL    |       |
    -> | status     | varchar(20) | NO   |     | NULL    |       |
    -> | Support_id | int         | NO   |     | NULL    |       |
    -> +------------+-------------+------+-----+---------+-------+
    -> 3 rows in set (0.00 sec)
    -> 
    -> mysql> alter table Support modify ID tinyint;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '+------------+-------------+------+-----+---------+-------+
| Field      | Type ' at line 1
mysql> Query OK, 0 rows affected (0.11 sec)
    -> Records: 0  Duplicates: 0  Warnings: 0
    -> 
    -> mysql> alter table Status add foreign key(Support_id) references Support(ID);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'Query OK, 0 rows affected (0.11 sec)
Records: 0  Duplicates: 0  Warnings: 0

mys' at line 1
mysql> ERROR 3780 (HY000): Referencing column 'Support_id' and referenced column 'ID' in foreign key constraint 'Status_ibfk_2' are incompatible.
    -> mysql> alter table Status add foreign key(Support_id) references Support(ID);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'ERROR 3780 (HY000): Referencing column 'Support_id' and referenced column 'ID' i' at line 1
mysql> ERROR 3780 (HY000): Referencing column 'Support_id' and referenced column 'ID' in foreign key constraint 'Status_ibfk_2' are incompatible.
    -> mysql> alter table Status drop foreign key Status_ibfk_2;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'ERROR 3780 (HY000): Referencing column 'Support_id' and referenced column 'ID' i' at line 1
mysql> ERROR 1091 (42000): Can't DROP 'Status_ibfk_2'; check that column/key exists
    '> mysql> alter table Status drop constraint Status_ibfk_2;
    '> ERROR 3940 (HY000): Constraint 'Status_ibfk_2' does not exist.
    '> mysql> alter table Status drop constraint 'Status_ibfk_2';
    '> ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''Status_ibfk_2'' at line 1
    '> mysql> drop table Status;
    '> Query OK, 0 rows affected (0.04 sec)
    '> 
    '> mysql> CREATE TABLE Status(Id int primary key auto_increment,status varchar(50) not null,Support_id int,foreign key(Support_id) references Support(ID));
    '> ERROR 3780 (HY000): Referencing column 'Support_id' and referenced column 'ID' in foreign key constraint 'Status_ibfk_1' are incompatible.
    '> mysql> desc Support;
    '> +---------+---------+------+-----+---------+-------+
    '> | Field   | Type    | Null | Key | Default | Extra |
    '> +---------+---------+------+-----+---------+-------+
    '> | ID      | tinyint | NO   | PRI | NULL    |       |
    '> | user_id | int     | NO   | MUL | NULL    |       |
    '> +---------+---------+------+-----+---------+-------+
    '> 2 rows in set (0.01 sec)
    '> 
    '> mysql> CREATE TABLE Status(Id int primary key auto_increment,status varchar(50) not null,Support_id int not null,foreign key(Support_id) references Support(ID));
    '> ERROR 3780 (HY000): Referencing column 'Support_id' and referenced column 'ID' in foreign key constraint 'Status_ibfk_1' are incompatible.
    '> mysql> CREATE TABLE Status(Id int primary key auto_increment,status varchar(50) not null,Support_id int not null,foreign key(Support_id) references Support(ID));
    '> ERROR 3780 (HY000): Referencing column 'Support_id' and referenced column 'ID' in foreign key constraint 'Status_ibfk_1' are incompatible.
    '> mysql> alter table Support drop column ID;
    '> Query OK, 0 rows affected (0.10 sec)
    '> Records: 0  Duplicates: 0  Warnings: 0
    '> 
    '> mysql> alter table Support add column id int primary key auto_increment before user_id;
    '> ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'before user_id' at line 1
    '> mysql> alter table Support add column id int primary key auto_increment;
    '> Query OK, 0 rows affected (0.08 sec)
    '> Records: 0  Duplicates: 0  Warnings: 0
    '> 
    '> mysql> alter table Support modify column id before user_id;
    '> ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'before user_id' at line 1
    '> mysql> 
    '> 
    '> 

