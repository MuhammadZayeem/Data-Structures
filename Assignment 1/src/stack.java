public class stack {
    int top;
    String stack[];
    int size;

    public stack(int size){
    this.top=-1;
    this.size=size;
    this.stack=new String[size];
    }

    public void push(String input){
        if(top==size-1){
            String stack2[]=new String[size*2];
            int count=0;
            for (int i=0;i<stack.length;i++){
                stack2[count++]=stack[i];
            }
            stack=stack2;
            size=size*2;
        }
        stack[++top]=input;
    }

    public String pop(){
        if(top==-1){
            return null;
        }
        return stack[top--];
    }
    public Boolean isEmpty(){
        return top==-1;
    }
    public String peek(){
        return stack[top];
    }
}
