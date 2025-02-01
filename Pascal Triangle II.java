import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] row=new int[n];
		row[0]=1;
		for(int i=1;i<n;i++){
		    for(int j=i;j>0;j--){
		        row[j]=row[j]+row[j-1];
		    }
		}
		for(int i=0;i<n;i++){
		    System.out.print(row[i]+" ");
		}
	}
}
