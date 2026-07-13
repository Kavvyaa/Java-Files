//import java.

public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();  // created a pen object named p1
        p1.setcolor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setcolor("Yellow");
        System.out.println(p1.getColor());

        Student s1 = new Student();
        Student s2 = new Student("kavya");
        Student s3 = new Student(123);

        Student s4 = new Student();
        s4.name = "Kavya";
        s4.roll = 123;
        s4.password = "abc";

        Student s5 = new Student(s4);
        s5.password = "xyz";


    }
}

class Pen {
    private String color ;
    private int tip;
 
           // getters
    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    } 

          // setters
    void setcolor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
    
}


class Student {
    String name;
    int roll;
    String password;

    Student(Student s4){
        this.name = s4.name;
        this.roll = s4.roll;
    }

    Student(){          // non - parameterised constructor
        System.out.println("Constructor is called ...");
    }
    Student(String name){      // parameterised constructor
        this.name = name;
    }
    Student(int roll){        // parameterised constructor
        this.roll= roll;
    }
}