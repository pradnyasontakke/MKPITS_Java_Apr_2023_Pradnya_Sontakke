
/*Assignment 1: Basic View Creation
Create a view named film_titles that displays 
the film_id, title, and release_year for all films in the Sakila database.*/

create view filmTitles as select film_id, title,release_year from film
select * from filmTitles