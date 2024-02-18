import java.util.Objects;

public class Person
{
    int age;
    String name;
    Person(int age,String name){
        this.age=age;
        this.name=name;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name,age);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Person)){
            return false;
        }
        Person per=(Person) obj;
        return per.name.equals(name) && per.age==age;
    }

    public static void main(String[] args) {
        Person p1=new Person(21,"Neeraj");
        Person p2=new Person(21,"Neeraj");
        System.out.println(p2.equals(p1));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
