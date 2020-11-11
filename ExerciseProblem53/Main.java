package ExerciseProblem53;

/**
 * @author : 62701
 * @Title : Main
 * @Description :
 * @date : 2020-10-24 20:13
 * @since : 1.0.0
 * abcdabcab
 * ab
 **/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(getStringCount(str1,str2));

    }
    public static  int getStringCount(String str,String key){
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(key))!=-1){
            count++;
            str =str.substring(index + key.length());
        }
        return count;
    }
}