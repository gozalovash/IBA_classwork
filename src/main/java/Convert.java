public class Convert {
    public static void main(String[] args) {
        int s1=transform("123");
        int s2=transform("abd");
    }

    private static int  transform(String origin){
        int i1 = 0;
        try{
            i1=Integer.parseInt(origin);
            System.out.println(i1);
        }
        catch(Exception e){
            System.out.println("wrong");
        }

        return i1;
    }
}
