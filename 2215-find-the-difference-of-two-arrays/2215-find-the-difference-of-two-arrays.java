class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();

        HashSet<Integer> one = new HashSet<>();
        HashSet<Integer> two = new HashSet<>();
        
        for(int i : nums1){
            one.add(i);
        }
         for(int i : nums2){
            two.add(i);
        }

        for (int i : one){
            if(!two.contains(i)) first.add(i);
        }
        for (int i : two){
            if(!one.contains(i)) second.add(i);
        }
        list.add(first);
        list.add(second);
        return list;
    }
}