create database stud_details
use stud_details

create table students
(rollno char(5) primary key, studname char(10),
 address varchar(15))
select * from students
create table markdetails
(rollno char(5), physics int,chemishry int, math int,
constraint fk_rn foreign key(rollno) references students(rollno))
show table  student
select * from students
insert into students value('1001', 'pranish', 'nagpur')
insert into students value('1002','pratik','nagpur')


insert into markdetails value( '1001',65,87,97)
select * from markdetails


