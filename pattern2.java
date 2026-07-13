import java.util.*;
public class pattern2 {
    public static void main(String[] args) {
    //   Scanner sc= new Scanner(System.in);
    //   System.out.println("Enter number :");
    //   int n = sc.nextInt();
    //   int nol = 1;
    //   int st = 1;
    //   int sp = 2 * n - 2;
    //   while (nol <= 2*n) {
    //     for (int i = 0; i < st; i++) {
    //         System.out.print("* ");
    //     }
    //     for (int i = 0; i < sp; i++) {
    //         System.out.print("  ");
    //     }
    //     for (int i = 0; i < st; i++) {
    //         System.out.print("* ");
    //     }
    //     if (nol<n) {
    //         st++;
    //         sp = sp-2;
    //     }
    //     else{
    //         st--;
    //         sp= sp+2;
    //     }
    //     System.out.println();
    //     nol ++;
    //   }
    int num[]={2, 4, 6, 8, 10};
    //int currsum =0;
    for (int i = 0; i < num.length; i++) {
        for (int j = i; j < num.length; j++) {
            for (int j2 = i; j2 <= j; j2++) {
                System.out.print(num[j2]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    }}