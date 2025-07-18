import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    int n1=in.nextInt();
	    int n2=in.nextInt();
	    int ar1[]=new int[n1];
	    int ar2[]=new int[n2];
	    int ans[]=new int[n1+n2];
	    for(int i=0;i<n1;i++){
	        ar1[i]=in.nextInt();
	    }
	    for(int i=0;i<n2;i++){
	        ar2[i]=in.nextInt();
	    }
	    for(int i=0;i<n1;i++){
	        ans[i]=ar1[i];
	    }
	    for(int i=0;i<n2;i++){
	        ans[i+n1]=ar2[i];
	    }
	    for(int i=0;i<ans.length;i++){
	        System.out.print(ans[i]+" ");
	    }
	}
}
