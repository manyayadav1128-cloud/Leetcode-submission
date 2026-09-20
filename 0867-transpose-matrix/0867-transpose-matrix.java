class Solution {
    public int[][] transpose(int[][] matrix) {
        if (matrix == null || matrix.length ==0){
            return new int[0][0];
        }
        int totalRows = matrix.length;
        int totalcols =matrix[0].length;

        int newTotalRows = totalcols;
        int newTotalCols = totalRows;
        int ans[][] = new int [newTotalRows][newTotalCols];

        for(int i=0; i<totalRows; i++){
            for(int j=0; j<totalcols; j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
        }
        
} 