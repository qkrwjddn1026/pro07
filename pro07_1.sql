create database goverment;
use goverment;

create table sample(id varchar(20), pw varchar(20));
insert into sample values('pjw', '1234');
insert into sample values('pjw2', '1234');
insert into sample values('pjw3', '1234');
commit;	
drop table member;
create table member(
id varchar(50) primary key,
pw varchar(500) not null,
name varchar(20) not null,
tel varchar(20),
addr varchar(30),
regdate datetime default now()); 
select * from member;
insert into member values ('pjw','1234','박정우','01012345678','김포',default);
insert into member values ('pjw','1234','박정우','01012345678','김포',default);

create table board (
no int not null auto_increment primary key,
title varchar(50) not null,
content varchar(500) not null,
author varchar(20) not null,
regdate datetime default now(),
visited int default 0); 
select * from board;
insert into board (title, content, author) values ('공지사항1','공지사항1 내용','admin');

drop table free;

create table free(no int primary key auto_increment,  -- 글번호
title varchar(100) not null,   -- 글제목
content varchar(1500) not null,    -- 글내용
regdate datetime default now(),   -- 작성일
visited int default 0,    -- 조회수
id varchar(20),    -- 작성자
rec int default 0 -- 추천수
);
insert into free(title,content,id) values ('자유1','자유1 내용','admin');
commit;
select * from free;