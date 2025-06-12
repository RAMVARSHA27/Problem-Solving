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
		int k=in.nextInt();
		int res[]=new int[n];
		for(int i=0;i<n-k;i++){
		    res[i]=ar[k+i];
		}
		for(int i=0;i<k;i++){
		    res[n-k+i]=ar[i];
		}
		for(int i=0;i<n;i++){
		    System.out.print(res[i]+" ");
		}
	}
}
