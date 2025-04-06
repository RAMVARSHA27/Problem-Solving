import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		int num=0;
		int res=0;
		int signValue=1;
		Stack<Integer>st=new Stack<>();
		for(int i=0;i<s.length();i++){
		    char ch=s.charAt(i);
		    if(Character.isDigit(ch)){
		        num=num*10+(ch-'0');
		    }
		    else if(ch=='+' || ch=='-'){
		        res+=num*signValue;
		        signValue=ch=='-'?-1:1;
		        num=0;
		    }
		    else if(ch=='('){
		        st.push(res);
		        st.push(signValue);
		        res=0;
		        signValue=1;
		    }
		    else if(ch==')'){
		        res+=num*signValue;
		        res*=st.pop();
		        res+=st.pop();
		        num=0;
		    }
		}
		System.out.println(res+num*signValue);
	}
}
