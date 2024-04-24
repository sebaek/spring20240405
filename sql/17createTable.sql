# 17createTable.sql

USE w3schools;

# CREATE TABLE :새 테이블 만들기
# 테이블 생성시 컬럼들 정의 해야함
# CREATE TABLE 테이블명 (
#   # 컬럼명1 컬럼타입,
#   # 컬럼명2 컬럼타입,
# );

# 테이블명, 컬럼명 작성 관습 : (upper/lower)스네이크케이스
# UPPER_SNAKE_CASE
# lower_snake_case

CREATE TABLE my_table1
(
    address varchar(30),
    city    varchar(50),
    country varchar(20)
);
INSERT INTO my_table1
    (address, city, country)
VALUES ('신촌', '서울', '한국');
SELECT *
FROM my_table1;
DESCRIBE my_table1;
DESC my_table1;

# todo ; my_table2 만들기
#  컬럼 name varchar(30), age varchar(30)
#  DESC로 테이블 확인
#  INSERT로 레코드 추가
#  SELECT 조회
CREATE TABLE my_table2
(
    name VARCHAR(30),
    age  VARCHAR(30)
);
DESC my_table2;
INSERT INTO my_table2
    (name, age)
VALUES ('son', 33);
SELECT *
FROM my_table2;
INSERT INTO my_table2
    (name, age)
VALUES ('lee', '강인');

