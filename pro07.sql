select * from board;
desc board;
select * from free;
desc member;
select * from member;
drop table qna;
create table qna(
    no int primary key ,
    title varchar(100) not null,
    content varchar(1000) not null,
    author varchar(20) not null,
    regdate date default sysdate,
    lev int default 0    ,     -- 깊이	
    parno INT -- 부모글 번호
);
CREATE SEQUENCE seq_qna START WITH 1 INCREMENT BY 1;
insert into qna(no,author, title, content) values (1,'pjw123','질문1','내용1');
commit;
select * from qna;