package ExerciseProblem39;

/**
 * @author : 62701
 * @Title : Solution
 * @Description :
 * @date : 2020-09-21 15:04
 * @since : 1.0.0
 *
 * 整形数组转换为字符串的方式
 * int[] ints = new int[]{1,2,3,4,5};
 * StringBuffer sb = new StringBuffer();
 * for(int i = 0; i <ints.length;i++ ){
 *     sb.append(ints[i]);
 * }
 * String str  = sb.toString();
 **/

class Solution {
    public static void main(String[] args) {
        int[] ints = new int[]{6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3};
        int[] plusOne = plusOne(ints);
        for (int i = 0; i < plusOne.length ; i++) {
            System.out.println(plusOne[i]);
        }

    }
    public static int[] plusOne(int[] digits) {
        long digitsNum  = 0 ;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i <digits.length ; i++) {
            sb.append(digits[i]);
        }
        String str = sb.toString();
        System.out.println(str);
        digitsNum = Long.parseLong(str) + 1 ;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(digitsNum);
        String string = stringBuffer.toString();
        int[] nums = new int[string.length()];
        for (int i = 0; i < string.length(); i++) {
            nums[i] = Integer.parseInt(string.substring(i,i+1));
        }
        return nums;

    }
}
