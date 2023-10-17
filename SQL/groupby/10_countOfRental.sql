/*10. Calculate the count of rentals for each film language.*/




select language_id,count(rental_id) from film join inventory
on film.film_id=inventory.film_id join rental on
rental.inventory_id=inventory.inventory_id group by language_id