class loading{
    public void sum(int a,int b){
        System.out.println(a+b);
    }
    public void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
}
public class Methodoverloading {
    public static void main(String[] args) {
        loading obj=new loading();
        obj.sum(1,2);
        obj.sum(1,2,3);
    }
}