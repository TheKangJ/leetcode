package ExerciseProblem32;

/**
 * @author : 62701
 * @Title : Test
 * @Description : 测试专用
 * @date : 2020-09-11 15:27
 * @since : 1.0.0
 **/

public class Test {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
    public static int reverse(int x){
        if (x== 0 ){
            return 0;
        }else if (x<0 && x> Integer.MIN_VALUE){
            int absX = Math.abs(x);
            String s = String.valueOf(absX);
            int length = s.length();
            StringBuffer stringBuffer = new StringBuffer(length);
            for (int i = length-1; i >-1 ; i--) {
                stringBuffer.append(s.charAt(i));
            }
            String str = new String(stringBuffer);
            System.out.println(str);
            System.out.println();
            int number = Integer.parseInt(str.trim());
            return 0-number;
        }else if (x>0 && x<Integer.MAX_VALUE){
            String s = String.valueOf(x);
            int length = s.length();
            StringBuffer stringBuffer = new StringBuffer(length);
            for (int i = length-1; i > -1 ; i--) {
                stringBuffer.append(s.charAt(i));
            }
            String str = new String(stringBuffer);
            System.out.println(str);
            int number = Integer.parseInt(str.trim());
            return number;
        }else{
            return 0;
        }
    }
}
