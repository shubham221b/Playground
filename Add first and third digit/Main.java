#include<stdio.h>
int main()
{
  int num,f,l;
  scanf("%d",&num);
  l=num%10;
  f=num/100;
  printf("%d",f+l);
  
  //Type your code here
  return 0;
}