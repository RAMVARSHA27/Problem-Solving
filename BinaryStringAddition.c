//Binary String Addition(MCW)
#include<stdio.h>
int main()
{
    char s1[50];
    scanf("%s",s1);
    char s2[50];
    scanf("%s",s2);
    int i=0;
    int n1=strtol(s1, NULL, 2);
    int n2=strtol(s2, NULL, 2);
    int s=n1+n2;
    printf("%d",s);
    printf("\n");
    char res[10];
    while(s>0){
        int r=s%2;
        res[i]=r+'0';
        printf("%d ",r);
        s=s/2;
        i++;
    }
    printf("\nString: %s",res);
}
