public class OverloadingAdd
{
    int add(int a,int b){
        return a+b;
}
int add(int a,int b,int c){
        return a+b+c;
}
double add(double a,double b){
        return a+b;
}
    public static void main(String[] args) {
        OverloadingAdd obj=new OverloadingAdd();
        System.out.println("your 2 int add is "+  obj.add(2,1));
        System.out.println("your 3 int add is "+  obj.add(2,1,5));
        System.out.println("your 2 int add is "+  obj.add(2.5,1.7));
    }
}
