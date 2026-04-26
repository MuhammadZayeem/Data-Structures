public class Node {
    int value;
    Node nextaddress;

    public Node(Node nextadress, int value){
        this.value=value;
        this.nextaddress=nextadress;
    }
    public Node(int value){
        this.value=value;
    }

}
