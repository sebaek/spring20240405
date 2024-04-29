# 41aggregate.sql

USE w3schools;
# aggregate function : 집계함수
# 평균, 합계, 갯수, 최댓값, 최솟값
# NULL 은 집계시 제외됨

# COUNT :갯수
SELECT COUNT(EmployeeId)
FROM Employees;
SELECT COUNT(Notes)
FROM Employees;
SELECT COUNT(Country)
FROM Customers;
SELECT COUNT(DISTINCT Country)
FROM Customers;
SELECT Country
FROM Customers;

# MIN : 최솟값, 최소값
# MAX : 최댓값, 최대값
SELECT MAX(Price)
FROM Products;
SELECT MIN(Price)
FROM Products;
-- 가장 어린 사람의 생년월일
SELECT MAX(BirthDate)
FROM Employees;
-- 가장 나이가 많은 사람의 생년월일
SELECT MIN(BirthDate)
FROM Employees;

# SUM : 합계
SELECT SUM(Price)
FROM Products;

# AVG : 평균
SELECT AVG(Price)
FROM Products;


