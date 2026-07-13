//import java.util.*;
class funtion {

  public static void swap(int a, int b) {
    int t=a;
    a=b;
    b=t;
    System.out.println("value of a :" +a);
    
    System.out.println("value of b :" +b);
  }

  public static int fact(int n) {
    int f=1;
    for (int i = 1; i <= n; i++) {
         f = f*i;
         //System.out.println(f);
    }
    return f;
  }

  public static void bincoff(int n, int r){
    int fact_n= fact(n);
    int fat= fact(r);
    int fact_r= fact(n-r);
    int bincoff= fact_n/(fat*fact_r);
    System.out.println(bincoff);
  }

  public static int sum(int a, int b){
    int c = a+b;
    System.out.println(c);
    return c;
  }

  public static int sum(int a, int b, int d){
    int c = a+b+d;
    System.out.println(c);
    return c;
  }
  public static float sum(float a, float b){
    float c = a+b;
    System.out.println(c);
    return c;
  }

  public static boolean prime(int n){
    boolean isprime=true;
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n%i == 0) {
            isprime= false;
      }
    }
    return isprime;
  }

  public static void range(int n){
    for (int i = 1; i <=n; i++) {
      if(prime(i)){
        System.out.print(i +" ");
      }
    }
    System.out.println();
  }


  public static void binTodec(int bin) {
    int num=bin;
    int pow=0;
    int dec=0;
    while (bin>0) {
      int lastDigit = bin%10;
      dec = dec + (lastDigit*(int)Math.pow(2, pow));
      pow++;
      bin= bin/10;
    }
    System.out.println("decimal of "+ num + " = " + dec);
  }

  public static void decTobin(int dec){
    int bin=0;
    int pow=0;
    while(dec>0)
    {
      int r = dec%2;
      bin= bin+(r*(int)Math.pow(10, pow));
      dec = dec/2;
      pow++;
    }
    System.out.println(bin);
  }

  public static int average(int a, int b, int c){
    double average=(a+b+c)/3;
    System.out.println("Average : "+ average);
    return (int)average;
  }
  public static boolean isEven (int a) {
    if (a%2==0) {
      return true;
    }
      else {
        return false;
      }
    }

    public static int palindrome(int n){
      int s=0;
      int no=n;
      for (int i = n; n > 0; i=n/10) {
        int r=n%10;
        s=(s+r);
      }
      System.out.println(s);
        if (no==s) {
          System.out.println("Palindrome number");
        }
        else {
        System.out.println("Not a Palindrome number");
        }
        return n;
  
    }
     public static void main(String[] args) {
     System.out.println(isEven(254));
} 
}