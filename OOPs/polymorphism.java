package OOPs;

public class polymorphism{
    public static void main(String[] args) {
            // method overloading
        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(8, 2));
        // System.out.println(calc.sum(8, 2, 5));
        // System.out.println(calc.sum((float)8.5, (float)1.5, (float)5.0));
            // method overriding
        deer d = new deer();
        d.eat();        
    }
}
      // method overloading
class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
    float sum(float a, float b, float c){
        return a+b+c;
    }
}
        // method overriding
class Animal {
    void eat(){
        System.out.println("eats anything");
    }
}

class deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}