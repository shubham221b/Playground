#include <stdio.h>
int main() {
  int num;
  scanf("%d",&num);
  for(int i=1;i<=num;i++)
  {
    if(i%2==1)
    {
      printf("%d\n",i);
    }
  }
	//Type your code
	return 0;
}