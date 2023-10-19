create database shop
use shop
create table product_details(product_id int primary key, product_name varchar(20), amount int )

create table product_billing(product_id int , billno int )

insert into product_details values (1,'soap',40);
insert into product_details values (2,'bottle',140);

select * from product_details
select * from billing 

delimiter //
create trigger tableTotal 
after update on product_details for each row
begin
update product_billing
set billno=(new.product_id,new.billno)
 where product_id=new.product_id;
 end;
 //
delimiter ;







