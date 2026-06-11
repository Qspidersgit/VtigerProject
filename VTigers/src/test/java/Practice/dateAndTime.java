package Practice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class dateAndTime {
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Date d = c.getTime();
		System.out.println(d);
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-YYYY  hh-mm-ss");
		String finaldate = sdf.format(d);
		System.out.println(finaldate);
	}

}
