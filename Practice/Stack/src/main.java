public class main {
    public static void main(String[] args) {
//        PostFixEvaluation pfe = new PostFixEvaluation();
//        System.out.println(pfe.evaluation("2 3 4 5 ^ * / "));
//
//        InfixtoPostfix itp = new InfixtoPostfix();
//        System.out.println(itp.Conversion("A*B(c+d)"));
            Balance b=new Balance();
     String input = "{[()]}";
        if (b.ifbalanced(input)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
    }
