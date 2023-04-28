#include<stdio.h>
#include<conio.h>
void main()
{
int num;
clrscr();
printf("enter the number betwwen 1 to 50\n");
scanf("%d",&num);

for(num=1;num<=50;num++)
if(num%2==0)
{
printf("even number\n");
}
else
{
 printf("not even\n");
}
getch();
}