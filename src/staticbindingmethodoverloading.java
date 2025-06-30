class kk{
    public static int add(int a,int b){
       return a+b;
    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }
}
public class staticbindingmethodoverloading {
    public static void main(String[] args) {
        System.out.println(kk.add(20,30));
        System.out.println(kk.add(10,20,30));
    }
}