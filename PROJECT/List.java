public class List {
    protected ListNode firstNode;
    protected ListNode lastNode;
    protected String name;

    public List(String listName){
        firstNode = lastNode = null;
        name = listName;
    }
    public List(){
        this("List");
    }
    public void insertAtFront(Object newData){
        if(firstNode==null){
            firstNode = lastNode = new ListNode(newData,null);
        }
        else{
            ListNode newFirstNode = new ListNode(newData,firstNode);
            firstNode = newFirstNode;
        }
    }
    public void insertAtBack(Object newData){
        if(firstNode==null){
            firstNode = lastNode = new ListNode(newData,null);
        }
        else{
            ListNode newLastNode = new ListNode(newData,null);
            lastNode.setNext(newLastNode);
            lastNode = newLastNode;
        }
    }
    public Object removeFromFront() {
        if(firstNode==null){
            return null;
        }
        Object removedData = firstNode.getData();
        if (firstNode == lastNode){
            firstNode = lastNode = null;
        }
        else{
            firstNode = firstNode.getNext();
        }
        return removedData;
    }
    public Object removeFromBack(){
        if (firstNode==null) {
            return null;
        }
        Object removedData=lastNode.getData();
        if(firstNode==lastNode) {
            firstNode = lastNode = null;
        }
        else{
            ListNode current=firstNode;
            while (current.getNext()!=lastNode)
                current=current.getNext();
            lastNode=current;
            current.setNext(null);
        }
        return removedData;
    }
    public ListNode getFirst() {
        return firstNode;
    }
    public String toString(){
        String output = new String();
        ListNode current = firstNode;

        output = name + ":";
        while(current != null){
            output += " " + current.getData();
            current = current.getNext();
        }
        return output;
    }
}
