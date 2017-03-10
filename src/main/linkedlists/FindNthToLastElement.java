package main.linkedlists;

import main.data_structures.SinglyLinkedList;

import java.util.LinkedList;

/**
 * Created by chq-keving on 3/6/2017.
 */
public class FindNthToLastElement {
    //Implement an algorithm to find the nth to last element of a singly linked list.

    public static SinglyLinkedList.Node findNth(SinglyLinkedList.Node head, int n) {
        if (head == null || n < 1) {
            return null;
        }
        SinglyLinkedList.Node p1 = head;
        SinglyLinkedList.Node p2 = head;
        //this loop is setting the p2 node to be n number of nodes from the start
        for (int j = 0; j < n - 1; ++j) {
            if (p2 == null) {
                return null;
            }
            p2 = p2.getNextRef();
        }
        //increment until the second node reaches the tail and then p1 is n nodes from the last node/element
        while (p2.getNextRef() != null) {
            p1 = p1.getNextRef();
            p2 = p2.getNextRef();
        }
        return p1;
    }

    public static SinglyLinkedList.Node findNthRecursive(SinglyLinkedList.Node head, int n) {
        //http://stackoverflow.com/questions/2598348/how-to-find-nth-element-from-the-end-of-a-singly-linked-list
        return null;
    }
}
