public class Queue {
    int N=7;
    int array[]=new int[N];
    int front=-1;
    int rear =-1;
    void enqueue(int x){
        if(rear==N-1){
            System.out.println("Overflow...");
        }
        else{
             if(front==-1){
                front=0;
            }
            rear++;
            array[rear]=x;
        }
    }
    int dequeue() {
        if (front == -1) {
            System.out.println("Queue is empty...");
        } else {
            int output = array[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
        }
    }
 
}
