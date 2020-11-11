package ExerciseProblem37;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author : 62701
 * @Title : Main
 * @Description : 设计一个自持push,pop,top的操作，并在常熟时间内检索到最小元素的栈 。
 * push（x） 把X压入栈
 * pop，出栈
 * top，获取栈顶元素
 * getMin 获取栈中的最小值
 * @date : 2020-09-16 21:41
 * @since : 1.0.0
 * push -3
 * push 0
 * push -2
 * getMin
 * top
 * pop
 * getMin
 **/

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int minNumber = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        int times = Integer.parseInt(sc.nextLine());
        for (int i = 0; i <times ; i++) {
            String string = sc.nextLine();
            String[] s = string.split(" ");
            if ("push".equals(s[0])){
                int number = 0;
                number = Integer.parseInt(s[1]);
                minNumber = push(stack,minNumber,number);
            }else if (("getMin".equals(s[0]))){
                System.out.println(getMin(minNumber));
            }else if ("pop".equals(s[0])){
                pop(stack);
            }else if ("top".equals(s[0])){
                System.out.println(top(stack));
            }
        }
    }

    public static int push(Stack<Integer> stack,int minNumber,int num){
        stack.push(num);
        if (num < minNumber){
            minNumber = num;
        }
        return minNumber;
    }

    public static void pop(Stack<Integer> stack){
        stack.pop();
    }

    public static int top(Stack<Integer> stack){
        return stack.pop();
    }


    public static int getMin(int minNumber){
            return minNumber;
    }

}
