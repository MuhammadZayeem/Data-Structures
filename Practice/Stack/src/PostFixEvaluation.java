public class PostFixEvaluation {

    public int evaluation(String expression){
        Stack s=new Stack(100);
        for(int i=0;i<expression.length();i++){
            char ch=expression.charAt(i);
            if(ch==' '){
                continue;
            }
            if(Character.isDigit(ch)){
                s.push(ch-'0');
            }
            else{
                int operand_2=s.pop();
                int operand_1=s.pop();
                int result=0;
                if(ch=='+'){
                    result=operand_1+operand_2;
                }
               else if(ch=='*'){
                    result=operand_1*operand_2;
                }
                else if(ch=='-'){
                    result=operand_1-operand_2;
                }
                else if(ch=='/'){
                    result=operand_1/operand_2;
                }
                else if(ch=='^'){
                    result=operand_2^operand_1;

                }
                    s.push(result);
            }
        }
        return s.pop();
    }
}
