class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for(char ch : chars){
            if(ch >= '0' && ch <= '9'){
                sb.append(ch);
            }
            else if(ch >= 'a' && ch <= 'z'){
                sb.append(ch);
            }
            else if(ch >= 'A' && ch <= 'Z'){
                sb.append((char)(ch-('A'-'a')));
            }
        }
        String a = sb.toString();
        sb.reverse();
        System.out.println(a + " " + sb);
        return a.equals(sb.toString());
    }
}
