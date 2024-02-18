import java.util.List;

public class FiltringAndReducing
{
    public static void main(String[] args) {
        List<String> list= List.of("Neeraj ","is ","a ","boy ","cherry ","banana ","ubmralla ","Apple ");
        List<Integer> integer=List.of(1,2,3,4,5,6,7,8,9);

        list.stream().filter(s->s.endsWith("e")).forEach(s-> System.out.println(s));

        // above code has print issue means it is not printing the elements of list;

        System.out.println(integer.stream().reduce(0,(a,b)->a+b));
    }
}
