drop database if exists dssystem;
create database dssystem;
use dssystem;

# 1. 로그인 기능
create table member (
	mno int unsigned auto_increment ,
    mid varchar(30) not null ,
    mpwd varchar(30) not null ,
    mname varchar(30) not null ,
    mphone varchar(13) not null ,
    mtype tinyint not null ,
    constraint primary key(mno)
);
-- 로그인 샘플
insert into member (mid, mpwd, mname, mphone, mtype) values ('qwe', '1234', '현정우', '010-1111-1111', 1);
insert into member (mid, mpwd, mname, mphone, mtype) values ('asd', '2345', '박희만', '010-2222-2222', 2);
insert into member (mid, mpwd, mname, mphone, mtype) values ('zxc', '3456', '한상범', '010-3333-3333', 2);
insert into member (mid, mpwd, mname, mphone, mtype) values ('rty', '4567', '노진구', '010-4444-4444', 2);
insert into member (mid, mpwd, mname, mphone, mtype) values ('fgh', '5678', '유재석', '010-5555-5555', 2);
insert into member (mid, mpwd, mname, mphone, mtype) values ('vbn', '6789', '강호동', '010-6666-6666', 3);

# 2. 회원주소기능
create table memberaddress (
	mano int unsigned auto_increment ,
    mazipcode varchar(100) not null ,
    maroad varchar(100) not null ,
    mastreet varchar(100) not null ,
    madetail varchar(100) not null ,
    mno int unsigned ,
    constraint primary key(mano) ,
    constraint foreign key(mno) references member(mno) on update cascade on delete cascade
);
-- 회원주소기능 샘플
insert into memberaddress (mazipcode, maroad, mastreet, madetail, mno) values ('14743', '경기 부천시 소사구 경인로 10번길 25-44', '경기 부천시 소사구 송내동 313-23', '701호', 1);
insert into memberaddress (mazipcode, maroad, mastreet, madetail, mno) values ('7530', '서울 강서구 강서로 486', '서울 강서구 가양동 150-27', '701호', 1);
insert into memberaddress (mazipcode, maroad, mastreet, madetail, mno) values ('21510', '인천 남동구 간석로 1', '인천 남동구 간석동 73-9', '간석아파트 가동 101호', 2);

# 3. 입점목록
create table entry(
	eno int unsigned auto_increment,
    ename varchar(30) not null,
    espot varchar(30) not null,
    etype tinyint default 0,
    mno int unsigned,
	constraint primary key( eno ) ,
    constraint foreign key( mno ) references member( mno ) on update cascade on delete cascade
);
insert into entry ( ename , espot , etype , mno ) value( "BHC치킨" , "부평점" , 0 , 3 );
insert into entry ( ename , espot , etype , mno ) value( "맥도날드" , "부평중앙점" , 1 , 4 );
insert into entry ( ename , espot , etype , mno ) value( "BHC치킨" , "부평점" , 1 , 5 );

# 4. 입점주소
create table entryaddress (
	eano int unsigned auto_increment ,
    eazipcode varchar(5) not null ,
    earoad varchar(100) not null ,
    eastreet varchar(100) not null ,
    eadetail varchar(100) not null ,
    eno int unsigned ,
    constraint primary key (eano) ,
    constraint foreign key (eno) references entry (eno) on update cascade on delete cascade
);
-- 입점주소 샘플
insert into entryaddress (eazipcode, earoad, eastreet, eadetail, eno) values ('21356', '인천 부평구 장제로189번길 4', '부평동 10-894', '-', 1);
insert into entryaddress (eazipcode, earoad, eastreet, eadetail, eno) values ('21393', '인천 부평구 부평문화로 65', '부평동 212-65', '-', 1);
insert into entryaddress (eazipcode, earoad, eastreet, eadetail, eno) values ('21354', '인천 부평구 길주남로 25', '부평동 885-6', '1층 푸라닭', 2);

# 5. 카테고리
create table category (
	cno int unsigned auto_increment ,
    cname varchar(30) not null unique ,
    constraint primary key (cno)
);
-- 카테고리 샘플 
insert into category (cname) values ('패스트푸드');
insert into category (cname) values ('치킨');
insert into category (cname) values ('고기/구이');

# 6. 메뉴
create table menu (
	meno int unsigned auto_increment ,
    mename varchar(30) not null ,
    meprice int unsigned not null ,
    cno int unsigned ,
    eno int unsigned ,
    constraint primary key(meno) ,
    constraint foreign key (cno) references category (cno) on update cascade on delete cascade ,
    constraint foreign key (eno) references entry (eno) on update cascade on delete cascade
);
-- 메뉴 샘플
insert into menu (mename, meprice, cno, eno) values ('빅맥세트', 7500, 1, 2);
insert into menu (mename, meprice, cno, eno) values ('행운버거 세트', 8000, 1, 2);
insert into menu (mename, meprice, cno, eno) values ('1955버거', 8500, 1, 2);

# 7. 주문목록
create table orderlist (
	ono int unsigned auto_increment ,
    odate datetime default now() ,
    mno int unsigned ,
    constraint primary key (ono) ,
    constraint foreign key (mno) references member  (mno) on update cascade on delete cascade
);
-- 주문목록 샘플
insert into orderlist (odate, mno) values (now(), 1);
insert into orderlist (odate, mno) values (now(), 2);
insert into orderlist (odate, mno) values (now(), 2);

# 8. 주문상세
create table orderdetail (
	odno int unsigned auto_increment ,
    meno int unsigned ,
    ono int unsigned ,
    constraint primary key (odno) ,
    constraint foreign key (meno) references menu (meno) on update cascade on delete cascade ,
    constraint foreign key (ono) references orderlist (ono) on update cascade on delete cascade
);
-- 주문상세 샘플
insert into orderdetail (meno, ono) values (1, 1);
insert into orderdetail (meno, ono) values (2, 1);
insert into orderdetail (meno, ono) values (3, 2);

# 9. 기피목록
create table dodge (
	dno int unsigned auto_increment ,
    eno int unsigned ,
    mno int unsigned ,
    constraint primary key (dno) ,
    constraint foreign key (eno) references entry (eno) on update cascade on delete cascade ,
    constraint foreign key (mno) references member (mno) on update cascade on delete cascade
);
-- 기피목록 샘플 
insert into dodge (eno, mno) values (1, 1);
insert into dodge (eno, mno) values (1, 2);
insert into dodge (eno, mno) values (2, 2);

# 10. 별점목록
create table rating(
	rno int unsigned auto_increment,
    constraint primary key( rno ),
    rrating int unsigned,
    mno int unsigned
);
-- 별점목록 샘플
insert into rating(rrating , mno) values(3 , 1);
insert into rating(rrating , mno) values(4 , 2);
insert into rating(rrating , mno) values(5 , 2);

show tables;
-- select * from orderlist;