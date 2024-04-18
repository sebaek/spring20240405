#07between.sql
USE w3schools;

# BETWEEN 최소값 AND 최대값
# 최소값 최대값의 사이이면 TRUE

SELECT *
FROM Products
WHERE Price >= 10.00
  AND Price <= 20.00;

SELECT *
FROM Products
WHERE Price BETWEEN 10.00 AND 20.00;

# todo : 1996년 7월에 주문한 주문들
SELECT *
FROM Orders
WHERE OrderDate BETWEEN '1996-07-01' AND '1996-07-31';
# todo : 1960년대생 직원들
SELECT *
FROM Employees
WHERE BirthDate BETWEEN '1960-01-01' AND '1969-12-31';
