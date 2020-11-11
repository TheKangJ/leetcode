package ExerciseProblem41;

/**
 * @author : 62701
 * @Title : Solution
 * @Description :
 * @date : 2020-09-25 16:33
 * @since : 1.0.0
 **/

class Solution {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("he3llo wor3ld"));
    }
    public static int lengthOfLastWord(String s) {
        String[] strings = s.split(" ");
        int length = strings.length;
        String str  = "";
        for (int i = length-1; i >-1 ; i--) {
            //判断最后一个字符串是不是单词
            if (isWords(strings[i])){
                str = strings[i];
                break;
            }
        }
        return str.length();
    }
    public static boolean isWords(String s){
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))){
                return false;
            }
        }
        return true;
    }
}