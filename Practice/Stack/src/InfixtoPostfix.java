public class InfixtoPostfix {

    public int precedence(char ch){
        if(ch=='^')return 3;
        if(ch=='*'||ch=='/')return 2;
        if(ch=='+'||ch=='-')return 1;
        return -1;
    }
    public String Conversion(String expression){
        Stack s = new Stack(100);
        String result="";
        for(int i=0;i<expression.length();i++){
            char ch=expression.charAt(i);
            if(ch==' '){
                continue;
            }
            if(Character.isLetterOrDigit(ch)){
                result+=ch;
            }
            else if(ch=='('){
                s.push(ch);
            }
            else if(ch==')'){
                while(!s.isEmpty()&& s.peek()!='('){
                     result+=s.pop();
                }
                s.pop();
            }
            else{
                while(!s.isEmpty()&& precedence((char) s.peek())>=precedence(ch)){
                    result+=s.pop();
                }
                s.push(ch);
            }
        }
        while (!s.isEmpty()){
            result+=s.pop();
        }
        return result;
    }
}
