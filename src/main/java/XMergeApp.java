public class XMergeApp {


    XLinkedList.XItem merge(XLinkedList x1, XLinkedList x2){
        XLinkedList.XItem current1=x1.getHead();
        XLinkedList.XItem current2=x2.getHead();
        XLinkedList.XItem head;
        XLinkedList.XItem current;

        if(current1.value<=current2.value){
            head=current1;
            current1=current1.next;
        }
        else{
            head=current2;
            current2=current2.next;
        }
        current=head;


        while(current1!=null && current2!=null){
            if(current1.value<=current2.value){
                current.next=current1;
                current1=current.next;
            }
            else{
                current.next=current2;
                current2=current2.next;
            }
            current=current.next;
        }


        while
        (current1!=null){
            current.next=current1;
            current1=current1.next;
            current=current.next;
        }
        while(current2!=null){
            current.next=current2;
            current2=current2.next;
            current=current.next;
        }

        return head;
    }
    /*private void print(XLinkedList.XItem merged){
        XLinkedList.XItem current=

    }*/

    public static void main(String[] args) {
        XMergeApp app=new XMergeApp();
        XLinkedList x1 = new XLinkedList();
        XLinkedList x2 = new XLinkedList();
        x1.add(1);
        x1.add(4);
        x1.add(5);
        x1.add(7);
        x1.add(9);
        x2.add(2);
        x2.add(3);
        x2.add(6);
        x2.add(8);
        XLinkedList.XItem merged = app.merge(x1, x2);
       // app.print(merged);
    }
}
