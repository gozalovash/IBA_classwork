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
        XItem item =current.next;
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
        XItem left=head;
        XItem right=head;
        int count=0;
        while(right.next!=null){
            count+=1;
            right=right.next;
        }
        for(int i=0; i<count/2; i++){
            int temp=left.value;
            left.value=right.value;
            right.value=temp;
        }
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

