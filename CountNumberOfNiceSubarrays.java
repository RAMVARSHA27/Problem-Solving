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
		int k=in.nextInt();
		int l=0, r=0, sum=0, count=0, validCount=0;
		while(r<n){
		    sum+=nums[r]%2;
		    if(sum>k){
		        sum-=nums[l]%2;
		        l--;
		    }
		    if(sum==k){
		        validCount=0;
		        int temp=0;
		        while(temp<r && nums[temp]%2==0){
		            validCount++;
		        }
		        validCount++;
		        count+=validCount;
		    }
		    r++;
		}
		System.out.print(count);
	}
}
