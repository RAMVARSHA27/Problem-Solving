import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=in.nextInt();
		}
		int k=in.nextInt();
		int sum=0, maxSum=0;
		for(int i=0;i<k;i++){
		    sum+=a[i];
		}
		maxSum=sum;
		for(int j=n-1;j>=n-k;j--){
		    sum=sum-a[k-(n-j)]+a[j];
		    maxSum=Math.max(sum, maxSum);
		}
		System.out.print(maxSum);
	}
}
