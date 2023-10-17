Create  view named film_titles that displays the film_id, title, and release_year for all films in the Sakila database.


use sakila
CREATE VIEW film_titles AS
SELECT
    film_id,
    title,
    release_year
FROM
    film;
