class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> group = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            // sorting the string
            char[] tempS = strs[i].toCharArray();
            Arrays.sort(tempS);
            String s = new String(tempS);

            // adding sorted string and their original string
            if(group.containsKey(s)){
                group.get(s).add(strs[i]);
            }else{
                List<String> g = new ArrayList<>();
                g.add(strs[i]);
                group.put(s, g);
            }
        }

        List<List<String>> res = new ArrayList<>();

        // iterating into map to collect the values
        for(Map.Entry<String, List<String>> e : group.entrySet()){
            res.add(e.getValue());
        }

        return res;
    }
}