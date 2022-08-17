package baitap1;
import java.util.ArrayList;
public class MyListTest<E> extends ArrayList<E> {
    int size =0;
    static final int DEFAULT_CAPACITY=10;
    Object elements[];

    public MyListTest(int size, Object[] elements) {
        this.size = size;
        this.elements = elements;
    }
    MyListTest(){}
    MyListTest(int DEFAULT_CAPACITY){
        elements=new Object[DEFAULT_CAPACITY];
    }
    @Override
    public void add(int index,E elment){
       super.add(index,elment);
    }
    @Override
    public E remove(int index){
       return super.remove(index);
    }
    @Override
    public int size(){
        return super.size();
    }
    public E clone(){
        return (E) super.clone();
    }
    @Override
    public boolean contains(Object o){
        return super.contains(o);
    }
    @Override
    public int indexOf(Object o){
        return super.indexOf(o);
    }
    @Override
    public boolean add(E o){
        return super.add(o);
    }
    @Override
    public void ensureCapacity(int minCapacity){
        super.ensureCapacity(minCapacity);
    }
    @Override
    public E get(int i){
        return super.get(i);
    }
    @Override
    public void clear(){
        super.clear();
    }
    //   public MyList(){
//       elements=new Object[DEFAULT_CAPACITY];
//    }
//    public MyList(int capacity){
//    }
//
//    public void add(int index ,E element){
//        elements[size++]=element;
//    }
//    public E remove(int index){
//       if(index<0&&index>=elements.length){
//           throw new IndexOutOfBoundsException("index :"+index+"size"+index);
//       }
//        return (E) elements[index];
//    }
//
}
