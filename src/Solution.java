import java.util.Stack;

public class Solution{
    public String removeOuterParentheses(String S) {
        Stack<Character> stack1=new Stack<>();
        String res="";
        char[] s=S.toCharArray();
        for(int i=0;i<=s.length-1;i++){
            if(s[i]==')'){
                stack1.pop();
            }
            if(!stack1.empty()){
                res+=s[i];
            }
            if(s[i]=='('){
                stack1.push('(');
            }
        }
        return res;
    }
}
