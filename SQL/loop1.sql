use sakila
DELIMITER $$
CREATE FUNCTION Geekdemo (value1 INT)
RETURNS INT
BEGIN
 DECLARE value2 INT;
 SET value2 = 0;
 label: LOOP
  SET value2 = value2 + value1;
  IF value2 < 4000 THEN
    ITERATE label;
  END IF;
  LEAVE label;
 END LOOP label;
 RETURN value2 ;
END $$
DELIMITER ;

CALL Geekdemo();