package Examination;

import java.util.HashMap;

/**
 * @author : 62701
 * @Title : Solution
 * @Description :
 * @date : 2020-10-21 15:37
 * @since : 1.0.0
 **/

public class Solution {
    public static void main(String[] args) {
        String key = "eydbkmiqugjxlvtzpnwohracsf";
        String cipherText = "Kifq oua zarxa suar bti yaagrj fa xtfgrj";
        System.out.println(Decryption(key,cipherText));
    }
    public static String Decryption(String key,String cipherText){
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
}
