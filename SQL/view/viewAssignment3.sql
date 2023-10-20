/*Assignment 3: Aggregated View
Create a view named monthly_rental_stats that displays the month, year, and the total number of 
rentals for each month in the rental table.*/
use sakila 
select * from rental
select * from monthly_rental_stats
create VIEW monthly_rental_stats as
select 
    DATE_FORMAT(rental_date, '%Y-%m') AS month_year,
    COUNT(*) AS total_rentals
FROM
    rental
GROUP BY
    month_year;
