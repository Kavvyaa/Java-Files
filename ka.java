import java.util.*;

public class ka {
    public static void main (String[] args)
    {                 
        char ch;
        int a,b,c;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number A");
        a = sc.nextInt();   
        System.out.println("Enter number B");
        b = sc.nextInt(); 
        System.out.println("Enter operator:");
        ch = sc.next().charAt(0);
        switch (ch)
        {
            case '+' :   c = a + b;
                       System.out.println("Sum is :" + c);
                       break;
            case '-' :   c = a - b;
                       System.out.println("Difference is :" + c);
                       break;
            case '*' :   c = a * b;
                       System.out.println("Product is :" + c);
                       break;
            case '/' :   c = a / b;
                       System.out.println("Division is :" + c);
                       break;
            case '%' :   c = a % b;
                       System.out.println("Remainder is : " + c);
                       break;
            default :  System.out.println("Invalid Choice");
                       break;
        }
      }
    }

        
