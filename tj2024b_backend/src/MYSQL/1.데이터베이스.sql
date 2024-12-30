/* 여러줄 주석 */
# 한줄 주석
-- 한줄 주석
/*
	1. SQL 코드 작성 방법
		1. SQL 문법을 작성한다.
		2. SQL 문장이 끝나면 ;(세미콜론)으로 마친다.
    2. SQL 코드 실행 방법
		방법1 : 단위실행 
			1. 실행할 코드에 (마우스)커서를 두고 CTRL+ENTER
            2. 실행할 코드에 (마우스)커서를 두고  (번개I아이콘) 클릭
		방법2 : 현재 파일내 모든 코드 실행( 위에서 아래순으로 )
			1. CTRL+SHIFT+ENTER
            2. (번캐아이콘) 클릭
	3. SQL 코드 실행 결과
		- 하단에 Result Grid 탭에서 확인 가능합니다.
*/ 
# [1] db server 내 모든 데이터베이스 확인
# 데이터베이스란? 데이터집합, 표/테이블들을 모아둔 곳
show databases;

# [2] db server의 local path 확인
show variables like 'datadir';
-- 'C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Data\\'

# [3] db server 의 데이터베이스 생성하기.
# create(뜻 : 생성한다) databases(데이터베이스) DB명 , 
create database mydb1226;

# [4] db server의 데이터베이스 삭제하기
# drop(뜻:버린다) database(데이터베이스) DB명 , drop database DB명
drop database mydb1226;

# [4-2] 만약에 지정한 데이터베이스가 존재하면 삭제하기
# if(만약에) exists(존재하다)
drop database if exists mydb1226;

# [5] db server 내 여러개 데이터베이스 중에 사용/활성화 할 데이터베이스 선택
use mydb1226;

# 실습1 : 아래와 같이 순서대로 SQL코드를 작성하고 실행하시오.
-- 1. 'test1' 이름의 데이터베이스가 존재하면 삭제하기 SQL 작성
drop database if exists test1;
-- 2. 'text1' 이름의 데이터베이스 생성하기 SQL 작성
create database test1;
-- 3. 서버의 전체 데이터베이스 목록 확인 SQL 작성
show databases;
-- 4. 로컬PC에 데이터베이스가 만들어졌는기 졍로 확인 SQL 작성
show variables like 'datadir';
-- 5. 'test1' 이름의 데이터베이스 사용 활성화하기 SQL 작성
use test1;

# 참고 : 현재 작성한 코드 파일을 sql확장자 파일 , crtl+s


create database my1230;
use my1230;
# [1] 테이블 생성한다. create table 테이블명( 필드명 타입 );
create table testtable1( 필드명 int );
# [2] 현재 활성화(사용) 중인 DB내 모든 테이블 조회
show tables;
# [3] 테이블 생성한다. create table 테이블명( 필드명 타입 , 필드명 타입 );
# 여러개 필드가 존재할 ㄱㅇ우 , (쉼표) 구분한다.
create table testtable2( 필드명1 int , 필드명2  int );
# [4] 테이블 삭제한다. dtop table 테이블명;
drop table testtable1;
drop table if exists testtable2;
# [5] MYSQL 데이터 타입
/*
	[정수]
		tinyint 		1바이트	-128 ~ +127		vs byte
        smallint 		2바이트 	+-3만정도			vs short
        mediumint		3바이트	+-800만정도
        int 			4바이트 	+-21억정도
        bigint 		8바이트 	+-21억이상		vs long
	[실수]
		float			4바이트	부동소수점( 표현 범위 이상일 경우 오차 발생 )
        double			8바이트	부동소수점( 표현 범위 이상일 경우 오차 발생 )
        decimal			문자타입	실수를 문자로 처리하는 타입 , 오차 없음
	[날짜/시간]
        date			날짜표현 , 0000-00-00		1000년 ~ 9999년
        time			시간표현 , 00:00:00\
        datetime		날짜/시간표현 , 0000-00-00 00:00:00
	[문자]
		char(문자길이)		문자열표현 , 고정길이 , 최대 255글자 , char(5)		-->"유재석"	--> [유] [재] [석] [ ] [ ] 2칸이 남는다.
        varchar(문자길이)	문자열표현 , 가변길이 , 최대 255글자 , varchar(5)	-->"유재석"	--> [유] [재] [석] 남은 길이는 제거
        text			문자열표현 , 최대 6만 글자
        long text		문자열표현 , 최대 42억개 글자 , 4GB , 대용량
	[논리]
		bool			true or false 표현 , tinyint와 같다.	
        
        
        
*/





