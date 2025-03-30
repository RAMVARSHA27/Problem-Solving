import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s1=in.nextLine();
		String s2=in.nextLine();
		StringBuilder res=new StringBuilder();
		int n1=s1.length();
		int n2=s2.length();
		int i=n1-1;
		int j=n2-1;
		int sum=0, carry=0;
		while(i>=0 || j>=0 || carry==1){
		    int d1=i>=0?s1.charAt(i--)-'0':0;
		    int d2=j>=0?s2.charAt(j--)-'0':0;
		    sum=d1+d2+carry;
		    res.append(sum%10);
		    carry=sum/10;
		}
		System.out.print(res.reverse().toString());
	}
}
