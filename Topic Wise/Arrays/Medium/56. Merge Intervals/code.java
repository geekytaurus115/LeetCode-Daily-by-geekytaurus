class Solution {
    public int[][] merge(int[][] intervals) {
        
        //sorted on the basis of starting point
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        ArrayList<int[]> list = new ArrayList<>();
        
        for(int[] interval : intervals){
            if(list.size() == 0){
                list.add(interval);
            }else{
                int preInterval[] = list.get(list.size() - 1);
                if(interval[0] <= preInterval[1]){
                    preInterval[1] = Math.max(interval[1], preInterval[1]);
                }else{
                    list.add(interval);
                }
            }
        }
        
        return list.toArray(new int[list.size()][]);
        
    }
}
