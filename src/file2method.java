import java.io.FileOutputStream;

public class file2method {
    public static void main(String[] args) {
        String a="2ndmethod.csv";
        String content="Hello TATA STRIVE";
        try(FileOutputStream fos=new FileOutputStream(a)){
            System.out.println("file created successfully");
            byte[] bytes=content.getBytes();
            fos.write(bytes);
            System.out.println("Data Inserted successfully");
            fos.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
