package exp01;

public class TestDoublyLinkedList {
    public void TestTraverseList() {
        String[] wanted, got;
        // Mock data: {{i0,1,null,i1}{i1,2,i0,i2}{i2,3,i1,i3}{i3,4,i2,null}}
        DoublyLinkedList dLinkedList = new DoublyLinkedList();
        got = dLinkedList.TraverseList(); // traverse forward
        //wanted = {1,2,3,4}; // like an array
        wanted = new String[] {"1","2","3","4"};
    }
}