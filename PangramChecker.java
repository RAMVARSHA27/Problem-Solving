import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		int n=s.length();
		s=s.toLowerCase();
		int flag=1;
		boolean seen[]=new boolean[26];
		for(int i=0;i<n;i++){
		    char ch=s.charAt(i);
		    if(ch>='a' && ch<='z'){
		        seen[ch-'a']=true;
		    }
		}
		for(boolean b:seen){
		    if(!b){
		        flag=0;
		    }
		}
		if(flag==1){
		    System.out.print("True");
		}
		else{
		    System.out.print("False");
		}
	}
}
