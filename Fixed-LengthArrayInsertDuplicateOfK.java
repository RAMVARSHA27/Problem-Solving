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
		int k=in.nextInt();
		ArrayList<Integer>res=new ArrayList<>();
		for(int i=0;i<n;i++){
		    res.add(ar[i]);
		    if(ar[i]==k){
		        res.add(k);
		    }
		}
		for(int i=0;i<n;i++){
		    ar[i]=res.get(i);
		}
		System.out.print(Arrays.toString(ar));
	}
}
