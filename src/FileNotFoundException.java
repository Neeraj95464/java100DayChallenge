import java.util.Scanner;

public class FileNotFoundException
{
    // file file is not caseSenstive
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your file name ");
        String fileName=input.nextLine();
        try (java.io.FileReader reader=new java.io.FileReader(fileName)){
            int character;
            while ((character=reader.read()) !=-1){
                System.out.print((char) character);
            }
        }catch (java.io.FileNotFoundException fileNot){
            System.out.println("Error is "+fileNot.getMessage());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
