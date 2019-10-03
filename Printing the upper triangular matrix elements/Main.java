#include<stdio.h>
void upper(int r, int c, int m[r][c]);
int main()
{
    int i,j,r,c;
    scanf("%d %d", &r, &c);
    int m[r][c];
    for(i = 0; i < r; i++)
    {
        for(j = 0; j < c; j++)
        {
           scanf("%d", &m[i][j]);
        }
    }
    upper(r, c, m);
}
    void upper(int r, int c, int m[r][c])
    {
        int i, j,k;
     
       for(k = 0; k < c; k++)
        {
              for(i = 0, j = k; j < c ; i++, j++)
              {
           printf("%d ", m[i][j]);
              }
        }
    }