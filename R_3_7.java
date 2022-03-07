package Assignments.Lab4;
/**
 * Created by ${*  Osama Abo Adel  *} on 1/2/2022.
 */
public class R_3_7 {
    public void addFirst(E ele){
        if (isEmpty()){
            tail=new CircularyLinkedList.Node<E>(ele,null);
            tail.setNext(tail);
        }
        else {

            tail.next=new CircularyLinkedList.Node<E>(ele,tail.getNext());
        }
    }

}
