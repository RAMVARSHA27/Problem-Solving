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
		int sum=0, max=0;
		int start=0, end=0, tempStart=0;
		for(int i=0;i<n;i++){
		    sum+=ar[i];
		    if(sum>max){
		        max=sum;
		        start=tempStart;
		        end=i;
		    }
		    if(sum<0){
		        sum=0;
		        tempStart=i+1;
		    }
		}
		System.out.println("Maximum Sub-array Sum : "+max);
		System.out.println("Maximum Sub-array : ");
		for(int i=start;i<=end;i++){
		    System.out.print(ar[i]+" ");
		}
	}
}
