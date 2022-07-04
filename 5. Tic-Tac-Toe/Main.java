import java.util.*;

class Main {
    public static boolean playerOne;
    public static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        Board board = new Board();
        showRules();
        board.printBoard();
        playerOne = true;
        for(int i = 0; i < 9; i++)
        {
            int player = getPlayer();
            int[] rowcol = getMove(player);
            int row = rowcol[0];
            int col = rowcol[1];
            board.makeMove(row, col, player);
            System.out.println();
            board.printBoard();
            if(board.checkForWinner())
            {
                System.out.println("Player " + player + " wins!");
                break;
            }
        }
        scanner.close();
    }

    public static void showRules() {
        System.out.println("Rules: ");
        System.out.println("Players alternate putting their marks on the board.");
        System.out.println("The first player is X and the second player is O.");
        System.out.println("The first player to get three in a row wins.");
        System.out.println("If the board is full and no one has three in a row, the game is a draw.");
        System.out.println();
    }

    public static int[] getMove(int player) {
        System.out.print("Player " + player + ": Enter your move (row): ");
        int[] move = new int[2];
        move[0] = scanner.nextInt();
        System.out.println();
        System.out.print("Player " + player + ": Enter your move (column): ");
        move[1] = scanner.nextInt();
        return move;
    }

    public static int getPlayer()
    {
        if(playerOne)
        {
            playerOne = false;
            return 1;
        }
        else
        {
            playerOne = true;
            return 2;
        }
    }
}