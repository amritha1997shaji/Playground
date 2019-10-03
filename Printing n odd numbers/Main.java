#include<stdio.h>
int main()
{
	int n,i,j;
	printf("");
	scanf("%d",&n);
	printf("",n);
	for(j=1,i=1;j<=n;i=i+2,j++)
	{
		printf("%d\n",i);
	}
	return 0;
}