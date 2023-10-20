/*Assignment 2: Complex View with Joins
Create a view named customer_rental_info that displays the customer's first name, last name, email, rental date, 
and film title for each rental transaction in the Sakila database. Utilize appropriate joins to obtain the 
necessary information.*/
CREATE VIEW filmT AS 
select customer.customer_id,email,rental_date,rental_id,return_date from customer 
join rental on 
customer.customer_id=rental.customer_id
join inventory on
rental.inventory_id=inventory.inventory_id join film  on
inventory.film_id=film.film_id
select * from filmT


