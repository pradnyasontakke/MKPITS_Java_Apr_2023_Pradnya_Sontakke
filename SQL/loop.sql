use sakila

DELIMITER $$ 

CREATE PROCEDURE loop_example()
BEGIN
    DECLARE counter INT DEFAULT 0;

    WHILE counter < 10 DO
select 
        SET counter = counter + 1;
    END WHILE;
END$$

DELIMITER ; -- Reset the delimiter to ';'
