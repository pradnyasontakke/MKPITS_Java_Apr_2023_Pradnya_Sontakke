100.Retrieve the rental date and return date for each rental made by customer "Michelle Johnson".

use sakila
  select rental_date,return_date,first_name,last_name from rental 
  join customer on rental.customer_id=customer.customer_id
  where customer.first_name="Michelle" and customer.last_name="Johnson"