# 10not.sql

USE w3schools;

# NOT : 조건을 만족하지 않으면 TRUE
SELECT *
FROM Employees
WHERE NOT BirthDate >= '1960-01-01';

SELECT *
FROM Customers
WHERE NOT Country IN ('France', 'UK', 'Spain')
ORDER BY Country;

SELECT *
FROM Customers
WHERE Country NOT IN ('France', 'UK', 'Spain')
ORDER BY Country;

SELECT *
FROM Products
WHERE NOT Price BETWEEN 100 AND 200
ORDER BY Price;

# 여러 조건 사용시 괄호 잘 사용하기
SELECT *
FROM Products
WHERE NOT (CategoryID = 1)
  AND Price > 50
ORDER BY CategoryID, Price;

# todo : 1997년 주문을 제외하고 주문 조회
SELECT *
FROM Orders
WHERE NOT OrderDate BETWEEN '1997-01-01' AND '1997-12-31';
SELECT *
FROM Orders
WHERE OrderDate < '1997-01-01'
   OR OrderDate > '1997-12-31';
# todo : 국가가 UK, USA가 아닌 공급자 조회
SELECT *
FROM Suppliers
WHERE Country NOT IN ('uk', 'usa')
ORDER BY Country;

SELECT *
FROM Suppliers
WHERE Country <> 'uk'
  AND Country <> 'usa'
ORDER BY Country;