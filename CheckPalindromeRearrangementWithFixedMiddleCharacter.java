import java.util.*;
class Main
{
    static boolean isPalindrome(String s){
	        int i=0, j=s.length()-1;
	        while(i<j){
	            if(s.charAt(i)!=s.charAt(j)){
	                return false;
	            }
	            i++;
	            j--;
	        }
	        return true;
	    }
	public static void main(String[] args) {
	    
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		if(isPalindrome(s)){
		    System.out.print("-1");
		    return;
		}
		int n=s.length();
		char middle=s.charAt(n/2);
		
		StringBuilder sb=new StringBuilder(s);
		sb.deleteCharAt(n/2);
		String rest=sb.toString();
		
		int freq[]=new int[26];
		for(char ch:rest.toCharArray()){
		    freq[ch-'a']++;
		}
		int odd=0;
		for(int f:freq){
		    if(f%2!=0){
		        odd++;
		    }
		}
		if(odd>0){
		    System.out.println("No possible palindrome");
		    return;
		}
		StringBuilder half=new StringBuilder();
		for(int i=0;i<26;i++){
		    for(int j=0;j<freq[i]/2;j++){
		        half.append((char)(i+'a'));
		    }
		}
		String res=half.toString()+middle+half.reverse().toString();
		System.out.println(res);
	}
}
