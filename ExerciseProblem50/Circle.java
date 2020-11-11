package ExerciseProblem50;

/**
 * @author : 62701
 * @Title : InnerClass
 * @Description : 内部类
 * @date : 2020-10-19 09:27
 * @since : 1.0.0
 **/

public class Circle {
    double radius = 5;

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle() {

    }

    //内部类
    class Draw{
        public void drawCircle(){
            System.out.println("drawCircle");
            System.out.println(radius);
        }
    }
    void method(){
        Draw draw = new Draw();
        draw.drawCircle();
    }
}
