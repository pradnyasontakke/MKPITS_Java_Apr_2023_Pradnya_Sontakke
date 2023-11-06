/* create bank application
create login and registration page 
login page = user name,pw,login button,sign in  when click on sign in redirect the registration page
 registration page =userId, pw,name,add,city,email

*/
create database Bank_Application
use Bank_Application

create table Registration
(userId varchar(30) primary key, password varchar(20), name varchar(30), address varchar(30), city varchar(30),email varchar(30),balance varchar(30) );
insert into Registration values('pradnya123','12345','pradnya s','chatrapati sq','nagpur','p@gmail.com',50000);
insert into Registration values('mina','12345','mina s','chatrapati sq','nagpur','mina@gmail.com',10000);
 select * from Registration
 drop table Registration
 desc Registration    
 desc show the details
 
 


drop table transaction
create  table transaction
(userId varchar(30),transaction_date date,
amount double,transactiontype varchar(20),
constraint f_k foreign key(userId) references Registration(userId)   )

select * from transaction