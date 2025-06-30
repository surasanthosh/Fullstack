import java.util.ArrayList;
import java.util.List;

public class secondfeatureofjava8foreachmethod {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(5);
        list.add(8);
        /*System.out.println(list);
        System.out.println(list.get(3));
        for(int i=0;i<list.size();i++){    //extrenal loop
            System.out.println(i);
        }
        for(Integer i:list){                //external loop
            System.out.println(i);
        }*/
        list.forEach(i -> System.out.println(i));  //intrenal method for list or collections
    }
}
