Assignment 2: Complex View with Joins
Create a view named customer_rental_info that displays the customer's 
first name, last name, email, rental date, and film title for each rental 
transaction in the Sakila database. Utilize appropriate joins to obtain the
 necessary information.


use sakila
CREATE VIEW customer_rental_info AS
SELECT
    c.first_name AS customer_first_name,
    c.last_name AS customer_last_name,
    c.email,
    r.rental_date,
    f.title AS film_title
FROM
    customer c
    JOIN rental r ON c.customer_id = r.customer_id
    JOIN inventory i ON r.inventory_id = i.inventory_id
    JOIN film f ON i.film_id = f.film_id;

