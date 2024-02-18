import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClass
{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        java.util.Collections.addAll(list,2,4,6,84,32,6,8,9,5);
        System.out.println(list);
        java.util.Collections.sort(list);
        System.out.println(list);
        int max= java.util.Collections.max(list);
        int min= java.util.Collections.min(list);
        System.out.println("your max"+max);
        System.out.println("your min"+min);
        java.util.Collections.reverse(list);
        System.out.println(list);

        System.out.println("your unmodifiableList ");
//        ArrayList<Integer> unModifiabel= java.util.Collections.unmodifiableList(list);
//        System.out.println(unModifiabel);
    }
}
