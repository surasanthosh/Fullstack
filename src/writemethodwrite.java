import java.nio.file.Files;
import java.nio.file.Paths;
public class writemethodwrite {
    public static void main(String[] args)throws Exception {
        String a="many.csv";
        String content="My name is mine";
        Files.write(Paths.get(a),content.getBytes());
        System.out.println("inserted successfully");
    }
}