#include <stdio.h>
 
void main()
{
    int n, i, j, c, t, b;
 
    printf("");
    scanf("%d", &n);
    int array[n - 1];     /* array size-1 */
    printf("");
    for (i = 0; i < n - 1; i++)    
        scanf("%d", &array[i]);
    b = array[0];
    for (i = 1; i < n - 1; i++)
        b = b ^ array[i];
    for (i = 2, c = 1; i <= n; i++)
        c = c ^ i; 
    c = c ^ b;  
    printf("%d \n", c);
}
