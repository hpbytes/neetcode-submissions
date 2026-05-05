class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String , List<String>> m = new HashMap<>();
        for(String s:strs){
            char[] a = s.toCharArray();
            Arrays.sort(a);
            String s1 = String.valueOf(a);

            if(!m.containsKey(s1)){
                m.put(s1,new ArrayList<>());
            }
            m.get(s1).add(s);
        }
        return new ArrayList<>(m.values());
    }
}
