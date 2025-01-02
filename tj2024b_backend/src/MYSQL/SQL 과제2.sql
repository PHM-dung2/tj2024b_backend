create database market;
use market;

# [1] 회원기능
create table joinlist(
	jno int auto_increment,
	constraint primary key( jno ),
    jid varchar(30) not null unique,
    jpwd varchar(30) not null,
    jname varchar(10) not null,
    jphone varchar(13) not null,
    jaddress varchar(100) not null
);

# [2] 주소기능
create table address(
	ano int auto_increment,
    constraint primary key( ano ),
    aroad varchar(100) not null,
    astreet varchar(100) not null,
    adetail varchar(100) not null,
    anote varchar(100) not null,
    jno int,
    constraint foreign key( jno ) references joinlist( jno )
);

# [3] 카테고리
create table categorie(
	cno int auto_increment,
    constraint primary key( cno ),
    cname varchar(30) not null unique
);

# [4] 카테고리 디테일
create table cdetail(
	cdno int auto_increment,
    constraint primary key( cdno ),
    cdname varchar(30) not null unique,
    cno int,
    constraint foreign key( cno ) references categorie( cno )
);

# [5] 제품기능
create table product(
	pno int auto_increment,
    constraint primary key( pno ),
    pname varchar(30) not null unique,
    pprice int unsigned default 0,
    cdno int,
    constraint foreign key( cdno ) references cdetail( cdno )
);

# [6] 주문기능
create table porder(
	pono int auto_increment,
    constraint primary key( pono ),
    podate datetime default now(),
    jno int,
    constraint foreign key( jno ) references joinlist( jno )
);

# [7] 주문 디테일
create table porderdetail(
	podno int auto_increment,
    constraint primary key( podno ),
    podamount int not null default 0,
    pno int,
    constraint foreign key( pno ) references product( pno ),
    pono int,
    constraint foreign key( pono ) references porder( pono )
);

drop database market;



