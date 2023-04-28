#include<stdio.h>
#include<conio.h>
void main()
{
 double a,b,c, bha;
 clrscr();
 printf("enter number(a)\n");
 scanf("%f",&a);
 printf("enter number(b)");
 scanf("%f",&b);
 printf("enter number (c)");
 scanf("%f",&c);
 bha = (b*b)-(4*(a)*(c));
 if(bha>0 && a!=0)
 {
double x,y;
 bha = sqrt(bha);
 x=(-b+bha)/(2*a );
 y = (-b-bha)/(2*a);
 printf("root1=%f\n",&x);
 printf("root2=%f\n",y);
 }else
 {
 printf("\nimpossible find root");
 }
 getch();
 }
