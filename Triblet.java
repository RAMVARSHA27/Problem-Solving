import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int count=0;
		int ar[]=new int[n];
		for(int i=0;i<n;i++){
		    ar[i]=in.nextInt();
		}
		int x=ar[0], y=ar[1];
		for(int i=2;i<=n;i++){
		    int z=x+y;
		    if(z==i){
		        count++;
		    }
		    x=y;
		    y=i;
		}
		System.out.print(count);
	}
}
