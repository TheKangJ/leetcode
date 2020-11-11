package ExerciseProblem52;

import java.util.Stack;

/**
 * @author : 62701
 * @Title : MyQueue
 * @Description :
 * @date : 2020-10-20 09:38
 * @since : 1.0.0
 * <p>
 * //使用栈实现队列的下列操作：
 * //
 * //
 * // push(x) -- 将一个元素放入队列的尾部。
 * // pop() -- 从队列首部移除元素。
 * // peek() -- 返回队列首部的元素。
 * // empty() -- 返回队列是否为空。
 * //
 * //
 * //
 * //
 * // 示例:
 * //
 * // MyQueue queue = new MyQueue();
 * //
 * //queue.push(1);
 * //queue.push(2);
 * //queue.peek();  // 返回 1
 * //queue.pop();   // 返回 1
 * //queue.empty(); // 返回 false
 **/

class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        stack1.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        while (stack1.size() > 1) {
            Integer pop = stack1.pop();
            stack2.push(pop);
        }
        Integer pop = stack1.pop();
        while (stack2.size() > 0) {
            stack1.push(stack2.pop());
        }
        return pop;
    }

    /**
     * Get the front element.
     */
    public int peek() {
        return stack1.get(0);
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        if (stack1.size() > 0) {
            return false;
        } else {
            return true;
        }
    }
}
