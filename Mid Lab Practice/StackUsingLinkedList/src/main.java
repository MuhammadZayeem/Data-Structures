public class main {

    public static void main(String[] args) {
            Stack stack=new Stack();
            stack.push(12);
            stack.push(13);
            stack.push(14);
            stack.push(15);
            stack.push(16);
            stack.display();
        System.out.println("");
            stack.pop();
            stack.pop();
            stack.pop();
            stack.display();
            stack.peek();
    }
}
