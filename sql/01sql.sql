-- SQL 주석
# SQL 주석

# 명령문 실행 ctrl + enter
SELECT *
FROM w3schools.Employees;

# 명령문 종료는 ; 꼭 사용
SELECT *
FROM w3schools.Customers;

# table : 데이터들이 저장되는 공간
#  행(records, data, row), 열(field, attribute, column)로 이루어져 있음

# schema (database) : table 들이 정의되어 있는 곳

# schema (database) 만들기
CREATE DATABASE test1;
# 새 테이블 만들기 (나중에..)
CREATE TABLE test1.test
(
    id   int,
    name varchar(20)
);

# 데이터베이스명.테이블명
SELECT *
FROM test1.test;

# 현재 사용중인 데이터베이스 선택
USE test1;

# 현재 데이터베이스의 테이블은 데이터베이스명 생략 가능
SELECT *
FROM test;

# 다른 데이터베이스의 테이블은 생략 못함
SELECT *
FROM w3schools.Customers;

USE w3schools;
SELECT *
FROM Customers;