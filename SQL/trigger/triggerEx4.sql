create database shop

create table product_details(product_id int, product_name varchar(20), amount int )

create table billing(product_id int , billingNumber int )

insert into product_details values (1,'soap',40);
insert into product_details values (2,'bottle',140);
insert into product_details values (3,'maggi',50);
insert into product_details values (4,'tiffin',240);
insert into product_details values (5,'book',400);

select * from product_details
select * from billing 
selct * from total

delimiter //
create trigger table 
after insert on billing for each row
begin
insert into total values()
end;
delimiter 

