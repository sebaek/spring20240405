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
ALTER TABLE my_table23
    DROP COLUMN state;
# todo ; city 컬럼 삭제
ALTER TABLE my_table23
    DROP COLUMN city;
DESC my_table23;


# 컬럼 변경
#   이름변경(주의!!)
ALTER TABLE my_table23
    RENAME COLUMN address TO town;
DESC my_table23;

# todo ; birth 를 birth_date 컬럼으로 이름 변경
ALTER TABLE my_table23
    RENAME COLUMN birth TO birth_date;
DESC my_table23;

# 자료형
ALTER TABLE my_table23
    MODIFY COLUMN price DEC(20, 2);
DESC my_table23;

# todo ; name 컬럼의 타입을 varchar(30) 변경
ALTER TABLE my_table23
    MODIFY COLUMN name VARCHAR(30);

# 타입변경시 주의할 점 : 데이터를 잃어버리지 않도록 해야함
INSERT INTO my_table23
    (name, country)
VALUES ('123456789012345', 'korea');
ALTER TABLE my_table23
    MODIFY COLUMN name VARCHAR(20);
ALTER TABLE my_table23
    MODIFY COLUMN name VARCHAR(10);

# 제약사항 변경
DESC my_table23;

ALTER TABLE my_table23
    MODIFY COLUMN name VARCHAR(20) UNIQUE;
# todo; age 컬럼에 unique 제약사항 추가
ALTER TABLE my_table23
    MODIFY COLUMN age INT UNIQUE;

# UNIQUE 제약사항 삭제하기
SHOW index FROM my_table23;
ALTER TABLE my_table23
    DROP INDEX age;
DESC my_table23;
# todo; name 컬럼의 UNIQUE 제약사항 삭제
SHOW index FROM my_table23;
ALTER TABLE my_table23
    DROP INDEX name;
DESC my_table23;

# NOT NULL 추가
ALTER TABLE my_table23
    MODIFY COLUMN name VARCHAR(20) NOT NULL;

# NOT NULL 삭제
ALTER TABLE my_table23
    MODIFY COLUMN name VARCHAR(20) NULL;

# todo; age 컬럼에 not null 추가, 삭제
ALTER TABLE my_table23
    MODIFY COLUMN age INT NOT NULL;
ALTER TABLE my_table23
    MODIFY COLUMN age INT NULL;
SELECT *
FROM my_table23
WHERE age IS NULL;;
UPDATE my_table23
SET age = 0
WHERE age IS NULL;

# DEFAULT 제약사항 추가/삭제
ALTER TABLE my_table23
    MODIFY COLUMN name VARCHAR(20) DEFAULT 'guest';
ALTER TABLE my_table23
    ALTER COLUMN name DROP DEFAULT;
DESC my_table23;

# todo; age 컬럼에 default 제약사항 추가/삭제
ALTER TABLE my_table23
    MODIFY COLUMN age INT DEFAULT 0;
ALTER TABLE my_table23
    ALTER COLUMN age DROP DEFAULT;

# PRIMARY KEY 제약 사항 추가 / 삭제
ALTER TABLE my_table23
    ADD PRIMARY KEY (name);
DESC my_table23;
ALTER TABLE my_table23
    DROP PRIMARY KEY;
ALTER TABLE my_table23
    MODIFY COLUMN name VARCHAR(20) NULL;

# age 컬럼에 PRIMARY KEY 제약 사항 추가 / 삭제
ALTER TABLE my_table23
    ADD PRIMARY KEY (age);
ALTER TABLE my_table23
    DROP PRIMARY KEY;
DESC my_table23;

