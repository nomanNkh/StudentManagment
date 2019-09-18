public class IntegerOrdList extends OrderedList{

    @Override
    protected int compare(Object obj1, Object obj2){
        Integer integer1 = ((Integer) obj1).intValue();
        Integer integer2 = ((Integer) obj2).intValue();

        if(integer1<integer2) return -1;
        else if(integer1>integer2) return 1;
        else return 0;
    }
}
