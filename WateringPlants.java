import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int plants[]=new int[n];
		for(int i=0;i<n;i++){
		    plants[i]=in.nextInt();
		}
		int capacity=in.nextInt();
		int steps=0, currentWater=capacity;
		for(int i=0;i<n;i++){
		    if(currentWater>=plants[i]){
		        steps++;
		        currentWater-=plants[i];
		    }
		    else{
		        steps+=(2*i)+1;
		        currentWater=capacity-plants[i];
		    }
		}
		System.out.print(steps);
	}
}
