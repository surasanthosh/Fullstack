import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
public class fileCWRD {
    public static void main(String[] args) {
        String a="rat.txt";
        File file=new File(a);
        try{
            if(file.createNewFile()){
                System.out.println("file successfully created");
            }
            else{
                System.out.println("try again");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{
            FileWriter writer=new FileWriter(a);
            writer.write("hello developers");
            System.out.println("data inserted successfully");
            writer.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        try(FileReader reader=new FileReader(a)){
            int character;
            while((character=reader.read())!=-1){
                System.out.println((char)character);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        if(file.exists()){
            if(file.delete()){
                System.out.println("file deleted successfully");
            }
            else{
                System.out.println("file not deleted");
            }
        }
        else{
            System.out.println("file doesnot exists");
        }
    }
}
