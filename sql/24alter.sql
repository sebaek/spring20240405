# 24alter.sql

USE w3schools;

# ALTER TABLE : 테이블 구조 변경

# 컬럼 추가
CREATE TABLE my_table23
(
    name VARCHAR(3),
    age  INT
);
INSERT INTO my_table23 (name, age)
VALUES ('son', 44),
       ('lee', 33);
ALTER TABLE my_table23
    ADD COLUMN address VARCHAR(10);
SELECT *
FROM my_table23;

# todo; my_table23 에 city 컬럼 추가
ALTER TABLE my_table23
    ADD COLUMN city VARCHAR(10);

ALTER TABLE my_table23
    ADD COLUMN country VARCHAR(10) NOT NULL;

ALTER TABLE my_table23
    ADD COLUMN price INT NOT NULL;

ALTER TABLE my_table23
    ADD COLUMN state VARCHAR(10) NOT NULL UNIQUE;

ALTER TABLE my_table23
    ADD COLUMN state VARCHAR(10) NOT NULL DEFAULT 'seoul';

ALTER TABLE my_table23
    ADD COLUMN birth DATE AFTER age;
DESC my_table23;



# 컬럼 삭제 (주의!!)

# 컬럼 변경
#   이름변경, 자료형/제약사항변경
