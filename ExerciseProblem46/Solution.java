package ExerciseProblem46;

/**
 * @author : 62701
 * @Title : Solution
 * @Description : 验证是否是回文字符串
 * @date : 2020-10-09 10:24
 * @since : 1.0.0
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * raceacar
 * 输入: "race a car"
 * 输出: false
 **/

class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));

    }

    public static boolean isPalindrome(String s) {
        int length = s.length();
        if (length == 0) {
            return true;
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                sb.append(c);
            } else if (c >= 'A' && c <= 'Z') {
                c = String.valueOf(c).toLowerCase().charAt(0);
                sb.append(c);
            } else if (c>='0' && c<= '9'){
                sb.append(c);
            }else{
                continue;
            }
        }
        String string = new String(sb);
        System.out.println(string);
        boolean flag = true;
        int key = 2;
        for (int i = 0; i < string.length() / key; i++) {
            if (string.charAt(i) == string.charAt(string.length() - 1 - i)) {
                continue;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
