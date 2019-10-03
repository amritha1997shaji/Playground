#include <stdio.h>
int main() {
  int n;
  scanf("%d",&n);
  int num;
  for(num=1;num<=n;num++)
  {
    printf("%d",num);
    if((num%3==0))
      printf(",");
  }
  
	//Type your code
	return 0;
}