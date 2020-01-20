package com.testvagrant.Subscription;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.testvagrant.utils.ReadPriceDetailsFromJson;

public class Subscriptionrate  extends ReadPriceDetailsFromJson {

	DailyRate rate;
	
	public Subscriptionrate() {
		rate = new DailyRate();
	}
	
	
	
	private static Map<String, Integer> numOfDays(Date startDate, Date endDate) {
		Map<String, Integer> daysCount = new HashMap<String, Integer>();
		Calendar firstDayofMonth = Calendar.getInstance();
		firstDayofMonth.setTime(startDate);

		Calendar lastDayOfMonth = Calendar.getInstance();
		lastDayOfMonth.setTime(endDate);

		int weekdays = 0;
		int saturday = 0;
		int sunday = 0;

		if (firstDayofMonth.getTimeInMillis() > lastDayOfMonth.getTimeInMillis()) {
			firstDayofMonth.setTime(endDate);
			lastDayOfMonth.setTime(startDate);
		}

		while (firstDayofMonth.getTimeInMillis() <= lastDayOfMonth.getTimeInMillis()) {
			if (firstDayofMonth.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY
					&& firstDayofMonth.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {

				weekdays++;
			} else if (firstDayofMonth.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
				saturday++;
			} else {
				sunday++;
			}

			firstDayofMonth.add(Calendar.DAY_OF_MONTH, 1);
		}
		daysCount.put("Weekdays", weekdays);
		daysCount.put("Saturday", saturday);
		daysCount.put("Sunday", sunday);

		return daysCount;
	}

	private double Weekdaysrate() {
		rate.setWeekdaysRate(weekdaysRate);
		return rate.getWeekdaysRate();
	}

	private double saturdayRate() {

		rate.saturdayRate(saturdayRate);
		return rate.getsaturdayRate();
	}

	private double sundayRate() {

		rate.setSundayRate(sundayRate);
		return rate.getSundayRate();
	}
	
	private double saturdayRate, sundayRate, weekdaysRate;
	
	public double finalSubscriptionChargeForAllPapers(List<String> papers) {
		int finalcharge = 0;
		for (int i =0; i < papers.size(); i++) {
			finalcharge += totalSubscriptionChargeforCurrentMonth(papers.get(i));
		}
		
		return finalcharge;
	}
	
	private double totalSubscriptionChargeforCurrentMonth(final String paperName) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String dateInString = "01-01-2020";
		String dateInString2 = "31-01-2020";
		Date startDate = null, endDate = null;
		try {
			startDate = sdf.parse(dateInString);
			endDate = sdf.parse(dateInString2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
				Map<String, Integer> finalPrice = populatePricedetails(paperName);
				weekdaysRate = finalPrice.get("weekdaysRate");
				saturdayRate = finalPrice.get("Saturdayrate");
				sundayRate = finalPrice.get("SundayRate");
				
				Map<String, Integer> numofDays = numOfDays(startDate, endDate);
				numofDays.get("Weekdays");
				numofDays.get("Saturday");
				numofDays.get("Sunday");
				return (Weekdaysrate() * numofDays.get("Weekdays"))
						+ (saturdayRate() * numofDays.get("Saturday"))
						+ (sundayRate() * numofDays.get("Sunday"));
		} catch (Exception e) {
			System.out.println(paperName +" newspaper price details not available.");
			return 0d;
		}
		
	}
}
