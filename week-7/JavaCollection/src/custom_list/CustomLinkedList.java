package custom_list;

public class CustomLinkedList<T> {

    private LinkedListNode head;

    public CustomLinkedList() {
        // TODO
    }

    public void add(T element) {
        // 1. Ще създадаем нов Node елемент и ще му подпъхнем данни
        LinkedListNode newNode = new LinkedListNode(element);

        if(this.head == null) {
            this.head = newNode;
            this.head.index = 0;
        }
        else {
            LinkedListNode lastNode = this.head;
            while(lastNode.nextNode != null) {
                lastNode = lastNode.nextNode;
            }
            int newIndex = (lastNode.index + 1);
            newNode.index = newIndex;
            lastNode.nextNode = newNode;
        }

        // 2. Трябва да го закачим към предишния, с който в момента работя
    }

    public T get(int index) {

        LinkedListNode current = this.head;
        while (current.nextNode != null) {

            if(current.index == index) {
                return (T) current.data;
            }

            current = current.nextNode;
        }

        return null;
    }

    public void traverse() {

        LinkedListNode current = this.head;

        while(current.nextNode != null) {

            System.out.println("data ->" + current.data);
            System.out.println("index -> " + current.index);
            current = current.nextNode;
        }
    }

    private class LinkedListNode<T> {

        int index;
        T data;
        LinkedListNode nextNode;

        public LinkedListNode(T data) {

            this.data = data;
            this.nextNode = null;
        }
    }
}