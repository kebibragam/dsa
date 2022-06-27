package sll;
public class singlylinkedlist {
    public static void main(String[] args) {
        sll mylist = new sll();
        mylist.addToHead(5);
        mylist.addToHead(4);
        mylist.addToHead(3);
        mylist.addToTail(6);
        mylist.addToHead(2);
        mylist.deleteFromHead();
        mylist.deleteFromTail();
        mylist.printall();
    }
}
