package org.nrj.linkedlists;

import java.lang.System.*;

import static java.lang.System.out;

public class LinkedListRunner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtTheEnd(5);
        list.insertAtTheEnd(8);
        list.insertAtTheEnd(9);
        list.insertAtTheEnd(7);
        list.insertAtTheEnd(6);
        list.insertAtTheEnd(5);

        list.insertAtTheBeginning(3);
        list.insertAtTheBeginning(7);
        list.insertAtTheBeginning(10);
        list.insertAtTheBeginning(25);


        list.printLinkedList();
        out.println(list.head.data);

        out.println("List Size : " + list.size());



    }
}
