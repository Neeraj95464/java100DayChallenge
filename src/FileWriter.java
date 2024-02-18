public class FileWriter
{
    public static void main(String[] args) {
        String fileName="neerajJava.txt";
        try(java.io.FileWriter writer=new java.io.FileWriter(fileName)){
            writer.write("this is test text written by,Neeraj \n during prectice of java all advance concepts");
        }catch (Exception e){
            System.out.println("exception found "+e.getMessage());
        }
    }
}
