#include<stdio.h>
#include<conio.h>
void main()
{

float x1,y1,x2,y2, distance;
printf("enter input x1");
scanf("%f",&x1);
printf("enter input x2");
scanf("%f",&x2);
printf("enter input y1");
scanf("%f",&y2);

distance=((x2-x1)*(x2-x1)+(y2-y1)(y2-y1));


printf("distanc of two point is %f%f%f%f",sqrt(distance) ) ;
getch();
}
