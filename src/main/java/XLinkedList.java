import java.util.StringJoiner;

public class XLinkedList {

    class XItem {
        int value;
        XItem next;

        public XItem(int value) {
            this.value = value;
        }
    }

    private XItem head;

    public XItem getHead() {
        return head;
    }

    public void add(int value) {
        XItem item = new XItem(value);
        if (head == null) {
            head = item;
        } else {
            XItem current = head;

            while (current.next != null) {
                current = current.next;
            }
            current.next = item;
        }
    }

    public boolean contains(int value) {
        XItem current=head;
        while(current!=null) {
            if (current.value == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public void delete(int position){
        if(head==null)
            return;
        XItem current=head;
        if(position==0)
            head=current.next;
        for(int i=0; i<position-2 ; i++){
            if(current==null)
                return;
            current=current.next;
        }
        current.next=current.next.next;
    }
    public void remove(int value){
        if(head==null)
            return;
        XItem temp=head;
        if(head.value==value){
            head=temp.next;
            return;
        }
        while(temp.next.value!=value){
            if(temp.next==null)
                return;
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
    public void revert(){
        if(head==null)
            return;

        XItem left=null;
        XItem current=head;
        XItem right=null;

        while(current!=null){
            right=current.next;//next=current.next
            current.next=left;//current.next=prev
            left=current;//prev=current
            current=right;//current=next
        }
        head=left;
    }

    public int lengthPrimitive(){
        int count=0;
        XItem current=head;
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }


    public int recursive_length(XItem curr){
        if(curr==null)
            return 0;
        return recursive_length(curr.next)+1;
    }
    public int length(){
        return recursive_length(head);
    }


    public int length_rec2(XItem curr, int c){
        if(curr==null)
            return c;
        return length_rec2(curr, c+1);
    }

    public int length2(){
        return length_rec2(head, 0);
    }
    public String toString() {
        StringJoiner sj = new StringJoiner(",");
        XItem current=head;
        while(current!=null){
            sj.add(String.valueOf(current.value));
            current=current.next;
        }
        return sj.toString();
    }

}

