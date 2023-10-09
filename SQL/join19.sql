19.	Retrieve the film titles rented by the customer with customer_id 500.//inner join
use sakila
select * from customer
select * from film
select * from rental
select * from inventory

SELECT last_name
FROM customer
JOIN rental ON customer.customer_id = rental.customer_id
JOIN inventory ON rental.inventory_id = inventory.inventory_id
JOIN film ON inventory.film_id = film.film_id
WHERE customer.customer_id = 500;
