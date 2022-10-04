package VideoHw;

import java.util.Arrays;

public class WorkingWith2DArrays {
    public static void main(String[] args) {
        // 2d arrays are good when you want to have a grid
        char[][] board = new char[3][3];
        //loopint thorugh a 2d array
        for(int i = 0; i<3; i++){
            for(int j = 0; j < 3; j++){
                board[i][j] = '-';
            }
        }

        char [][] boardTwo = new char[][] {
                new char[]{'O','-','-'},
                new char[]{'O','-','-'},
                new char[]{'O','-','-'}
        };
        board[0][0] = 'O';
        board[1][0] = 'O';
        board[2][0] = 'O';
        // printing array
        System.out.println(Arrays.deepToString(board));
        System.out.println(Arrays.deepToString(boardTwo));
    }
}
