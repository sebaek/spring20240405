# 21unique.sql

USE w3schools;

# UNIQUE : 다른 레코드의 컬럼 값이 중복되지 않음
CREATE TABLE my_table15
(
    col1 VARCHAR(3),
    col2 VARCHAR(3) UNIQUE
);
INSERT INTO my_table15
    (col1, col2)
VALUES ('abc', 'def');
INSERT INTO my_table15
    (col1, col2)
VALUES ('qwe', 'qwe');
INSERT INTO my_table15
    (col1, col2)
VALUES ('abc', 'abc');
INSERT INTO my_table15
    (col1, col2)
VALUES ('def', 'def');
INSERT INTO my_table15
    (col1)
VALUES ('qwe');
INSERT INTO my_table15
    (col1)
VALUES ('asd');
SELECT *
FROM my_table15;
DESC my_table15;

# my_table16
#  제약사항없이
#  UNIQUE
#  NOT NULL UNIQUE
CREATE TABLE my_table16
(
    col1 INT,
    col2 INT UNIQUE,
    col3 INT NOT NULL UNIQUE
);
INSERT INTO my_table16
    (col1, col2, col3)
VALUES (1, 1, 1);
INSERT INTO my_table16
    (col1, col2, col3)
VALUES (1, 2, 2);
INSERT INTO my_table16
    (col1, col2, col3)
VALUES (1, 2, 3);
INSERT INTO my_table16
    (col1, col2, col3)
VALUES (1, 3, 2);

INSERT INTO my_table16
    (col1, col2, col3)
VALUES (1, NULL, 3);
INSERT INTO my_table16
    (col1, col2, col3)
VALUES (1, NULL, 4);

INSERT INTO my_table16
    (col1, col2, col3)
VALUES (1, NULL, 4);

INSERT INTO my_table16
    (col1, col2, col3)
VALUES (1, NULL, NULL);
DESC my_table16;

