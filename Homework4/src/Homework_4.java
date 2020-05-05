import java.util.Scanner;

public class Homework_4 {
    public static void main(String[] args) {
        // 0 Data



        String[][] board = new String[6][6];
        setBoard(board);

        // 1 Get data
        Scanner chessInputScanner = new Scanner(System.in);

        boolean hasWinner = false;
        String winner = "";
        String currentPlayer = "w";

        while (!hasWinner) {
            System.out.println("Въведи текущ ред  (число)");
            int currentRow = Integer.parseInt(chessInputScanner.nextLine());
            System.out.println("Въведи текуща колона (число)");
            int currentCol = Integer.parseInt(chessInputScanner.nextLine());


            System.out.println("Въведи желан ред (число)");
            int desiredRow = Integer.parseInt(chessInputScanner.nextLine());
            System.out.println("Въведи желана колона (число)");

            int desiredCol = Integer.parseInt(chessInputScanner.nextLine());

            String currentFigure = board[currentRow][currentCol];
            String desiredFigure = board[desiredRow][desiredCol];

            if(desiredFigure.charAt(0)==currentPlayer.charAt(0)){
                System.out.println("Не може да поставите фигура в/у своя такава.");
                continue;          // Не може да поставите фигура в/у своя такава
            }

            if (desiredFigure.contains("K")) {
                hasWinner = true;
                winner = currentPlayer;
            } else {

                currentPlayer = currentPlayer.equals("w") ? "b" : "w";
            }
            board[desiredRow][desiredCol] = currentFigure;
            board[currentRow][currentCol] = "   ";

            printBoard(board);


        }
        System.out.println("The winner is: " + winner);

    }


    public static void setBoard(String[][] board) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                board[i][j] = "   ";
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < 6; j++) {
                board[i][j] = "   ";
            }
        }

        // Джуджета
        board[0][0] = "wDw";
        board[0][5] = "wDw";
        board[5][0] = "bDw";
        board[5][5] = "bDw";
        // Картечници
        board[0][4] = "wM";
        board[5][1] = "bM";
        // Магаре
        board[0][1] = "wD";
        board[5][4] = "bM";
        //Кралица
        board[0][2] = "wQ";
        board[5][2] = "bK";
        // Крал
        board[0][3] = "wK";
        board[5][3] = "bQ";

        printBoard(board);

    }

    private static void printBoard(String[][] board) {
        System.out.println(" **********************");
        System.out.println("│" + board[0][0] + "│" + board[0][1] + "│" + board[0][2] + "│" + board[0][3] + "│" + board[0][4] + "│" + board[0][5] + "│");
        System.out.println("=========================");
        System.out.println("│" + board[1][0] + "│" + board[1][1] + "│" + board[1][2] + "│" + board[1][3] + "│" + board[1][4] + "│" + board[1][5] + "│");
        System.out.println("=========================");
        System.out.println("│" + board[2][0] + "│" + board[2][1] + "│" + board[2][2] + "│" + board[2][3] + "│" + board[2][4] + "│" + board[2][5] + "│");
        System.out.println("=========================");
        System.out.println("│" + board[3][0] + "│" + board[3][1] + "│" + board[3][2] + "│" + board[3][3] + "│" + board[3][4] + "│" + board[3][5] + "│");
        System.out.println("=========================");
        System.out.println("│" + board[4][0] + "│" + board[4][1] + "│" + board[4][2] + "│" + board[4][3] + "│" + board[4][4] + "│" + board[4][5] + "│");
        System.out.println("=========================");
        System.out.println("│" + board[5][0] + "│" + board[5][1] + "│" + board[5][2] + "│" + board[5][3] + "│" + board[5][4] + "│" + board[5][5] + "│");
        System.out.println(" **********************");
    }
}

