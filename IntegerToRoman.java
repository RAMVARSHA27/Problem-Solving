import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String s=new String();
        int i=0;
        int num[]={1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String str[]={"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        while(n>0){
            if(n>=num[i]){
                s+=str[i];
                n-=num[i];
            }
            else{
                i++;
            }
        }
        System.out.print(s);
    }
}