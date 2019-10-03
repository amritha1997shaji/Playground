
#include <stdio.h>
int biggestNumber(int a,int b,int c)
{
    int biggest;
if(a>b && a>c)
    biggest=a;
else if(b>a && b>c)
    biggest=b;
else
    biggest=c;
return biggest;
}
int main()
{
    int a,b,c;
    scanf("%d%d%d",&a,&b,&c);
    int result=biggestNumber(a,b,c);
    printf("%d\n",result);
    return 0;
}
