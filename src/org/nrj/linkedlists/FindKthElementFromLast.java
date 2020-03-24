package org.nrj.linkedlists;

/**
 * @author TheDevelopersFun
 */
public class FindKthElementFromLast {

    //Simple Solution :  Count the number of elements n and then find the (n-k)th element.

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insertAtTheEnd(10);
        list.insertAtTheEnd(8);
        list.insertAtTheEnd(9);
        list.insertAtTheEnd(7);
        list.insertAtTheEnd(6);
        list.insertAtTheEnd(5);
        list.insertAtTheEnd(11);
//        list.insertAtTheEnd(25);

        int k=7;  // Size =7, K=6 : return 1st element.

        //n=6, k=3, Find 6-3= 3rd Element.

//        System.out.println(findKthelementFromLast(list, k));
        System.out.println(findKthelementFromLastOptimized(list, k));


    }

    private static String findKthelementFromLast(LinkedList list, int k) {
        int n = 1;
        if(list==null || list.head==null){
            return " Null List";
        }
        Node node = list.head;

        while (null!=node.next){
            n++;
            node=node.next;
        }

        if(k>n){
            return " K > n";
        }

        node = list.head;
        int counter = 1;
        while (counter<(n-k)){
            counter++;
            node=node.next;
        }

        return "Data : " + node.data;

        //System.out.println("length of linked list : " + n);
    }

    private static String findKthelementFromLastOptimized(LinkedList list, int k) {

        if(list==null || list.head==null){
            return " Null List";
        }

        Node firstNode = list.head;
        Node secondNode = list.head;


        while (k!=0){
            k--;
            if(secondNode!=null){
                secondNode=secondNode.next;
            }
        }

        if (secondNode==null){
            return "K is greater.";
        }

        while (secondNode.next!=null){
            firstNode=firstNode.next;
            secondNode=secondNode.next;
        }

        return "Data : " + firstNode.data;

        //System.out.println("length of linked list : " + n);
    }


}
