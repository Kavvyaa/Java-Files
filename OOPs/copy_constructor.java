package OOPs;

public class copy_constructor{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Kavya";
        s1.roll = 234;
        s1.pwd = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80; 

        Student s2 = new Student(s1);  
        s2.pwd = "xwz";
        s1.marks[2] = 100;
        for(int i = 0; i<3 ; i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String pwd;
    int marks[];

      // copy constructor
    // Student(Student s1){      // shallow copy
    //     marks = new int [3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    Student(Student s1){     // deep copy
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < 3; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

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