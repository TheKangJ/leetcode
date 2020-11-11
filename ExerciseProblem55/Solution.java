package ExerciseProblem55;

import java.util.Stack;

/**
 * @author : 62701
 * @Title : Solution
 * @Description :
 * @date : 2020-10-28 09:44
 * @since : 1.0.0
 **/

public class Solution {
    public static void main(String[] args) {
        String s ="[";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        int length = s.length();
        if (length == 1){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c == '[' || c == '{' || c == '('){
                stack.push(c);
            }else if (c == ']'){
                if (stack.get(stack.size()-1) == '['){
                    stack.pop();
                }else{
                    return false;
                }
            }else if (c == '}'){
                if (stack.get(stack.size()-1) == '{'){
                    stack.pop();
                }else {
                    return false;
                }
            }else if (c == ')'){
                if (stack.get(stack.size()-1) == '('){
                    stack.pop();
                }
            }
        }
        if (stack.size() == 0){
            return true;
        }else {
            return false;
        }
    }
}
