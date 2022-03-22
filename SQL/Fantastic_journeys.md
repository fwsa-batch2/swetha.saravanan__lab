# FANTASTIC JOURNEYS APPLICATION
### Creating database called Fantastic journeys
```
CREATE DATABASE FANTASTIC_JOURNEYS;
```
## 
```
SHOW DATABASES;
```

| Database           |
|--------------------|
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
## Using database called Fantastic journeys
```
use FANTASTIC_JOURNEYS;
```
```
SHOW TABLES;
```

| Tables_in_FANTASTIC_JOURNEYS |
|------------------------------|
| Booking                      |
| Contact                      |
| Payments                     |
| Plan_trip                    |
| Reviews                      |
| User                         |

## Creating table called User
```
CREATE TABLE User(ID int PRIMARY KEY,Name varchar(100) NOT NULL,Email varchar(100) NOT NULL UNIQUE KEY,Phone_no bigint NOT NULL UNIQUE KEY,Password varchar(100) NOT NULL UNIQUE KEY);
```
### Describing table called User
```
DESC User;
```

| Field    | Type         | Null | Key | Default | Extra          |
|----------|--------------|------|-----|---------|----------------|
| ID       | int          | NO   | PRI | NULL    | auto_increment |
| Name     | varchar(100) | NO   |     | NULL    |                |
| Email    | varchar(100) | NO   | UNI | NULL    |                |
| Phone_no | bigint       | NO   | UNI | NULL    |                |
| Password | varchar(100) | NO   | UNI | NULL    |                |

### Inserting values
```
INSERT INTO User VALUES(1,'Swetha','swethakarthika16@gmail.com',9025336748,'12345#Sm');
```
```
INSERT INTO User(Name,Email,Phone_no,Password) VALUES('Abisha','abisha@gmail.com',9087654321,'abi1234@'),VALUES('Jerusheya','jerusheya@gmail.com',9077654321,'jeru234@'), ('Aswath','aswath@gmail.com',9067654321,'aswath4$'), ('Haiden','haiden@gmail.com',9057654321,'haiden5$')('Saranya','saran@gmail.com',9047654321,'saran20$'),('Rishi','rishi@gmail.com',9037654321,'rishi13@');
```
```
insert into User values(8,'Selva','selva@gmail.com',9017654321,'selva32@');
```
```
insert into User values(9,'Santhanu','santhanu@gmail.com',9027654321,'santa15*'),(10,'Riyaz','riyaz@gmail.com',9016654321,'riyaz32@');
```
```
SELECT * FROM User;
```

| ID | Name      | Email                      | Phone_no   | Password |
|----|-----------|----------------------------|------------|----------|
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

### Creating table called Plan_trip
``` 
create table Plan_trip (trip_id int primary key auto_increment,user_id int not null,foreign key(user_id) references User(ID),Source varchar(100) not null, Destination varchar(100) not null,Start date not null,End date not null,Adults tinyint not null CHECK(Adults<10),Children tinyint not null CHECK(Children<10));
```
```
DESC Plan_trip;
```

| Field       | Type         | Null | Key | Default | Extra          |
|-------------|--------------|------|-----|---------|----------------|
| trip_id     | int          | NO   | PRI | NULL    | auto_increment |
| user_id     | int          | NO   | MUL | NULL    |                |
| Source      | varchar(100) | NO   |     | NULL    |                |
| Destination | varchar(100) | NO   |     | NULL    |                |
| Start       | date         | NO   |     | NULL    |                |
| End         | date         | NO   |     | NULL    |                |
| Adults      | tinyint      | NO   |     | NULL    |                |
| Children    | tinyint      | NO   |     | NULL    |                |
### Inserting values
```
insert into Plan_trip values(1,1,'India','Newyork','2022-03-22','2022-03-31',1,1),(2,2,'Newyork','India','2022-03-23','2022-04-01',1,0),(3,3,'Beijing','Sanfrancisco','2022-03-24','2022-04-02',1,0);
```
```
insert into Plan_trip values(4,4,'Hongkong','Switzerland','2022-03-25','2022-04-03',1,0),(5,5,'Chicago','Switzerland','2022-03-26','2022-04-04',1,1);
```
```
insert into Plan_trip values(6,6,'Hawaii','London','2022-03-27','2022-04-05',1,0),(7,7,'Moscow','Switzerland','2022-03-28','2022-04-06',1,1);
```
```
insert into Plan_trip values(8,8,'England','India','2022-03-28','2022-04-07',1,0),(9,9,'Ukraine','Switzerland','2022-03-29','2022-04-07',1,1),(10,10,'Russia','Newyork','2022-03-30','2022-04-08',1,0);
```
### Extract values
```
select*from Plan_trip;
```

