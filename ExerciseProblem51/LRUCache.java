package ExerciseProblem51;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author : 62701
 * @Title : LRUCache
 * @Description :
 * @date : 2020-10-19 10:09
 * @since : 1.0.0
 *
 * //运用你所掌握的数据结构，设计和实现一个 LRU (最近最少使用) 缓存机制。它应该支持以下操作： 获取数据 get 和 写入数据 put 。
 * //
 * // 获取数据 get(key) - 如果关键字 (key) 存在于缓存中，则获取关键字的值（总是正数），否则返回 -1。
 * //写入数据 put(key, value) - 如果关键字已经存在，则变更其数据值；如果关键字不存在，则插入该组「关键字/值」。当缓存容量达到上限时，它应该在
 * //写入新数据之前删除最久未使用的数据值，从而为新的数据值留出空间。
 * //
 * //
 * //
 * // 进阶:
 * //
 * // 你是否可以在 O(1) 时间复杂度内完成这两种操作？
 * //
 * //
 * //
 * // 示例:
 * //
 * // LRUCache cache = new LRUCache( 2  缓存容量 );
* //
* //cache.put(1, 1);
        * //cache.put(2, 2);
        * //cache.get(1);       // 返回  1
        * //cache.put(3, 3);    // 该操作会使得关键字 2 作废
        * //cache.get(2);       // 返回 -1 (未找到)
        * //cache.put(4, 4);    // 该操作会使得关键字 1 作废
        * //cache.get(1);       // 返回 -1 (未找到)
        * //cache.get(3);       // 返回  3
        * //cache.get(4);       // 返回  4
        *
 */

class LRUCache {


    public int capacity;
    public int count = 0;
    public Map<Integer,Integer> map = new LinkedHashMap<>();


    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (map.containsKey(key)){
            Integer value = map.get(key);
            map.remove(key);
            map.put(key,value);
            System.out.println(value);
            return value;
        }else{
            System.out.println(-1);
            return -1;
        }
    }

    public void put(int key, int value) {
        // 判断是否存在key，如果存在，则执行以下代码
            if (map.containsKey(key)){
                map.remove(key);
                map.put(key,value);
                return;
            }
        // 如果不存在，执行以下代码
        if (count>=capacity) {
            //取出头部元素
            Map.Entry<Integer, Integer> firstEntry = map.entrySet().iterator().next();
            map.remove(firstEntry.getKey());
            count--;
        }
        map.put(key,value);
        count++;
    }
}
