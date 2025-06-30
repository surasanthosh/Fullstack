class f extends Thread{
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("red for stop");
            System.out.println("green for go");
            System.out.println("yellow for ready");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}
public class multithreadingclassthreaadexample {
    public static void main(String[] args) {
        Thread obj=new f();
        obj.start();
    }
}