import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		List<Integer> li=new ArrayList<>();
	    while(true){
	        int n=in.nextInt();
	        if(n==-1){
	            break;
	        }
	        li.add(n);
	    }
	    int ar[]=new int[li.size()];
	    for(int i=0;i<li.size();i++){
	        ar[i]=li.get(i);
	    }
	    Set<Integer>set=new HashSet<>();
	    for(int num:ar){
	        set.add(num);
	    }
	    for(int num:ar){
	        int rev=revNumber(num);
	        set.add(rev);
	    }
	    System.out.print(set.size());
	}
	private static int revNumber(int num){
	    int rev=0;
	    while(num>0){
	        rev=rev*10+num%10;
	        num/=10;
	    }
	    return rev;
	}
}
