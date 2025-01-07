use dssystem;

# 9. 기피목록
create table dodge(
	dno int unsigned auto_increment,
    constraint primary key( dno ),
    eno int unsigned,
    constraint foreign key( eno ),
    mno int unsigned,
    constraint foreign key( mno )
);
#기피목록 샘플
insert into dodge

# 10. 별점목록
create table rating(
	rno int unsigned auto_increment,
    constraint primary key( rno ),
    rrating int unsigned,
    mno int unsigned
);
# 별점목록 샘플
insert into rating(rrating , mno) values(3 , 1);
insert into rating(rrating , mno) values(4 , 2);
insert into rating(rrating , mno) values(5 , 2);

select * from rating;