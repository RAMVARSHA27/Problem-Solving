import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		int freq[]=new int[26];
		boolean isboolean=false; 
		for(char ch:s.toCharArray()){
		    freq[ch-'a']++;
		}
		for(char ch:s.toCharArray()){
		    if(freq[ch-'a']==1){
		        isboolean=true;
		        System.out.print(ch);
		        break;
		    }
		}
		if(!isboolean){
		    System.out.print("$");
		}
	}
}
