package ExerciseProblem49;

/**
 * @author : 62701
 * @Title : Solution
 * @Description : StrStr
 * @date : 2020-10-12 15:06
 * @since : 1.0.0
 **/

public class Solution {
    public static void main(String[] args) {
        System.out.println(strStr("a","a"));
    }
    public static int strStr(String haystack, String needle) {
        if ("".equals(needle)){
            return 0;
        }
        // 判断是否是strStr
        int flag = 0;
        char[] haystackToChars = haystack.toCharArray();
        int length = haystackToChars.length;
        char[] needleToChars = needle.toCharArray();
        for (int i = 0; i < length; i++) {
            if (haystackToChars[i] == needleToChars[0]){
                for (int j = 0; j < needleToChars.length; j++) {
                    if (needleToChars[j] != haystackToChars[i+j]){
                        flag = -1;
                        break;
                    }else{
                        flag = 1;
                    }
                }
                if (flag == 1){
                    return i;
                }
            }
        }
        return -1;
    }
}
