import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		int n=in.nextInt();
		int ops[]=new int[n];
		for(int i=0;i<n;i++){
		    ops[i]=in.nextInt();
		}
		char ch[]=s.toCharArray();
		for(int op:ops){
		    if(op==1){
		        char t=ch[0];
		        ch[0]=ch[ch.length-1];
		        ch[ch.length-1]=t;
		    }
		    else if(op==2){
		        int mid=ch.length/2;
		        for(int i=0;i<mid;i++)
		        {
		            char temp=ch[i];
		            ch[i]=ch[mid+i];
		            ch[mid+i]=temp;
		        }
		    }
		}
		System.out.println(new String(ch));
	}
}
