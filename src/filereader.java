import java.io.FileReader;
public class filereader {
    public static void main(String[] args) {
        String a="abc.txt";
        try(FileReader reader=new FileReader(a)){
            int character;
            while((character=reader.read())!=-1){
                System.out.println((char)character);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}