class chatuser extends Thread{          //in build thread class
    String user;
    String[] message;
    chatuser(String user,String[] message){  //constructor
        this.user=user;
        this.message=message;
    }
    public void run(){                      //default run method for thread
        for(String msg:message) {
            System.out.println(user + ":" + msg);
            try{                            //exception handling
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
public class multithreadingexampleofall {
    public static void main(String[] args) {
       String[] user1msg={"hi","how are you","where are you"};  //array
       String[] user2msg={"hello","i am fine","im banglore"};

       Thread t1=new chatuser("lol",user1msg);    //creating two obj for one method
       Thread t2=new chatuser("lulu",user2msg);

       t1.start();                         //method call by obj name
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println(e);
        }
       t2.start();
    }
}