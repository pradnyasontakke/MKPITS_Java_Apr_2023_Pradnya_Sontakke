#include<stdio.h>
#include<conio.h>
void main()
{
 int r,c;
 clrscr();
 for(r='E';r>='A';r--)
 {
  for(c=r;c>='A';c--)
  {
  printf("%c",c);
  }
  printf("\n");
  }
  getch();
  }