import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String[] ar=s.split(" ");
		for(String res:ar){
		    for(int i=res.length()-1;i>=0;i--){
		        System.out.print(res.charAt(i));
		    }
		    System.out.print(" ");
		}
	}
}
