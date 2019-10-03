#include<stdio.h>
 
int main()
{
	char message[100], ch;
	int i, key;
    scanf("%[^\n]s",&message);
	scanf("%d", &key);
  key = key % 26;
	for(i = 0; message[i] != '\0'; ++i){
		ch = message[i];
		if(ch >= 'a' && ch <= 'z'){
			ch = ch - key;	
			if(ch <'a'){
		   ch = ch + 'z' - 'a' + 1;
			}
			message[i] = ch;
		}
		else if(ch >= 'A' && ch <= 'Z'){
			ch = ch - key;
			if(ch < 'A'){
				ch = ch + 'Z' - 'A' + 1;
			}
			message[i] = ch;
        }
	}
	printf("%s", message);
	return 0;
}