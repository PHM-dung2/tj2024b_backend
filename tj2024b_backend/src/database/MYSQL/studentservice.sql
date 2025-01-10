drop database if exists studentservice;
create database studentservice;
use studentservice;

create table student(
	sno int unsigned auto_increment,
    constraint primary key( sno ),
	sid varchar(30) unique not null,
    spwd varchar(30) not null,
    sname varchar(30) not null
);
insert into student(sid,spwd,sname) values('qwe','qwe','유재석');
insert into student(sid,spwd,sname) values('asd','asd','강호동');
insert into student(sid,spwd,sname) values('zxc','zxc','신동엽');

create table score(
	scno int unsigned auto_increment,
    constraint primary key( scno ),
    kor int default 0, 
    eng int default 0, 
	math int default 0,
    sno int unsigned,
    constraint foreign key( sno ) references student ( sno ) on update cascade on delete cascade
);
insert into score(kor,eng,math,sno) values(100,95,90,1);
insert into score(kor,eng,math,sno) values(80,95,80,2);
insert into score(kor,eng,math,sno) values(70,55,80,3);

select * from student;
select * from score;
