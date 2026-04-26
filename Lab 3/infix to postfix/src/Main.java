//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       InfixtoPostfix itp=new InfixtoPostfix();
       String s="3*4+(9/3)-2";
        System.out.println(itp.convertToPostfix(s));
    }
}