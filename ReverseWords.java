import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		StringBuilder res=new StringBuilder();
		String words[]=s.trim().split("\\s+");
		for(int i=words.length-1;i>=0;i--){
		    res.append(words[i]);
		    if(i!=0){
		        res.append(" ");
		    }
		}
		System.out.print(res.toString());
	}
}
