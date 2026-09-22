class Solution {
    public List<Integer> getRow(int rowIndex) {
        List <Integer> currentRow = new ArrayList<>();
        long ans = 1;
        for (int i = 0 ; i <= rowIndex ; i++){
            currentRow.add((int)ans);
            ans=ans*(rowIndex - i )/(i+1);
        }
        return currentRow;
    }
}