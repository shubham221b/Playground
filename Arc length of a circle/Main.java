#include<stdio.h>
int main()
{
  float r,ang,len;
  scanf("%f%f",&r,&ang);
  len = (ang/360) * 2 * 3.14 * r;
  printf("%.2f",len);
  return 0;
}