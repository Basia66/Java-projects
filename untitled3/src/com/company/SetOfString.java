package com.company;

public class SetOfString {
    static class Node {
        Node next;
        String value;

        public Node(String value) {
            this.value = value;
        }
    }

    Node head;
    Node tail;

    public SetOfString() { }

    public void Add(String newStr){
        Node node = new Node(newStr);
        if(head == null) {
            head = node;
        }
        else {
            tail.next = node;
        }
        tail = node;
    }

    public void Remove(String oldStr) {

    }
}
