create database product_man
create table product(product_id int primary key, product_name varchar (30),  price decimal(10,2),quantity int)
select * from product
insert into product values(1001,'Monitor',20000.00,50);
insert into product values(1002,'Mouse',29900.00,40);
insert into product values(1003,'Keybord',24400.00,90);
insert into product values(1004,'charger',20320.00,70);
insert into product values(1005,'SSDcard',28700.00,30);


create table sale(salesId int,product_id int,quantity int);
insert into sale values(1006,1007,39);


DELIMITER //
CREATE TRIGGER afte_sale_trigger
AFTER INSERT ON sale FOR EACH ROW
BEGIN
UPDATE product
    set quantity=quantity-NEW.quantity
    where product_id=NEW.product_id;
END;
//
DELIMITER ;

