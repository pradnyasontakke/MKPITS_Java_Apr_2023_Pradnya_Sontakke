4.	Get the titles of all films rented by the customer named "William Brown".

use sakila
select * from film
select * from inventory
select * from rental
select * from customer


select title from film join inventory
on film.film_id=inventory.film_id join rental
on inventory.inventory_id=rental.inventory_id
join customer on rental.customer_id=customer.customer_id
where first_name ='willium'