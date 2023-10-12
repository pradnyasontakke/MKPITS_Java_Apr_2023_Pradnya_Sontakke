71.	Get the first name, last name, and email of customers who have rented more than 18 films.


use sakila
select first_name,last_name, email from customer 
join rental on
customer.customer_id=rental.customer_id
 

GROUP BY customer.customer_id
HAVING COUNT(rental.rental_id) > 18;



 