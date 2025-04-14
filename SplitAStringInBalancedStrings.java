import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		int r=0,l=0,c=0;
		for(int i=0;i<s.length();i++){
		    if(s.charAt(i)=='R'){
		        r++;
		    }
		    else{
		        l++;
		    }
		    if(r==l){
		        c++;
		        r=0;
		        l=0;
		    }
		}
		System.out.print(c);
	}
}
