import java.util.Scanner;

class type
{
    public static void main(String[] args) {
        int y;
        System.out.print("enter year: ");
        Scanner sc = new Scanner (System.in);
        y = sc.nextInt();
        System.out.println("Year :" +y );

        System.out.println(((Object)y).getClass().getName());

        //     if ((y % 4 == 0 && (y%100 != 0||(y%100==0 && y % 400 == 0)))) {
    //         System.out.println("leap year");
    //     }
    //     else
    //     System.out.println("NO LEAP YEAR"); 
    //     System.out.println("Enter number");
    //     Scanner sc = new Scanner (System.in);
    //     int n = sc.nextInt();
    //     if (n > 0) {
    //         System.out.println("Positive Number");
    //     } else {
    //         System.out.println("Negative Number");
    // }
}
}