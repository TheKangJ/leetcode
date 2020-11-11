package ExerciseProblem28;

/**
 * @author : 62701
 * @Title : Singleton_懒汉式
 * @Description : 懒汉式
 * @date : 2020-08-07 15:35
 * @since : 1.0.0
 **/

public class Singleton_懒汉式 {
    private static Singleton_懒汉式 instance ;
    private Singleton_懒汉式(){}
    public static synchronized Singleton_懒汉式 getInstance(){
        if (instance == null){
            instance = new Singleton_懒汉式();
        }
        return instance;
    }
}
