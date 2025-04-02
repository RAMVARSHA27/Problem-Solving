import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    String s=in.nextLine();
	    int uc=0, lc=0, dc=0;
	    for(int i=0;i<s.length();i++){
	        char ch=s.charAt(i);
	        if(ch>='A' && ch<='Z'){
	            uc++;
	        }
	        else if(ch>='a' && ch<='z'){
	            lc++;
	        }
	        else{
	            dc++;
	        }
	    }
	    int sum=uc+lc+dc;
	    int sc=s.length()-sum;
	    if(uc>0 && lc>0 && dc>0 && sc>0 && s.length()>=8 && s.length()<=15){
	        System.out.print("Valid");
	    }
	    else{
	        System.out.print("Invalid");
	    }
	}
}
