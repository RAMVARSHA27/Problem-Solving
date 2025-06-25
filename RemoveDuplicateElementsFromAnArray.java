import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int j=0;
		int ar[]=new int[n];
		for(int i=0;i<n;i++){
		    ar[i]=in.nextInt();
		}
		Set<Integer>set=new HashSet<>();
		for(int num:ar){
		    set.add(num);
		}
		int res[]=new int[set.size()];
		for(int num:set){
		    res[j++]=num;
		}
		System.out.print(Arrays.toString(res));
	}
}
