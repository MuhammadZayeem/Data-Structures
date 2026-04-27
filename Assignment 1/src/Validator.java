public class Validator {

    public String Validation(String html_string){
        stack s=new stack(100);
        int i=0;
        while (i<html_string.length()){
            char ch=html_string.charAt(i);
            if(ch=='<') {
                int close = html_string.indexOf('>', i);
                if (close == -1) {
                    return "Invalid HTML-String";
                }
                String opening_tag = html_string.substring(i + 1, close);
                i = close + 1;
                if (opening_tag.startsWith("/")) {
                    String closingtag = opening_tag.substring(1);
                    if (s.isEmpty() || !s.peek().equals(closingtag)) {
                        return "Invalid HTML-String";
                    }
                    s.pop();
                } else {
                    s.push(opening_tag);
                }
            }
            else {
                i++;
            }
            }
        return s.isEmpty()? "Valid HTML-String":"Invalid HTML-String";
    }

}
