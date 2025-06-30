import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class fifthfeatureofstreamapi {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        System.out.println(list);
        Stream s1=list.stream();
        s1.forEach(System.out::println);  //instead of this System.out.println();
        // s1.forEach(System.out::println);  //stream is only one time use not more than one
    }
}