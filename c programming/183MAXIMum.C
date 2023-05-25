#include<stdio.h>
#include<conio.h>
void main()
{
 int num1, num2,num3;
 printf("enter the three number");
 scanf("%d%d%d",&num1,&num2,&num3);
 if(num1>=num2&&num1>=num3)
 printf("is the largest number");
 if(num2>=num1&&num2>=num3);
 printf("is the largest number");
 if(num3>=num1&&num3>=num2)
 printf("is the largest number");
 getch();
 }