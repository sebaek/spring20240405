# 15update.sql

USE w3schools;

# UPDATE 테이블명
# SET 컬럼명 = 바꿀값, 컬럼명 = 바꿀값,,,,,,,
# WHERE 레코드의 조건

# 주의!!! : UPDATE 전에 같은 WHERE 로 SELECT 꼭 해보기!!!!

SELECT *
FROM Customers
WHERE CustomerID = 10;

UPDATE Customers
SET Address    = 'STARK TOWER',
    City       = '맨하탄',
    PostalCode = '12345'
WHERE CustomerID = 10;


UPDATE Customers
SET ContactName = 'TONY STARK'
WHERE CustomerID = 10;

UPDATE Customers
SET CustomerName = 'IRON MAN'
WHERE CustomerID = 10;


SELECT *
FROM Customers
WHERE Country = 'UK';
UPDATE
    Customers
SET Country = '영국'
WHERE Country = 'UK';
SELECT *
FROM Customers
WHERE Country = '영국';
SELECT *
FROM Customers;
UPDATE Customers
SET Country = '영국';


SELECT *
FROM Products
WHERE ProductID = 1;

UPDATE
    Products
SET Price = Price * 2
WHERE ProductID = 1;

# todo : 2번 카테고리에 있는 상품들의 값을 3배로 업데이트
SELECT *
FROM Products
WHERE CategoryID = 2;

UPDATE
    Products
SET Price = Price * 3
WHERE CategoryID = 2;
