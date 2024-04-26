# 37outerJoin.sql

USE mydb2;
SELECT *
FROM product;
SELECT *
FROM category;

SELECT *
FROM category c
         LEFT JOIN product p
                   ON c.id = p.category_id;

# 상품이 존재하지 않는 카테고리
SELECT *
FROM category c
         LEFT JOIN product p
                   ON c.id = p.category_id
WHERE p.id IS NULL;

USE w3schools;
# 한 번도 주문한 적 없는 고객의 이름을 조회
SELECT c.CustomerName
FROM Orders o
         RIGHT JOIN Customers c
                    ON o.CustomerID = c.CustomerID
WHERE o.OrderID IS NULL;

# 1996년에 주문한 적 있는 고객들 이름

# 1996년에 한번도 주문한 적 없는 고객들 이름


