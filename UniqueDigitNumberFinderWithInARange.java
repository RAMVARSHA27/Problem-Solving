import java.util.*;
class Main
{
    public static boolean hasUniqueDigits(int num){
        String res=Integer.toString(num);
        Set<Character>set=new HashSet<>();
        for(char ch:res.toCharArray()){
            if(set.contains(ch)){
                return false;
            }
            set.add(ch);
        }
        return true;
    }
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n1=in.nextInt();
		int n2=in.nextInt();
		for(int i=n1;i<=n2;i++){
		    if(hasUniqueDigits(i))
		        System.out.print(i+" ");
		}
	}
}
