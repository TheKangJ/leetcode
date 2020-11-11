package ExerciseProblem36;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author : 62701
 * @Title : Main
 * @Description :
 * @date : 2020-09-16 21:08
 * @since : 1.0.0
 **/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        HashMap<Character,Integer> map = new HashMap<>();
        str = sc.nextLine();
        StringBuffer sb = new StringBuffer();
        int min  = Integer.MAX_VALUE;
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch) + 1);
            }else {
                map.put(ch,1);
            }
        }
        for (Integer value:map.values()
             ) {
            min = Math.min(value,min);
        }
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if (map.get(ch)!= min){
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());

    }
}
