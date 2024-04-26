# 36join.sql
USE w3schools;

SELECT *
FROM Products
WHERE ProductID = 1;

SELECT *
FROM Categories
WHERE CategoryID = 1;

# 1번 상품의 카테고리명 조회
SELECT p.ProductName, c.CategoryName
FROM Products p
         JOIN Categories c
              ON p.CategoryID = c.CategoryID
WHERE p.ProductID = 1;

# 10번 상품의 이름, 공급자 이름, 공급자의 국가 조회
# Products, Suppliers
SELECT p.ProductName, s.SupplierName, s.Country
FROM Products p
         JOIN Suppliers s
              ON p.SupplierID = s.SupplierID
WHERE p.ProductID = 10;

# 10249번 주문(Orders)을 한 고객의 이름(Customers) 조회

