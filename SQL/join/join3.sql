3.	List the names of actors who have appeared in the film titled "Chamber Italian".

use sakila
select first_name,last_name from actor join film_actor on 
actor.actor_id=film_actor.actor_id join film on 
film.film_id=film_actor.film_id
where film.title='Chamber Italian'




