package DS_ALGO.Stack;

public class Stack {

    int stack[] = new int[10];
    int top = 0;

    // Push data
    public void push(int data) {
        stack[top] = data;
        top++;
    }

    // Pop data
    public void pop() {
//        top--;
        System.out.println("top is : " + stack[top-1]);
        stack[top-1] = 0;
    }

    // Peek
    public int peek() {
        int data = stack[top-1];
        System.out.println("Peek: " + data);
        return data;
    }

    // Print data
    public void show() {

        for(int st : stack) {
            System.out.println(st);
        }

    }

}
