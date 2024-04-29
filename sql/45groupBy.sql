# 45groupBy.sql

USE w3schools;

# GROUP BY : 집계함수(avg, sum, count, min, max)를 그룹별로 결과 내게 함
SELECT CategoryId, COUNT(ProductID)
FROM Products
GROUP BY CategoryID;

SELECT CategoryId                          번호,
       (SELECT c.CategoryName
        FROM Categories c
        WHERE c.CategoryID = p.CategoryID) 이름,
       COUNT(ProductID)                    상품수
FROM Products p
GROUP BY CategoryID;

SELECT c.CategoryID       번호,
       c.CategoryName     이름,
       COUNT(p.ProductID) 상품수
FROM Categories c
         JOIN Products p
              ON c.CategoryID = p.CategoryID
GROUP BY c.CategoryID;

