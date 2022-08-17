package baitap1;

public class MyList<I extends Number> {
    public static void main(String[] args) {
        MyListTest<Integer> myList = new MyListTest<Integer>(10);
        myList.add(0, 3);
        myList.add(1, 4);
        System.out.println(myList);
        myList.remove(1);
        System.out.println(myList);
        myList.size();
        System.out.println(myList.size);
        myList.clone();
        System.out.println(myList.clone());
        System.out.println(myList.contains(1));

        System.out.println(myList.indexOf(2));
        System.out.println(myList.add(4));

    }
}
