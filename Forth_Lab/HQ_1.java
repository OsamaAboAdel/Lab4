package Forth_Lab;

import java.util.Scanner;

public class HQ_1<E> {
    public static void main ( String[] args ) {
        Scanner in = new Scanner (System.in);
        HQ_1<String> t= new HQ_1<String> ();
        System.out.println(" 1 add first \n"+" 2 add last \n"+" 3 remove first \n"+" rotate  list \n");
        int choice=-1;
        while (choice!=0){
            System.out.print("your choice: ");
            choice=in.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("input name");
                    t.addFirst(in.next());
                    System.out.println("first= "+t.first()+
                            "\tlast= "+t.last()+"\tsize= "+t.Size());
                    break;
                case 2:
                    System.out.print("input name");
                    t.addLast(in.next());
                    System.out.println("first= "+t.first()+
                            "\tlast= "+t.last()+"\tsize= "+t.Size());
                    break;
                case 3:
                    System.out.println("deleted name= "+t.removeFirst());
                    System.out.println("first= "+t.first()+
                            "\tlast= "+t.last()+"\tsize= "+t.Size());
                    break;
                case 4:
                    t.rotate();
                    System.out.println("first= "+t.first()+
                            "\tlast= "+t.last()+"\tsize= "+t.Size());
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }




    private Node<E> tail=null;
    private int size = 0;

    public HQ_1() {
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int Size(){
        int x = 0;
        Node<E> n =tail;
        while (n != null){

            x++;
        }
        return size;
    }

    public E first(){
        if (isEmpty())return null;
        return tail.getNext().getElement();
    }

    public E last(){
        if (isEmpty())return null;
        return tail.getElement();
    }

//                                          Q1 Answer   //////////////////////////////////////////////////////
    public void addFirst(E e){
        if (isEmpty()){
            tail=new Node<E> (e,null);
            tail.setNext(tail);
        }
        else {
            tail.next= new Node<E> (e,tail.getNext());
            tail.setNext(tail.next);
        }
        size++;
    }

    public void addLast(E e){
        addFirst(e);
        tail=tail.getNext();
    }

    public E removeFirst(){
        if (isEmpty()) return null;
        Node<E> x=tail.getNext();
        if (x==tail)
            tail=null;
        else
            tail.setNext(x.getNext());
        size--;
        return x.getElement();
    }
    public void rotate(){
        if (tail != null)
            tail=tail.getNext();
    }


    private static class Node<E>{
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

//        public void setElement(E element) {
//            this.element = element;
//        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext( Node<E> next) {
            this.next = next;
        }
    }
}
