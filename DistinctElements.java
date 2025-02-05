import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n1=in.nextInt();
		int n2=in.nextInt();
		int a1[]=new int[n1];
		int a2[]=new int[n2];
		for(int i=0;i<n1;i++){
		    a1[i]=in.nextInt();
		}
		for(int i=0;i<n2;i++){
		    a2[i]=in.nextInt();
		}
		HashSet<Integer> set=new HashSet<>();
		for(int num:a1){
		    set.add(num);
		}
		for(int num:a2){
		    set.add(num);
		}
		for(int num:set){
		    System.out.printf("%d ",num);
		}
	}
}
