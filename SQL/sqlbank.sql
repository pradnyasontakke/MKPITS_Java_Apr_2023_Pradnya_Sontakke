create database bank_details
use bank_details
create table bank
(bname char (10), accno int, address varchar(15), branchname char(20));
select * from bank
insert into bank values('boi', 123456789,'bhadrawati')
insert into bank values('sbi', 234123789, 'nagpur')
insert into bank values('sbi', 239873789, 'pune')
insert into bank values('sbi', 94578789, 'chandrapur')

select * from bank where address='pune'
select accno from bank where accno
select * from students order by name,state
select database();
