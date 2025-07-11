import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		int count=0;
		int freq[]=new int[26];
		for(char c:s.toCharArray()){
		    freq[c-'a']++;
		}
		for(int i=0;i<26;i++){
		    if(freq[i]>0){
		        char ch=(char)(i+'a');
		        System.out.println(ch+" : "+freq[i]);
		    }
		}
	}
}
