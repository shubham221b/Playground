#include<stdio.h>
int main()
{
  //Type your code here
  int num,second_last;
  scanf("%d",&num);
  second_last=(num/10)%10;
  printf("%d",second_last);
  return 0;
}