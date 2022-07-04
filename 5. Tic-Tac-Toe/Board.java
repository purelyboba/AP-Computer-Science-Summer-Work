public class Board {
    private int[][] board;
    
    public Board(){
        board = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                board[i][j] = 0;
            }
        }
    }

    public void printBoard(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(board[i][j] == 0){
                    System.out.print("- ");
                }
                else if(board[i][j] == 1){
                    System.out.print("O ");
                }
                else if(board[i][j] == 2){
                    System.out.print("X ");
                }
                else{
                    System.out.print("ERROR ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void makeMove(int row, int col, int player){
        board[row - 1][col - 1] = player;
    }

    public boolean checkForWinner()
    {
        //check rows
        for(int i = 0; i < 3; i++)
        {
            if(board[i][0] == board[i][1] && board[i][1] == board[i][2])
            {
                if(board[i][0] != 0)
                {
                    return true;
                }
            }
        }
        //check columns
        for(int i = 0; i < 3; i++)
        {
            if(board[0][i] == board[1][i] && board[1][i] == board[2][i])
            {
                if(board[0][i] != 0)
                {
                    return true;
                }
            }
        }
        //check diagonals
        if(board[0][0] == board[1][1] && board[1][1] == board[2][2])
        {
            if(board[0][0] != 0)
            {
                return true;
            }
        }
        if(board[0][2] == board[1][1] && board[1][1] == board[2][0])
        {
            if(board[0][2] != 0)
            {
                return true;
            }
        }
        return false;
    }
}
