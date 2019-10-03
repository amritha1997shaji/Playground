#include <stdio.h>
#include <string.h>
int main()
{
    char str[1000], revstr[1000];
    int len, i, index,Start,End;
    gets(str);
    len   = strlen(str);
    index = 0;
    Start = len - 1;
    End   = len - 1;
    while(Start > 0)
    {
        if(str[Start] == ' ')
        {
            i = Start + 1;
            while(i <= End)
            {
                revstr[index] = str[i];
                i++;
                index++;
            }
            revstr[index++] = ' ';
            End = Start - 1;
        }
      Start--;
    }
    for(i=0; i<= End; i++)
    {
        revstr[index] = str[i];
        index++;
    }
    revstr[index] = '\0'; 
    printf("%s", revstr);
    return 0;
}