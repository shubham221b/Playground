#include <stdio.h>
int main() 
{
  int n,t1,t2,temp,sum=0;
  scanf("%d",&n);
  temp=n;
  while(temp!=0)
  {
    t1=temp%10;
    sum=sum + fact(t1);
    temp=temp/10;
  }
  if(n==sum)
  {
    printf("Yes");
  }
  else
  {
    printf("No");
  }
  
	//Type your code
	return 0;
}
int fact(int a)
{
  int f=1;
  for(int i=1;i<=a;i++)
  {
    f=f*i;
  }
  return f;
}
    