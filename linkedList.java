public class linkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        //step 1:
        Node newNode = new Node(data);
        size++;
        //special case when ll is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }
        //step 2:
        newNode.next = head;
        //step 3:
        head = newNode;
    }

    public void addLast(int data){
        //step 1:
        Node newNode = new Node(data);
        size++;
        //special case when ll is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }
        //step 2:
        tail.next = newNode;
        //step 3:
        tail = newNode;
    }

    public void print(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+ " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addMid(int idx, int data){
        if (idx==0) {
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
        // i=idx-1
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        // special cases
        if(size==0){
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        else if(size ==1){
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        //special case
        if (size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        else if (size == 1) {
            int val = head.data;
            head=tail=null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size-2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int iterativeSearch(int key){
        Node temp = head;
        int idx = 0;
        while (temp != null) {
            if (temp.data == key) {
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    public int Helper(Node head, int key){
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = Helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx+1;
    }

    public int recursiveSearch(int key){
        return Helper(head, key);
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr!= null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void removeNthFromEnd(int n){
        int size = 0;
        Node temp = head;
        // calculate size
        while (temp!= null) {
            temp = temp.next;
            size++;
        }
        // head ko hi delete karna hai to use case.......
        if (size == n) {
            head = head.next;
            return;
        }
        int i=1;
        int iToFind = size-n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public Node findMid(){
        Node slow = head;
        Node fast = head;
        while (fast!= null && fast.next!= null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while(fast!= null && fast.next!= null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public void removeCycle(){
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }
        slow = head;
        Node prev = null;
        while (slow!= fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }
    
    private Node mid(Node head){
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next!= null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node merge(Node head1, Node head2){
        Node mergell = new Node(-1);
        Node temp = mergell;
        while (head1!= null && head2!=null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1!= null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next; 
        }

        while (head2!= null) {
            temp.next = head2;
            head2=head2.next;
            temp = temp.next; 
        }
        return mergell.next;
    }

    public Node mergeSort(Node head){
        // base case
        if (head == null || head.next == null) {
            return head;
        }
        // step 1 find mid
        Node mid = mid(head);
        // step 2 divide the linkedlist
        Node righthead = mid.next;
        mid.next = null;
        // step 3 sort left then right half
        Node newleft = mergeSort(head);
        Node newright = mergeSort(righthead);
        //step 4 merge both
        return merge(newleft, newright);

    }

    public void zigzag(){
        // to find mid
        Node slow = head;
        Node fast = head.next;
        while (fast!= null && fast.next!= null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        // to reverse ll second half
        Node curr = mid.next;
        mid.next = null;
        Node next;
        Node prev = null;
        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }         
        Node lefthead = head;
        Node righthead = prev;
        Node nextL, nextR;
        while (lefthead!= null && righthead!= null) {
            nextL = lefthead.next;
            lefthead.next = righthead;
            nextR = righthead.next;
            righthead.next = nextL;
            righthead = nextR;
            lefthead = nextL; 
        }
    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.addFirst(1);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addLast(5);
        ll.addLast(4);
        ll.print();
        ll.head = ll.mergeSort(ll.head);
        ll.print();
        ll.zigzag();
        ll.print();
        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = new Node(4);
        // head.next.next.next.next = temp;
        // // ll.print();
        // System.out.println(ll.isCycle());
        // ll.removeCycle();
        // System.out.println(ll.isCycle());
    }
}
