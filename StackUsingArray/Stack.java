package DS_ALGO.StackUsingArray;

public class Stack {

    int stack[] = new int[10];
    int top = 0;

    // Push data
    public void push(int data) {
        if(top==10) {
            System.out.println("\nSTACK IS FULL");
        }else{
            stack[top] = data;
            top++;
        }
    }

    // Pop data
    public void pop() {
        if(top <= 0) {
            System.out.println("\nSTACK IS EMPTY");
        }else{
            top--;
//            System.out.println("POP : " + stack[top]);
            stack[top] = 0;
        }

    }

    // Peek
    public int peek() {
        int data = 0;
        if(top <= 0) {
            System.out.println("\nSTACK IS EMPTY, PEEK : 0");
        }else {
            data = stack[top-1];
            System.out.println("PEEK : " + data);
        }
        return data;
    }

    // Size
    public int size() {
        System.out.println("Size : " + top);
        return top;
    }

    // Is empty
    public boolean isEmpty() {
        boolean res;
        if(top <= 0) {
            res = true;
        } else {
            res = false;
        }
        System.out.println("Is empty : " + res);
        return res;
    }

    // Print data
    public void show() {

//        for(int st : stack) {
//            System.out.print(st+"  ");
//        }
//        System.out.println();
        while (top != 0) {
            System.out.println(stack[top-1]);
            top--;
        }

    }

}
