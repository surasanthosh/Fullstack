import java.io.File;
import java.io.FileWriter;
public class file1method {
    public static void main(String[] args) {
        String a="1stmethod.txt";
        File file=new File(a);
        try {
            if (file.createNewFile()) {
                System.out.println("file successfully created");
            } else {
                System.out.println("try again");
            }
            FileWriter writer = new FileWriter(file);
            writer.write("hello TATA");
            System.out.println("Data inserted successfully");
            writer.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
