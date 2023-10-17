/*6. Calculate the count of rentals handled by each staff member.*/

use sakila
select staff.staff_id, first_name, last_name, count(rental_id) from staff
join rental on staff.staff_id=rental.staff_id group by rental_id

select staff.staff_id,first_name,count(rental_id)
from staff join rental on
staff.staff_id=rental.staff_id group by staff_id
