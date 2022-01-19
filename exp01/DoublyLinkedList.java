package exp01;

public class DoublyLinkedList {

    String[] list;

    public DoublyLinkedList();

    public DoublyLinkedList(String[] list) {
        this.list = list;
        // iteration over list
        // initialization of each node with data from list and references
        // between data items
        //{{i0,1,null,i1}{i1,2,i0,i2}{i2,3,i1,i3}{i3,4,i2,null}}
        // iN <- new
        int listLength = list.length;
        Node[] nodeList = new Node[listLength];
        int i = 0;
        for (String s: this.list) {
            Node n = new Node(s);
            nodeList[i] = n;
            i++;
        }
    }

    public String[] get() {
        return this.list;
    }

    public String[] TraverseList() {
        return list;
    }
}