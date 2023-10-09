51.	Get the names of customers who have rented the film titled "Golden Groove".

use sakila


select first_name,last_name,title from customer 
join rental on  customer.customer_id=rental.customer_id 
join inventory on rental.inventory_id=inventory.inventory_id 
join film on inventory.film_id=film.film_id 
 where film.title = 'academy dinosaur'

SELECT first_name,last_name,title
FROM customer
JOIN rental ON customer.customer_id = rental.customer_id
JOIN inventory ON rental.inventory_id = inventory.inventory_id
JOIN film ON inventory.film_id = film.film_id
WHERE film.title = 'academy dinosaur'

