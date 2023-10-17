Display the rental date and return date for each rental along with the customer's first name and last name.

use sakila
select rental_date,return_date,first_name,last_name from rental join customer on
customer.customer_id=rental.customer_id




