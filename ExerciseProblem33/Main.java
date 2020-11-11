package ExerciseProblem33;

import java.util.Scanner;

/**
 * @author : 62701
 * @Title : Solution
 * @Description :
 * @date : 2020-09-13 19:32
 * @since : 1.0.0
 * X星人最近流行打暗语，大家都喜欢把信息加密后再发送给对方，然后再偷偷告诉人家破解方法，他们觉得这样很酷。
 *
 * 某X星人发明了一种加密方法，该加密方法是将一个明文字符串从左到右分割成若干个长度相等的子字符串（最后一个子字符串的长度可以不同），然后将每个子字符串中的字符进行逆序，从而得到密文。
 *
 * 但是，X星人可不会轻易告诉你每个子字符串的长度是多少。还好你够聪明，每次都能够猜到X星人设置的长度值。
 *
 * 现在你成功截取了X星人的密文并且也猜到了X星人设置的长度值，能否写一个程序将该密文破解得到对应的明文呢？
 *
 * 2
 * gogogoout
 *
    ogogoguot

输入样例2
3
Gogo, go out!?
输出样例2
goG ,o ogtuo?!
 **/

public class Main {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s = sc.nextLine();
        int num = Integer.parseInt(s1);
        int length = s.length();
        int fenzu = 0;
        if (length == 0){
            System.out.println("");
        }
        if (length == 1){
            System.out.println(s);
        }
//        if (num >= s.length()){
//            System.out.println(reverse(s));
//        }
        if (length % num == 0){
            fenzu = length / num;
            StringBuffer stringBuffer  = new StringBuffer();
            for (int i = 0; i < fenzu ; i++) {
                String reverse = reverse(s.substring(i * num, i * num + num));
                stringBuffer.append(reverse);
            }
            System.out.println(stringBuffer.toString());
        }else {
            fenzu = length / num +1;
            StringBuffer stringBuffer  = new StringBuffer();
            for (int i = 0; i < fenzu - 1 ; i++) {
                String reverse = reverse(s.substring(i * num, i * num + num));
                stringBuffer.append(reverse);
            }
            String reverse = reverse(s.substring((fenzu-1) * num,length));
            stringBuffer.append(reverse);
            System.out.println(stringBuffer.toString());
        }


    }
    public static String reverse(String s){
        int length = s.length();
        if(s.length() == 1){
            return s;
        }else if(s.length()>1){
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = length-1; i >-1 ; i--) {
                stringBuffer.append(s.charAt(i));
            }
            return stringBuffer.toString();
        }else{
            return null;
        }
    }

}
