package DS_ALGO.QueueUsingArray;

public class Queue {
    int queue[] = new int[10];
    int front;
    int rear;
    int size;

    // Adding or enQueue data
    void enQueue (int data) {
        queue[rear] = data;
        rear++;
        size++;
    }

    // Remove or deQueue
    int deQueue () {
        int data = queue[front];
        front++;
        size--;
        return data;
    }

    // Print data
    void show () {
        System.out.print("Values: ");
        for(int i=0; i<size; i++) {
            System.out.print(queue[front+i]+ " ");
        }
    }
}
