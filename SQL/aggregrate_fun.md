## Aggregrate Functions

```Syntax
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
```Syntax
 select count(*) from constraints;
```

| count(*) |
|----------|
|       10 |

1 row in set (0.01 sec)
```Syntax
select max(age) from constraints;
```

| max(age) |
|----------|
|       30 |

1 row in set (0.00 sec)
```Syntax
select min(age) from constraints;
```

| min(age) |
|----------|
|       19 |

1 row in set (0.00 sec)
```Syntax
select avg(age) from constraints;
```

| avg(age) |
|----------|
|  21.4000 |

1 row in set (0.00 sec)
```Syntax
select sum(age) from constraints;
```

| sum(age) |
|----------|
|      214 |

1 row in set (0.00 sec)
```Syntax
select distinct age from constraints;
```

| age |
|-----|
|  21 |
|  20 |
|  30 |
|  23 |
|  19 |

5 rows in set (0.00 sec)



