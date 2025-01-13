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
insert into member (mid, mpwd, mname, mphone, mtype) values ('admin', '1234', '유재석', '010-1111-1111', 1);
insert into member (mid, mpwd, mname, mphone, mtype) values ('fran', '1234', '강호동', '010-2222-2222', 2);
insert into member (mid, mpwd, mname, mphone, mtype) values ('fran1', '1234', '신동엽', '010-3333-3333', 2);
insert into member (mid, mpwd, mname, mphone, mtype) values ('guest', '1234', '딘딘', '010-4444-4444', 3);
insert into member (mid, mpwd, mname, mphone, mtype) values ('guest1', '1234', '조현영', '010-5555-5555', 3);

# 2. 회원주소기능
create table memberaddress (
	mano int unsigned auto_increment ,
    mazipcode varchar(100) not null ,
    maroad varchar(100) not null ,       -- 도로명주소
    mastreet varchar(100) not null ,     -- 지번주소
    madetail varchar(100) not null ,     -- 상세주소
    masi varchar(32) not null ,          -- 시
    masgg varchar(32) not null ,         -- 구
    mno int unsigned ,
    constraint primary key(mano) ,
    constraint foreign key(mno) references member(mno) on update cascade on delete cascade
);
-- 회원주소기능 샘플
insert into memberaddress (mazipcode, maroad, mastreet, madetail, masi, masgg, mno) values ('14743', '경기도 부천시 소사구 송내동 313-23', '경기도 부천시 소사구 경인로10번길 25-44 (송내동)', '-', '경기도', '부천시 소사구', 1);
insert into memberaddress (mazipcode, maroad, mastreet, madetail, masi, masgg, mno) values ('07530', '서울특별시 강서구 강서로 486 (가양동)', '서울특별시 강서구 가양동 150-27', '-', '서울특별시', '강서구', 2);
insert into memberaddress (mazipcode, maroad, mastreet, madetail, masi, masgg, mno) values ('21510', '인천광역시 남동구 간석로31번길 1 (간석동, 세종아트빌)', '인천광역시 남동구 간석동 83-24 세종아트빌', '101호', '인천광역시', '남동구', 3);
insert into memberaddress (mazipcode, maroad, mastreet, madetail, masi, masgg, mno) values ('07995', '인천광역시 부평구 구산동 360 부평자이', '인천광역시 부평구 일신로 120 (구산동, 부평자이)', '301호', '인천광역시', '부평구', 4);
insert into memberaddress (mazipcode, maroad, mastreet, madetail, masi, masgg, mno) values ('08830', '서울특별시 관악구 참숯5길 7 (봉천동, e편한세상 서울대입구 3단지)', '서울특별시 관악구 봉천동 1730-2 e편한세상 서울대입구 3단지', '505호', '서울특별시', '관악구', 5);

