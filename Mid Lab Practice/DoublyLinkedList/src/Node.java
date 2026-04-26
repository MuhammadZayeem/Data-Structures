public class Node {
    int value;
    Node nextaddress;
    Node previousaddress;

    public Node(int value){
        this.value=value;
    }
    public Node(Node nextaddress,Node previousaddress,int value){
        this.nextaddress=nextaddress;
        this.previousaddress=previousaddress;
        this.value=value;
    }
}