use sakila
create procedure greatest (a int, b int ,c int)
if a>b then 
if a>c then
select b;
end if 
else
if b>c then
select c;
end if;
end