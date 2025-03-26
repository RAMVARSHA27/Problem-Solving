//Count 1 in Binary value
#include<stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
    int c=0;
    while(n>0){
        if((n&1)==1){
            c++;
        }
        n=n>>1;
    }
    printf("%d",c);
}
