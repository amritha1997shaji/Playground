#include<stdio.h>
#include<string.h>
int main(){
    char str[100] ,ch;
    scanf("%[^\n]s", &str);
    int fnd;
    for(int i = 0; str[i] != '\0'; i++)
    {
        fnd = 0;
        for(int j = 0; str[j] != '\0'; j++)
        {
            if(str[i] == str[j] && i != j)
            {
                fnd = 1;
                break;
            }
        }
        if(fnd == 0)
        {
            ch = str[i];
            break;
        }
    }
    if(fnd == 0)
    {
        printf("%c", ch);
    }
    else
    {
        printf("All the characters are repetitive");
    }
return 0;
}