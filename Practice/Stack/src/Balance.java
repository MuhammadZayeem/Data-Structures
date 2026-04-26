public class Balance {

    public boolean ifbalanced(String expression){
        Stack stack =new Stack(100);
        for(int i=0;i<expression.length();i++){
            char ch=expression.charAt(i);
            if (ch=='('||ch=='['||ch=='{'){
                stack.push(ch);
            }
            else if(ch==')'||ch==']'||ch=='}'){
                if(stack.isEmpty()){
                    return false;
                }
                char top =(char)stack.pop();
                if((ch==')'&&top!='(')||(ch=='}'&&top!='{')||(ch==']'&&top!='[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
