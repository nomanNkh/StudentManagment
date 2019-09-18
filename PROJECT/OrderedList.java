public abstract class OrderedList extends List {

    protected abstract int compare(Object obj1, Object obj2);

    public ListNode find (Object newData) {
        if(firstNode==null){
            return null;
        }
        else{
            ListNode currentNode = firstNode;

            while (currentNode != null){
                if (compare(currentNode.getData(),newData) == 0) {
                    return currentNode;
                }
                currentNode = currentNode.getNext();
            }
        }
        return null;
    }

    public ListNode remove (Object newData) {
        if(firstNode == null){
            return null;
        }
        else{
            ListNode currentNode = firstNode;
            ListNode removedNode = null;

            if(compare(newData,firstNode.getData())==0){
                removedNode = firstNode;
                firstNode = firstNode.getNext();
            }
            else {
                while (currentNode.getNext() != null) {
                    if (compare(newData, currentNode.getNext().getData()) == 0) {
                        removedNode = currentNode.getNext();
                        currentNode.setNext(currentNode.getNext().getNext());
                        break;
                    }
                    currentNode = currentNode.getNext();
                }
            }
            return removedNode;
        }
    }

    public boolean insert(Object newData) {
        if(find(newData) != null){
            return false;
        }
        else{
            if(firstNode == null){
                firstNode = new ListNode(newData,null);
            }
            else if(compare(newData,firstNode.getData())<0){
                ListNode newFirstNode = new ListNode(newData,firstNode);
                firstNode = newFirstNode;
            }
            else {
                ListNode currentNode = firstNode;
                while (currentNode.getNext() != null) {
                    if(compare(newData,currentNode.getNext().getData())<0){
                        ListNode newNode = new ListNode(newData,currentNode.getNext());
                        currentNode.setNext(newNode);
                        break;
                    }
                    currentNode = currentNode.getNext();
                }
                if(currentNode.getNext() == null) {
                    currentNode.setNext(new ListNode(newData, null));
                }
            }

            return true;
        }
    }

    @Override
    public void insertAtFront(Object newData){
        System.err.println("Please kindly insert new nodes using the insert(Object newData) method. Bitch");
    }

    @Override
    public void insertAtBack(Object newData){
        System.err.println("Please kindly insert new nodes using the insert(Object newData) method. Bitch");
    }
}
