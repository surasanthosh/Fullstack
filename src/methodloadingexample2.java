class sum{
    void show(float a,float b){
        System.out.println(a+b);
    }
    void show(float a,float b,float c){
        System.out.println(a+b+c);
    }
}
public class methodloadingexample2 {
    public static void main(String[] args) {
        sum obj=new sum();
        obj.show(2, 3);
        obj.show(3,4,5);
    }
}
