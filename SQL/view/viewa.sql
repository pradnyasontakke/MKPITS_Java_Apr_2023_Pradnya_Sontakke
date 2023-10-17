use sakila
create view vew as 
select first_name,customer_id,email from customer where first_name='john'
