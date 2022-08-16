-- database에 접속 필수 
USE playdata;

drop table if exists rent;
drop table if exists book;
drop table if exists customer;

create table book (
	book_no 		int PRIMARY KEY,
	book_name 		char(50) NOT NULL,
	writer 			char(20),
	publisher 		char(20),
    inventory 		int NOT NULL
); 

create table customer (
	customer_id 	int PRIMARY KEY,
    customer_name 	Char(20) NOT NULL,
    phone_num 		varchar(20) NOT NULL
);

create table rent (
	rent_no 		int PRIMARY KEY,
    rent_date		date NOT NULL,
    book_no			int,
    book_name		char(50),
    customer_id 	int NOT NULL,
    customer_name 	Char(20) NOT NULL
);

create table login (
	id				Varchar(10) PRIMARY KEY,
    pw				Varchar(10) NOT NULL
);

-- ALTER TABLE book AUTO_INCREMENT = 1;
ALTER TABLE rent ADD FOREIGN KEY (book_no) REFERENCES book (book_no);
ALTER TABLE rent ADD FOREIGN KEY (customer_id) REFERENCES customer (customer_id);

