#include<stdio.h>
int main()
{
 	int i, j, r, c, a[10][10], b[10][10], isEqual;
 	scanf("%d %d", &i, &j);
 	for(r = 0; r < i; r++)
  	{
   		for(c = 0;c < j;c++)
    	{
      		scanf("%d", &a[r][c]);
    	}
  	}
 	for(r = 0; r < i; r++)
  	{
   		for(c = 0;c < j;c++)
    	{
      		scanf("%d", &b[r][c]);
    	}
  	}
  	isEqual = 1;
  	
 	for(r = 0; r < i; r++)
  	{
   		for(c = 0;c < j;c++)
    	{
      		if(a[r][c] != b[r][c])
			{
			  	isEqual = 0;
			  	break;
			}    
   	 	}
  	}
 	if(isEqual == 1)
 	{
 		printf("Yes");		
	}
	else
	{
		printf("No");
	}	
 	return 0;
}