package ExerciseProblem28;

/**
 * @author : 62701
 * @Title : Singleton_Doiuble_check_lock
 * @Description : 双重检查
 * @date : 2020-08-07 15:39
 * @since : 1.0.0
 **/

public class Singleton_Doiuble_check_lock {
    private static volatile Singleton_Doiuble_check_lock instance;
    private Singleton_Doiuble_check_lock(){};
    public static Singleton_Doiuble_check_lock getInstance(){
        // 双重检查是否生成单例 Double Check Lock
        if (instance == null){
            synchronized (Singleton_Doiuble_check_lock.class){
                if (instance == null){
                    instance = new Singleton_Doiuble_check_lock();
                }
            }
        }
        return instance;
    }
}
