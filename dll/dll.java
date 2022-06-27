package dll;

public class dll {
    int el;
    dllNode head, tail;

    public dll() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void addToHead(int el) {
        
        if (isEmpty()) {
            head = new dllNode(null, el, head);
            tail = head;
        }else{
            head =new dllNode(null, el, head);
            head.next.prev=head;
        }
    }

    public void deleteFromHead() {
        head = head.next;
        head.prev = null;
        if (isEmpty()) {
            head = tail = null;
        }
    }

    public void addToTail(int el) {
        if (isEmpty()) {
            head = new dllNode(null, el, null);
            tail = head;
        } else {
            tail.next = new dllNode(tail, el, null);
            tail = tail.next;
        }
    }

    public void deleteFromTail() {
        if (isEmpty()) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void printall() {
        dllNode temp = head;
        while (temp != null) {
            System.out.print(temp.info + "->");
            temp = temp.next;
        }
    }
    public void printrev(){
        dllNode temp = tail;
        while (temp != null) {
            System.out.print(temp.info + "->");
            temp = temp.prev;
        }
    }

}
