#include <stdio.h>
int main() 
{
  int n,sec;
  scanf("%d",&n);
  while(n>0)
  {
    if(n<100)
    {
      sec=n%10;
    }
   
    
      n=n/1000;
    
  }
  printf("%d",sec);
  
    
	//Type your code
	return 0;
}