import java.util.Scanner;
public class main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Validator validator=new Validator();
    LinkedList list=new LinkedList();

        System.out.println("..........................................");
        System.out.println("..............HTML Validator..............");
        System.out.println("..........................................");
        while (true){
        System.out.println("\nMenu....");
        System.out.println("  1...Check Validation of an HTML String.");
        System.out.println("  2...View History.");
        System.out.println("  3...Exit.");
        System.out.println("\nEnter Choice: ");
        int choice= sc.nextInt();
        sc.nextLine();

        switch (choice){
            case 1:
                System.out.println("Enter the HTML String : ");
                String html=sc.nextLine();
                String result=validator.Validation(html);
                System.out.println("Result : "+result);
                list.InsertAtLast(html,result);
                break;
            case 2:
                System.out.println("------Validation History------");
                list.display();
                break;
            case 3:
                System.out.println("Exiting...");
                return;
            default:
                System.out.println("Invalid Choice...");
        }
    }
    }
}

