# 35join.sql

USE mydb2;
CREATE TABLE product
(
    id          INT PRIMARY KEY AUTO_INCREMENT,
    name        VARCHAR(10) NOT NULL,
    price       INT         NOT NULL DEFAULT 0,
    category_id INT REFERENCES category (id)
);
CREATE TABLE category
(
    id   INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(10) NOT NULL
);

INSERT INTO category
    (name)
VALUES ('초콜렛'),
       ('탄산음료'),
       ('과자'),
       ('유제품'),
       ('생필품');

INSERT INTO product
    (name, price, category_id)
VALUES ('가나', 500, 1),
       ('페레로로쉐', 700, 1),
       ('크런키', 400, 1),
       ('콜라', 300, 2),
       ('사이다', 300, 2),
       ('포카칩', 600, 3),
       ('새우깡', 550, 3);

# 카테시안곱
SELECT *
FROM product
         JOIN category;

# INNER JOIN
SELECT *
FROM product
         JOIN category ON category_id = category.id;

# ALIAS 별칭
SELECT *
FROM product AS p
         JOIN category AS c ON category_id = c.id;

# 필요한 컬럼만 조회
SELECT p.name  AS 상품명,
       c.name  AS 카테고리명,
       p.price AS 가격
FROM product AS p
         JOIN category AS c ON category_id = c.id;

# AS 생략 가능
SELECT p.name  상품명,
       c.name  카테고리명,
       p.price 가격
FROM product p
         JOIN category c ON category_id = c.id;




