import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++){
		    ar[i]=in.nextInt();
		}
		int res[]=new int[n];
		Stack<Integer> st=new Stack<>();
		for(int i=n-1;i>=0;i--){
		    while(!st.empty() && st.peek()<=ar[i]){
		        st.pop();
		    }
		    if(st.empty()){
		        res[i]=-1;
		    }
		    else{
		        res[i]=st.peek();
		    }
		    st.push(ar[i]);
		}
		for(int i=0;i<n;i++){
		    System.out.print(res[i]+" ");
		}
	}
}
