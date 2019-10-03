#include<stdio.h>
int fact(int);
int main()
{
  int a;
  int rslt;
  scanf("%d", &a);
  if (a < 0)
    {
       // printf("Factorial of negative number not possible\n");
    }
    else
    {
        rslt = fact(a);
        printf("%d\n",rslt);
    }
    return 0;
}
int fact(int a)
{
    if (a == 0 || a == 1)
    {
        return 1;
    }
    else
    {
        return(a * fact(a - 1));
    }
}