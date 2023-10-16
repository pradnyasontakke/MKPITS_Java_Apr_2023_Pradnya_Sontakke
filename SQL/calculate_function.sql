DELIMITER //

create function cal1_value(orderof int , quantity int) returns int
DETERMINISTIC
begin 

declare valueof int;

set valueof = orderof*quantity;

return valueof;

end //

DELIMITER;
SELECT cal_value(4,5);

0	18	16:34:57	create function cal1_value(orderof int , quantity int) returns int
 
 begin 
 
 declare valueof int;
 
 set valueof = orderof*quantity;
 
 return valueof;
 
 end	Error Code: 1418. This function has none of DETERMINISTIC, NO SQL, or READS SQL DATA in its declaration and binary logging is enabled (you *might* want to use the less safe log_bin_trust_function_creators variable)	0.015 sec



