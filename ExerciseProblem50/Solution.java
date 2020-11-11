package ExerciseProblem50;

/**
 * @author : 62701
 * @Title : Solution
 * @Description :
 * @date : 2020-10-19 09:30
 * @since : 1.0.0
 **/

public class Solution {
    public static void main(String[] args) {

        // 访问内部类的方法一，直接创建内部类对象，方法如下
        Circle.Draw draw = new Circle().new Draw();
        // 可看到，内部类科访问外部类的成员变量，其实能访问外部类的所有成员和所有方法(包括private 和 static)
        draw.drawCircle();
        // 访问内部类的方法二，间接访问内部类
        Circle circle = new Circle(10);
        circle.method();
    }
}
