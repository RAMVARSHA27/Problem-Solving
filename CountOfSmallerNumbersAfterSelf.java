import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int ar[]=new int[n];
		int c[]=new int[n];
		for(int i=0;i<n;i++){
		    ar[i]=in.nextInt();
		}
		for(int i=0;i<n;i++){
		    int count=0;
		    for(int j=i+1;j<n;j++){
		        if(ar[i]>ar[j]){
		            count++;
		        }
		    }
		    c[i]=count;
		}
		for(int x:c){
		    System.out.print(x+" ");
		}
	}
}
