import java.util.LinkedList;

public class collectionforlinkedlist {
    public static void main(String[] args) {
        LinkedList<String> veh=new LinkedList<>();
        veh.add("Black");
        veh.add("390cc");
        System.out.println(veh);
        veh.addFirst("Duke");
        System.out.println(veh);
        veh.addLast("AP24");
        System.out.println(veh);
        veh.removeLast();
        System.out.println(veh);
        veh.clear();
        System.out.println(veh);
    }
}