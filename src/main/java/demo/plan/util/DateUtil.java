package demo.plan.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public static final String Time24 = "yyyy-MM-dd 00:00:00";
	public static final String Time28 = "yyyy-MM-dd 00:04:00";
	
	public static final String StartTime = "StartTime";
	public static final String EndTime = "EndTime";

	public static Date getNow() {
		return new Date();
	}
	
	public static Date getTomorrow() {
		return new Date(new Date().getTime() + 24*60*60*1000);
	}

	public static Date getPlanTime(String startOREnd, String timeFormat) throws ParseException {
		Date time = null;
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		if(startOREnd.equals(StartTime)) {
			String tmp = new SimpleDateFormat(timeFormat).format(getNow());
			time = df.parse(tmp);
		}
		
		if(startOREnd.equals(EndTime)) {
			String tmp = new SimpleDateFormat(timeFormat).format(getTomorrow());
			time = df.parse(tmp);
		}
		return time;
	}
}
