import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=in.nextInt();
		}
		Arrays.sort(a);
		if(n%2==1){
		    System.out.print("Median : "+a[n/2]);
		}
		else{
		    System.out.print("Median : "+(a[(n-1)/2]+a[n/2])/2.0);
		}
	}
}
