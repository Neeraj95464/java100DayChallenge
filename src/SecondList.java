import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SecondList
{
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        Collections.addAll(list,3,4,3,4,5,7,8,5,8,6);
        ArrayList<Integer> list1 =new ArrayList<>();
        Collections.addAll(list1,3,4,3,4,5,7,8,5,8,6,9,0);
        list.addAll(list1);
        for (Integer i : list) {
            System.out.print(" "+i);
        }
    }
}
