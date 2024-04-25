# 19constraints.sql
USE w3schools;

# 제약사항 constraints
# 특정의 컬럼에 제약사항을 줌 (예: 꼭 값이 있어야함, 기본값, 중복불가)

# NOT NULL : 꼭 값이 있어야함
CREATE TABLE my_table11
(
    col1 VARCHAR(10),
    col2 VARCHAR(10) NOT NULL
);
DESC my_table11;
INSERT INTO my_table11
    (col1, col2)
VALUES ('value', 'value');
INSERT INTO my_table11
    (col2)
VALUES ('value');
INSERT INTO my_table11
    (col1)
VALUES ('value');

SELECT *
FROM my_table11;

SELECT *
FROM my_table11
WHERE col2 = 'value';
SELECT *
FROM my_table11
WHERE col1 = 'value';
# 해당 컬럼에 값이 없는 레코드 조회
SELECT *
FROM my_table11
WHERE col1 IS NULL;

# 해당 컬럼에 값이 있는 레코드 조회
SELECT *
FROM my_table11
WHERE col1 IS NOT NULL;

# NULL과의 연산은 모두 FALSE
SELECT *
FROM my_table11
WHERE col1 <> NULL;

# my_table12 테이블 만들고 2개의 컬럼에 제약사항 NOT NULL 주기
CREATE TABLE my_table12
(
    my_col VARCHAR(10) NOT NULL,
    my_age INT         NOT NULL
);
INSERT INTO my_table12
    (my_col, my_age)
VALUES ('abc', 12);
INSERT INTO my_table12
    (my_col)
VALUES ('def');
