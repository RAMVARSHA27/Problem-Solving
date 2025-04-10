// if row==even then i coordinates should greater than j coordinates
// if r==odd then i coordinates should lesser than j coordinates
// Then count the pairs
import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int ar[][]=new int[n][m];
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        ar[i][j]=in.nextInt();
		    }
		}
		int count=0;
		for(int r=0;r<n;r++){
		    for(int i=0;i<m;i++){
		        for(int j=i+1;j<m;j++){
		            if(r%2==0){
		                if(ar[r][i]>ar[r][j]){
		                    count++;
		                }
		            }
		            else{
		                if(ar[r][i]<ar[r][j]){
		                    count++;
		                }
		            }
		        }
		    }
		}
		System.out.print(count);
	}
}
