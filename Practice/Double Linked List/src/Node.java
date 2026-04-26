public class Node {
    public int value;
    public Node nextaddress;
    public Node previousaddress;

    public Node(Node nextaddress, int value,Node previousaddress) {
        this.nextaddress = nextaddress;
        this.value=value;
        this.previousaddress=previousaddress;
    }

    public Node(int value) {
        this.value = value;
    }
}
