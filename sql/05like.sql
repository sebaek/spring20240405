# 05like.sql
USE w3schools;

# LIKE : 와일드카드로 조회
# 와일드카드
# _ : 한글자 아무거나
# % : 0개 이상의 글자 아무거나

SELECT *
FROM Products
WHERE ProductName LIKE 'cha__';

SELECT *
FROM Orders
WHERE OrderDate LIKE '1996-07-1_';
SELECT *
FROM Orders
WHERE OrderDate LIKE '____-07-__';

SELECT *
FROM Products
WHERE ProductName LIKE 'cha%';

SELECT *
FROM Products
WHERE ProductName LIKE '%ng';

SELECT *
FROM Products
WHERE ProductName LIKE 's%s';

SELECT *
FROM Products
WHERE ProductName LIKE '%od%';

-- todo : anton 이 포함된 상품명을 가진 상품들 조회
SELECT *
FROM Products
WHERE ProductName LIKE '%anton%';
-- todo : b로 시작하는 고객명을 가진 고객들 조회
SELECT *
FROM Customers
WHERE CustomerName LIKE 'b%';

-- todo : a로 끝나는 나라에 있는 고객들 조회
SELECT *
FROM Customers
WHERE Country LIKE '%a';
-- todo : 1일에 주문된 주문(Orders) 조회
SELECT *
FROM Orders
WHERE OrderDate LIKE '%01';
SELECT *
FROM Orders
WHERE OrderDate LIKE '____-__-01';

