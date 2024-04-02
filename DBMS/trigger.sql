create database stores;
use stores;
create table Product(PdtId int primary key, Pname varchar(20), Price double(3,2),Qtyinstock int);
create table  Sale(saleId int primary key, Deliveryaddress varchar(50));
create table Saleitem(saleId int,PdtId int, Qty int,foreign key (saleId) references Sale(saleId),foreign key (PdtId) references Product(PdtId),primary key(saleId,PdtId));

create trigger abc1
after insert on Saleitem
for each row
update Product set Qtyinstock=Product.Qtyinstock-new.Qty where PdtId=new.PdtId;


insert into Product values (101,"pencil", 5, 10);
select * from Product;
insert into Product values (102,"pen", 3, 10);
insert into Sale(saleId,Deliveryaddress) values(001,"home123"),(002,"home345");
insert into Saleitem values (002,102,10);
set sql_safe_updates=0;
show triggers;