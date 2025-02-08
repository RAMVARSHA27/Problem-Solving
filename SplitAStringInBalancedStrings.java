import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		int r=0, l=0, c=0;
		for(int i=0,j=0;j<s.length();i++){
		    if(s.charAt(j)=='R'){
		        r++;
		        j++;
		    }
		    else{
		        l++;
		        j++;
		    }
		    if(r==l){
		        c++;
		        i=j;
		        r=0;
		        l=0;
		    }
		}
		System.out.print(c);
	}
}
