	Get the first name, last name, email of customers who have rented les than 18 films.
    
    
    select first_name, last_name, email from customer 
    inner join()
    rental  on c.customer_id = r.rental_id where 
use sakila

SELECT 
    c.first_name,
    c.last_name,
    c.email
FROM
    customer c
JOIN
    (SELECT customer_id, COUNT(*) AS rental_count
     FROM rental
     GROUP BY customer_id
     HAVING rental_count > 18) r
ON
    c.customer_id = r.customer_id;
