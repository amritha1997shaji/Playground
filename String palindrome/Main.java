#include <stdio.h>
#include <string.h>

int main(){
    char str1[20];
    int i, l;
    int flag = 0; 
    scanf("%s", str1);
    l = strlen(str1);
    for(i=0;i < l ;i++){
        if(str1[i] != str1[l-i-1]){
            flag = 1;
            break;
   }
}
    if (flag) 
    {
        printf("%s is not a palindrome", str1);
    }    
    else {
        printf("%s is a palindrome", str1);
    }
    return 0;
}
