class abc{
    public void sum(int a,int b){
        System.out.println("Addition "+(a+b));  //without return
    }
    public int sub(int a,int b){
        return a-b;         //with return
    }
}
public class methodcalling {
    public static void main(String[] args) {
        abc obj=new abc();
        obj.sum(5,1);
        int result=obj.sub(5,1);
        System.out.println("subtraction "+result);

    }
}
