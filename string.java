import java.util.*;
public class string {
    public static void printLetters(String str){
        for (int i = 0; i < str.length(); i++) {
        str.charAt(i);
    }
}

public static boolean palindrome(String str){
    for (int i = 0; i < str.length()/2; i++) {
        if (str.charAt(i) == str.charAt(str.length()-i-1)) {
            return true;
        }
    }
    return false;
}

public static float shortestPath(String str){
    int x = 0, y = 0;
    for (int i = 0; i < str.length(); i++) {
        int dir = str.charAt(i);
        if(dir == 'S'){
            y--;
        }
        else if (dir == 'N') {
            y++;
        }
        else if (dir == 'E') {
            x++;
        }
        else {
            x--;
        }
    }
    int X2 = x*x;
    int Y2 = y*y;
    return (float)Math.sqrt(X2+Y2);
}

public static void comparison(){
    String str = "Tony";
    String str2 = "Tony";
     String str3 = new String("Tony");

        if (str == str2) {
            System.out.println("Equal");
        }
        else {
            System.out.println("Not equal");
        }
          
        if (str.equals(str3)) {
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }
}

public static String substring(String str, int si,  int ei){
    String substr = "";
    for(int i=si ; i<=ei; i++){
        substr += str.charAt(i);
    }
    return substr;
}

public static void largest (String str[]){
    String largest = str[0];
    for (int i = 1; i < str.length; i++) {
        if (largest.compareTo(str[i])< 0) {
            largest = str[i];
        }
    }
    System.out.println(largest);
}

public static String uppercase(String str){
    StringBuilder sb = new StringBuilder("");
    char ch = Character.toUpperCase(str.charAt(0));
    sb.append(ch);
    for (int i = 1; i < str.length(); i++) {
        if (str.charAt(i) == ' ' && i<str.length()-1) {
            sb.append(str.charAt(i));
            // i++;
            sb.append(Character.toUpperCase(str.charAt(i+1)));
        }
        else {
            sb.append(str.charAt(i));
        }
    }
    return sb.toString();
}

public static String compress(String str){
    String newStr = "";
    for (int i = 0; i < str.length(); i++) {
        Integer count = 1;
        while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
            count++;
            i++;
        }
        newStr += str.charAt(i);
        if (count > 1) {
            newStr += count.toString();
        }
    }
    return newStr;
}

public static void compres(char chars[]) {
    String s = "";
    for(int i=0 ; i<chars.length ; i++){
        Integer count = 1;
        while(i<chars.length-1 && chars[i] == chars[i+1]){
            count++;
            i++;
        }
        s += chars[i];
    if(count>1){
        s += count.toString();
    }
}
for(int i=0 ; i<s.length() ; i++){
    chars[i] = s.charAt(i);
}

System.out.println(chars.length);

for(int i=0 ; i<chars.length ; i++){
    System.out.print(chars[i] + ",");
}
}


    public static void main(String[] args){
    char character [] = {'a', 'a', 'a'};
    // System.out.println(compress(str));
    compres(character);
  }
}
