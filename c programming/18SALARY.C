#include<stdio.h>
#include<conio.h>
void main()
{
int id,total_hr,salary,amount_hr;
printf("enter the employee id");
scanf("%d",&id);
printf("enter the working hour");
scanf("%d",&total_hr);
printf("enter the amount in hours");
scanf("%d",&amount_hr);
salary = amount_hr*total_hr;
printf("%d%d%d",&id,&total_hr,&salary);
getch();
}