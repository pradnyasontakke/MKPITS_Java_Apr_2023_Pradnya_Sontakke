13.	Get the names of all customers who have rented more than 5 films.


use sakila

SELECT customer.first_name, customer.last_name
FROM customer
JOIN rental ON customer.customer_id = rental.customer_id
GROUP BY customer.customer_id
HAVING COUNT(rental.rental_id) > 5;


 
