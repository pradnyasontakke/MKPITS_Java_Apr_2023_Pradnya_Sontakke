/*9. Retrieve the total revenue generated for each city.*/
select 





select city.city_id,sum(amount) from city
join address on city.city_id=address.city_id join staff
on staff.address_id=address.address_id join payment 
on payment.staff_id=staff.staff_id group by city_id