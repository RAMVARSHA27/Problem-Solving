import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int nums[]=new int[n];
		for(int i=0;i<n;i++){
		    nums[i]=in.nextInt();
		}
		int res[]=new int[n];
		int i=0, j=1;
		for(int k=0;k<n;k++){
		    if(nums[k]<0){
		        res[j]=nums[k];
		        j+=2;
		    }
		    else{
		        res[i]=nums[k];
		        i+=2;
		    }
		}
		for(int k=0;k<n;k++){
		    System.out.print(res[k]+" ");
		}
	}
}
