# SQL 과제
/*
	[ 요구사항 ]
    1. 여러개 카테고리중에 카테고리를 선택을 해서 카테고리 별로 제품들을 출력/확인 한다.
    2. 해당 제품을 선해서 수량 입력받아 주문처리 한다. 단, 하나의 주문에 여러개 제품을 주문할 수 있다.
    3. 주문번호를 받아서 대기한다.
    4. 설계 조건
		1. [ 메모리 설계 필수 속성 ]
        - 식별자코드 , 카테고리명 , 가격 , 제품명 , 주문수량 , 주문날짜 하되 추가 가능 합니다.
        2. 테이블간의 데이터 중복을 최소화한다.
        3. 총 테이블은 3개 이상으로 설계한다.
        4. 적절한 타입과 제약조건을 최대한 활용하시오.
        5. DB명 , 테이블명 , 속성명은 임의로 합니다.
*/
create database kiosk;
use kiosk;
create table product(
	pno tinyint auto_increment,
    price int not null,
    pName varchar(30) not null unique,
    constraint primary key( pno ),
    kno tinyint,
    constraint foreign key( kno ) references kategorie( kno )
);

create table kategorie(
	kno int auto_increment,
    kategorie varchar(30) not null unique,
    constraint primary key( kno )
);

create table orderlist(
	ono int auto_increment,
    count tinyint default 0, 
    date time default now(),
    constraint primary key( ono ),
    kno tinyint,
    constraint foreign key( kno ) references kategorie( kno ),
    pno tinyint,
    constraint foreign key( pno ) references product( pno )
);
