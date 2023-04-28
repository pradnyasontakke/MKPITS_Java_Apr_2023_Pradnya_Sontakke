#include<stdio.h>
#include<conio.h>
void main()
{
 int num1,num2,num3,num4,num5, sum=0;
clrscr();
printf("enter first  number\n");
scanf("%d",&num1);
printf("enter second number\n");
scanf("%d",&num2);
printf("enter third number\n");
scanf("%d",&num3);
printf("enter fourth number\n");
scanf("%d",&num4);
printf("enter fifth number\n");
scanf("%d%",&num5);
if(num1%2==1)
{
sum=sum+num1;
}
if(num2%2==1)
{
sum=sum+num2;
}
if(num3%2==1)
{
sum=sum+num3;
}
if(num4%2==1)
{
sum=sum+num4;
}
if(num5%2==1)
{
sum=sum+num5;
}
printf("sum of odd number\n%d",sum);

getch();
}