import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		Integer ar[]=new Integer[n];
		for(int i=0;i<n;i++){
		    ar[i]=in.nextInt();
		}
		Arrays.sort(ar, (a, b)->{
		    int lenA=String.valueOf(a).length();
		    int lenB=String.valueOf(b).length();
		    if(lenA!=lenB){
		        return lenA-lenB;
		    }
		    else{
		        return a-b;
		    }
		});
		System.out.print(Arrays.toString(ar));
	}
}
