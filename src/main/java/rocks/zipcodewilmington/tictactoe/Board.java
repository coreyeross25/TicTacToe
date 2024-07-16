package rocks.zipcodewilmington.tictactoe;



public class Board {

    public int size = 3;
    public char[][] board;

    public Board(Character[][] matrix) {
        this.board = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                this.board[i][j] = matrix[i][j];
            }
        }
    }

    public String getWinner() {
        if (isWin('X')) {
            return "X";
        } else if (isWin('O')) {
            return "O";
        } else {
            return "";
        }
    }

    public boolean isInFavorOfX() {
        return isWin('X');
    }

    public boolean isInFavorOfO() {
        return isWin('O');
    }

    public boolean isTie() {
        return !isInFavorOfX() && !isInFavorOfO();
    }

    private boolean isWin(char player) {
        // this how we determine if the winner won horizontally
        for (int i = 0; i < size; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }
        // this is how i determine if someone won vertically
        for (int j = 0; j < size; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }
        // this is how we decide if someone won diagonally
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }
        return false;
    }
}


