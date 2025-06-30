import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class streamapiforfilterfeature {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        Predicate<Integer> p=new Predicate<Integer>() {
           public boolean test(Integer i){
               return i%2==0;       //predicate is a interface in this interface by default method is test only
           }                        //filter method is used for the filter the data
        };
        list.stream()
                .filter(p)
                .forEach(System.out::println);
    }
}