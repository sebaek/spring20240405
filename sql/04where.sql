USE w3schools;
# SELECT 에 컬럼명
# FROM 테이블명
# WHERE 솎아낼 레코드 조건
SELECT CustomerName, City, Country
FROM Customers
WHERE City = 'Berlin';
SELECT CustomerName, City, Country
FROM Customers
WHERE Country = 'Germany';

# 컬럼명 비교연산자 값
# 값에 ''로 감싸기 (but, 수형식은 생략해도됨)
SELECT *
FROM Customers
WHERE CustomerID = '1';
SELECT *
FROM Customers
WHERE CustomerID = 1;
# 권장

# 비교연산자 :
# 같다 =, 작다 <, 작거나 같다 <=, 크다 >, 크거나 같다 >=
# 같지않다 !=, <>
SELECT *
FROM Customers
WHERE CustomerID = 3;
SELECT *
FROM Customers
WHERE CustomerID < 3;
SELECT *
FROM Customers
WHERE CustomerID > 89;
SELECT *
FROM Customers
WHERE CustomerID <= 3;
SELECT *
FROM Customers
WHERE CustomerID >= 89;
SELECT *
FROM Customers
WHERE CustomerID != 1;
SELECT *
FROM Customers
WHERE CustomerID <> 1;

# 문자열 형식(대소문자 구분 없음)
SELECT *
FROM Customers
WHERE CustomerName >= 'S';
SELECT *
FROM Customers
WHERE CustomerName >= 's';
SELECT *
FROM Customers
WHERE Country = 'Germany';
SELECT *
FROM Customers
WHERE Country = 'gERmAny';

# 날짜 형식
SELECT *
FROM Employees
WHERE BirthDate = '1968-12-08';
SELECT *
FROM Employees
WHERE BirthDate >= '1955-01-01';
