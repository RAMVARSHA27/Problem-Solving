import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		int k=in.nextInt();
		int c=0;
		int n=s.length();
		for(int i=0;i<n;i++){
		    Set<Character> set=new HashSet<>();
		    for(int j=i;j<n;j++){
		        set.add(s.charAt(j));
		        if(set.size()==k){
		            c++;
		        }
		        else if(set.size()>k){
		            break;
		        }
		    }
		}
		System.out.print(c);
	}
}
