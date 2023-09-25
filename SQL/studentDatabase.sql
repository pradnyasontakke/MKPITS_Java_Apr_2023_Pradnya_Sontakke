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

update students set address='nagpur', where rollno='1005'







