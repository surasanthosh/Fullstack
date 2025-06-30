import java.nio.file.Files;
import java.nio.file.Paths;

public class file3method {
    public static void main(String[] args) {
        String a="3rdmethod.exe";
        try{
            System.out.println("file created successfully");
            Files.write(Paths.get(a),"hey ai".getBytes());
            System.out.println("data inserted");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
