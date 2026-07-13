public class recursion {
    public static void printDec(int n){
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }
 
    public static void printInc(int n){
        if (n == 1) {
            System.out.print(n +" ");
            return;
        } 
        printInc(n-1);
        System.out.print(n + " ");
    }

    public static int factorial(int n){
        if (n == 0) {
            return 1;
        }
        //int fn = factorial(n-1);
        int fact = n*factorial(n-1);
        return fact;
    }

    public static int sum(int n){
        if (n == 0) {
            return 0;
        }
        int s = n + sum(n-1);
        return s;
    } 

    public static int fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fib = fibonacci(n-1) + fibonacci(n-2);
        return fib;
    }

    public static void hanoi(int n, char from, char to, char aux){
        if(n==1){
            System.out.println("Move disk from "+ from+ " to "+ to);
            return;
        }
        hanoi(n-1, from, aux, to);
        hanoi(1, from, aux, to);
        hanoi(n-1, aux, to, from);
    }

    public static boolean sorted(int arr[], int i){
        if (i == arr.length-1) {
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return sorted(arr, i+1);
    }

    public static int firstOccurence(int arr[], int key, int i){
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }

    public static int lastOccurence(int arr[], int key, int i){
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static int power(int x, int n){
        if (n == 0) {
            return 1;
        }
        int result = x * power(x, n-1);
        return result;
    }

    public static int optimisedPower(int x, int n){
        if (n == 0) {
            return 1;
        }
        int halfPower = optimisedPower(x, n/2);
        int power = halfPower*halfPower;
        if (n%2!=0) {
            power = x * power;
        }
        return power; 
    }

    public static int tilingProblem(int n){   // 2 * n [floor size]
        if (n == 1 || n == 0) {
            return 1;
        }
        // vertical
        int ver = tilingProblem(n-1);
        // horizontal
        int hor = tilingProblem(n-2);

        int totalWays = ver + hor;
        return totalWays;
    }

    public static void removeDuplicates(int index, String str, StringBuilder newStr, boolean map[]){
        if (index == str.length()) {
            System.out.println(newStr);
            return;
        } 
        char currChar = str.charAt(index);
        if (map[currChar-'a'] == true) {
            removeDuplicates(index+1, str, newStr, map);
        }
        else {
            map[currChar - 'a'] = true;
            removeDuplicates(index, str, newStr.append(currChar), map);
        }
    }

        public static int friendsPairing(int n){
            if (n == 1 || n == 2) {
                return n;
            }
            int single = friendsPairing(n-1);
            int pair = friendsPairing(n-1) * friendsPairing(n-2);
            int totalWays = single + pair;
            return totalWays;
        }

    public static void main(String[] args) {
        //    String str = "apnacollege";
        //    removeDuplicates(0, str, new StringBuilder(""), new boolean[26]);
        System.out.println(fibonacci(7));
        hanoi(3, 'A', 'B', 'C');
    }
}
