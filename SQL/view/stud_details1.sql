create database stud_details1
use stud_details1

create table student1
(rollno char(5) primary key, name char(10), city char(10),
 address varchar(15));

insert into student1 values('1001', 'pranish', 'nagpur','chatrapati sq'),
						  ('1002','pratik','indore','ramnagar'),
                            ('1003','pratik','pune','sadashiv peth'),
                           ('1004','shamita','chandrapur','gandhi nagar'),
							('1005','sami','nagpur','ajani');
select * from student1

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
 




