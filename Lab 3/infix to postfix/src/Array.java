class Array{
    int top;
    int[] array;

    Array() {
        top = -1;
        array = new int[5];
    }
    public void push(int value) {
        if (top == array.length - 1) {
            int[] temp = new int[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                temp[i] = array[i];
            }
            array = temp;
        }
        array[++top] = value;
    }

    public int pop() {
        if (top == -1) {
            return -1;
        }
        return array[top--];
    }

    public int peek() {
        if (top == -1) return -1;
        return array[top];
    }
    public void resize(){
        int temp[]=new int[array.length*2];
        for (int i=0;i<array.length;i++){
            temp[i]=array[i];
        }
        array=temp;
    }
    public boolean empty(){
        return top==-1;
    }

}