class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        int minr = 0;
        int minc = 0;
        int maxr = matrix.length-1;
        int maxc = matrix[0].length-1;
        
        int count = 1;
        int total = matrix.length*matrix[0].length;
        
        while(count<=total){
            
            //upper wall traversal
            for(int i=minc;i<=maxc && count<=total;i++){
                ans.add(matrix[minr][i]);
                count++;
            }
            minr++;
            
            //right wall traversal
            for(int i=minr;i<=maxr && count<=total;i++){
                ans.add(matrix[i][maxc]);
                count++;
            }
            maxc--;
            
            //bottom wall traversal
            for(int i=maxc;i>=minc && count<=total;i--){
                ans.add(matrix[maxr][i]);
                count++;
            }
            maxr--;
            
            //left wall traversal
            for(int i=maxr;i>=minr && count<=total;i--){
                ans.add(matrix[i][minc]);
                count++;
            }
            minc++;
        }
        return ans;
    }
}
