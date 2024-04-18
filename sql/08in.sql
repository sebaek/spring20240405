#08in.sql
USE w3schools;

# IN 하나라도 같으면...
SELECT *
FROM Customers
WHERE Country = 'Germany'
   OR Country = 'UK';

SELECT *
FROM Customers
WHERE Country IN ('germany', 'uk');

SELECT *
FROM Customers
WHERE Country IN ('germany', 'uk', 'sweden', 'france');

# todo : 2, 3, 6 번 카테고리에 있는 상품들 조회
SELECT *
FROM Products
WHERE CategoryID IN (2, 3, 6);
# todo : 브라질, 일본, 이탈리아에 있는 공급자(Suppliers) 조회
SELECT *
FROM Suppliers
WHERE Country IN ('Japan', 'Brazil', 'Italy');

SELECT DISTINCT Country
FROM Suppliers;
