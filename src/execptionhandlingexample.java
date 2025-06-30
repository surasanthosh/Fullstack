public class execptionhandlingexample {
    public static void main(String[] args) {
        int a=4;
        int b=2;
        try{
            int c=a/b;
            System.out.println(c);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array out of bound");
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("welcome");
        }
    }
}