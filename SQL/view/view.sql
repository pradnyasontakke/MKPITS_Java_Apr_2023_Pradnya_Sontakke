use sakila
select * from customer
create view vm as select * from customer where last_name='lord'
select * from vm

create view vm1 as select * from customer where customer_id>7
select * from vm1