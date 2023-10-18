create database studentMarks
create table student(rollno int primary key, physics int, chemishtry int, math int)
select * from student
insert into student values (1,60,90,80);
insert into student values (2,70,80,90);
insert into student values (3,80,50,80);
insert into student values (4,90,40,50);
insert into student values (5,60,90,70);

create table total(rollno int,total_marks int )
select * from total
insert into total values (5);

DELIMITER //
CREATE TRIGGER total_calculation
after insert on total for each row
BEGIN
set total=physics+chemishtry+math
where rollno= new rollno;

END;
DELIMITER;
