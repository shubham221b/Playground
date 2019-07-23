#include<stdio.h>
int main()
{
  int year;
 
  scanf("%d", &year);
 
  if (year%400 == 0) // Exactly divisible by 400 e.g. 1600, 2000
    printf("LEAP YEAR");
  else if (year%100 == 0) // Exactly divisible by 100 and not by 400 e.g. 1900, 2100
    printf("NOT LEAP YEAR");
  else if (year%4 == 0) // Exactly divisible by 4 and neither by 100 nor 400 e.g. 2016, 2020
    printf("LEAP YEAR");
  else // Not divisible by 4 or 100 or 400 e.g. 2017, 2018, 2019
    printf("NOT LEAP YEAR");  
   
  return 0;
}