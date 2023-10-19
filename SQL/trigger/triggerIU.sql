create database studentExam
use studentExam
create table student(rollno int primary key,sname varchar(20))
insert into student values(101,'rati');
insert into student values(102,'nita');
select * from student

create table marks(rollno int, physics int, math int)

select * from marks

create table totalS(rollno int,total int)
select * from totalS
delimiter //
create trigger totalTrigger
after insert on  marks for each row 
begin
insert into totalS values(new.rollno,new.physics + new.math);
end;
//
delimiter ;
insert into marks values (101, 60,70);


   update  total_of_subject
   set total=new.math+new.physics
   where roll_no=new.roll_no;

delimiter //
create trigger TriggerUpdate
after update on  marks for each row 
begin

   update  totalS
   set total=new.math+new.physics
   where rollno=new.rollno;
end;
//
delimiter ;

update marks set physics=physics+100 where rollno=1

select * from totalS

insert into marks value(1,50,50)