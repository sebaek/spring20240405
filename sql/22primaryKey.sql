# 22primaryKey.sql

USE w3schools;

# PRIMARY KEY : NOT NULL UNIQUE
CREATE TABLE my_table17
(
    col1 INT,
    col2 INT PRIMARY KEY -- NOT NULL UNIQUE
);
INSERT INTO my_table17
    (col1, col2)
VALUES (1, 1);
INSERT INTO my_table17
    (col1, col2)
VALUES (2, 2);
INSERT INTO my_table17
    (col1, col2)
VALUES (3, 2);
INSERT INTO my_table17
    (col1, col2)
VALUES (NULL, 3);
INSERT INTO my_table17
    (col1, col2)
VALUES (3, NULL);
DESC my_table17;

# PRIMARY KEY 제약사항은 한 테이블에 하나만 줄 수 있음
CREATE TABLE my_table18
(
    col1 INT PRIMARY KEY,
    col2 INT PRIMARY KEY
);
CREATE TABLE my_table19
(
    col1 INT NOT NULL UNIQUE,
    col2 INT NOT NULL UNIQUE
);
CREATE TABLE my_table20
(
    col1 INT PRIMARY KEY,
    col2 INT NOT NULL UNIQUE
);
DESC my_table19;
DESC my_table20;

# 여러 컬럼 조합으로 PRIMARY KEY 제약사항을 줄 수 있음
CREATE TABLE my_table21
(
    col1 INT,
    col2 INT,
    col3 INT,
    PRIMARY KEY (col1, col2)
);
DESC my_table21;
INSERT INTO my_table21
    (col1, col2, col3)
VALUES (1, 1, 1);
INSERT INTO my_table21
    (col1, col2, col3)
VALUES (1, 2, 1);
INSERT INTO my_table21
    (col1, col2, col3)
VALUES (2, 2, 1);
INSERT INTO my_table21
    (col1, col2, col3)
VALUES (NULL, 2, 1);

# my_table22 만들기
#  PRIMARY KEY
#  NOT NULL UNIQUE
#  제약사항없이

# 여러 레코드 INSERT 해보기

CREATE TABLE my_table22
(
    col1 VARCHAR(3) PRIMARY KEY,
    col2 VARCHAR(3) NOT NULL UNIQUE,
    col3 VARCHAR(3)
);
DESC my_table21;

# CHECK, FOREIGN KEY
