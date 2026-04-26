public class Stack {
    int stack[];
    int top;
    int size;

    public Stack(int size){
        this.size=size;
        stack =new int[size];
        top=-1;
    }

    public void push(int input){
        if(top==size-1){
            int temp[]=new int[size*2];
            int count=0;
            for(int i=0;i<stack.length;i++){
                temp[count++]=stack[i];
            }
            stack=temp;
            size=size*2;
        }
            stack[++top]=input;
    }

    public int pop(){
        if(top==-1){
            System.out.println("Stack is empty...");
            return -1;
        }
        return stack[top--];
    }
    int peek() {
        if(top==-1){
            System.out.println("Stack is empty...");
            return -1;
        }
        return stack[top];
    }
    boolean isEmpty() {
        return top == -1;
    }
}
