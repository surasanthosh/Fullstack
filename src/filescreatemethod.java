import java.io.File;
public class filescreatemethod {
    public static void main(String[] args) throws Exception{
        String a="abc.txt";
        File file=new File(a);
        if(file.createNewFile()){
            System.out.println("File created succesfully");
        }
        else{
            System.out.println("Try again");
        }
    }
}