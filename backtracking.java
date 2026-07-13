public class backtracking {
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

    public static void changeArray(int arr[], int i, int val){
        if (i == arr.length) {
            printArray(arr);
            return;
        }
        arr[i] = val;
        changeArray(arr, i+1, val+1);
        arr[i]=val-2;
    }

    public static void findSubsets(String str, String ans, int i){
        //base case
        if (i == str.length()) {
            if (ans.length()==0) {
                System.out.println("NULL");
            }else{
                System.out.println(ans);
            }
            return;
        }
        // yes choice
        findSubsets(str, ans+str.charAt(i), i+1);
        //no choice
        findSubsets(str, ans, i+1);
    }

    public static void findPermutations(String str, String ans){
        //base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i)+str.substring(i+1);
            findPermutations(newStr, ans+curr);
        }
    }

    public static Boolean isSafe(char board[][], int row, int col){
        //vertical up
        for (int i = row-1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        //left diagonal up
        for (int i = row-1, j = col-1; i>=0 && j>=0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        //right diagonal up
        for (int i =row-1, j=col+1; i>=0 && j < board.length; i-- ,j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
    public static boolean nQueens(char board[][], int row){
        //base case
        if (row == board.length) {
            // printBoard(board);
            // count ++;
            return true;
        }
        for (int j = 0; j < board.length; j++) {
            if(isSafe(board, row, j)){
                board[row][j]='Q';
                if(nQueens(board, row+1)){
                    return true;
                }
                board[row][j]='x'; 
            }
        }
        return false;
    }

    public static void printBoard(char board[][]){
        System.out.println("--------chess board---------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static boolean isSudokuSafe(int sudoku[][], int row, int col, int digit){
        //colum
        for(int i=0; i<=8; i++){
            if(sudoku[i][col]== digit){
                return false;
            }
        }

        //row
        for(int j=0; j<=8; j++){
            if (sudoku[row][j]== digit) {
                return false;
            }
        }
        //grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }

    public static void printSudoku(int sudoku[][]){
        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j <= 8; j++) {
                System.out.print(sudoku[i][j]+ " ");
            }
        System.out.println();
        }
    }

    public static boolean sudokuSolver(int sudoku[][], int row, int col){
        // base case
        if(row == 9){
            return true;
        } 
        // int newRow = row, newCol =col+1;
        // if(row ==9){
        //     newRow =row+1;
        //     newCol =0;
        // }
        if(col == 9){
            return sudokuSolver(sudoku, row+1, 0);
        }
        if(sudoku[row][col]!=0){
            return sudokuSolver(sudoku, row, col+1);
        }
        for(int digit=1; digit<=9; digit++){
            if(isSudokuSafe(sudoku, row, col, digit)){
                sudoku[row][col] = digit;
                if(sudokuSolver(sudoku, row, col+1)){
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }

    static int count =0;
    public static void main(String[] args) {
        // int arr[] = new int[5];
        // String str = "abc";
        // int n=4;
        // char board[][] = new char[n][n];
        //initialize
        // for (int i = 0; i < board.length; i++) {
        //     for (int j = 0; j < board.length; j++) {
        //         board[i][j] = 'x';
        //     }
        // }
        // if(nQueens(board, 0)){
        //     System.out.println("Solution is possible");
        //     printBoard(board);
        // }
        // else{
        // System.out.println("No solution is possible");
        // }

        int sudoku [][] = {{0, 0, 8, 0, 0, 0, 0, 0, 0},
                           {4, 9, 0, 1, 5, 7, 0, 0, 2},
                           {0, 0, 3, 0, 0, 4, 1, 9, 0},
                           {1, 8, 5, 0, 6, 0, 0, 2, 0},
                           {0, 0, 0, 0, 2, 0, 0, 6, 0},
                           {9, 6, 0, 4, 0, 5, 3, 0, 0},
                           {0, 3, 0, 0, 7, 2, 0, 0, 4},
                           {0, 4, 9, 0, 3, 0, 0, 5, 7},
                           {8, 2, 7, 0, 0, 9, 0, 1, 3}};

        if (sudokuSolver(sudoku, 0, 0)) {
            System.out.println("Solution exists");
            printSudoku(sudoku);
        }
        else{
            System.out.println("Solution does not exist");
        }
    }
}
