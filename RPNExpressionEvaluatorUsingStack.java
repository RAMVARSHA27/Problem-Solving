import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String[] sr=in.next().split(",");
		for(int i=0;i<sr.length;i++){
		    System.out.print(sr[i]+" ");
		}
		Stack<Integer> st=new Stack<>();
		for(String c:sr){
		    if(c.equals("+")){
		        st.push(st.pop()+st.pop());
		    }
		    else if(c.equals("-")){
		        int sec=st.pop();
		        int fir=st.pop();
		        st.push(fir-sec);
		    }
		    else if(c.equals("*")){
		        st.push(st.pop()*st.pop());
		    }
		    else if(c.equals("/")){
		        int sec=st.pop();
		        int fir=st.pop();
		        st.push(fir/sec);
		    }
		    else{
		        st.push(Integer.parseInt(c));
		    }
		}
		System.out.println();
		System.out.print(st.peek());
	}
}
