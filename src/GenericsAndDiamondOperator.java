import java.util.Scanner;

class GenericsAndDiamond<T>{
    private T thing;
    public T getThing(){
        return thing;
    }
    public void setThing(T thing){
        this.thing=thing;
    }

    public static void main(String[] args) {
        GenericsAndDiamond<String> obj=new GenericsAndDiamond<>();
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter some string ");
        String name=input.nextLine();
        obj.setThing(name);
        System.out.println(obj.getThing());
    }
}