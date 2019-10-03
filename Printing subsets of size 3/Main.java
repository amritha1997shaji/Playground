#include<stdio.h>
int main()
{
  int arrsize;
  scanf("%d\n", &arrsize);
  int arr[arrsize];
  for (int i=0; i<=arrsize-1; i++)
  {
    scanf("%d",&arr[i]);
  }
  for (int i1=0; i1<=arrsize-2; i1++)
  {
     for (int i2=i1+1; i2<=arrsize-1; i2++)
     {
         for (int i3=i2+1; i3<=arrsize-1; i3++)
         {
           printf("(%d, %d, %d) " ,arr [i1], arr[i2], arr[i3]);
         }
     }
    printf("\n");
  }
      
    
  //Type your code here
  return 0;
}
