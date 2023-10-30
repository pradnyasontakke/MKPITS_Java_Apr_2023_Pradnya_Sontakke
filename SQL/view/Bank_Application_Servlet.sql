/* create bank application
create login and registration page 
login page = user name,pw,login button,sign in  when click on sign in redirect the registration page
 registration page =userId, pw,name,add,city,email

*/
create database Bank_Application
use Bank_Application

create table Registration
(userId varchar(30) primary key, password varchar(20), name varchar(30), address varchar(30), city varchar(30),email varchar(30),balance double)
drop table Registration
 select * from Registration



create  table transaction(userID varchar(30),transaction_date date,
amount double,transactiontype varchar(20),
constraint f_k foreign key(userID) references Registration(userID)   )

select * from transaction