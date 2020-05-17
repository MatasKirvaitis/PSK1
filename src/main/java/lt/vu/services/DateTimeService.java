package lt.vu.services;

import javax.enterprise.inject.Specializes;

@Specializes
public class DateTimeService extends SimpleDateTimeService {
    public String time(){
        return java.time.LocalTime.now().toString();
    }
    public String date(){
        return java.time.LocalDate.now().toString();
    }
}
