#include <stdio.h>
int add(int n);
int main()
{
  int a;
  scanf("%d", &a);
  printf("%d",add(a));
  //Type your code here
  return 0;
}
int add(int n)
{
    if(n != 0)
        return n + add(n-1);
    else
        return n;
}