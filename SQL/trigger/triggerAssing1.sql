 /*Trigger to Update Rental History:
Create a trigger that updates the rental history table whenever a new rental record is inserted into the rental table.*/
 
 create database rentalTable
use rentalTable
create table rental1(rental_id int primary key, customer_name varchar(20))
insert into rental1 values(101,'ram')
insert into rental1 values(102,'bharat') 
insert into rental1 values(103,'bina') 
insert into rental1 values(104,'nita') 
insert into rental1 values(105,'nitesh') 
insert into rental1 values(106,'pranali') 
insert into rental1 values(107,'pranay') 
select * from rental1

create table rentalHistory11(rental_id int,rental_c varchar(30))
drop table rentalHistory1



select * from rentalHistory11

delimiter //
create trigger rentalTable  after insert on rental1 for each row
begin
insert into rentalHistory11 values(new.rental_id,new.customer_name);
end;
//
delimiter ;
