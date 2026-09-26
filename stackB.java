import java.util.*;

import org.w3c.dom.Node;
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

    public static void stockSpan(int stocks[], int span[]){
        Stack <Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for (int i = 1; i < stocks.length; i++) {
            int currPrice = stocks[i];
            while (!s.isEmpty() && currPrice>stocks[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i+1;
            } else {
                int prevHigh = s.peek();
                span[i] = i-prevHigh;
            }
            s.push(i);
        }
    }

    public static void nextGrBrute(int arr[], int nextGre[]){
        for (int i = 0; i < arr.length; i++) {
            nextGre[i] = -1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]<arr[j]) {
                    nextGre[i] = arr[j];
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        //to use jcf just add the next line and all methods will be imported
        // Stack <Integer> s = new Stack<>();

        int arr[] = {6, 8, 0, 1, 3};
        int nextGr[] = new int[arr.length];
        nextGrBrute(arr, nextGr);
        for(int i=0; i<nextGr.length; i++){
            System.out.print(nextGr[i]+ " ");
        }
    }
}
