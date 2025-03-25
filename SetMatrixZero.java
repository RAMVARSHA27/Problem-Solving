import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int matrix[][]=new int[n][m];
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        matrix[i][j]=in.nextInt();
		    }
		}
		HashSet<Integer>zeroRows=new HashSet<>();
		HashSet<Integer>zeroCols=new HashSet<>(); 
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        if(matrix[i][j]==0){
		            zeroRows.add(i);
		            zeroCols.add(j);
		        }
		    }
		}
		for(int row:zeroRows){
		    Arrays.fill(matrix[row],0);
		}
		for(int col:zeroCols){
		    for(int i=0;i<n;i++){
		        matrix[i][col]=0;
		    }
		}
		System.out.println();
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        System.out.print(matrix[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}
