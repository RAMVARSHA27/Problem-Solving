import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s1=in.nextLine();
		String s2=in.nextLine();
		if(s1.length()!=s2.length()){
		    System.out.println("False");
		    return;
		}
		int count[]=new int[26];
	    for(int i=0;i<s1.length();i++){
	        count[s1.charAt(i)-'a']++;
	        count[s2.charAt(i)-'a']--;
	    }
	    for(int c:count){
	        if(c!=0){
	            System.out.println("False");
	            return;
	        }
	    }
	    System.out.println("True");
	}
}
