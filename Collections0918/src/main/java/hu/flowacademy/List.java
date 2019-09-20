package hu.flowacademy;

import java.util.Iterator;

public class List <T> {

    private static class Node <T> implements Iterator<T> {
        T value;
        int index;
        Node previousNode;
        Node nextNode;

        Node(T value, int index, Node previousNode, Node nextNode) {
            this.value = value;
            this.index = index;
            this.previousNode = previousNode;
            this.nextNode = nextNode;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public Node getPreviousNode() {
            return previousNode;
        }

        public void setPreviousNode(Node previousNode) {
            this.previousNode = previousNode;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }

        @Override
        public boolean hasNext() {
            return this.nextNode != null;
        }

        @Override
        public T next() {
            return (T) this.nextNode.value;
        }

       @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", index=" + index +
                    '}';
        }
    }

    private int size;
    private int index;
    private Node<T> actualNode;
    private Node<T> head;
    private Node<T> tail;

    List() {
        this.size = 0;
        this.index = 0;
        this.actualNode = null;
        this.head = null;
        this.tail = null;
    }

    private boolean isEmpty(){ return head == null; }

    void add(T value) {
        if (isEmpty()) {
            actualNode = new Node<T>(value, this.index, null, null);
            head = actualNode;
            tail = actualNode;
        } else {
            Node<T> newNode = new Node<>(value, this.index, actualNode, null);
            actualNode = newNode;
            actualNode.previousNode.nextNode = actualNode;
            tail = newNode;
        }
        size++;
        this.index++;
    }

    void addWithIndex(T value, int index){
        if (isEmpty() && index != 0 || index + 1 > size){
            throw new IllegalArgumentException("Hibás indexelés");
        } else {
            Node old = getNodeByIndex(index);
            Node<T> newNode = new Node<>(value, index , old.previousNode, old);
            old.previousNode.nextNode = newNode;
            old.setPreviousNode(newNode);
            for (int i = index; i < size; i++) {
                old = getNodeByIndex(i);
                old.setIndex(i + 1);
            }
        }
    }

    void remove(T value){
        if(isEmpty()){
            throw new IllegalArgumentException("Üres a lista.");
        }
        Node tmp = get(value);
        tmp.nextNode.previousNode = tmp.previousNode;
        tmp.previousNode.nextNode = tmp.nextNode;

    }

    boolean hasNext(T value){
        return get(value).hasNext();
    }

    private Node get(T value){
        Node tmp = head;
        for (int i = 0; i < size; i++) {
            if(tmp.value == value){
                return tmp;
            }
            tmp = tmp.nextNode;
        }
        throw new IllegalArgumentException("Nincs value");
    }

    private Node getNodeByIndex(int index){
        Node tmp = head;
        for (int i = 0; i < size; i++) {
            if(tmp.getIndex() == index){
                return tmp;
            }
            if(tmp.hasNext()) {
                tmp = tmp.nextNode;
            }
        }
        throw new IllegalArgumentException("Nincs ilyen index");
    }

    @Override
    public String toString() {
        return "List{" + printList() + '}';
    }

    private String printList() {
        Node tmp = head;
        StringBuilder str = new StringBuilder();
        while (tmp != null){
            str.append(tmp.value).append(" ");
            tmp = tmp.nextNode;
        }
        return str.toString();
    }
}
