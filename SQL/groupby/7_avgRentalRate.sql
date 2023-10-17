/*7. Compute the average rental rate for each film category.*/
select title,avg(rental_rate) from film join inventory on
film.film_id=inventory.film_id
 join rental on inventory.inventory_id=rental.inventory_id
 group by title
 
 or
 
 
select title,avg(rental_rate) from 
film group by title

