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
		int pivot=in.nextInt();
		List<Integer>less=new ArrayList<>();
		List<Integer>equal=new ArrayList<>();
		List<Integer>greater=new ArrayList<>();
		for(int num:ar){
		    if(num<pivot){
		        less.add(num);
		    }
		    else if(num==pivot){
		        equal.add(num);
		    }
		    else{
		        greater.add(num);
		    }
		}
		int index=0;
		int res[]=new int[n];
		for(int num:less) res[index++]=num;
		for(int num:equal) res[index++]=num;
		for(int num:greater) res[index++]=num;
		for(int i=0;i<n;i++){
		    System.out.print(res[i]+" ");
		}
	}
}
