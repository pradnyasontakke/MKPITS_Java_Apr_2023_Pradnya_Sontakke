#include<stdio.h>
#include<conio.h>
void main()
 {  int num;
 printf("enter the integer number\n");
 scanf("%d",&num);
 if(num<80&&num>0)
 {
 printf("number is below than 80 and positive value\n=%d",num);
 }else
 {printf("\n error");
 }
 getch();
}