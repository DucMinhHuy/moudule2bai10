package baitap2;
//import baitap1.MyList;

import java.util.LinkedList;
public class MyLinkedList1<E> extends LinkedList<E>{
    private Node head;
    private int numberNodes;
    private class Node{
        private Node next;
        private Object data;
        private Node(Object data){
            this.data=data;
        }
        private Object getData(){
            return this.data;
        }
    }
    MyLinkedList1(){}
    @Override
    public void add(int index,E elment){
        super.add(index,elment);
    }
    @Override
    public void addFirst(E e){
        super.addFirst(e);
    }
    @Override
    public void addLast(E e){
        super.addLast(e);
    }
    @Override
    public E remove(int index){
        return super.remove(index);
    }
    @Override
    public boolean remove(Object e){
        return super.remove(e);
    }
    @Override
    public int size(){
        return super.size();
    }
    @Override
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
//    @Override
//    public void ensureCapacity(int minCapacity){
//        super.ensureCapacity(minCapacity);
//    }
    public E get(int i){
        return super.get(i);
    }
}
