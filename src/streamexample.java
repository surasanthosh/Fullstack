import java.util.Arrays;
import java.util.List;

public class streamexample {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(19,12,31,40,19,15,6);
        list.stream().sorted().forEach(System.out::println);  //sorting elements(asecending order)
        list.stream().distinct().forEach(System.out::println); //removing duplicancy
        list.stream().skip(3).forEach(System.out::println); //deleting first 3 elements
        list.stream().limit(4).forEach(System.out::println); //first four elements
        long l=list.stream().count();  //counting of elements
        System.out.println(l);
    }
}