package offer;

import java.util.Stack;

public class minStack {
    Stack<Integer> stackMain = new Stack<>();
    Stack<Integer> stackMin = new Stack<>();

    public void push(int node) {
        if(!stackMin.isEmpty()){
            if(stackMain.peek() < node){
                stackMin.push(stackMin.peek());
            }else{
                stackMin.push(node);
            }
        }else{
            stackMin.push(node);
        }
        stackMain.push(node);
    }

    public void pop() {
        stackMain.pop();
        stackMin.pop();
    }

    public int top() {
        return stackMain.peek();
    }

    public int min() {
        return stackMin.peek();
    }
}
