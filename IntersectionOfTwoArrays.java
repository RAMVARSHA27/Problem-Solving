import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n1=in.nextInt();
		int[] nums1=new int[n1];
		for(int i=0;i<n1;i++){
		    nums1[i]=in.nextInt();
		}
		int n2=in.nextInt();
		int[] nums2=new int[n2];
		for(int i=0;i<n2;i++){
		    nums2[i]=in.nextInt();
		}
		int min=Math.min(n1, n2);
		int[] num=new int[min];
		int k=0;
		boolean[] used=new boolean[n2];
		for(int i=0;i<n1;i++){
		    for(int j=0;j<n2;j++){
		        if(nums1[i]==nums2[j] && !used[j]){
		            num[k]=nums2[j];
		            k++;
		            used[j]=true;
		            break;
		        }
		    }
		}
		int[] res = Arrays.copyOf(num, k);
		for(int i=0;i<k;i++){
		    System.out.print(res[i]+" ");
		}
	}
}
