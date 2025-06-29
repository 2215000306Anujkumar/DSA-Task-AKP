class Solution {
    public void solveSudoku(char[][] board) {
        boolean ans = solve(board);
        return;
    }
    public static boolean solve(char[][] board){
        for(int i =0 ; i<board.length ; i++){
            for(int j=0 ; j<board.length ; j++){
                if(board[i][j]=='.'){
                    for(char c='1' ; c<='9' ; c++){
                        if(isvalid(board , i,j,c)){
                            //do
                            board[i][j]=c;
                            
                            //explore
                            if(solve(board)){
                                return true;
                            }
                            else{
                                //undo
                                board[i][j]='.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isvalid(char[][] board , int row , int col ,char c){
        // same row me char c kahi mile toh return false
        for(int i = 0; i<9 ; i++){
            if(board[row][i]==c) return false;
        }
        //same col me
        for(int i=0 ; i<9 ; i++){
            if(board[i][col]==c) return false;
        }
        //same 3x3 matrix me
        for(int i=0 ; i<9 ; i++){
            if(board[3*(row/3)+i/3][3*(col/3)+i%3]==c) return false;
        }
        return true;
    }
    
}