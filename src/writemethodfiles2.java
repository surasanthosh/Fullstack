import java.io.File;
import java.io.FileWriter;
public class writemethodfiles2 {
    public static void main(String[] args)throws Exception {
        String a="abcd.txt";
        File file=new File(a);
        FileWriter writer=new FileWriter(file);
        writer.write("Hello developers ");
        writer.write("Banglore");
        System.out.println("Data inserted successfully");
        writer.close();
    }
}