public class StudentRecordOrdList extends OrderedList{

    @Override
    protected int compare(Object obj1, Object obj2) {
        String student1 = ((StudentRecord) obj1).getName();
        String student2 = ((StudentRecord) obj2).getName();
        return student1.compareTo(student2);
    }

    @Override
    public String toString(){
        String output = new String();
        ListNode current = firstNode;

        output = name + ":";
        while(current != null){
            output += "\n\n" + current.getData();
            current = current.getNext();
        }
        return output;
    }}