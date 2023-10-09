18.	Get the film titles and rental dates for all rentals made on August 10, 2005.


use sakila
select title ,rental_date from film join inventory on 
film.film_id=inventory.inventory_id join rental on 
inventory.inventory_id=rental.inventory_id join customer on 
rental.customer_id=customer.customer_id where 
date(rental.rental_date)='2006-8-10'



















