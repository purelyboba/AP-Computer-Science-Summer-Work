import java.util.*;

class Main{
    public static int player;
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        
        player = 1;
        printRules();
        Board board = new Board();
        while(!board.lastStone()){
            board.printBoard();
            int[] input = getInput();
            board.takeStones(input[0], input[1]);
            changePlayer();
        }
        changePlayer();
        System.out.println("Player " + player + " wins!");
    }

    public static void printRules()
    {
        System.out.println("Rules: ");
        System.out.println("The game is played with 3 piles of stones.");
        System.out.println("The player who takes the last stone loses.");
        System.out.println();
    }

    public static void changePlayer() {
        if (player == 1) {
            player = 2;
        }
        else {
            player = 1;
        }
    }

    public static int[] getInput() {
        System.out.println("Player " + player + ": ");
        System.out.print("Enter the pile number: ");
        int pile = scanner.nextInt();
        System.out.print("Enter the number of stones: ");
        int stones = scanner.nextInt();
        System.out.println();
        int[] input = {pile, stones};
        return input;
    }
}