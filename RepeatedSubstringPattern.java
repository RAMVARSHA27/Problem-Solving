import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String doubled=s+s;
		String sub=doubled.substring(1, doubled.length()-1);
		if(sub.contains(s)){
		    System.out.print("True");
		}
		else{
		    System.out.print("False");
		}
	}
}