| trip_id | user_id | Source   | Destination  | Start      | End        | Adults | Children |
|---------|---------|----------|--------------|------------|------------|--------|----------|
|       1 |       1 | India    | Newyork      | 2022-03-22 | 2022-03-31 |      1 |        1 |
|       2 |       2 | Newyork  | India        | 2022-03-23 | 2022-04-01 |      1 |        0 |
|       3 |       3 | Beijing  | Sanfrancisco | 2022-03-24 | 2022-04-02 |      1 |        0 |
|       4 |       4 | Hongkong | Switzerland  | 2022-03-25 | 2022-04-03 |      1 |        0 |
|       5 |       5 | Chicago  | Switzerland  | 2022-03-26 | 2022-04-04 |      1 |        1 |
|       6 |       6 | Hawaii   | London       | 2022-03-27 | 2022-04-05 |      1 |        0 |
|       7 |       7 | Moscow   | Switzerland  | 2022-03-28 | 2022-04-06 |      1 |        1 |
|       8 |       8 | England  | India        | 2022-03-28 | 2022-04-07 |      1 |        0 |
|       9 |       9 | Ukraine  | Switzerland  | 2022-03-29 | 2022-04-07 |      1 |        1 |
|      10 |      10 | Russia   | Newyork      | 2022-03-30 | 2022-04-08 |      1 |        0 |


### Creating table callled Booking
```
CREATE TABLE Booking(Booking_id int PRIMARY KEY AUTO_INCREMENT,Trip_id int NOT NULL,foreign key(Trip_id) references Plan_trip(trip_id) ,Name varchar(100) NOT NULL,Age int NOT NULL,Passport_no varchar(100) NOT NULL,Gender char(1) NOT NULL CHECK(Gender IN ('M','F')));
```
### Describing Booking
```
DESC Booking;
```

| Field       | Type         | Null | Key | Default | Extra          |
|-------------|--------------|------|-----|---------|----------------|
| Booking_id  | int          | NO   | PRI | NULL    | auto_increment |
| Trip_id     | int          | NO   | MUL | NULL    |                |
| Name        | varchar(100) | NO   |     | NULL    |                |
| Age         | int          | NO   |     | NULL    |                |
| Passport_no | varchar(100) | NO   |     | NULL    |                |
| Gender      | char(1)      | NO   |     | NULL    |                |
### Inserting values
```
INSERT INTO Booking VALUES(1,1,'Swetha',21,'A2096457','F'),(2,2,'Abisha',22,'A2096458','F'),(3,3,'Jerusheya',23,'A2096459','F'),(4,4,'Aswath',22,'A2093457','M'),(5,5,'Haiden',26,'A2026457','M'),(6,6,'Saranya',21,'A2096157','F'),(7,7,'Rishi',26,'A2092457','M'),(8,8,'Selva',26,'A2096657','M'),(9,9,'Santhanu',26,'A2091457','M'),(10,10,'Riyaz',25,'A5096457','M');
```
```
SELECT*FROM Booking;
```

| Booking_id | Trip_id | Name      | Age | Passport_no | Gender |
|------------|---------|-----------|-----|-------------|--------|
|          1 |       1 | Swetha    |  21 | A2096457    | F      |
|          2 |       2 | Abisha    |  22 | A2096458    | F      |
|          3 |       3 | Jerusheya |  23 | A2096459    | F      |
|          4 |       4 | Aswath    |  22 | A2093457    | M      |
|          5 |       5 | Haiden    |  26 | A2026457    | M      |
|          6 |       6 | Saranya   |  21 | A2096157    | F      |
|          7 |       7 | Rishi     |  26 | A2092457    | M      |
|          8 |       8 | Selva     |  26 | A2096657    | M      |
|          9 |       9 | Santhanu  |  26 | A2091457    | M      |
|         10 |      10 | Riyaz     |  25 | A5096457    | M      |

### Creating table called Payments
```
CREATE TABLE Payments(Pay_id int Primary key auto_increment,Book_id int,
foreign key(Book_id) references Booking(Booking_id), Ac_holdername varchar(100)
not null,Account_no bigint not null,Cvv_code varchar(100) not null unique key,Expiration_year year not null);
```
```
DESC Payments;
```

| Field         | Type         | Null | Key | Default | Extra          |
|---------------|--------------|------|-----|---------|----------------|
| Pay_id        | int          | NO   | PRI | NULL    | auto_increment |
| Book_id       | int          | NO   | MUL | NULL    |                |
| Ac_holdername | varchar(100) | NO   |     | NULL    |                |
| Account_no    | bigint       | NO   | UNI | NULL    |                |
### Inserting Values
```
INSERT INTO Payments VALUES(1,1,'Swetha',50010020010023,300000),(2,2,'Abisha',50010020010013,100000),(3,3,'Jerusheya',50010030010013,100000),(4,4,'Aswath',50010070010013,100000);,(5,5,'Haiden',50010070010093,300000),(6,6,'Saranya',50010050010093,100000),(7,7,'Rishi',50010050010003,300000),(8,8,'Selva',50010059010003,100000),(9,9,'Santhanu',50010009010003,300000),(10,10,'Riyaz',50010009010203,100000)
```
### Extract values
```
SELECT*FROM Payments;
```

