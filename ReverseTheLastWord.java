import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		StringBuilder res=new StringBuilder();
		for(int i=s.length()-1;i>=0;i--){
		    if(s.charAt(i)!=' '){
		        res.append(s.charAt(i));
		    }
		    else if(res.length()>0){
		        break;
		    }
		}
		System.out.print(res);
	}
}
