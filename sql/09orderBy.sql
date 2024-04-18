#09orderBy.sql
USE w3schools;

# order by : 조회 순서 결정
# order by 컬럼명
SELECT *
FROM Products
ORDER BY ProductID;

SELECT *
FROM Products
ORDER BY Price;

# ASC : 오름 차순
SELECT *
FROM Products
ORDER BY Price ASC;

# DESC : 내림 차순
SELECT *
FROM Products
ORDER BY Price DESC;

# 여러 컬럼 기준
SELECT *
FROM Products
ORDER BY CategoryID, Price, ProductName;

SELECT *
FROM Products
ORDER BY CategoryID ASC, Price DESC;
SELECT *
FROM Products
ORDER BY CategoryID, Price DESC;

# 컬럼명 대신 컬럼 index
SELECT *
FROM Products
ORDER BY 4, 6;

# SELECT 에 명시한 컬럼명의 순서를 따라야 함
SELECT ProductName, CategoryId, Price, Unit
FROM Products
ORDER BY 2, 3;
-- ORDER BY CategoryId, Price;

# todo : 나이가 많은 직원부터 나이가 적은 직원순으로 직원 조회
SELECT *
FROM Employees
ORDER BY BirthDate;
# todo : 국가명, 도시명 순으로 고객 조회
SELECT *
FROM Customers
ORDER BY Country, City;

DESC Customers;
SELECT *
FROM Customers
ORDER BY 7, 5;
# todo : 도시명 순으로 공급자 조회
SELECT *
FROM Suppliers
ORDER BY City;
# todo : First Name의 역순으로 직원 조회
SELECT *
FROM Employees
ORDER BY FirstName DESC;

SELECT *
FROM Products
WHERE CategoryID IN (5, 6, 8)
ORDER BY CategoryID, Price;





