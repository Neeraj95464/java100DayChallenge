import java.util.HashSet;
import java.util.Set;

public class SetClass
{
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(1);
        set.add(1);
        set.add(1);
        for (Integer i : set) {
            System.out.println(i);
        }
        System.out.println(set.size());
        System.out.println(set.isEmpty());
    }
}
