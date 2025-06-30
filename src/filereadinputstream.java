import java.io.FileInputStream;

public class filereadinputstream {
    public static void main(String[] args) {
        String a="abcd.txt";
        try(FileInputStream fis=new FileInputStream(a)){
            int character;
            while((character=fis.read())!=-1){
                System.out.println(character);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
