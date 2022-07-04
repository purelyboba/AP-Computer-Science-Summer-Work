public class Board {
    private static int pile1;
    private static int pile2;
    private static int pile3;

    public Board() {
        pile1 = 3;
        pile2 = 5;
        pile3 = 8;
    }

    public static int getPile1() {
        return pile1;
    }

    public static int getPile2() {
        return pile2;
    }

    public static int getPile3() {
        return pile3;
    }

    public void takeStones(int pile, int stones) {
        if (pile == 1) {
            pile1 -= stones;
        } 
        else if (pile == 2) {
            pile2 -= stones;
        } 
        else if (pile == 3) {
            pile3 -= stones;
        }
    }

    public boolean lastStone() {
        if(pile1 + pile2 + pile3 == 1) {
            return true;
        }
        else {
            return false;
        }
    }

    public void printBoard() {
        System.out.println("Pile 1: " + pile1);
        System.out.println("Pile 2: " + pile2);
        System.out.println("Pile 3: " + pile3);
        System.out.println();
    }
}
