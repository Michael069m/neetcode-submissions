class Solution {
    public List<Integer> partitionLabels(String s) {
        int[][] freq = new int[26][2];
        for(int i = 0 ; i < 26 ; i ++){
            freq[i][0]=-1;
            freq[i][1]=-1;
        }

        for(int i = 0 ; i < s.length(); i ++){
            char ch = s.charAt(i);
            if(freq[ch-'a'][0] == -1){
                freq[ch-'a'][0] = i;
            }
            else {
                freq[ch-'a'][1] = i;
            }
        }
        int n = s.length();
        int i = 0;
        List<Integer> ans = new ArrayList<>();
        while(i<n){
            int j = i;
            int last = freq[s.charAt(j)-'a'][1];
            while(j<last){
                j++;
                last = Math.max(last,freq[s.charAt(j)-'a'][1]);
            }
            ans.add(j-i+1);
            i = ++j;
        }
        return ans;
    }
}
