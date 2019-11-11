package com.hackerrank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
/*
 * The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.

You are given a date. You just need to write the method, , which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.

For example, if you are given the date , the method should return  as the day on that date.

image

Input Format

A single line of input containing the space separated month, day and year, respectively, in    format.

Constraints

Output Format

Output the correct day in capital letters.

Sample Input

08 05 2015
Sample Output

WEDNESDAY
Explanation

The day on August th  was WEDNESDAY.
 */
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
