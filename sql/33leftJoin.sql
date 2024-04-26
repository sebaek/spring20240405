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


# table3 (4), (5), (6), (3)
# table4 (5), (6), (7), (7), (8)

# 1. 카테시안 곱
# 2. INNER JOIN
# 3. LEFT JOIN

DELETE
FROM table3;
DELETE
FROM table4;
INSERT INTO table3
VALUES (4),
       (5),
       (6),
       (3);
INSERT INTO table4
VALUES (5),
       (6),
       (7),
       (7),
       (8);
SELECT *
FROM table3
         LEFT JOIN table4 ON col_a = col_b;
SELECT *
FROM table4
         LEFT JOIN table3 ON col_a = col_b;

# RIGHT OUTER JOIN
SELECT *
FROM table3
         RIGHT JOIN table4 ON col_a = col_b;

# table1, table2 을 사용해서 RIGHT 조인 해보기
# 1, 2, 2, 3, 4
SELECT *
FROM table1;
# 3, 4, 5, 5
SELECT *
FROM table2;
SELECT *
FROM table1
         RIGHT JOIN table2 ON col_a = col_b;
SELECT *
FROM table2
         RIGHT JOIN table1 ON col_a = col_b;


