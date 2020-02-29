package cww2020229;
public class Test {
    private static void testAddFirst(){
        ListNode listnode = new ListNode();
        listnode.addFirst(1);
        listnode.addFirst(2);
        listnode.addFirst(3);
        listnode.addFirst(4);
        listnode.display();
    }
    private  static  void teatAddLast(){
        ListNode listnode = new ListNode();
        listnode.addFirst(1);
        listnode.addFirst(2);
        listnode.addFirst(3);
        listnode.addFirst(4);
        listnode.display();
    }
    public static void main(String[] args) {
                testAddFirst();
                teatAddLast();
    }
}
