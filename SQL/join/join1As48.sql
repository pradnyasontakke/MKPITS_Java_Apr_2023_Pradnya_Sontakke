49.	List the rental date and rental duration for each rental made by customer "David Clark".


use sakila
select rental_date,rental_duration, first_name,last_name from film join inventory on 
film.film_id=inventory.film_id join rental on 
inventory.inventory_id=rental.inventory_id join customer on 
rental.customer_id=customer.customer_id where 
customer.first_name='joel' and customer.last_name='francisco' 

