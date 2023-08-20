#include<stdio.h>
#include<conio.h>
void main()
{
  int amt, total;
  printf("enter the amount");
  scanf("%d ",&amt);
  total=amt/100;
  printf("there are :");
  printf("%d note (s)of 100.00 \n", total);
  amt = amt - (total * 100);
  total = amt/50;
  printf("%d note(s) of 50.00\n", total);
  amt = amt - (total * 50);
  total = amt/20;
  printf("%d note(s) of 20.00\n", total);
  amt = amt - (total * 20);
  total = amt/ 10;
  printf("%d note(s) of 10.00\n", total);
  amt = amt - (total * 10);
  total = amt/5;
  printf("%d note(s) of 05.00\n", total);
  amt = amt - (total * 5);
  getch();
  }