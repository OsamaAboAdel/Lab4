package Assignments.Lab4;

/**
 * Created by Ahmed Al masadi on 2/02/2022.
 * */
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
