-- DML

insert into book values (1, '파이썬 철저입문', '최은석', '위키북스', 3);
insert into book values (2, '이것이 MySQL이다', '우재남', '한빛미디어', 3);
insert into book values (3, "Do it!자바 프로그래밍 입문", "박은종", "이지스퍼블리싱", 3);
insert into book values (4, "스프링 마이크로소프트 코딩 공작소", "존 카넬", "길벗", 3);
insert into book values (5, "객체지향 소프트웨어 공학", "최은만", "한빛아카데미", 3);
-- insert into book (book_name,writer,publisher,inventory) values ( '파이썬 철저입문', '최은석', '위키북스', 3);

SELECT * FROM book;

insert into customer values (101, '김규리', '01012345678');
insert into customer values (102, '김민성', '01011235813');
insert into customer values (103, '최우성', '01024681012');
insert into customer values (104, '한예찬', '01035791113');

SELECT * FROM customer;

insert into rent values (1001, STR_TO_DATE('2022-08-12','%Y-%m-%d'), 1, '파이썬 철저입문', 101, '김규리');
insert into rent values (1002, STR_TO_DATE('2022-08-12','%Y-%m-%d'), 2, '이것이 MySQL이다', 102, '김민성');
insert into rent values (1003, STR_TO_DATE('2022-08-13','%Y-%m-%d'), 3, 'Do it!자바 프로그래밍 입문', 103, '최우성');
insert into rent values (1004, STR_TO_DATE('2022-08-14','%Y-%m-%d'), 4, '스프링 마이크로소프트 코딩 공작소', 104, '한예찬');
insert into rent values (1005, STR_TO_DATE('2022-08-15','%Y-%m-%d'), 1, '파이썬 철저입문', 103, '최우성');

SELECT * FROM rent;


insert into login values ('qwe123','qwe123');
insert into login values ('rew123','rew123');
insert into login values ('bigdata','playdata');
insert into login values ('playdata','bigdata');
insert into login values ('qwe123','rew123');

SELECT * FROM login where pw like id;

commit;
