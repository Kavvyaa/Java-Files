package OOPs;

public class abstraction {
    public static void main(String[] args) {
    horse h = new horse();
    h.eat();
    h.walk();
    System.out.println(h.color);
    // chicken c =new chicken();
    // c.eat();
    // c.walk();
    mustang m = new mustang();
    }
}
 
    // Abstract class
abstract class animal {
    String color;
    animal(){
       // color = "brown";
       System.out.println("animal constructor");
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();    // Abstract method
}

class horse extends animal {
    horse(){
        System.out.println("horse constructor");
    }
    void changeColor(){
        color = "Dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class mustang extends horse{
    mustang(){
        System.out.println("Mustang constructor");
    }
}
class chicken extends animal{
    void changeColor(){
        color ="yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
