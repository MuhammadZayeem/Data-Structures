public class Node {
    int value;
    Node nextaddress;

    public Node(Node nextaddress,int value){
        this.value=value;
        this.nextaddress=nextaddress;
    }
    public Node(int value){
        this.value=value;
    }
}
