# 14delete.sql

USE w3schools;

SELECT *
FROM Employees
ORDER BY EmployeeID DESC;

# 지우기 전에 꼭!!!! 같은 WHERE로 SELECT 해보기
DELETE
FROM Employees
WHERE EmployeeID = 65523;


DELETE
FROM Employees
WHERE FirstName = 'Nancy';

# 모든 레코드 지우기 : WHERE 안쓰면됨
# 매우 주의!!!
SELECT *
FROM Employees;
DELETE
FROM Employees;
