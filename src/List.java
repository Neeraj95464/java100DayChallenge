import java.util.ArrayList;

public class List
{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(2);
        list.add(6);

        for (Integer i : list) {
            System.out.print(" "+i);
        }
        list.remove(3);
        System.out.println();
        for (Integer i : list) {
            System.out.print(" "+i);
        }
        System.out.println();
        System.out.println("your array list size is "+list.size());
        System.out.println("your array list 4 index "+list.indexOf(4));
        System.out.println("your array list 5 setIndex "+list.set(3,5));
        System.out.println("your array list sze "+list.size());
        System.out.println("your array list 5 contains "+list.contains(5));
        System.out.println("your array list get 3 "+list.get(3));
        System.out.println();
        for (Integer i : list) {
            System.out.print(" "+i);
        }
         list.clear();
        System.out.println("Your list size now "+ list.size());
    }
}
