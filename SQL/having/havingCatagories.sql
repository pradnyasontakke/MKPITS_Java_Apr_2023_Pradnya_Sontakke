

1. High revenue categories:
Find categories with an average rental revenue greater than $10.


use sakila
SELECT rental_id, AVG(rental_revenue) AS average_revenue
FROM rental
GROUP BY category_name
HAVING (rental_revenue) > 10;






/3. Calculate the average rental duration (in days) for each film./

select * from film
select * from rental
select * from inventory



select film.film_id,title, round(avg(datediff(return_date,rental_date)))
from film join inventory on
film.film_id=inventory.film_id join rental 
on inventory.inventory_id=rental.inventory_id
group by film_id


/maximum avgdays/
select film.film_id,title, round(avg(datediff(return_date,rental_date)))
from film join inventory on
film.film_id=inventory.film_id join rental 
on inventory.inventory_id=rental.inventory_id
group by film_id