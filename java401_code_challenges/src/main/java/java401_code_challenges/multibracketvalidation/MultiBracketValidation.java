package java401_code_challenges.multibracketvalidation;
import java.util.Stack;

public class MultiBracketValidation {
    public static boolean checkIfBracketsAreBalanced(String brackets){
         Stack<Character> stackOfBrackets = new Stack<>();
        for(int i = 0; i<brackets.length(); i++){
            if(brackets.charAt(i)=='{'||brackets.charAt(i)=='['||brackets.charAt(i)=='('){
                stackOfBrackets.push(brackets.charAt(i));
            }
            if(brackets.charAt(i)=='}'||brackets.charAt(i)==']'||brackets.charAt(i)==')'){
                if (stackOfBrackets.peek()==null){
                    return false;
                }
                if((brackets.charAt(i)=='}'&&stackOfBrackets.peek()=='{')||(brackets.charAt(i)==')'&&stackOfBrackets.peek()=='(')||(brackets.charAt(i)==']'&&stackOfBrackets.peek()=='[')){
                    stackOfBrackets.pop();
                }
                else return false;
            }
        }
    return stackOfBrackets.isEmpty();
    }
}

//Reference: https://stackoverflow.com/questions/16874176/parenthesis-brackets-matching-using-stack-algorithm
