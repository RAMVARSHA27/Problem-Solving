import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] coins=new int[n];
		for(int i=0;i<n;i++){
		    coins[i]=in.nextInt();
		}
		int amount=in.nextInt();
		int dp[]=new int[amount+1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0]=0;
		for(int i=1;i<dp.length;i++){
		    for(int coin : coins){
		        if(i>=coin && dp[i-coin]!=Integer.MAX_VALUE){
		            dp[i]=Math.min(dp[i], dp[i-coin]+1);
		        }
		    }
		}
		System.out.print(dp[amount]==Integer.MAX_VALUE ? -1 : dp[amount]);
	}
}
