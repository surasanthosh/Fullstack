class Aa extends Thread{
    public void run(){
        for(int i=0;i<5;i++) {
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
class Bb extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("react developers");
            try {
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
public class multithreading {
    public static void main(String[] args) {
        Aa obj1=new Aa();
        Bb obj2=new Bb();
        obj1.start();
        obj2.start();
    }
}