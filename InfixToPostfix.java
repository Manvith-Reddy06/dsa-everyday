import java.util.*;
import java.io.*;
class InfixToPostfix{
    public static int priority(char c){
        if(c=='^')return 3;
        else if(c=='*' || c=='/')return 2;
        else if(c=='+' || c=='-')return 1;
        else return -1;

    }
    public static void main(String[] args) {
        // System.out.println("Hello");
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        Stack<Character> stack= new Stack<Character>();
        StringBuilder ans= new StringBuilder();
        for(int i=0;i<n;i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                ans.append(s.charAt(i));
            }
            else if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    ans.append(stack.pop());
                }
                stack.pop(); // pop the '('
            }
            else{
                while(!stack.isEmpty() && priority(stack.peek()) >= priority(s.charAt(i))){
                    ans.append(stack.pop());
                }
                stack.push(s.charAt(i));
            }
        }
        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }
        System.out.println("Postfix Expression: " + ans.toString());


    }
}