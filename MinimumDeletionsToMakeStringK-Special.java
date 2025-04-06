import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		int k=in.nextInt();
		int res=Integer.MAX_VALUE;
		int[]freq=new int[26];
		for(char c:s.toCharArray()){
		    freq[c-'a']++;
		}
		for(int baseFreq:freq){
		    if(baseFreq==0) continue;
		    int del=0;
		    for(int f:freq){
		        if(f==0) continue;
		        else if(f<baseFreq){
		            del+=f;
		        }
		        else if(f>baseFreq+k){
		            del+=f-(baseFreq+k);
		        }
		    }
		    res=Math.min(res, del);
		}
		System.out.print(res);
	}
}
