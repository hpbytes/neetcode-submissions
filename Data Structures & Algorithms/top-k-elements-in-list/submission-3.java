class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer , Integer> m = new HashMap<>();
        int i = 1;
        for(int n : nums){
            if(!m.containsKey(n)){
                m.put(n, i);
            }
            else{
                m.put(n, m.get(n) + 1);
            }
        }

        List<Integer> list = new ArrayList<>(m.keySet());
        list.sort((a, b) -> m.get(b) - m.get(a));

        int[] ans = new int[k];
        for(int index = 0; index < k; index++) {
            ans[index] = list.get(index);
        }

        return ans;
    }
}