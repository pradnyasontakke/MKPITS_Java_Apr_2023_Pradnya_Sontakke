create database data_db
use data_db

create table employee(e_id int not null primary key,e_name varchar(20),salary int)
insert into employee values(1,'Rahul',500000),(2,'Pranali',300000),(3,'Komal',100000),(4,'Bharat',22000),(5,'Pawan',1100)

select * from employee
select max(salary) from employee
select max(salary) from employee where salary< (select max(salary) from employee) 
select salary from employee where salary limit 3,2
select e_name from employee where salary< (select max(salary) from employee )

create table emp as(select * from employee where 1=2)
select * from emp
drop table emp
create table emp as select * from employee
select * from emp


