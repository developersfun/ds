package org.nrj.linkedlists;

/**
 * This class acts as a Node for Binary Tree.
 */
public class Node {

    public int data;
    public Node next;
    //public Node previous;

    Node(int data){
        this.data=data;
    }

    @Override
    public String toString() {
        return "[ Value ->" + this.data + " Next ->" + this.next + "]";
    }


}
