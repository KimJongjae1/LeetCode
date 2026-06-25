class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();

        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);

            if(a=='('||a=='{'||a=='['){
                stack.push(a);
            }else{
                if(stack.isEmpty())return false;
                else{
                    char close=stack.pop();
                    if(a==')'){
                        if(close!='(')return false;
                    }else if(a==']'){
                        if(close!='[')return false;
                    }else{
                        if(close!='{')return false;
                    }
                }
            }

        }
        if(stack.isEmpty())
        return true;
        else return false;
    }
}