# 46having.ssql

USE w3schools;

# HAVING : 집계함수의 조건절
SELECT CategoryId, COUNT(ProductID)
FROM Products
GROUP BY CategoryID;

# 상품수가 10개 이상인 카테고리
SELECT *
FROM (SELECT CategoryId, COUNT(ProductID) 상품수
      FROM Products
      GROUP BY CategoryID) c
WHERE 상품수 >= 10;

SELECT CategoryId, COUNT(ProductID) 상품수
FROM Products
GROUP BY CategoryID
HAVING 상품수 >= 10;

# 고객이 5명 이상 있는 국가들 조회
SELECT Country, COUNT(CustomerID) customerNumber
FROM Customers
GROUP BY Country
HAVING customerNumber >= 5
ORDER BY customerNumber DESC;

# 97년 7월 매출액(SUM(상품가격*갯수))이 10000달러 이상인 직원들 조회




