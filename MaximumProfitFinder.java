import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int prices[]=new int[n];
		for(int i=0;i<n;i++){
		    prices[i]=in.nextInt();
		}
		int minPrices=prices[0];
		int maxProfit=0;
		for(int i=0;i<n;i++){
		    if(prices[i]<minPrices){
		        minPrices=prices[i];
		    }
		    else{
		        int profit=prices[i]-minPrices;
		        maxProfit=Math.max(profit, maxProfit);
		    }
		}
		System.out.print(maxProfit);
	}
}
