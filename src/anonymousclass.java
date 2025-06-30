abstract class anonymous{
    public abstract void show();
}
public class anonymousclass {
    public static void main(String[] args) {
        anonymous obj=new anonymous()
        {
            public void show(){
                System.out.println("Anonymous class");
            }
        };
        obj.show();
    }
}