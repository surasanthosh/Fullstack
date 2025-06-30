import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class streamapiformap {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        Function<Integer,Integer> f=new Function<Integer, Integer>() {
           public Integer apply(Integer i){  //Function is a interface in this interface by default method is apply only
               return i*2;                   //map method is used for a performing a operations
           }
        };
        list.stream()
                .filter(i -> i%2==0)
                .map(f)
                .forEach(System.out::println);
    }
}
