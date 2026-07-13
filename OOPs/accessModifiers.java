package OOPs;

public class accessModifiers {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("BLue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color = "Yellow";
        System.out.println(p1.color);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "Kavya";
        myAcc.setPassword("abcd");
        
       } 
    }    

class BankAccount {
    public String username;
    private String pwd;
    public void setPassword(String password){
        pwd = password;
    }
}
