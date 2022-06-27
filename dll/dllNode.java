package dll;
public class dllNode {
    public int info;
    public dllNode next,prev;
    public dllNode(int el){
        this.info = el;
        this.next =this.prev= null; 
    }
    public dllNode(dllNode prev,int el,dllNode next){
        this.info = el;
        this.prev = prev;
        this.next = next; 
    }
}
