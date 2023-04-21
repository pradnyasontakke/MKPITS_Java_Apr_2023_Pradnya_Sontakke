#include<stdio.h>
#include<conio.h>
viod main()
{
int num1, num2, sw;
printf("enter thetwo number" );
scanf("%d%d",num1, num2);
sw= num1;
num1= num2;
num2=sw;
printf("after swapping num1=%d", num1);
printf("after swapping num2=%d,"num2);
getch ();
}