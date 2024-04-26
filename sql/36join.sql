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
SELECT c.CustomerName
FROM Orders o
         JOIN Customers c
              ON o.CustomerID = c.CustomerID
WHERE o.OrderID = 10249;

# 10249번 주문(Orders)을 처리한 직원의 이름(Employees) 조회
SELECT e.FirstName, e.LastName
FROM Orders o
         JOIN Employees e
              ON o.EmployeeID = e.EmployeeID
WHERE o.OrderID = 10249;
# 10249번 주문(Orders)을 배달한 Shipper의 이름(Shippers) 조회
SELECT s.ShipperName
FROM Orders o
         JOIN Shippers s
              ON o.ShipperID = s.ShipperID
WHERE OrderID = 10249;

# 90번 고객의 이름과 주문한 날짜들을 오름차순으로 조회
SELECT c.CustomerName, o.OrderDate
FROM Orders o
         JOIN Customers c
              ON o.CustomerID = c.CustomerID
WHERE c.CustomerID = 90
ORDER BY o.OrderDate;

# 3번 직원이 주문을 처리한 날짜들을 오름차순 조회 (직원이름, 날짜)