| Pay_id | Book_id | Ac_holdername | Account_no     | Amount |
|--------|---------|---------------|----------------|--------|
|      1 |       1 | Swetha        | 50010020010023 | 300000 |
|      2 |       2 | Abisha        | 50010020010013 | 100000 |
|      3 |       3 | Jerusheya     | 50010030010013 | 100000 |
|      4 |       4 | Aswath        | 50010070010013 | 100000 |
|      5 |       5 | Haiden        | 50010070010093 | 300000 |
|      6 |       6 | Saranya       | 50010050010093 | 100000 |
|      7 |       7 | Rishi         | 50010050010003 | 300000 |
|      8 |       8 | Selva         | 50010059010003 | 100000 |
|      9 |       9 | Santhanu      | 50010009010003 | 300000 |
|     10 |      10 | Riyaz         | 50010009010203 | 100000 |




### Creating table called Reviews
```
create table Reviews(Review_id int primary key auto_increment,user_id int not null,foreign key(user_id) references User(ID),Name varchar(100) not null,Reviews text not null);
```
```
DESC Reviews;
```

| Field     | Type         | Null | Key | Default | Extra          |
|-----------|--------------|------|-----|---------|----------------|
| Review_id | int          | NO   | PRI | NULL    | auto_increment |
| user_id   | int          | NO   | MUL | NULL    |                |
| Name      | varchar(100) | NO   |     | NULL    |                |
| Reviews   | text         | NO   |     | NULL    |                |
### Inserting values
```
insert into Reviews values(1,1,'Swetha','Wonderfull services'),(2,2,'Abisha','Enjoyed very much');
```
```
insert into Reviews values(3,3,'Jerusheya','Loved this trip very much'),(4,4,'Aswath','Enjoyed so much'),(5,5,'Haiden','Unforgettable trip'),(6,6,'Saranya','Loved very much');
```
```
insert into Reviews values(7,7,'Rishi','Enjoyed'),(8,8,'Selva','Appreciating FJ'),(9,9,'Santhanu','Wonderfull trip'),(10,10,'Riyaz','Excellent');
```
### Extract values
```
SELECT*FROM Reviews;
```

| Review_id | user_id | Name      | Reviews                   |
|-----------|---------|-----------|---------------------------|
|         1 |       1 | Swetha    | Wonderfull services       |
|         2 |       2 | Abisha    | Enjoyed very much         |
|         3 |       3 | Jerusheya | Loved this trip very much |
|         4 |       4 | Aswath    | Enjoyed so much           |
|         5 |       5 | Haiden    | Unforgettable trip        |
|         6 |       6 | Saranya   | Loved very much           |
|         7 |       7 | Rishi     | Enjoyed                   |
|         8 |       8 | Selva     | Appreciating FJ           |
|         9 |       9 | Santhanu  | Wonderfull trip           |
|        10 |      10 | Riyaz     | Excellent                 |


### Creating table called contact

```
create table Contact(contact_id int primary key auto_increment,user_id int not null, foreign Key(user_id) references User(ID),Email varchar(100) not null,Queries text not null);
```
```
DESC Contact;
```

| Field      | Type         | Null | Key | Default | Extra          |
|------------|--------------|------|-----|---------|----------------|
| contact_id | int          | NO   | PRI | NULL    | auto_increment |
| user_id    | int          | NO   | MUL | NULL    |                |
| Email      | varchar(100) | NO   |     | NULL    |                |
| Queries    | text         | NO   |     | NULL    |                |
### Inserting values
```
INSERT INTO Contact VALUES(2,2,'abisha@gmail.com','I did not get my tickets');
```
```
INSERT INTO Contact VALUES(3,3,'jerusheya@gmail.com','Extend trip days'); 
```
```
INSERT INTO Contact VALUES(4,4,'aswath@gmail.com','Show more places'),(5,5,'Haiden','Add food facilites'),(6,6,'saran@gmail.com','Add places');
```
```
INSERT INTO Contact VALUES(7,7,'rishi@gmail.com','Add food facilities'),(8,8,'selva@gmail.com','Show more places'),(9,9,'santhanu@gmail.com','Add places'
),(10,10,'riyaz@gmail.com','Add some special offers');
```
### Extract values
```
SELECT * FROM Contact;
```

| contact_id | user_id | Email                      | Queries                  |
|------------|---------|----------------------------|--------------------------|
|          1 |       1 | swethakarthika16@gmail.com | Add some places          |
|          2 |       2 | abisha@gmail.com           | I did not get my tickets |
|          3 |       3 | jerusheya@gmail.com        | Extend trip days         |
|          4 |       4 | aswath@gmail.com           | Show more places         |
|          5 |       5 | Haiden@gmail.com           | Add food facilites       |
|          6 |       6 | saran@gmail.com            | Add places               |
|          7 |       7 | rishi@gmail.com            | Add food facilities      |
|          8 |       8 | selva@gmail.com            | Show more places         |
|          9 |       9 | santhanu@gmail.com         | Add places               |
|         10 |      10 | riyaz@gmail.com            | Add some special offers  |


