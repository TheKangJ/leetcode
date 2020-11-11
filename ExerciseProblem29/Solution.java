package ExerciseProblem29;
import java.lang.Math;
/**
 * @author : 62701
 * @Title : Solution
 * @Description :
 * @date : 2020-08-29 10:27
 * @since : 1.0.0
 * <p>
 * ["1,1","2,2","1,2","1,3"]
 **/

public class Solution {
    public static int get_index(String[] points) {
        if (points.length == 0) {
            return 0;
        }
        int columnSum = 0;
        int rowSum = 0;
        String zuobiao;
        String xzuobiao;
        String yzuobiao;
        int length = points.length;
        for (String point : points) {
            zuobiao = point;
            xzuobiao = zuobiao.substring(0, 1);
            yzuobiao = zuobiao.substring(2, 3);
            columnSum = Integer.parseInt(xzuobiao) + columnSum;
            rowSum = Integer.parseInt(yzuobiao) + rowSum;
        }
        int xAverage = columnSum / points.length;
        int yAverage = rowSum / points.length;


        int[] juli = new int[length];
        for (int i = 0; i < length; i++) {
            zuobiao = points[i];
            xzuobiao = zuobiao.substring(0, 1);
            yzuobiao = zuobiao.substring(2, 3);
            int xshu = Integer.parseInt(xzuobiao);
            int yshu = Integer.parseInt(yzuobiao);

            juli[i] = (int) Math.sqrt((xshu - xAverage) * (xshu - xAverage) + (yshu - yAverage) * (yshu - yAverage));
        }
        int min = juli[0];
        int minIndex = 0;
        for (int i = 1; i < length; i++) {
            if (juli[i] < min) {
                min = juli[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"1,1", "2,2", "1,2", "1,3"};
        int index = get_index(strings);
        System.out.println(index);
    }

}
