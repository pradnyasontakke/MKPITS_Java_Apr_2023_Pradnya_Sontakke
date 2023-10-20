/*31.Get the film titles and rental dates for all rentals made on may 25, 2005.*/
use sakila
select title from film join inventory
on film.film_id=inventory.film_id join rental 
on rental.inventory_id=inventory.inventory_id
where date(rental_date)=2006-02-15;
select * from film