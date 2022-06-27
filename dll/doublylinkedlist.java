package dll;

public class doublylinkedlist {
    public static void main(String[] args) {
        dll mylist = new dll();
        mylist.addToTail(4);
        mylist.addToTail(5);
        mylist.addToTail(6);
        mylist.addToHead(3);
        mylist.addToHead(2);
        mylist.addToHead(1);
        mylist.deleteFromHead();
         mylist.deleteFromTail();
        mylist.printall();
        System.out.println("rev");
        mylist.printrev();
    }
}
