/*1. Retrieve the total revenue generated for each film category.*/
use sakila



select title,sum(amount) 
from film join inventory on
film.film_id=inventory.film_id join 
rental on rental.inventory_id=inventory.inventory_id
join payment on payment.customer_id=rental.customer_id group by title