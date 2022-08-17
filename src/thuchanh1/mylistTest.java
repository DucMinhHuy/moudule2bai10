package thuchanh1;

public class mylistTest {
    public static void main(String[] args) {
        mylist<Integer> listInteger=new mylist<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
//        listInteger.add(6);
//        listInteger.add(5);
//        listInteger.add(7);
        System.out.println("element 4 :"+listInteger.get(4));
        System.out.println("element 1:"+listInteger.get(1));
        System.out.println("element 2:"+listInteger.get(2));

//        listInteger.get(6);
//        System.out.println("element 6:"+listInteger.get(6));
//        listInteger.get(-1);
//        System.out.println("elment -1:"+listInteger.get(-1));
    }
}
