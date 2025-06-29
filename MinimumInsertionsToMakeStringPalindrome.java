import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		int n=s.length();
		String rev=new StringBuilder(s).reverse().toString();
		int dp[][]=new int[n+1][n+1];
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=n;j++){
		        if(s.charAt(i-1)==rev.charAt(j-1)){
		            dp[i][j]=1+dp[i-1][j-1];
		        }
		        else{
		            dp[i][j]=Math.max(dp[i][j-1], dp[i-1][j]);
		        }
		    }
		}
		System.out.print(n-dp[n][n]);
	}
}
