class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>(); 
        HashMap <Integer,Integer> mpp = new HashMap<>();

        for (int [] match: matches){
            int win = match[0];
            int looser = match[1];

            mpp.put(looser, mpp.getOrDefault(looser,0)+1);

            if(!mpp.containsKey(win)){
                mpp.put(win,0);
            }
        }

        for(int it : mpp.keySet()){
            if(mpp.get(it) == 0) first.add(it);
            else if (mpp.get(it) == 1) second.add(it);
        }
        Collections.sort(first);
        Collections.sort(second);
        list.add(first);
        list.add(second);

        return list;
    }
}