import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		while(true){
		    if(s.contains("{}")){
		        s=s.replace("{}","");
		    }
		    else if(s.contains("()")){
		        s=s.replace("()","");
		    }
		    else if(s.contains("[]")){
		        s=s.replace("[]","");
		    }
		    else{
		        break;
		    }
		}
		if(s.isEmpty()){
		    System.out.print("Valid Parenthesis");
		}
		else{
		    System.out.print("Invalid Parenthesis");
		}
	}
}
