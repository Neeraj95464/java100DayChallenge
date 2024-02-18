public class ArrayOperatorsNestedClass
{
    private int[] arry={1,2,3,4,1,5};
    private class statics{
        void calculateMean(){
            int sum=0;
            for (int i : arry) {
               sum+=i;
            }
            int mean=sum/arry.length;
            System.out.println("your Mean is "+ mean);
        }
}
    public static void main(String[] args) {
        ArrayOperatorsNestedClass s1=new ArrayOperatorsNestedClass();
        ArrayOperatorsNestedClass.statics s2=s1.new statics();
        s2.calculateMean();
    }
}
