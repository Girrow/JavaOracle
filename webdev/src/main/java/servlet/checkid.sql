create table userid(
	id varchar2(30)	primary key
);

insert into userid values('son');
insert into userid values('ryu');

select count(id) as cnt
  from USERID
 where id='son';