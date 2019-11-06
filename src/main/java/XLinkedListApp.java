public class XLinkedListApp {
    public static void main(String[] args) {
        XLinkedList xl = new XLinkedList();
        xl.add(11);
        xl.add(33);
        xl.add(55);
        xl.add(77);
        xl.add(89);
        System.out.println(xl.toString());
        xl.remove(11);
        System.out.println(xl.toString());
        xl.delete(2);
        System.out.println(xl.toString());
        xl.revert();
        System.out.println(xl.toString());

        /*boolean found11 = xl.contains(11);
        boolean found33 = xl.contains(33);
        boolean found44 = xl.contains(44);
        System.out.println(found11); // true
        System.out.println(found33); // true
        System.out.println(found44); // false*/
    }
}

