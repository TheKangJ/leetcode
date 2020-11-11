/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Test2
 * Author:   62701
 * Date:     2020/5/29 0:16
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package ExerciseProblem2;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 62701
 * @create 2020/5/29
 * @since 1.0.0
 */
public class Test2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("we are happy");
        System.out.println(replaceSpace(sb));
    }
    public static String replaceSpace(StringBuffer str) {
        if (str == null){
            return null;
        }
        else{
            StringBuffer newStr = new StringBuffer();
            for (int i = 0; i <str.length() ; i++) {
                String substring = str.substring(i, i + 1);
                if(" ".equals(substring)){
                    newStr = newStr.append("%20");
                }else {
                    newStr = newStr.append(substring) ;
                }
            }
            return newStr.toString();
        }
    }
}