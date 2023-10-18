create database stud_marks
create table students(rollno int primary key,sname varchar(20), city varchar(20))
insert into students values (1, 'sumit', 'pune');
insert into students values (2, 'rita', 'cpur');
insert into students values (3, 'pranish', 'mumbai');
insert into students values (4, 'nitisha', 'beed');
insert into students values (5, 'sumit', 'pune');

select * from students
select * from marksT
select * from total


drop table marks
create table marksT(rollno int, physics int,chemishtry int,math int)
/*insert query*/
DELIMITER //
create trigger total
after insert on marksT for  each row
BEGIN
insert into total values(new.rollno,new.physics+new.chemishtry+new.math);
END ;
//
DELIMITER ;

/*update query*/
DELIMITER //
create trigger total
after update on marksT for  each row
BEGIN
update total
 set marksT=((new.physics+10)+new.chemishtry+new.math) 
 where rollno=new.rollno;
END 
//
DELIMITER ;
insert into marksT values (1, 40,60,90);
insert into marksT values (2, 80,60,40);
insert into marksT values (3, 70,80,90);
insert into marksT values (4, 60,50,40);
insert into marksT values (5, 50,50,50);
insert into marksT values (6, 50,50,50);
insert into marksT values (8, 50,90,50);

update total set physics=physics+100 
 where rollno=rollno;

