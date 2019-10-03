#include <stdio.h>
 
int main()
{
   int m, n, c, d, m1[10][10], m2[10][10], diff[10][10];
   scanf("%d%d", &m, &n);
   for (c = 0; c < m; c++)
   {
     for (d = 0 ; d < n; d++)
     {
       scanf("%d", &m1[c][d]);
     }
   }
   for (c = 0; c < m; c++)
   {
     for (d = 0; d < n; d++)
     {
         scanf("%d", &m2[c][d]);
     }
   }
   for (c = 0; c < m; c++)
   {
     for (d = 0; d < n; d++) 
     {
       diff[c][d] = m1[c][d] - m2[c][d];
       printf("%d ",diff[c][d]);
     }
     printf("\n");
   }
 
   return 0;
}
