class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> m = new HashMap();
        for(String i: strs){
            char[] a = i.toCharArray();
            Arrays.sort(a);

            String key = new String(a);
            if(!m.containsKey(key)){
                m.put(key,new ArrayList<>());
            }
            m.get(key).add(i);
        }
        return new ArrayList<>(m.values());
    }
}
