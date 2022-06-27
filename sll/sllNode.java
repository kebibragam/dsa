package sll;
public class sllNode {
    public int info;
    public sllNode next;
    public sllNode(int el){
        this.info = el;
        this.next = null; 
    }
    public sllNode(int el,sllNode next){
        this.info = el;
        this.next = next; 
    }
}
