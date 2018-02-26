package ex;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Valid_Parentheses {
	public static void main(String[] args) {
		 System.out.println(new Solution6().isValid("([])"));
	}
}
class Solution6 {
    public boolean isValid(String s) {
        Map<Character,Character> map=new HashMap<Character,Character>(){
            {
                put('{','}');
                put('[',']');
                put('(',')');

            }
        };
        Stack<Character> stack=new Stack<Character>();
        int num=0;
        for(int i=0;i<s.length();i++){
           char a=s.charAt(i);
           switch (a) {
		case '{':
		case '[':
		case '(':stack.push(a);  break;
		case '}':
		case ')':
		case ']': if(stack.isEmpty()||a!=map.get(stack.pop())) {return false;}; break;
		}
            
        }
        if(stack.isEmpty()) {return true;}
        else {return false;}
    }
}
