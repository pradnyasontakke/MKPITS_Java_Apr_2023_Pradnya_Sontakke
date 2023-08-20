#include<stdio.h>
#include<conio.h>

void main()
{
float num1,num2,num3,area,par;
printf("enter the three number\n");
scanf("%f%f%f",&num1,&num2,&num3);
if(num1<(num2+num3)&& num2<(num1+num3)&& num3<(num2+num1))
{
par =num1+num2+num3;
printf("\nperimeter = %f\n",par);
}
else
{
 printf("not possible to create a triangle");
 }
 getch();
 }
