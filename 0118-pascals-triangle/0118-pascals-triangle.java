class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for(int row = 1 ; row <= numRows ; row++){
            List<Integer> currentRow = new ArrayList<>();
            int ans = 1;
            for (int col = 1 ; col <= row ; col++){
                currentRow.add(ans);
                ans= ans * (row-col)/col;
            }
            triangle.add(currentRow);
        }
        return triangle ;
    }
}