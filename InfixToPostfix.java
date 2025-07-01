// You are using Java
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        Stack<Character>stack=new Stack<>();
        StringBuilder res=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                res.append(ch);
            }
            else if(ch=='('){
                stack.push(ch);
            }
            else if(ch==')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    res.append(stack.pop());
                }
                if(!stack.isEmpty() && stack.peek()=='('){
                    stack.pop();
                }
            }
            else{
                while(!stack.isEmpty() && precedence(ch)<=precedence(stack.peek())){
                    if(stack.peek()=='(') break;
                    res.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()){
            res.append(stack.pop());
        }
        System.out.print(res.toString());
    }
    static int precedence(char ch){
        if(ch=='+' || ch=='-') return 1;
        if(ch=='*' || ch=='/') return 2;
        return 0;
    }
}