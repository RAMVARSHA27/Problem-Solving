import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		Map<Character, Integer>m=new HashMap<>();
		m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
		m.put('M',1000);
		int ans=0;
		for(int i=0;i<s.length();i++){
		    if(i<s.length()-1 && m.get(s.charAt(i))<m.get(s.charAt(i+1))){
		        ans-=m.get(s.charAt(i));
		    }
		    else{
		        ans+=m.get(s.charAt(i));
		    }
		}
		System.out.print(ans);
	}
}
