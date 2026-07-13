public class doublell {
    public class Node {
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;;

    //add
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        newNode.prev = null;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        tail.next = newNode;
        newNode.next = null;
        newNode.prev = tail;
        tail = newNode;
    }

    public void addMid(int data, int idx){
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while (i < idx-1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
    }

    public int removeFirst(){
        if (head == null) {
            System.out.println("ll is empty");
            return -1;
        }
        if (size == 1) {
            int val = head.data;
            head=tail = null;
            size = 0;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public int removeLast(){
        if (head == null) {
            System.out.println("ll is empty");
            return -1;
        }
        if (size == 1) {
            int val = tail.data;
            head=tail = null;
            size = 0;
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }

    public void print(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+ " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;
        while (curr!= null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        doublell ll = new doublell();
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addLast(1);
        ll.print();
        ll.reverse();
        ll.print();
        // System.out.println(ll.removeLast());
        // System.out.println(ll.removeLast());
        // ll.print();
        // System.out.println(ll.size);
    }
}
