7. Active customers:
Identify customers who have rented in the last 30 days

use sakila
SELECT DISTINCT customer_id, first_name
FROM customer 
INNER JOIN rental  ON customer.customer_id = rental.customer_id
WHERE rental.rental_date >= DATE_SUB(CURDATE(), INTERVAL 30 DAY);
cal_valueget_customer_balanceinventory_held_by_customerinventory_in_stock




