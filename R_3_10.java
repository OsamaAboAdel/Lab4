package Assignments.Lab4;

/**
 ** Created by Ahmed Al masadi on 2/02/2022.
 */
public class R_3_10 {

    public int size(){
        int si=0;
        if (tail==null) return si;
        else si++;
        CircularyLinkedList.Node<E> x=tail;
        while (x.getNext()!=tail){
            si++;
            x=x.getNext();
        }
        return si;
    }
}
