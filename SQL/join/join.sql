1.	Retrieve the names of all customers and the titles of the films they have rented.


SELECT *
FROM customer
JOIN rentals ON customers.customer_id = rentals.customer_id
JOIN films ON rentals.film_id = films.film_id;
