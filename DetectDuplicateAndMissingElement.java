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
		ArrayList<Integer>res=new ArrayList<>();
		int freq[]=new int[n+1];
		for(int i=0;i<n;i++){
		    freq[ar[i]]++;
		}
		int repeating=0, missing=0;
		for(int i=1;i<=n;i++){
		    if(freq[i]==2){
		        repeating=i;
		    }
		    if(freq[i]==0){
		        missing=i;
		    }
		}
		res.add(repeating);
		res.add(missing);
		System.out.print(res);
	}
}
