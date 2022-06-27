package sll;

public class sll {
    sllNode head, tail;

    public void sll() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void addToHead(int el) {
        head = new sllNode(el, head);
        if (tail == null) {
            tail = head;
        }
    }
    public void deleteFromHead(){
        if(!isEmpty()){
            head=head.next;
        }else{
            head = tail = null;
        }
    }

    public void addToTail(int el) {
        if (!isEmpty()) {
            tail.next = new sllNode(el);
            tail = tail.next;
        } else {
            head = new sllNode(el);
            tail = head;
        }
    }
    public void deleteFromTail(){
        if(!isEmpty()){
            sllNode temp = head;
            while(temp != null){
                if(temp.next==tail){
                    tail=temp;
                    tail.next=null;
                }
                temp = temp.next;
            }
        }else{
            head = tail = null;
        }
    }

    public void printall() {
        sllNode temp = head;
        while (temp != null) {
            System.out.print(temp.info + " -> ");
            temp = temp.next;
        }
    }
}