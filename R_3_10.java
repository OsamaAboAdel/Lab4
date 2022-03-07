package Assignments.Lab4;
/**
 * Created by ${*  Osama Abo Adel  *} on 1/2/2022.
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
