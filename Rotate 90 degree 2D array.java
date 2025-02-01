import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int r=in.nextInt();
		int c=in.nextInt();
		int[][] a=new int[r][c];
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        a[i][j]=in.nextInt();
		    }
		}
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        System.out.printf("%d ", a[i][j]);
		    }
		    System.out.println("");
		}
		System.out.println("");
		rotate90(a, r, c);
	}
	public static void rotate90(int a[][], int r, int c){
	    for(int i=0;i<r;i++){
	        for(int j=0;j<i;j++){
	            int t=a[i][j];
	            a[i][j]=a[j][i];
	            a[j][i]=t;
	        }
	    }
	    for(int i=0;i<r;i++){
	        for(int j=0;j<r/2;j++){
	            int t=a[i][j];
	            a[i][j]=a[i][c-j-1];
	            a[i][c-j-1]=t;
	        }
	    }
	    for(int i=0;i<r;i++){
	        for(int j=0;j<c;j++){
	            System.out.printf("%d ", a[i][j]);
	        }
	        System.out.println("");
	    }
	}
}
