public class CircularQueue {
    int front;
    int rear;
    int size;
    Student array[];

    public CircularQueue(int size){
        front=-1;
        rear=-1;
        this.size=size;
        array=new Student[size];
    }

    public void enqueue(Student s) {
        if ((rear + 1)%size==front) {
            System.out.println("Queue is already full, Can't add new Student...");
            return;
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            array[rear]=s;
        }
    }

    public void dequeue() {
        if (front==-1) {
            System.out.println("The Library is empty, Nothing to remove...");
            return;
        }
        System.out.println("Student :" + array[front].name + " removed...");
        if (front==rear) {
            front=-1;
            rear=-1;
        } else {
            front=(front+1)%size;
        }
    }


    public void display() {
        if (front==-1) {
            System.out.println("Queue is Empty!!");
        }
        else {
            int i = front;
            while (true) {
                System.out.println(array[i]);
                if (i==rear)
                    break;
                i=(i+1)%size;
            }
        }
    }

}
