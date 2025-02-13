import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int nums[]=new int[n];
		int a=0;
		for(int i=0;i<n;i++){
		    nums[i]=in.nextInt();
		}
		for(int i=0;i<n;i++){
		    if(nums[i]!=0){
		        nums[a]=nums[i];
		        a++;
		    }
		}
		for(int i=a;i<n;i++){
		    nums[i]=0;
		}
		for(int i=0;i<n;i++){
		    System.out.print(nums[i]+" ");
		}
	}
}
