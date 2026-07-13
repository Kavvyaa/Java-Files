 package OOPs;

 public class keywords {
     public static void main(String[] args) {

        // ""static"" keyword
    student s1 = new student();
    s1.schoolName = "NCIC";
    student s2 = new student();
    System.out.println(s2.schoolName);
      // ""super""" keyword
    horse h = new horse();
    System.out.println(h.color);
 }
 }
     // ""static""" keyword
class student {
    String name;
    int roll;
    static String schoolName;
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}
 
//      // ""super""" keyword
class animal {
    String color;
    animal(){
        System.out.println("Animal constructor is called ...");
    }
}

class horse extends animal{
    horse(){
        super.color  = "brown";
        System.out.println("Horse constructor is called ...");
    }

}
