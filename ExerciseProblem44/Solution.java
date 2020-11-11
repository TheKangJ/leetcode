package ExerciseProblem44;

/**
 * @author : 62701
 * @Title : Solution
 * @Description :
 * @date : 2020-09-29 11:02
 * @since : 1.0.0
 * [1,1,2]
 * [1,2]
 * <p>
 * [0,0,1,1,1,2,2,3,3,4]
 * 0, 1, 2, 3, 4
 **/

public class Solution {
    public static void main(String[] args) {
        String[] strs = new String[]{"aca","cba"};
        System.out.println(longestCommonPrefix(strs));
        //System.out.println(longestCommonPrefixInTwoString("flight","flow"));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0){
            return "";
        }
        String string = strs[0];
        for (int i = 1; i < strs.length; i++) {
            string = longestCommonPrefixInTwoString(string,strs[i]);
        }
        return string;
    }
    public static String longestCommonPrefixInTwoString(String str1,String str2){
        StringBuffer sb = new StringBuffer();
        int length = Math.min(str1.length(),str2.length());
        for (int i = 0; i < length ; i++) {
            if (str1.charAt(i) == str2.charAt(i)){
                sb.append(str1.charAt(i));
            }else{
                break;
            }
        }
        return new String(sb);
    }

}
