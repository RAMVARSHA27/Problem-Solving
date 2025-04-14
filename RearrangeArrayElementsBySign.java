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
		int res[]=new int[n];
		int i=0, j=1;
		for(int k=0;k<n;k++){
		    if(ar[k]<0){
		        if(j<n){
    		        res[j]=ar[k];
    		        j+=2;
		        }
		    }
		    else{
		        if(i<n){
    		        res[i]=ar[k];
    		        i+=2;
		        }
		    }
		}
		for(int x=0;x<n;x++){
		    System.out.print(res[x]+" ");
		}
	}
}
