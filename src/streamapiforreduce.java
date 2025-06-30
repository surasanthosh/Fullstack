import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class streamapiforreduce {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        BinaryOperator<Integer> b=new BinaryOperator<Integer>() {
            public Integer apply(Integer i, Integer j) {
                return i+j;          //BinaryOperator is a interface in this interface by default method is apply only
            }                        //reduce method is used for a combine the operationslike sum, product, min, max
        };
        Integer sum=list.stream()
                .filter(i -> i%2==0)
                .map(i -> i*2)
                .reduce(0,b);
        System.out.println(sum);
    }
}