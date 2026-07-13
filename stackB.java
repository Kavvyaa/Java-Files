import java.util.*;
public class stackB {

    static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class stack {
        // static ArrayList <Integer> list = new ArrayList<>();

        //     public boolean isEmpty(){
    //         return list.size() == 0;
    //     }

        //     public void push(int data){
    //         list.add(data);
    //     }

        //     public int pop(){
    //         int top = list.get(list.size()-1);
    //         list.remove(list.size()-1);
    //         return top;
    //     }

        //     public int peek(){
    //         return list.get(list.size()-1);
    //     }

        // static Node head = null;
    
        // public boolean isEmpty(){
        //     return head == null;
        // }

        // public void push(int data){
        //     Node newNode = new Node(data);
        //     if (isEmpty()) {
        //         head = newNode;
        //         return;
        //     }

        //     newNode.next = head;
        //     head = newNode;
        // }

        // public int pop(){
        //     if (isEmpty()) {
        //         return -1;
        //     }

        //     int top = head.data;
        //     head = head.next;
        //     return top;
        // }

        // public int peek(){
        //     if (isEmpty()) {
        //         return -1;
        //     }
        //     return head.data;
        // }
    }

    public static void pushAtBottom(Stack<Integer>s, int data){
        // base case
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static String reverseString(String str){
        Stack <Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        //to use jcf just add this line and all methods will be imported
        Stack <Integer> s = new Stack<>();
        // stack s = new stack();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // pushAtBottom(s, 4);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }

        // while (!s.isEmpty()) {
        //     System.out.println(s.peek());
        //     s.pop();
        // }
        String str = "kavya";
        System.out.println(reverseString(str));
    }
}
