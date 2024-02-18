import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class TestCode {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        Collections.addAll(list, 2, 4, 6, 84, 32, 6, 8, 9, 5);

        System.out.println("Your unmodifiableList ");
        try {
            List<Integer> unmodi = Collections.unmodifiableList(list);
            System.out.println(unmodi);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
