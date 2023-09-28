use bank_details        //for open that database
use stud_details
select * from students       //show table
select * from markdetails
select * from  students where address in ('chandrapurr')  //in= check if match then show
select * from markdetails where math > 40 and rollno='1004'    
select * from markdetails where chemishry between 80 and 90       //between= show data between that 
select * from students where address not in ('nagpur')       //not show those data



