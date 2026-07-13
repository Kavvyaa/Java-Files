import java.util.*;
public class analyze {
    public static void main(String args[]){
        int count=0;
        int flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        String str = sc.nextLine();
        for (int i = 0; i <= str.length()-1; i++) {
            char ch = str.charAt(i);
            flag++;
            if (ch == ' ' || ch == str.length()-1) {
                count++;
            }
        }
        if (count ==0) {
            System.out.println("String is empty");
        }
        else{
            System.out.println("Number of words :" +count);
        }
        System.out.println("No of alphabets:" +flag);
    }
}
