class ii implements Runnable{
    String user;
    String[] message;
    ii(String user,String[] message){
        this.user=user;
        this.message=message;
    }
    public void run(){
        for(String msg:message) {
            System.out.println(user + ":" + msg);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
public class multithreadingofall {
    public static void main(String[] args) {
        String[] user1={"hi","how are you","bye"};
        String[] user2={"hello","fine","byee"};

        Runnable obj1=new ii("lol",user1);
        Runnable obj2=new ii("mol",user2);

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
    }
}