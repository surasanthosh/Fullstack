import java.io.FileOutputStream;
public class writeoutputsreamconstructor {
    public static void main(String[] args) {
        String a="abcd.txt";
        String content ="Hello how are you Banglore";
        try(FileOutputStream fos=new FileOutputStream(a)){
            byte[] bytes=content.getBytes();
            fos.write(bytes);
            System.out.println("Inserted successfully");
            fos.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}