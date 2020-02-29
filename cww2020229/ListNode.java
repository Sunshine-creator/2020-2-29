package cww2020229;
 class Node{
     public   int data;
     public Node next =null;
     public Node(int data) {
         this.data = data;
     }
     //下一个节点的位置
 }
public class ListNode {
    private Node head = null;

    public void addFirst(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    public void addLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        Node tail = head;
        while (tail != null) {
            tail = tail.next;
        }
        tail.next = node;
    }

    public void display() {
        for (Node cur = head; cur != null; cur = cur.next) {
            System.out.println(cur.data + "");
        }
        System.out.println();
    }

    public int getsize() {
        int size = 0;
        for (Node cur = head; cur != null; cur = cur.next) {
            size++;
        }
        return size;
    }

    public boolean addIndex(int index, int data) {
        int size = getsize();
        if (index < 0 || index > size) {
            return false;//判断index是否有效
        }
        if (index == 0) {
            addFirst(data);
            return true;
        }
        if (index == size) {
            addLast(data);
            return true;
        }
        Node node = new Node(data);
        Node prev = getPos(index - 1);
        node.next = prev.next;
        prev.next = node;
        return true;
    }
    private Node getPos(int index) {
        Node cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur;
    }
    public  boolean contains(int key) {
        for (Node cur = head; cur != null; cur = cur.next) {
            if (cur.data == key) {
                return true;
            }
        }
        return false;
    }
    public void remove(int key){
         if(head.data == key){
             head = head.next;
             return;
         }
         Node prev =searchprev(key);
         prev.next= prev.next.next;
    }
    private   Node searchprev(int key) {
        for (Node cur = head; cur != null && cur.next != null; cur = cur.next) {
            if (cur.next.data == key) {
                return cur;
            }
        }
        return  null;
    }
    public  void removeAllkey(int key){

   }
   public void clear() {
        }
}









