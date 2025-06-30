class outing{
    void display(){
        class inning{
            void show(String gamename,String rating){
            System.out.println(gamename+" "+rating);
            }
        }
        inning obj=new inning();
        obj.show("pubg","five");
    }
}
public class methodlocal{
    public static void main(String[] args) {
        outing obj1=new outing();
        obj1.display();
    }
}