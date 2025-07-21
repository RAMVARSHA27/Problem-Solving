import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int ar[]=new int[2*n];
		for(int i=0;i<2*n;i++){
		    ar[i]=in.nextInt();
		}
		List<Integer>li=new ArrayList<>();
		for(int i=0;i<n;i++){
		    li.add(ar[i]);
		    li.add(ar[i+n]);
		}
		int res[]=new int[2*n];
		for(int i=0;i<2*n;i++){
		    res[i]=li.get(i);
		    System.out.print(res[i]+" ");
		}
	}
}
