package ExerciseProblem51;

/**
 * @author : 62701
 * @Title : Solution
 * @Description :
 * @date : 2020-10-19 10:47
 * @since : 1.0.0
 **/

public class Solution {
    public static void main(String[] args) {
        LRUCache cache = new LRUCache( 2  );
        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);
        cache.put(3, 3);
        cache.get(2);
        cache.put(4,4);
        cache.get(1);
        cache.get(3);
        cache.get(4);
    }
}
