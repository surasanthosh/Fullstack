class outer5{                          //outer class
    void show(){
        class inner5{                     //method local inner class
            void display() {
                System.out.println("method local inner class");
            }
        }
        inner5 obj1=new inner5();
        obj1.display();
    }
}
public class methodlocalinnerclass {
    public static void main(String[] args) {
        outer5 obj=new outer5();
        obj.show();
    }
}