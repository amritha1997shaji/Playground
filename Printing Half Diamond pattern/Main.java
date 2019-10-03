#include <stdio.h>
int main() {
  int n;
  scanf("%d",&n);
  for(int a = 1; a<=n; ++a)
  {
    for(int space= 1;space <= (n-a); ++space)
    {
      printf(" ");
    }
    for(int b=1; b<=2*a-1; ++b)
    {
      printf("*");
    }
    printf("\n");
  }
  
	// Type your code here
	return 0;
}
