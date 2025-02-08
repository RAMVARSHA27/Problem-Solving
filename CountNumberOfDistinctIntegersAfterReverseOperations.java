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
		HashSet<Integer> set=new HashSet<>();
		for(int num:ar){
		    set.add(num);
		    set.add(reverse(num));
		}
		System.out.print(set.size());
	}
	static int reverse(int no){
	    int rev=0;
	    while(no>0){
	        rev=rev*10+(no%10);
	        no/=10;
	    }
	    return rev;
	}
}
