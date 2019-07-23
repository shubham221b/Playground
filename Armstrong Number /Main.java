#include <stdio.h>
int main() 
{
  int n,temp,sum=0,len=0;
  scanf("%d",&n);
  temp=n;
  while(temp!=0)
  {
    len++;
    temp=temp/10;
  }
  temp=n;
  while(temp!=0)
  {
    sum=sum + (pow(temp%10,len));
    temp=temp/10;
  }
  if(sum==n)
  {
    printf("Armstrong Number");
  }
  else
  {
    printf("Not an Armstrong Number");
  }
	//Type your code
	return 0;
}