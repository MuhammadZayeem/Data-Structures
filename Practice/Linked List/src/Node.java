public class Node {
    public int value;
    public Node nextaddress;

    public Node(Node nextaddress, int value) {
        this.nextaddress = nextaddress;
        this.value=value;
    }

    public Node(int value) {
        this.value = value;
    }
}
