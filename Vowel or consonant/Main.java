#include<stdio.h>
int main()
{
  char alpha;
  scanf("%c",&alpha);
  if(alpha =='a' || alpha == 'A' || alpha == 'e' || alpha =='E' || alpha == 'i' || alpha == 'I' || alpha == 'o' || alpha== 'O' || alpha == 'u' || alpha == 'U')
  {
    printf("Vowel");
  }
  else
  {
    printf("Consonant");
  }
  //type your code here
  return 0;
}