package ExerciseProblem30;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 * @author : 62701
 * @Title : Solution
 * @Description :
 *  设计LRU缓存结构，该结构在构造时确定大小，假设大小为K，并有如下两个功能
 *
 *     set(key, value)：将记录(key, value)插入该结构
 *     get(key)：返回key对应的value值
 *
 * [要求]
 *
 *     set和get方法的时间复杂度为O(1)
 *     某个key的set或get操作一旦发生，认为这个key的记录成了最常使用的。
 *     当缓存的大小超过K时，移除最不经常使用的记录，即set或get最久远的。
 *
 * 若opt=1，接下来两个整数x, y，表示set(x, y)
 * 若opt=2，接下来一个整数x，表示get(x)，若x未出现过或已被移除，则返回-1
 * 对于每个操作2，输出一个答案
 * @date : 2020-08-30 13:11
 * @since : 1.0.0
 **/

public class Solution {
    /**
     * lru design latest Recently Used 最近最少使用
     * @param operators int整型二维数组 the ops
     * @param k int整型 the k
     * @return int整型一维数组
     */
    public int[] LRU (int[][] operators, int k) {
        // write code here
        // 使用LinkHashMap存储有序键值对 存储数据
        LinkedHashMap<Integer,Integer> lruMap = new LinkedHashMap<>();
        // get操作结果
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < operators.length ; i++) {
            if (operators[i][0] == 1){
                //set(x,y)

                    // 获取key 和value
                int key = operators[i][1];
                int value = operators[i][2];

                if (lruMap.containsKey(key)){
                    // lruMap存在Key的话，就先移除这个key-value
                    lruMap.remove(key);
                }else{
                    // 如果lruMap不存在这个key的话，先判断是否超出k的大小，超出的话，移除最开始的那个key-value
                    if (lruMap.size() == k){
                        Set<Integer> keySet = lruMap.keySet();
                        Object[] objects = keySet.toArray();
                        lruMap.remove(objects[0]);
                    }
                }
                lruMap.put(key,value);
            }else if(operators[i][0] == 2){
                //get(x) 若x未出现过或已经被移除，则返回-1
                int key = operators[i][1];
                // 不要忘记get后也是要把key设置为最新的，所以先获取value，再存入LinkedHashMap
                if (lruMap.containsKey(key)){
                    int value = lruMap.remove(key);
                    lruMap.put(key,value);
                    result.add(value);
                }
                else {
                    result.add(-1);
                }
            }
        }
        int[] arr = new int[result.size()];
        for (int i = 0; i <result.size() ; i++) {
            arr[i] = result.get(i);
        }
        return arr;
    }
}
