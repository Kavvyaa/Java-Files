package OOPs;

public class inheritance {
    public static void main(String[] args) {
      fish shark = new fish();
       shark.eat();
       birds pihu = new birds();
       pihu.breath();
    }
}
    // base class
class animal {
    String color;

    void eat(){
        System.out.println("Eats !");
    }

    void breath(){
        System.out.println("Breathes !");
    }
    }
  
    class mammal extends animal {
        void walk(){
            System.out.println("Walks!");
        }
    }

    class fish extends animal {
        int fins;

        void swims(){
            System.out.println("Swims !");
        }
    }

    class birds extends animal {
        void fly(){
            System.out.println("Flies!");
        }
    }

    


