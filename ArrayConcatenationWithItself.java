import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++){
		    ar[i]=in.nextInt();
		}
		int ans[]=new int[2*n];
		for(int i=0;i<n;i++){
		    ans[i]=ar[i];
		    ans[i+n]=ar[i];
		}
		for(int i=0;i<ans.length;i++){
		    System.out.print(ans[i]+" ");
		}
	}
}
