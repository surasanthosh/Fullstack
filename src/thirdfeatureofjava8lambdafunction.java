interface v{
    void demo();
}
public class thirdfeatureofjava8lambdafunction {
    public static void main(String[] args) {
        v obj=() -> System.out.println("hello world");     //-> (lambda)
        obj.demo();
    }
}