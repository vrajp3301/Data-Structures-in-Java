package Exercise;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node{
        private int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }


    private Node head;
    private Node tail;
    private int size;
    
    public void addLast(int item) {
        var node = new Node(item);

        if (head == null)
            head = tail = node;

        else {
            tail.next = node;
            tail = node;
        }

        size++;

    }

    public void addFirst(int item) {
        var node = new Node(item);

        if(isEmpty())
            head = tail = node;
        else {
            node.next = head;
            head = node;
        }

        size++;
    }

    private boolean isEmpty(){
        return head == null;
    }

    public int indexOf(int item) {
        int index = 0;
        var current = head;
        
        while (current != null){
            if(current.value == item) return index;
            current= current.next;
            index++;
        }
        return -1;

    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        if(isEmpty())
            throw new NoSuchElementException();
        
        if(head == tail)
            head = tail = null;
        else {               
            var firstNode = head.next;
            head.next = null;
            head = firstNode;

        }
        size--;
    }

    public void removeLast() {
        if(isEmpty())
            throw new NoSuchElementException();
        
        if(head == tail){
            head = tail = null;
            return;
        }

        var previous = getPrevious(tail);
        tail = previous;
        tail.next = null;
        
        size--;
    }

    private Node getPrevious(Node node) {
        var current = head;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
        
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        int[] array = new int[size];
        var current = head;
        var index = 0;
        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }

        return array;

    }
        
}
