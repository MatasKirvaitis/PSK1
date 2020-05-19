package lt.vu.services;

public class DateTimeService {
    public String time(){
        return java.time.LocalTime.now().toString();
    }
    public String date(){
        return java.time.LocalDate.now().toString();
    }
}
