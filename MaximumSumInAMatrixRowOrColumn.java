import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int ma[][]=new int[n][m];
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        ma[i][j]=in.nextInt();
		    }
		}
		int maxSum=0;
		for(int i=0;i<n;i++){
		    int rowSum=0;
		    for(int j=0;j<m;j++){
		        rowSum+=ma[i][j];
		    }
		    if(rowSum>maxSum){
		        maxSum=rowSum;
		    }
		}
		for(int j=0;j<m;j++){
		    int colSum=0;
		    for(int i=0;i<n;i++){
		        colSum+=ma[i][j];
		    }
		    if(colSum>maxSum){
		        maxSum=colSum;
		    }
		}
		System.out.print(maxSum);
	}
}
