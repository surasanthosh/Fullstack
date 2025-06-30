import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class con implements Consumer<Integer> {    //fonctional interafce
    public void accept(Integer i){
        System.out.println(i);             //consumer is a interface in this interface by default method is accpet only
    }
}
public class fourthfeatureofjava8functionalinterface {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        Consumer<Integer> obj=new con();
        list.forEach(obj);
    }
}