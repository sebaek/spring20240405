# 32join.sql

CREATE DATABASE mydb2;
USE mydb2;

CREATE TABLE table1
(
    col_a INT
);
CREATE TABLE table2
(
    col_b INT
);

INSERT INTO table1
    (col_a)
VALUES (1),
       (2),
       (3),
       (4);

INSERT INTO table2
    (col_b)
VALUES (2),
       (2),
       (3),
       (4),
       (5);

SELECT *
FROM table1;

SELECT *
FROM table2;

# JOIN : 두 개(이상)의 테이블을 결합
# 컬럼수 : 두 테이블의 컬럼 수의 합
# 행(레코드)수 : 두 테이블의 행의 수의 곱
#  -> cartesian product

SELECT *
FROM table1
         JOIN table2
ORDER BY col_a, col_b;


# INNER JOIN : 두 테이블에 모두 있는 값만
SELECT *
FROM table1
         JOIN table2 ON col_a = col_b;

SELECT *
FROM table1
         JOIN table2
WHERE col_a = col_b;

# # 테이블 만들고 값 넣기
# table3 (col_a INT) , (5), (6), (7)
# table4 (col_b INT),  (7), (6), (7), (8)
# #1 카테시안 곱 결과 보기(JOIN) -> 컬럼 수와 레코드 수 예측하기
# #2 INNER JOIN 결과 보기 (JOIN ON) -> 컬럼 수와 레코드 수 예측하기, 결과 예측


CREATE TABLE table3
(
    col_a INT
);
CREATE TABLE table4
(
    col_b INT
);

INSERT INTO table3
    (col_a)
VALUES (5),
       (6),
       (7);
INSERT INTO table4
    (col_b)
VALUES (7),
       (6),
       (7),
       (8);
SELECT *
FROM table3
         JOIN table4;
SELECT *
FROM table3
         JOIN table4 ON col_a = col_b;
