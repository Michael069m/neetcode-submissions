class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int i = 0;
        int j = 0;
        HashSet<Character> set = new HashSet<>();
        int ans = 0;
        while(j < n){
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            ans = Math.max(ans,j-i+1);
            set.add(s.charAt(j));
            j++;
        }
        return ans;
    }
}
