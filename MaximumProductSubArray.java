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
		int maxEnd=ar[0], minEnd=ar[0], max=ar[0];
		for(int i=1;i<n;i++){
		    int curr=ar[i];
		    int tempMax=Math.max(curr, Math.max(curr*maxEnd, curr*minEnd));
		    int tempMin=Math.min(curr, Math.min(curr*maxEnd, curr*minEnd));
		    maxEnd=tempMax;
		    minEnd=tempMin;
		    max=Math.max(max, maxEnd);
		}
		System.out.print("Maximum Product SubArray "+max);
	}
}
