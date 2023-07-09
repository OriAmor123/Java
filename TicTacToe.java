import java.util.Scanner;
import java.util.Stack;

public class TicTacToe {
    public static void printBoard(String[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j!=2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i != 2) {
                System.out.println("----------");
            }
            
        }
    }

public static boolean numberInvalidator(int number, Stack<Integer> list) {
    if (number >=1 && number <= 9 && !list.contains(number)) {
        return true;
    }
    System.out.printf("%f is not valid or already used\n", number);
    return false;    
}

public static void assignSymbol(String[][] boardArr, int spot, String symbol) {
    switch (spot) {
        case 1:
            boardArr[2][0] = symbol;
            break;
        case 2:
            boardArr[2][1] = symbol;
            break;
        case 3:
            boardArr[2][2] = symbol;
            break;
        case 4:
            boardArr[1][0] = symbol;
            break;
        case 5:
            boardArr[1][1] = symbol;
            break;
        case 6:
            boardArr[1][2] = symbol;
            break;
        case 7:
            boardArr[0][0] = symbol;
            break;
        case 8:
            boardArr[0][1] = symbol;
            break;
        case 9:
            boardArr[0][2] = symbol;
            break;
    }
}
public static String doWon(String[][] boardArr, String symbol) {
    for (int i = 0; i < 3; i++) {     
        if (boardArr[i][0] != " " && boardArr[i][0] == boardArr[i][1] && boardArr[i][0] == boardArr[i][2]) { // * Checking rows
            return symbol;
        } 
        if ( boardArr[0][i] != " " && boardArr[0][i] == boardArr[1][i] && boardArr[0][i] == boardArr[2][i]) { // * Checking columns
            return symbol;
        } 
    }
    if (boardArr[0][0] != " " && boardArr[0][0] == boardArr[1][1] && boardArr[0][0] == boardArr[2][2]) { // * checking diagonal
        return symbol;
    }
    if (boardArr[2][0] != " " && boardArr[2][0] == boardArr[1][1] && boardArr[2][0] == boardArr[0][2]) { // * checking diagonal
        return symbol;
    }
    return "None";
}

public static String ticTacToe(String[][] boardArr, Scanner input) {
    Stack<Integer> recentUses = new Stack<>();
    String winner = "draw";
    String player;
    for (int i = 0; i < 9; i++, printBoard(boardArr)) {
        if (i % 2 == 0) {
            player = "X";
        } else {
            player = "O";
        }
    // * giving  instructions
        if (!recentUses.empty()) {
            System.out.println("Spots taken: " + recentUses);
        }
        System.out.printf("%s turn, enter a number between 1-9 like the numpad: ", player);
        
        // * letting the player to write a spot and ensure the spot is available
        int spot;
        do {
            spot = input.nextInt();
        } while (!numberInvalidator(spot, recentUses));

        assignSymbol(boardArr, spot, player);
        recentUses.push(spot);
        // * checks if the player won
        if (doWon(boardArr, player) == player) {
            winner = player;
            break;
        }
    }
    if (winner != "draw") {
        printBoard(boardArr);
    }
    return winner;
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] boardArr = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
        printBoard(boardArr);
        String winner = ticTacToe(boardArr, input);
        endGame(winner);
    }

    public static void endGame(String winner) {
        System.out.println("Game Over");
        switch (winner) {
            case "draw":
            System.out.println("No winners, the result is draw.");
            default:
            System.out.printf("%s is the winner, congratulations!!", winner);
        }
    }
}
