import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class streamexampletimeanddate {
    public static void main(String[] args) {
        LocalDate d=LocalDate.now();
        System.out.println(d);
        LocalTime t=LocalTime.now();
        System.out.println(t);
        LocalTime tt=LocalTime.now(ZoneId.of("Africa/Nairobi")); //last feature of java8
        System.out.println(t);
        for(String i:ZoneId.getAvailableZoneIds()){
            System.out.println(i);
        }
    }
}