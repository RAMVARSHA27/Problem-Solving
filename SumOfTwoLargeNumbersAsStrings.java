import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		StringBuilder res=new StringBuilder();
        String s1=in.nextLine();
        String s2=in.nextLine();
        int i=s1.length()-1;
        int j=s2.length()-1;
        int sum=0, carry=0;
        while(i>=0 || j>=0 || carry!=0){
            int digit1=(i>=0)?s1.charAt(i)-'0':0;
            int digit2=(j>=0)?s2.charAt(j)-'0':0;
            sum=digit1+digit2+carry;
            res.append(sum%10);
            carry=sum/10;
            i--;
            j--;
        }
        String result=res.reverse().toString();
        int start=0;
        while(start<result.length() && result.charAt(start)==0){
            start++;
        }
        System.out.print(result.substring(start));
	}
}
