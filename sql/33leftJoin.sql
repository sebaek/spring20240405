# 33leftJoin.sql

USE mydb2;

# LEFT (OUTER) JOIN
# INNER JOIN + 왼쪽 테이블에만 있는 레코드

# 1, 2, 3, 4
SELECT col_a
FROM table1;

# 2, 2, 3, 4, 5
SELECT col_b
FROM table2;

SELECT *
FROM table1
         LEFT JOIN table2 ON col_a = col_b;

DELETE
FROM table1;
DELETE
FROM table2;
INSERT INTO table1
VALUES (1),
       (2),
       (2),
       (3),
       (4);
INSERT INTO table2
VALUES (3),
       (4),
       (5),
       (5);

SELECT *
FROM table1
         LEFT JOIN table2 ON col_a = col_b;

SELECT *
FROM table2
         LEFT JOIN table1 ON col_a = col_b;