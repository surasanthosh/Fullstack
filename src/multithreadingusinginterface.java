class ee implements Runnable{
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println("java developers");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class rr implements Runnable{
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println("react developers");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
public class multithreadingusinginterface {
    public static void main(String[] args) {
        Runnable obj1=new ee();
        Runnable obj2=new rr();

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}