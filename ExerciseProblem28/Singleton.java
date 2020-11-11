package ExerciseProblem28;

/**
 * @author : 62701
 * @Title : Singleton
 * @Description : 单例模式_饿汉式
 * @date : 2020-08-07 15:32
 * @since : 1.0.0
 **/

public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton(){};

    public static Singleton getInstance(){
        return instance;
    }
}
