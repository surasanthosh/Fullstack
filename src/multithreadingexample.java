class r extends Thread{
    public void run(){
        for(int i=0;i<3;i++) {
            System.out.println("red for stop");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
class t extends Thread{
    public void run(){
        for(int i=0;i<3;i++) {
            System.out.println("green for go");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
class u extends Thread{
    public void run(){
        for(int i=0;i<3;i++) {
            System.out.println("yellow for ready");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
public class multithreadingexample {
    public static void main(String[] args) {
        Thread obj1=new r();
        Thread obj2=new t();
        Thread obj3=new u();
        obj1.start();
        obj2.start();
        obj3.start();
    }
}