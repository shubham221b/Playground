#include <stdio.h>
#include <math.h>
int main()
{
    int base, exponent;
    long long result;
    scanf("%d", &base);
    scanf("%d", &exponent);
    if(exponent < 0)
    {
      printf("Wrong input");
    }
    else
    {
      result = pow(base , exponent);
      printf("%lld", result);
    }
    return 0;
}