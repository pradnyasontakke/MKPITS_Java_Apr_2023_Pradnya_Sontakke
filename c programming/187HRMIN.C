#include<stdio.h>
#include<conio.h>
void main()
{
  int second, hr,min,sec;
  printf("enter seconds");
  scanf("%d", &second);
  hr = (second/3600);
  min = (second-(3600*hr))/60 ;
  sec = (second-3600*hr)-(min*60)	;
  printf("H:M:S- %d%d%d\n", hr,min,sec);
getch();
}
