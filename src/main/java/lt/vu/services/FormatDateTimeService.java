package lt.vu.services;

import javax.enterprise.inject.Specializes;
import java.text.SimpleDateFormat;
import java.util.Date;

@Specializes
public class FormatDateTimeService extends DateTimeService{
    public String time(){
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        return formatter.format(date);
    }

    public String date(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd");
        Date date = new Date();
        return formatter.format(date);
    }
}
