class Solution {
    public int[][] updateMatrix(int[][] mat) {
     int rows = mat.length;
     int cols = mat[0].length;
    int[][] result = new int[rows][cols];
     for(int i=0;i<rows;i++){
         for(int j=0;j<cols;j++){
             result[i][j]=Integer.MAX_VALUE;
          }
     }
      //first pass
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            if(mat[i][j]==0){
                result[i][j]=0;
         }
        else{
            if(i>0 && result[i-1][j]!=Integer.MAX_VALUE){
                result[i][j] = Math.min(result[i][j],result[i-1][j] + 1);
            }
            if(j>0 && result[i][j-1]!=Integer.MAX_VALUE){
            result[i][j] = Math.min(result[i][j],result[i][j-1] + 1);
         }
       }
    }
  }
      // second pass
    for(int i=rows-1;i>=0;i--){
       for(int j=cols-1;j>=0;j--){
          if(mat[i][j]!=0){
             if(i<rows-1 && result[i+1][j]!=Integer.MAX_VALUE){
                result[i][j] = Math.min(result[i][j],result[i+1][j] + 1);
            }
            if(j<cols-1 && result[i][j+1]!=Integer.MAX_VALUE){
              result[i][j] = Math.min(result[i][j],result[i][j+1] + 1);
            }
        }
    }
 }
return result;
    }
}