import java.sql.Date;
import java.util.ArrayList;
import java.util.LinkedList;

public class FirstProblem {

    public void arrayListTime(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Date start = new Date(0);
        for (int i=0; i < 300000; i++) {
            arrayList.add(i);
        }
        Date end = new Date(0);
        long duration = end.getTime() - start.getTime();
        System.out.println("ArrayList: " + duration);
    }

    public void linkedListTime(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        Date start = new Date(0);
        for (int i=0; i < 300000; i++) {
            linkedList.add(i);
        }
        Date end = new Date(0);
        long duration = end.getTime() - start.getTime();
        System.out.println("LinkedList: " + duration);
    }
}