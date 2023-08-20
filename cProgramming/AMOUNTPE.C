#include<stdio.h>
#include<conio.h>
void main()
{
char id, int hour,salary,amount;
printf("enter the employee id");
scanf("%c",&id);
printf("enter the working hours");
scanf("%d",&hour);
salary = amount*hour;
printf("%c%d%d", &id,&hour,&salary);
getch();
}