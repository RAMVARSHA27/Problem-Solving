import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		boolean isBalanced = true;
		Stack<Character> st=new Stack<>();
		for(int i=0;i<s.length();i++){
		    char ch=s.charAt(i);
		    if(ch=='(' || ch=='{' || ch=='['){
		        st.push(ch);
		    }
		    else if(ch==')' || ch=='}' || ch==']'){
                if(st.empty()){
                    isBalanced=false;
                    break;
                }
                char top=st.pop();
                if((ch==')' && top!='(')|| (ch=='}' && top!='{') || (ch==']' && top!='[')){
                    isBalanced=false;
                    break;
                }
		    }
		}
		if(isBalanced || st.isEmpty()){
		    System.out.print("Balanced Parenthesis");
		}
		else{
		    System.out.print("Imbalanced Parenthesiss");
		}
	}
}
