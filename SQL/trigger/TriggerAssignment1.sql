/*Trigger to Update Rental History:
Create a trigger that updates the rental history table whenever a new rental record is inserted into the rental table.*/

use sakila
select * from rental

insert into rental(rental_id,customer_id) values(1, 77 );

create table rentalHistory(rentalID int, rentalDate date ,RentalRate int ,NumberOfDays int)
select * from rentalHistory
insert into rentalHistory values(1,'2023-10-19',12,40);


delimiter //
CREATE TRIGGER RentalInsert

AFTER INSERT ON Rental 
for each row
BEGIN
update rentalHistory
    -- Insert the new rental record into the RentalHistory table
    INSERT INTO RentalHistory (new.RentalID, new.RentalDate, new.RentalRate, new.NumberOfDays)
  
END;

delimiter //
