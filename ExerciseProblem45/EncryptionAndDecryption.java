package ExerciseProblem45;

import java.util.HashMap;

/**
 * @author : 62701
 * @Title : ExerciseProblem45.EncryptionAndDecryption
 * @Description :
 * @date : 2020-09-29 09:31
 * @since : 1.0.0
 * <p>
 * 1. 题目描述
 * 简单的加密算法：把字符串中的字符替换成另外的字符，只有对方知道如何替换就可以
 * 解密。要求根据给定的加密方法和密文，得到原始消息。
 * 输入格式
 * 第一行输入密钥，第二行输入密文。
 * 输出格式
 * 对输入的数据输出解密后的原始信息。
 * 输入样例
 * abcdefghijklmnopqrstuvwxyz
 * eydbkmiqugjxlvtzpnwohracsf
 * Kifq oua zarxa suar bti yaagrj fa xtfgrj
 * 输出样例
 * jump the fence when you seeing me coming
 *
 **/

public class EncryptionAndDecryption {
    public static void main(String[] args) {
        String key = "qwertyuiopasdfghjklzxcvbnm";
        String cipherText = "Qgzj epc ncyvc bpcy fig lcchyo zc vizhyo";
        String plainText = "jump the fence when you seeing me coming";
        System.out.println(Decryption(key, cipherText));
        //System.out.println(Encryption(key,plainText));
    }

    public static String Decryption(String key, String cipherText) {
        int length = key.length();
        if (length == 0 || cipherText.length() == 0){
            return "";
        }
        HashMap<Character, Character> keyMap = new HashMap<>(26);
        String str = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < length; i++) {
            keyMap.put(str.charAt(i), key.charAt(i));
        }
        return Decrypt(keyMap, cipherText);

    }

    public static String Decrypt(HashMap<Character, Character> map, String cipherStr) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < cipherStr.length(); i++) {
            if (cipherStr.charAt(i) == ' ') {
                sb.append(' ');
            } else if (cipherStr.charAt(i) >= 'A' && cipherStr.charAt(i) <= 'Z') {
                char c = cipherStr.charAt(i);
                c = String.valueOf(c).toLowerCase().charAt(0);
                char value = map.get(c);
                value = String.valueOf(value).toUpperCase().charAt(0);
                sb.append(value);
            } else {
                sb.append(map.get(cipherStr.charAt(i)));
            }
        }
        return new String(sb);
    }


    public static String Encryption(String keys, String plainText) {
        int length = keys.length();
        HashMap<Character, Character> keyMap = new HashMap<>(26);
        String str = "abcdefghijklmnopqrstuvwxyz";
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

}

