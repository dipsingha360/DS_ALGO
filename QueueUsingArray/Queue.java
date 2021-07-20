package DS_ALGO.QueueUsingArray;

public class Queue {
    int queue[] = new int[10];
    int front = 0;
    int rear = 0;
    int size = 0;

    // Adding or enQueue data
    void enQueue (int data) {
        if(size >= 10) {
            System.out.println("Queue is FULL");
        } else {
            queue[rear] = data;
            rear = (rear+1) % 10;
            size++;
        }
    }

    // Remove or deQueue
    int deQueue () {
        int data = 0;
        if(size<=0) {
            System.out.println("Queue is NULL");
        } else{
            data = queue[front];
            front = (front+1) % 10;
            size--;
            
        }
        return data;
    }

    // Is Empty
//    boolean idEmpty() {
//
//    }

    // Print data
    void show () {
        System.out.print("Values: ");
        for(int i=0; i<size; i++) {
            System.out.print(queue[(front+i) % 10]+ " ");
        }
    }
}
