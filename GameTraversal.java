import java.util.Scanner;

public class GameTraversal {

    static int N, M;
    static int[][] grid;
    static boolean[][] visited;
    static int destinationRow, destinationCol;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the grid dimensions
        N = sc.nextInt();
        M = sc.nextInt();
        
        // Initialize the grid
        grid = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        // Starting and destination positions
        int startRow = sc.nextInt();
        int startCol = sc.nextInt();
        destinationRow = sc.nextInt();
        destinationCol = sc.nextInt();
        
        // Initialize visited array
        visited = new boolean[N][M];
        
        // Call the recursive function
        int result = move(startRow, startCol, 0);
        
        // Output the result
        if (result == Integer.MAX_VALUE) {
            System.out.println("Impossible");
        } else {
            System.out.println(result);
        }
    }

    // Recursive function to simulate Nani's movement
    public static int move(int row, int col, int steps) {
        // Check if the current cell is out of bounds or already visited
        if (row < 0 || row >= N || col < 0 || col >= M || visited[row][col]) {
            return Integer.MAX_VALUE;  // Impossible to move
        }

        // Mark the current cell as visited
        visited[row][col] = true;

        // If the destination is reached, return the number of steps
        if (row == destinationRow && col == destinationCol) {
            return steps;
        }

        // Variable to track the minimum number of steps
        int minSteps = Integer.MAX_VALUE;

        // Explore the 4 possible directions (up, down, left, right)
        if (grid[row][col] == 1 || (grid[row][col] == 0 && hasLiftBelow(row, col))) {
            // Move up
            minSteps = Math.min(minSteps, move(row - 1, col, steps + 1));
            // Move down
            minSteps = Math.min(minSteps, move(row + 1, col, steps + 1));
            // Move left
            minSteps = Math.min(minSteps, move(row, col - 1, steps + 1));
            // Move right
            minSteps = Math.min(minSteps, move(row, col + 1, steps + 1));
        }

        // Backtrack by marking the current cell as unvisited before returning
        visited[row][col] = false;

        return minSteps;
    }

    // Function to check if the cell has a lift below it
    public static boolean hasLiftBelow(int row, int col) {
        return row < N - 1 && grid[row + 1][col] == 1;
    }
}
