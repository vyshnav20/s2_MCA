create database store;
use store;
create table Product(Pid int(4) primary key,Pname varchar(20),price double (5,2),quantity int(3));
desc Product;
call insert_values(1001,"bat",200,0);
select * from Product;