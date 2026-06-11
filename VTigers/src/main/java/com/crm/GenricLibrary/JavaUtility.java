package com.crm.GenricLibrary;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	
	public int generateRandom(int bound) {
		Random r=new Random();
		int value = r.nextInt(bound);
		return value;
	}
	
	public String getDateAndTime(String Pattern) {
		Calendar c = Calendar.getInstance();
		Date d = c.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat(Pattern);
		String value = sdf.format(d);
		return value;
	}

}
