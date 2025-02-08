import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		StringBuilder rev=new StringBuilder(s);
		rev.reverse();
		String res=rev.toString();
		System.out.print(res);
	}
}
