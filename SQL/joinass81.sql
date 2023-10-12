81.	List the rental date and return date for all rentals made by customer "Kevin Johnson".


use sakila
SELECT rental_date, return_date
FROM rental
JOIN customer ON rental.customer_id = customer.customer_id
WHERE customer.first_name = 'Kevin' AND customer.last_name = 'Johnson';
 delete customer from customer where customer_id=10
 

