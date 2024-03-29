
import java.util.Scanner;

public class nQueens {
    static int[][] board;
    static int size;
    static boolean solveProblem(int col){
        if (col>size-1)
            return true;
        for (int i=0;i<size;i++){
            if(isSafe(i,col)){
                board[i][col]=1;
                if(solveProblem(col+1))
                    return true;
                board[i][col]=0;
            }
        }
        return false;
    }

    static boolean isSafe(int row,int col){
        int i,j;
        for(i=0;i<col;i++)
            if (board[row][i]==1)
                return false;
        for(i=row,j=col;(i>=0)&&(j>=0);i--,j--)
            if (board[i][j]==1)
                return false;
        for(i=row,j=col;(j>=0)&&(i<size);i++,j--)
            if (board[i][j]==1)
                return false;
        return true;
    }

    static void printBoard(){
        for (int i=0;i<size;i++) {
            System.out.print("\n");
            for (int j=0;j<size;j++) {
                System.out.print(board[i][j]+"\t");
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        size = in.nextInt();
        board = new int[size][size];
        int i,j;
        for(i=0;i<size;i++)
            for(j=0;j<size;j++)
                board[i][j]=0;
        if (solveProblem(0)) {
            printBoard();
        }
        else {
            System.out.println("No soln...");
        }
    }
}
