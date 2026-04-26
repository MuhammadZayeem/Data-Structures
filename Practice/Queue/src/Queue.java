public class Queue {
    int front;
    int back;
    LinkedList list;

    public Queue(){
        list=new LinkedList();
        front=-1;
        back=-1;
    }

    public void enqueue(int input) {
        if (front == -1) {
            front = 0;
        }
            list.InsertAtLast(input);
        back++;
    }

    public int dequeue(){
        if(front==-1){
            System.out.println("Queue is already empty...");
            return -1;
        }
        int q=list.DeleteFromStart();
        if(front==back){
            front=back=-1;
        }
        front++;
        return q;
    }

    public void display(){
        list.displayqueue();
    }

}
