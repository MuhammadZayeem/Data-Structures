import java.util.Stack;

public class InfixtoPostfix {

    Array currentstack;

    public int precedenceOp(char ch) {
        if (ch=='+'||ch=='-') {return 1;}
        if (ch=='*'||ch=='/'){return 2;}
        if (ch == '^') {return 3;}
        return 0;
    }

    public boolean isLeftAssociate(char ch) {
        if (ch == '^') {return false;}return true;}

    public String convertToPostfix(String infix) {
        StringBuilder answere = new StringBuilder();

        for (int i = 0; i<infix.length(); i++) {
            char ch = infix.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                answere.append(ch);
            } else if (ch == '(') {
                currentstack.push(ch);
            } else if (ch == ')') {
                while (!currentstack.empty() && currentstack.peek() != ')') {
                    answere.append(currentstack.pop());}
                currentstack.pop();}
            else{
                while(!currentstack.empty()&&precedenceOp((char)currentstack.peek())>=precedenceOp(ch)&&isLeftAssociate(ch)){
                   answere.append(currentstack.pop());
                }
                currentstack.push(ch);
            }

        }
        while (!currentstack.empty()) {
            answere.append(currentstack.pop());
    }
        return answere.toString();
}


}