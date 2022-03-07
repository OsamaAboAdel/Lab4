package Assignments.Lab4;

/**
 ** Created by Ahmed Al masadi on 2/02/2022.
 */
public class R_3_15 {
    public boolean equals(CircularyLinkedList l1, CircularyLinkedList l2) {
        boolean b = false;
        if (l1.size() == l2.size()){
            int n = l1.size ();
            CircularyLinkedList.Node<E> n1 = l1.tail.getNext();
            CircularyLinkedList.Node<E> n2 = l2.tail.getNext();
            while (n != 0){
                if (l1.tail.getElemnt ().equals ( l2.tail.getElemnt () ) || n1.getElemnt().equals ( n2.getElemnt() ) ){
                    b = true;
                }
                else b=false;
                n1 = n1.getNext();
                n2 = n2.getNext();
                n--;
            }
        }return b;
    }
}
