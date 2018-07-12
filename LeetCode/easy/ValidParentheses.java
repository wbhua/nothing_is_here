package easy;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
    	Stack<Character> st= new Stack<>();
        for(char c:s.toCharArray()){
        	if(c == '('){
        		st.add(')');
        	}
        	else if(c == '['){
        		st.add(']');
        	}
        	else if(c == '{'){
        		st.add('}');
        	}
        	else{
        		if(!st.isEmpty()){
        			if(c!=st.pop())
            			return false;
        		}else
        			return false;
        	}
        }
        return st.isEmpty();
    }
}
