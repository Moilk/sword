public class Solution {
    public String replaceSpace(StringBuffer str) {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == ' '){
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}