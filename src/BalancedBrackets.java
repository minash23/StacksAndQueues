import java.util.Stack;

public class BalancedBrackets {
    public String isBalanced(String s){
        Stack<Character> hey = new Stack<Character>();
        for(int i = 0; i < s.length();i++){
            if (s.charAt(i) == '('){
                hey.push(')');
            }
            else if(s.charAt(i) == '{'){
                hey.push('}');
            }
            else if(s.charAt(i) == '['){
                hey.push(']');
            }
            else if(hey.isEmpty() || hey.pop() != s.charAt(i)){
                return "No";
            }
        }
        return "Yes";
    }
}
