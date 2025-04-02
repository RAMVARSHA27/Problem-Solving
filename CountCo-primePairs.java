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
		int a=0, b=0;
		int count=0;
		for(int i=1;i<=n;i++){
		    for(int j=i+1;j<=n;j++){
		        a=i;
		        b=j;
		        while(b!=0){
		            int temp=b;
		            b=a%b;
		            a=temp;
		        }
		    }
		    if(a==1){
		        count++;
		    }
		}
		System.out.print(count);
	}
}
