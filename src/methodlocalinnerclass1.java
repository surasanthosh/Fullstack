class outer6{
    void show(){
        class inner6{
            void person(String name,int age){
                System.out.println("PERSON NAME & AGE: "+name+" "+age);
            }
            void dog(String name,String color){
                System.out.println("DOG NAME & COLOR: "+name+" "+color);
            }
        }
        inner6 obj=new inner6();
        obj.person("SANTHOSH",21);
        obj.dog("VIJAY","BLACK&WHITE");
    }
}
public class methodlocalinnerclass1 {
    public static void main(String[] args) {
        outer6 obj1=new outer6();
        obj1.show();
    }
}