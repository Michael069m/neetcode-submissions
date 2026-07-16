class Solution {

    public String encode(List<String> strs) {
        // if(strs.size() == 1) return strs[0];
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str);
            sb.append("michael");
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        // String[] arr = str.split("michael");
        List<String> list = new ArrayList<>();
        int j = 0;
        for(int i = 0 ; i < str.length() - 6 ; i++){
            System.out.println(str.substring(i,i+7));
            if(str.substring(i,i+7).equals("michael")){
                list.add(str.substring(j,i));
                j=i+7;
                i=j-1;
            }
        }
        // if(str.equals("michael")){
        //     list.add("");
        // }
        // list.remove(list.size()-1);
        return list;
    }
}
