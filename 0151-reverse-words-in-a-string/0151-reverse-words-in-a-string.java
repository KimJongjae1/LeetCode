class Solution {
    public String reverseWords(String s) {
        int idx=s.length()-1;
        while(true){
            char a=s.charAt(idx);
            if(a!=' ')break;
            idx--;
        }
        StringBuilder sb=new StringBuilder();
        StringBuilder temp=new StringBuilder();
        while(idx>=0){
            char a=s.charAt(idx);

            if(a==' '){
                while(a==' '&&idx>=0){
                   a=s.charAt(idx);  
                   if(a!=' '){
                    sb.append(temp.reverse().toString());
                    temp.setLength(0);
                    sb.append(' ');   
                     break;
                   }
                   idx--;
                }
            }else{
                temp.append(a);
                idx--;
            }

        }
        sb.append(temp.reverse().toString());
        return sb.toString();

        
    }
}