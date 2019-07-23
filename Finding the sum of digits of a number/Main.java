#include <stdio.h>
int main() {
  int n,sum=0,temp;
  scanf("%d",&n);
  temp=n;
  while(temp!=0)
  {
    sum=temp%10 + sum;
    temp=temp/10;
  }
  printf("%d",sum);
  
	//Type your code
	return 0;
}