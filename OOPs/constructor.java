package OOPs;

public class constructor{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Kavya");
        Student s3 = new Student(123);
    }
}

class Student {
    String name;
    int roll;

    Student(){    // non-parameterised constructor
        System.out.println("constructor is called ...");
    }

    Student(String name){     // parameterised constructor
        this.name = name;
    }

    Student(int roll){     // parameterised constructor
        this.roll = roll;
    }
}