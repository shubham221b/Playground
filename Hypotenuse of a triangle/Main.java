#include<stdio.h>
#include<math.h>
int main()
{
  float p,h,b;
  scanf("%f%f",&p,&b);
  h = sqrt(p*p + b*b);
  printf("%.2f",h);
  //Type your code here
  return 0;
}