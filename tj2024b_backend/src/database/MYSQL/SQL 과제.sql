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
#주의할점은 테이블 생성시 상위PK 테이블 먼저 생성
# [4] 카테고리 테이블
create table categorie(
	cno int auto_increment,				# 카테고리번호
    kategorie varchar(30) not null,		# 카테고리명
    constraint primary key( cno )		# pk 필드 설정
);
# [5] 제품 테이블
create table product(
	pno int auto_increment,				# 제품번호
    pname varchar(100) not null unique,	# 제품명
    pprice int unsigned default 0,		# 제품가격
    constraint primary key( pno ),		# pk 필드 설정
    cno int,							# fk 필드 선언(pk필드와 동일한 타입 권장)
    constraint foreign key( cno ) references categorie( cno ) # fk 필드 설정
);
# [6] 주문 테이블
create table porder(
	pono int auto_increment,			# 주문번호
    pdate datetime default now(),		# 주문날짜 , 현재 시스템 날짜 자동
    constraint primary key( pono )		# pk 필드 설정
);

create table porderdetail(
	podno int auto_increment,				# 주문상세
    podamount tinyint unsigned not null,	# 주문수량
    constraint primary key( podno ),		# 주문상세 pk 설정
    pno int,							# 제품번호 fk 설정
    constraint foreign key( pno ) references product( pno ),
    pono int,								# 주문번호 fk 설정
    constraint foreign key( pono ) references porder( pono )
);
# 테이블 간의 관계를 시작화적으로 표현 : ERD 다이어그램
# 워크벤치에서 [datebase] - [reverse engineer]

drop database kiosk;