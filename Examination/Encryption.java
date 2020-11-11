package Examination;

import java.util.HashMap;
import java.util.Random;

/**
 * @author : 62701
 * @Title : Encryption
 * @Description : 生成测试用例
 * @date : 2020-10-22 12:55
 * @since : 1.0.0
 **/

public class Encryption {
    public static void main(String[] args) {
        String keys = generateKeys();
        String plainText = generatePlainText();
        System.out.println(keys);
        System.out.println(plainText);
        System.out.println(Encryption(keys,plainText));
    }
    public static String Encryption(String keys, String plainText) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        int length = keys.length();
        HashMap<Character, Character> keyMap = new HashMap<>(length);
        for (int i = 0; i < length; i++) {
            keyMap.put(keys.charAt(i), str.charAt(i));
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < plainText.length(); i++) {
            if (plainText.charAt(i) == ' ') {
                sb.append(' ');
            } else if (plainText.charAt(i) >= 'A' && plainText.charAt(i) <= 'Z') {
                char c = plainText.charAt(i);
                c = String.valueOf(c).toLowerCase().charAt(0);
                char value = keyMap.get(c);
                value = String.valueOf(value).toUpperCase().charAt(0);
                sb.append(value);
            } else {
                sb.append(keyMap.get(plainText.charAt(i)));
            }
        }
        return new String(sb);
    }
    public static String generateKeys(){
        // 生成不重复的26个字母
        String str = "abcdefghijklmnopqrstuvwxyz";
        int length = str.length();
        Random random = new Random();
        int[] nums = new int[length];
        char[] cc = str.toCharArray();
        int[] m = new int[length];
        StringBuffer sb = new StringBuffer();
        int ii = 0;
        while (sb.length()!=length){
            for (int i = 0; i < str.length(); i++) {
                ii = random.nextInt(26);
                m[i] = ii;
                if (sb.toString().indexOf(cc[ii]) == -1){
                    sb.append(cc[ii]);
                }
            }
        }
        return sb.toString();
    }
    public static String generatePlainText(){
        // 生成明文
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String space = "             ";
        String str = upper+space+lower;
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        char[] chars = str.toCharArray();
        int ans = 0;
        int size = 20;
        for (int i = 0; i < size; i++) {
            ans = random.nextInt(str.length());
            sb.append(chars[ans]);
        }
        return sb.toString();
    }
}
