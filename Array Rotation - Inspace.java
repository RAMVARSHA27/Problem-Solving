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
		int k=in.nextInt();
		k=k%n;
		int i,j;
		for(i=0,j=n-1;i<j;i++,j--){
		    int t=a[i];
		    a[i]=a[j];
		    a[j]=t;
		}
		for(i=0,j=k-1;i<j;i++,j--){
		    int t=a[i];
		    a[i]=a[j];
		    a[j]=t;
		}
		for(i=k,j=n-1;i<j;i++,j--){
		    int t=a[i];
		    a[i]=a[j];
		    a[j]=t;
		}
		for(i=0;i<n;i++){
		    System.out.printf("%d ",a[i]);
		}
	}
}
