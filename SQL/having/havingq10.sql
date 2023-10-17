
10. Customers with diverse film preferences:
Find customers who have rented films from at least 5 different categories.
use sakila
SELECT customer.customer_id COUNT(DISTINCT category.category_id)
FROM customer
INNER JOIN rental ON customer.customer_id = rental.customer_id
INNER JOIN inventory ON rental.inventory_id = inventory.inventory_id
INNER JOIN film ON inventory.film_id = film.film_id
INNER JOIN film_category ON film.film_id = film_category.film_id
INNER JOIN category ON film_category.category_id = category.category_id
GROUP BY customer.customer_id
HAVING COUNT(DISTINCT category.category_id) >= 5;
