package org.nrj.linkedlists;

import static java.lang.System.out;

/**
 * LinkedList custom implementation with its operations :
 * 1. Insertion - Beginning, Mid and End
 * 2. Deletion - Beginning Node, Data Node(using Value) and End Node
 *
 */

public class LinkedList {

    public Node head = null;
    private int size = 0;

    public void insertAtTheBeginning(int value){
        size++;
        Node node = new Node(value);
        node.next = head;
        head = node;
    }

    public void insertAtTheEnd(int value){
        size++;
        Node node = new Node(value);
        if(null==head){
            head = node;
            return;
        }
        Node someNode = head;
        while(null!=someNode.next){
            someNode = someNode.next;
        }
        someNode.next = new Node(value);

    }


    public void printLinkedList(){

        Node node = head;

        while(node!=null){
            out.print(node.data + " ");
            node = node.next;
        }
        out.println();
    }

    public int size(){
        return this.size;
    }

}
