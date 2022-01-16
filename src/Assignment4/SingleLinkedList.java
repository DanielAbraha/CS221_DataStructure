package Assignment4;

public class SingleLinkedList<Integer> {
    /**Create a singly linked list for Integer number.
     Create a node structure to hold integer value.
     Then perform the following behaviors.
     a. void add( int item) {} - add node in the front
     b. int size() {} - return the number of nodes in the list
     c. boolean find(int item) {} - to check the value is in the list or not
     d. int max() – return the greatest integer number in the list
     e. int min() – return the smallest integer number in the list*/

        private static class Node<Integer> {
            // Data Fields
            private Integer value;
            private Node<Integer> next;

            // constructors
            private Node(Integer value) {
                this.value = value;
                this.next = null;
            }

            private Node(Integer value, Node<Integer> nodeRef) {
                this.value = value;
                this.next = nodeRef;
            }
            //getters and setters


            public Integer getValue() {
                return this.value;
            }

            public void setValue(Integer value) {
                this.value = value;
            }

            public void setNext(Node<Integer> nodeRef) {
                this.next = nodeRef;
            }
        }

        private Node<Integer> head = null;
        private int size = 0;

        public SingleLinkedList() {

        }

        //  b. int size() {} return the number of nodes in the list
        public int size() {
            return this.size;
        }

        // a. void add( int item) {} - add node in the front
        public void addFirst(Integer value) {
            Node<Integer> temp = new Node<Integer>(value, head);
            head = temp;
            size++;
        }
        // c. boolean find(int item) {} - to check the value is in the list or not

        // First we need to find getNode.
        private Node<Integer> getNode(int index) {
            Node<Integer> node = head;
            for (int i = 0; i < index && node != null; i++) {
                node = node.next;
            }
            return node;
        }

        // C find
        public boolean find(Integer item) {
            Node current = head;
            while (current != null) {

                if (current.value == item)
                    return true;
                current = current.next;
            }
            return false;
        }

        //d. int max() – return the greatest integer number in the list
        public int greatestNumber(){
            int max = (int)head.getValue();
            while(head!=null){
                if((int)head.value >max)
                    max=(int)head.value;
                head = head.next;
            }
            return max;
        }
        // e. int min() – return the smallest integer number in the list
        public int SmallestNumber(){
            int min = (int)head.getValue();
            while(head!=null){
                if((int)head.value < min)
                    min=(int)head.value;
                head = head.next;
            }
            return min;
        }
        public String toString(){
            Node<Integer>nodeRef = (Node<Integer>) head;
            StringBuilder result = new StringBuilder();
            while(nodeRef != null){
                result.append(nodeRef.value);
                if(nodeRef.next !=null){
                    result.append("==>");
                }
                nodeRef= nodeRef.next;
            }
            return result.toString();
        }
    }

