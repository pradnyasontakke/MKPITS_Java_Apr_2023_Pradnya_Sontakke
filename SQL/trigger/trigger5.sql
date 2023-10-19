  create database student_exam
use student_exam
create table student(roll_no int primary key,name_of_student varchar(20))
insert into student values(101,'ram')
insert into student values(102,'radha')

select * from student

create table marks(roll_no int,physics int,math int)
insert into marks values(10,50,50)
insert into marks values(1,40,50)
select * from marks

create table total_of_subject(roll_no int,total int)
select * from total_of_subject

DELIMITER //
CREATE TRIGGER add_total_marks
AFTER INSERT ON marks FOR EACH ROW
BEGIN

   insert into total_of_subject values(new.roll_no,new.math+new.physics);

END;
//
DELIMITER ;

insert into marks values(13,20,30)

select * from marks 
select * from total_of_subject

 
/*update total*/


DELIMITER //
CREATE TRIGGER total_marks_student
AFTER update  ON marks FOR EACH ROW
BEGIN

   update  total_of_subject
   set total=new.math+new.physics
   where roll_no=new.roll_no;
 

END;
//
DELIMITER ;

update marks set physics=physics-10 where roll_no=16

select * from total_of_subject

insert into marks value(16,5,50)


/*delete*/