-- 부평구는 2번 가맹회원 독점, 관악구는 3번 가맹회원 독점
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
-- 인천광역시 부평구 입점 샘플
insert into entry (ename, espot, etype, mno ) value("맥도날드", "인천구산DT점", 1, 2);
insert into entry (ename, espot, etype, mno ) value("맥도날드", "부평중앙점", 1, 2);
insert into entry (ename, espot, etype, mno ) value("버거킹", "부평시장역점", 1, 2);
insert into entry (ename, espot, etype, mno ) value("버거킹", "부평역점", 1, 2);
insert into entry (ename, espot, etype, mno ) value("BHC치킨", "부평점", 1, 2);
insert into entry (ename, espot, etype, mno ) value("BHC치킨", "부평남부점", 1, 2);
-- 서울특별시 관악구 샘플 목록
insert into entry (ename, espot, etype, mno ) value("맥도날드", "신림점", 1, 3);
insert into entry (ename, espot, etype, mno ) value("버거킹", "신림역점", 1, 3);
insert into entry (ename, espot, etype, mno ) value("버거킹", "서울대입구역점", 1, 3);
insert into entry (ename, espot, etype, mno ) value("버거킹", "신림미림여고입구점", 1, 3);
insert into entry (ename, espot, etype, mno ) value("BHC치킨", "신림신원점", 1, 3);
insert into entry (ename, espot, etype, mno ) value("BHC치킨", "봉천중앙점", 1, 3);

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
-- 인천광역시 부평구 입점주소 샘플
insert into entryaddress (eazipcode, earoad, eastreet, eadetail, eno) values ('21416', '인천광역시 부평구 경인로 1191 (구산동)', '인천광역시 부평구 구산동 1-4 한국맥도날드', '1,2층', 1);
insert into entryaddress (eazipcode, earoad, eastreet, eadetail, eno) values ('21393', '인천광역시 부평구 부평문화로 65 (부평동)', '인천광역시 부평구 부평동 212-65', '-', 2);
insert into entryaddress (eazipcode, earoad, eastreet, eadetail, eno) values ('21359', '인천광역시 부평구 부평대로 90 (부평동)', '인천광역시 부평구 부평동 440-5 여산빌딩', '1층', 3);
insert into entryaddress (eazipcode, earoad, eastreet, eadetail, eno) values ('21389', '인천광역시 부평구 부평대로 5 (부평동)', '인천광역시 부평구 부평동 549-38 W빌딩', '1층', 4);
insert into entryaddress (eazipcode, earoad, eastreet, eadetail, eno) values ('21356', '인천광역시 부평구 장제로189번길 4 (부평동)', '인천광역시 부평구 부평동 10-894', '1층', 5);
insert into entryaddress (eazipcode, earoad, eastreet, eadetail, eno) values ('21425', '인천광역시 부평구 경인로 960 (부평동)', '인천광역시 부평구 부평동 645-34 서보타운', '104~105호', 6);
-- 서울특별시 관악구 입점주소 샘플
insert into entryaddress (eazipcode, earoad, eastreet, eadetail, eno) values ('08778', '서울특별시 관악구 신림로 310 (신림동)', '서울특별시 관악구 신림동 1641-22', '-', 7);
insert into entryaddress (eazipcode, earoad, eastreet, eadetail, eno) values ('08777', '서울특별시 관악구 신림로 318 (신림동, 청암두산위브센티움)', '서울특별시 관악구 신림동 86-3 청암두산위브센티움', '1층', 8);
insert into entryaddress (eazipcode, earoad, eastreet, eadetail, eno) values ('08786', '서울특별시 관악구 남부순환로 1796 (봉천동)', '서울특별시 관악구 봉천동 875-8 삼호빌딩', '1층', 9);
insert into entryaddress (eazipcode, earoad, eastreet, eadetail, eno) values ('08846', '서울특별시 관악구 신림로 141 (신림동)', '서울특별시 관악구 신림동 1513-1', '1층', 10);
insert into entryaddress (eazipcode, earoad, eastreet, eadetail, eno) values ('08774', '서울특별시 관악구 신원로3가길 14 (신림동)', '서울특별시 관악구 신림동 1606-12', '1층', 11);
insert into entryaddress (eazipcode, earoad, eastreet, eadetail, eno) values ('08729', '서울특별시 관악구 은천로 143 (봉천동)', '서울특별시 관악구 봉천동 1719-1 관악동부센트레빌아파트', '상가 1층 102호', 12);

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
    mename varchar(30) not null,
    meprice int unsigned not null,
    cno int unsigned ,
    eno int unsigned ,
    constraint primary key(meno) ,
    constraint foreign key (cno) references category (cno) on update cascade on delete cascade ,
    constraint foreign key (eno) references entry (eno) on update cascade on delete cascade
);
-- 부평구 맥도날드 메뉴 샘플
insert into menu (mename, meprice, cno, eno) values ('빅맥버거', 7000, 1, 1);
insert into menu (mename, meprice, cno, eno) values ('1955버거', 7500, 1, 1);
insert into menu (mename, meprice, cno, eno) values ('더블치즈버거', 6500, 1, 1);
insert into menu (mename, meprice, cno, eno) values ('빅맥버거', 7000, 1, 2);
insert into menu (mename, meprice, cno, eno) values ('1955버거', 7500, 1, 2);
insert into menu (mename, meprice, cno, eno) values ('더블치즈버거', 6500, 1, 2);
-- 관악구 맥도날드 메뉴 샘플
insert into menu (mename, meprice, cno, eno) values ('빅맥버거', 7000, 1, 7);
insert into menu (mename, meprice, cno, eno) values ('1955버거', 7500, 1, 7);
insert into menu (mename, meprice, cno, eno) values ('더블치즈버거', 6500, 1, 7);
-- 부평구 버거킹 메뉴 샘플 샘플
insert into menu (mename, meprice, cno, eno) values ('콰트로치즈와퍼', 7000, 1, 3);
insert into menu (mename, meprice, cno, eno) values ('통새우와퍼', 6000, 1, 3);
insert into menu (mename, meprice, cno, eno) values ('몬스터와퍼', 8000, 1, 3);
insert into menu (mename, meprice, cno, eno) values ('콰트로치즈와퍼', 7000, 1, 4);
insert into menu (mename, meprice, cno, eno) values ('통새우와퍼', 6000, 1, 4);
insert into menu (mename, meprice, cno, eno) values ('몬스터와퍼', 8000, 1, 4);
-- 관악구 버거킹 메뉴 샘플 샘플
insert into menu (mename, meprice, cno, eno) values ('콰트로치즈와퍼', 7000, 1, 8);
insert into menu (mename, meprice, cno, eno) values ('통새우와퍼', 6000, 1, 8);
insert into menu (mename, meprice, cno, eno) values ('몬스터와퍼', 8000, 1, 8);
insert into menu (mename, meprice, cno, eno) values ('콰트로치즈와퍼', 7000, 1, 9);
insert into menu (mename, meprice, cno, eno) values ('통새우와퍼', 6000, 1, 9);
insert into menu (mename, meprice, cno, eno) values ('몬스터와퍼', 8000, 1, 9);
insert into menu (mename, meprice, cno, eno) values ('콰트로치즈와퍼', 7000, 1, 10);
insert into menu (mename, meprice, cno, eno) values ('통새우와퍼', 6000, 1, 10);
insert into menu (mename, meprice, cno, eno) values ('몬스터와퍼', 8000, 1, 10);
-- 부평구 BHC치킨 메뉴 샘플
insert into menu (mename, meprice, cno, eno) values ('뿌링클치킨', 22000, 1, 5);
insert into menu (mename, meprice, cno, eno) values ('맛초킹치킨', 21000, 1, 5);
insert into menu (mename, meprice, cno, eno) values ('치퐁당후라이드치킨', 23000, 1, 5);
insert into menu (mename, meprice, cno, eno) values ('뿌링클치킨', 22000, 1, 6);
insert into menu (mename, meprice, cno, eno) values ('맛초킹치킨', 21000, 1, 6);
insert into menu (mename, meprice, cno, eno) values ('치퐁당후라이드치킨', 23000, 1, 6);
-- 관악구 BHC치킨 메뉴 샘플
insert into menu (mename, meprice, cno, eno) values ('뿌링클치킨', 22000, 1, 11);
insert into menu (mename, meprice, cno, eno) values ('맛초킹치킨', 21000, 1, 11);
insert into menu (mename, meprice, cno, eno) values ('치퐁당후라이드치킨', 23000, 1, 11);
insert into menu (mename, meprice, cno, eno) values ('뿌링클치킨', 22000, 1, 12);
insert into menu (mename, meprice, cno, eno) values ('맛초킹치킨', 21000, 1, 12);
insert into menu (mename, meprice, cno, eno) values ('치퐁당후라이드치킨', 23000, 1, 12);

