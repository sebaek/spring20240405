# 18type.sql

# 문자열
# VARCHAR(길이)
CREATE TABLE my_table3
(
    name  VARCHAR(3),
    title VARCHAR(5),
    notes VARCHAR(1000)
);
DESC my_table3;
INSERT INTO my_table3
    (name, title, notes)
VALUES ('이강인', '축구선수', '파리생제르망');
INSERT INTO my_table3
    (name, title, notes)
VALUES ('네이마르', '야구선수', '사우디아라비아');

# todo ; my_table4
#  책 제목, 책 내용, 저자
#  테이블 만들고, 데이터 추가, 조회

# 수
# 날짜시간