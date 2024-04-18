# 11limit.sql

USE w3schools;

# LIMIT : 조회 결과 수를 제한

SELECT *
FROM Customers
LIMIT 5;

SELECT *
FROM Products
ORDER BY Price DESC
LIMIT 5;

SELECT *
FROM Employees
ORDER BY BirthDate DESC
LIMIT 2;

SELECT *
FROM Products
WHERE CategoryID = 1
ORDER BY Price
LIMIT 3;

# todo : 최초로 주문된 주문 1개
# todo : 가장 최근에 주문된 주문 5개
# todo : 가장 나이가 많은 직원 1명
# todo : CategoryId 가 3 인 상품 중 가장 비싼 상품 2개

