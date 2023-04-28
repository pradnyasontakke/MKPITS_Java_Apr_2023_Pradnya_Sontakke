#include<stdio.h>
#include<conio.h>
void main()
{
 int nodays, yr,mn,day;
 printf("enter the number of dayes\n");
 scanf("%d",&nodays);
 yr=nodays/360 ;
 nodays=nodays-(365*yr);
 mn=nodays/30;
 day=nodays -(mn*30);
 printf("%d year\n%d month\n%d day\n", yr,mn,day);
 getch();
 }