public class Node {
    Node nextaddress;
    String html_string;
    String validation;

   public Node(String html_string, String validation){
        this.html_string=html_string;
        this.validation=validation;
    }
}
