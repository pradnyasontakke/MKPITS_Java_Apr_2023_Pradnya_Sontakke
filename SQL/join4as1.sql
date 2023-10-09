4.	Get the titles of all films rented by the customer named "William Brown".

use sakila
select first_name,last_name,title from film join inventory on
film.film_id=inventory.inventory_id 
join rental on rental.inventory_id =inventory.inventory_id join customer on
customer.customer_id=rental.rental_id
where customer.first_name ='William' and customer.last_name='Brown' 





