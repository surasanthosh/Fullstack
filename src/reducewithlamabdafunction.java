import java.util.Arrays;
import java.util.List;

public class reducewithlamabdafunction {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        Integer sum=list.stream().filter(i->i%2==0).map(i->i*2).reduce(0,(i,j)->i+j);
        System.out.println(sum);
    }
}