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
		int max=0, sum=0;
		for(int i=0;i<n;i++){
		    sum+=ar[i];
		    if(sum>max){
		        max=sum;
		    }
		    if(sum<0){
		        sum=0;
		    }
		}
		System.out.print(max);
	}
}
