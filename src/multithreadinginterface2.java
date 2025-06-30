class yy implements Runnable{
    public void run(){
        int n=50;
        for(int i=10;i<=n;i+=10){
            if (i < n) {
                System.out.println(i+" filling");
            }
            else if(i==n) {
                System.out.println(i+" filled");
            }
            else{
                System.out.println("try again");
            }
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
public class multithreadinginterface2 {
    public static void main(String[] args) {
        Runnable obj1=new yy();
        Thread t1=new Thread(obj1);
        t1.start();
    }
}
