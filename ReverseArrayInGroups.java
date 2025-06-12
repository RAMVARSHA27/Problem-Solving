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
		for(int i=0;i<n;i+=k)
		{
		    int left=i;
		    int right=Math.min(i+k-1, n-1);
		    while(left<right){
		        int t=ar[left];
		        ar[left]=ar[right];
		        ar[right]=t;
		        left++;
		        right--;
		    }
		}
		for(int i=0;i<n;i++){
		    System.out.print(ar[i]+" ");
		}
	}
}
