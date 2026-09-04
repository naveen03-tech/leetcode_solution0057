import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack <Character> p  = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                p.push(c);
            }else{
                if(p.isEmpty()){
                    return false;
                }
                char y = p.pop();
                if((c == ')'&& y != '(') ||(c == ']'&& y != '[')||(c == '}'&& y != '{')){
                    return false;
                }
            }
        }
        return p.isEmpty();
        }
}