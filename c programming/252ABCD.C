#include<stdio.h>
#include<conio.h>
void main()
{
int r,c;
clrscr();
for(r=65;r<=68;r++)
{
 for(c=65;c<=r;c++)
 {
 printf("%c",c);
 }
 printf("\n");
 }
 getch();
 }