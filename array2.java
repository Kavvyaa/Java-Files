import java.util.*;
public class array2 {
    
    // public static boolean search(int matrix[][], int key){
    //     for(int i=0 ; i<matrix.length ; i++){
    //         for(int j=0; j<matrix[0].length; j++){
    //             if (matrix[i][j] == key) {
    //                 return true;
    //                 // System.out.println("found at cell [" +i+" "+j+"]");
    //             }
    //         }
    //     }
    //     return false;
    // }
    public static void search(int matrix[][]){

       // int matrix[][]= new int[3][4];
        int n = matrix.length , m = matrix[0].length;
        Scanner sc= new Scanner(System.in);
        for(int i=0 ; i<n ; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0 ; i<n ; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void spiral(int matrix[][]){
     int startrow = 0;
     int startcol = 0;
     int endrow = matrix.length-1;
     int endcol = matrix[0].length-1;
        while(startcol<=endcol && startrow <= endrow){
            //top
            for(int j = startcol; j<= endcol ; j++){
                System.out.print(matrix[startrow][j]+ " ");
            }
            //right
            for (int i = startrow+1; i <= endrow; i++) {
                System.out.print(matrix[i][endcol]+ " ");
            }
            //bottom
            for (int j = endcol-1 ; j >= startcol; j--) {
                if (startrow == endrow) {
                    break;
                }
                System.out.print(matrix[endrow][j]+ " ");
            }
            //left
            for (int i = endrow-1; i >= startrow+1; i--) {
                if (startcol == endcol) {
                    break;
                }
                System.out.print(matrix[i][startcol]+ " ");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
        System.out.println();
     }

     public static int diagonal(int matrix[][]){
        // int sum = 0;
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[0].length; j++) {
        //         if (i == j) {
        //             sum +=matrix[i][j];
        //         }
        //          if ((i+j) == matrix.length-1) {
        //             sum += matrix[i][j];
        //         }
        //     }
        // }            
        // return sum;
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum+= matrix[i][i];
            if (i!=matrix.length-i-1) {
                sum+= matrix[i][matrix.length-i-1];
            }
        }
        return sum;
     }

     public static int linearSearch(int matrix[][], int key){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                   // System.out.println("Element Found");
                   return matrix[i][j];
                }
            }
        }
        return -1;
     }

     public static boolean staircaseSearch(int matrix[][], int key){
        int row = matrix.length-1;
        int col = 0;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("found key at [" + row + "," + col +"]");
                return true;
            }
           
            else if (key < matrix[row][col]) {
                row -- ;
            }
            else {
                col ++ ;
            }
        }
        System.out.println("key not found !");
        return false;
     }

     public static void frequency(int matrix[][], int key ){
        int flag = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    flag ++ ;
                }
            }
        }
        System.out.println(flag);
     }

     public static void sum(int matrix[][]){
        int sum = 0;
        for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[1][j]; 
        }
        System.out.println(sum);
     }

     public static void transpose(int matrix[][]){
       // int row = 4 , col = 4;
        int transpose[][] = new int [matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
             transpose[j][i] = matrix[i][j];
             System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][]= {{1, 2, 3, 4},
                         {5, 6, 7, 8},
                         {9, 10, 11, 12},
                         {13, 11, 15, 16}};
    transpose(matrix);
    }
}
