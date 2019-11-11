package com.hackerrank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class JavaDateAndTime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int date, month, year;
		String[] compdate = input.split(" ");
		date = Integer.parseInt(compdate[0]);
		month = Integer.parseInt(compdate[1]);
		year = Integer.parseInt(compdate[2]);
		String inputDate = date + "/"+month+"/"+year;
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date(23/11/2020));
		try {
			Date dateformat = new SimpleDateFormat("MM/dd/yy").parse(inputDate);
			String dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(dateformat);
			System.out.println(dayOfWeek.toUpperCase());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		sc.close();
	}

}
