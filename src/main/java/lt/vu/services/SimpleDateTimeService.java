package lt.vu.services;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateTimeService {
    public String time(){
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        return formatter.format(date);
    }

    public String date(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd");
        Date date = new Date();
        return formatter.format(date);
    }
}
