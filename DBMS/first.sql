create database s2;
use s2;
create table student (id varchar(13), name varchar(20), age int(2));

#table structure
desc student;

#add column
alter table student add phone int(10);

#add not null constraint
alter table student modify id varchar(13) not null;

#add unique contraint
alter table student modify id varchar(13) not null unique;

#insert row
insert into student values(1,'abcd',22,1234567890);
select * from student;