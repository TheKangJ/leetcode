/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Solution
 * Author:   62701
 * Date:     2020/5/30 17:07
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package ExerciseProblem17;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 62701
 * @create 2020/5/30
 * @since 1.0.0
 */
public class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums1Length = nums1.length;
        int nums2Length = nums2.length;
        int nums3Length = nums1Length + nums2Length;
        int[] nums3 = new int[nums3Length];
        double Median = 0;
        int i = 0;
        int j = 0;
        int index = 0;
        while (index < nums3Length) {
            while (i < nums1Length && j < nums2Length) {
                if (nums1[i] < nums2[j]) {
                    nums3[index] = nums1[i];
                    i++;
                    index++;
                } else {
                    nums3[index] = nums2[j];
                    j++;
                    index++;
                }
            }
            if (i == nums1Length) {
                for (int k = j; k < nums2Length; k++) {
                    nums3[index] = nums2[k];
                    index++;
                }
            } else if (j == nums2Length) {
                for (int k = i; k < nums1Length; k++) {
                    nums3[index] = nums1[k];
                    index++;
                }
            }
        }
        if (nums3Length % 2 == 0) {
            Median =(double) (nums3[nums3Length / 2 - 1] + nums3[nums3Length / 2]) / 2;
        } else {
            Median = nums3[nums3Length / 2];
        }
        return Median;
    }
}