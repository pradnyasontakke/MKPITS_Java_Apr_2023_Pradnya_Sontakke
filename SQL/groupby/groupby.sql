use sakila
select country_id from city group by city_id
select inventory_id,film_id  from inventory
join film on film.film_id =inventory.inventory_id



select amount,payment_date, count(customer_id)
 from  payment group by  amount,payment_date
