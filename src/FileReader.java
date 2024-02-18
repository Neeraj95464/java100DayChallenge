public class FileReader
{
    public static void main(String[] args) {
        String fileName="neerajJava.txt";
        try {
            java.io.FileReader reader=new java.io.FileReader(fileName);
            int character;
            while ((character=reader.read()) !=-1){
                System.out.print((char) character);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
