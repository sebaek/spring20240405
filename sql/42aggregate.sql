# 42aggregate.sql
# 집계시 NULL은 포함하지 않음
USE mydb2;

CREATE TABLE table12
(
    number INT
);
INSERT INTO table12
VALUES (3),
       (4),
       (5),
       (NULL),
       (NULL);

SELECT *
FROM table12;
SELECT COUNT(number)
FROM table12;
SELECT MAX(number)
FROM table12;
SELECT MIN(number)
FROM table12;
SELECT SUM(number)
FROM table12;
SELECT AVG(number)
FROM table12;

-- NULL 을 다른 값으로 바꾸기
SELECT number
FROM table12;
SELECT IFNULL(number, 0)
FROM table12;

SELECT COUNT(IFNULL(number, 0))
FROM table12;
SELECT SUM(IFNULL(number, 0))
FROM table12;
-- (3 + 4 + 5) / 5
SELECT AVG(IFNULL(number, 0))
FROM table12;
