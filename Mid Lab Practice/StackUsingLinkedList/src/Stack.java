public class Stack {
    int size;
    int top;
    LinkedList list;

    public Stack(){
        list=new LinkedList();
        top=-1;
    }

    public void push(int input){
        list.InsertAtStart(input);
        top++;
    }
    public void pop(){
        if(top==-1){
            System.out.println("Stack is already empty...");
            return;
        }
        list.DeleteFromStart();
        top--;
    }
    public void peek(){
        list.displayLast();
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public void display(){
        list.display();
    }
}
