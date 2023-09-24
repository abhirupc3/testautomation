package newPreperation.datastructure;

import java.util.LinkedList;

/*
 *  Java Program to Implement Singly Linked List
 */

import java.util.Scanner;

import collection.LinkedListImpl.Node;


public class linkedList_Reverse {

    public Node head;
    public Node tail;

    int size = 0;

    public void add(Object data) {
        Node current = head;
        Node temp = new Node(data);
        if (current == null) {
            head = temp;
            tail = head;
            size++;
            return;
        }
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(temp);
        size++;
    }

    public void add(Object data, int index) {
        Node current = head;
        Node temp = new Node(data);
        for (int y = 0; y < index; y++) {
            current = current.getNext();
        }
        temp.setNext(current.getNext());
        current.setNext(temp);
        size++;
    }

    public Object get(int index) {
        Node current = head;
        for (int y = 0; y < index; y++) {
            current = current.getNext();
        }

        return current.getData();
    }

    public static void main(String[] args) {
        LinkedList<String> li = new LinkedList<String>();
        linkedList_Reverse limp = new linkedList_Reverse();
        limp.add("Ab");
        limp.add("Ab12");
        limp.add("Ab123");
        limp.add("Ab12345");
        limp.add("Ab123456");
        //limp.remove(2);
        for (int i = 0; i < limp.size; i++) {
            System.out.println(limp.get(i));
        }
        System.out.println("After Reversal");
        limp.reverseList(limp);
        for (int i = 0; i < limp.size; i++) {
            System.out.println(limp.get(i));
        }
    }


    private void reverseList(linkedList_Reverse limp) {
        Node p = head;
        Node q = head;
        Node[] nArray = new Node[size];
        nArray[0] = head;
        for (int i = 1; i < size; i++) {
            nArray[i] = q.getNext();
            q = q.getNext();
        }
        int n = size;
        while (n > 0) {
            if (n == 1) {
                nArray[n - 1].setNext(null);
                head = nArray[size - 1];
                return;
            }
            nArray[n - 1].setNext(nArray[n - 2]);
            n--;
        }
        head = nArray[n - 1];
    }


    public class Node {
        public Object data;
        public Node next;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
