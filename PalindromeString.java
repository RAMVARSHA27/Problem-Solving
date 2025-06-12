import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		int left=0;
		int right=s.length()-1;
		boolean isPalindrome=true;
		while(left<right){
		    if(s.charAt(left)!=s.charAt(right)){
		        isPalindrome=false;
		    }
		    left++;
		    right--;
		}
		if(isPalindrome){
		    System.out.print("True");
		}
		else{
		    System.out.print("False");
		}
	}
}