# 7. 주문목록
create table orderlist (
	ono int unsigned auto_increment ,
    odate datetime default now() ,
    mno int unsigned ,
    constraint primary key (ono) ,
    constraint foreign key (mno) references member  (mno) on update cascade on delete cascade
);
-- 주문목록 샘플
insert into orderlist (odate, mno) values ('2025-01-11 07:30:00', 4);
insert into orderlist (odate, mno) values ('2025-01-11 08:30:00', 4);
insert into orderlist (odate, mno) values ('2025-01-11 09:30:00', 4);
insert into orderlist (odate, mno) values ('2025-01-12 15:30:00', 5);
insert into orderlist (odate, mno) values ('2025-01-12 16:30:00', 5);
insert into orderlist (odate, mno) values ('2025-01-12 17:30:00', 5);

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
insert into orderdetail (meno, ono) values (2, 2);
insert into orderdetail (meno, ono) values (4, 3);
insert into orderdetail (meno, ono) values (7, 4);
insert into orderdetail (meno, ono) values (8, 5);
insert into orderdetail (meno, ono) values (16, 6);

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
    rrating int unsigned default 3,
    mno int unsigned
);
-- 별점목록 샘플
insert into rating(rrating , mno) values(3 , 1);
insert into rating(rrating , mno) values(4 , 2);
insert into rating(rrating , mno) values(5 , 2);