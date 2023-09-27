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
insert into students values('1001', 'pranish', 'nagpur'),
						  ('1002','pratik','indore'),
  insert into students values   ('1003','pratik','pune'),
                           ('1004','shamita','chandrapurr'),
							('1005','sami','nagpur');
select * from students

insert into markdetails values( '1001',65,87,97),
                              ( '1002',95,97,99),
insert into markdetails values  ( '1004',95,57,47),
                            ( '1005',95,57,47);
select * from markdetails



  /* */
select phy from markdetails where physics between 50 and 90
select * from markdetails where math >=50 and math <=90

select * from students where address = 'nagpur'
select * from students where rollno='1005'

delete from students where rollno='1002'
delete from markdetails where rollno='1002'

update students set address='nagpur' where rollno='1003'

alter table students add state varchar(20)
insert into students values ( 'maharashtra')

alter table markdetails add address varchar(20)
insert into students values ( 'nagpur')
update markdetails set address='nagpur' where address is null
select * from markdetails
update students set state='maharashtra' where rollno='1004'
update students set state='maharashtra' where state is null
select * from students order by studname desc

alter table students modify column state varchar(20) after studname
select *from students
desc students
select address  from students left join markdetails
on markdetails.add


SELECT Orders.OrderID, Customers.CustomerName
FROM Orders
INNER JOIN Customers ON Orders.CustomerID = Customers.CustomerID;
 




