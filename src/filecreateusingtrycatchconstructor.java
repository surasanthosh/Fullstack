import java.io.FileOutputStream;
public class filecreateusingtrycatchconstructor {
    public static void main(String[] args) {
        try(FileOutputStream fos=new FileOutputStream("one.jpg")){
            System.out.println("Binary file created successfully");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}