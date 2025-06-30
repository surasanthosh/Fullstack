interface sik{
    void add(int a,int b);
    void sub(int a,int b);
}
public class anonymousforinterface {
    public static void main(String[] args) {
        sik obj=new sik(){
            public void add(int a,int b){
                System.out.println(a+b);
            }
            public void sub(int a,int b){
                System.out.println(a-b);
            }
        };
        obj.add(1,2);
        obj.sub(2,3);
    }
}