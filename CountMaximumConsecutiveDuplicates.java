import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=in.nextInt();
		}
        if(n==0){
            System.out.print("0");
        }
        int maxC=0, c=1;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
                c++;
            }
            else{
                maxC=Math.max(c, maxC);
                c=1;
            }
        }
        maxC=Math.max(c, maxC);
        System.out.print(maxC);
	}
}
