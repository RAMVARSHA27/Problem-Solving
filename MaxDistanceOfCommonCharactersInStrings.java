import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s1=in.nextLine();
		String s2=in.nextLine();
		int dis=0, maxDis=0;
		for(int i=0;i<s1.length();i++){
		    char ch1=s1.charAt(i);
		    for(int j=0;j<s2.length();j++){
		        char ch2=s2.charAt(j);
		        if(ch1==ch2){
		            dis=Math.abs(i-j);
		            if(dis>maxDis){
		                maxDis=dis;
		            }
		        }
		    }
		}
		System.out.print(maxDis);
	} 
}
