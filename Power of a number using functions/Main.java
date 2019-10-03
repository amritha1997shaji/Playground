#include<stdio.h>
int power_of(int b, int e);
int main(){
    int b, e;
    scanf("%d%d", &b, &e);
    printf("%d", power_of(b, e));
  	return 0;
}

int power_of(int b, int e)
{
    int power = 1;
    while(e >= 1)
    {
        power = power * b;
        e--;
    }
    return power;
}
