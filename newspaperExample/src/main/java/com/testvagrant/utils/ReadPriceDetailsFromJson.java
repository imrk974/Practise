package com.testvagrant.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

public class ReadPriceDetailsFromJson {

	public static JSONObject priceDetails() {
		File file = new File("conf\\DailyPrice.json");
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		StringBuilder priceDetails = new StringBuilder();
		String s = null;
		try {
			while ((s = reader.readLine()) != null) {
				priceDetails.append(s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return new JSONObject(priceDetails.toString());
	}

	public Map<String, Integer> populatePricedetails(String paperName) {
		// TOI < weekdays:4, saturday:5, sunday:6 >
		Map<String, Integer> priceMap = new HashMap<String, Integer>();
		JSONObject price = priceDetails();

		JSONArray allpapersPrice = price.getJSONArray("priceDetails");
		for (int i = 0; i < allpapersPrice.length(); i++) {
			JSONObject js = allpapersPrice.getJSONObject(i);
			if (js.getString("paperName").equals(paperName)) {
				priceMap.put("weekdaysRate", js.getJSONObject("Param").getInt("weekdaysRate"));
				priceMap.put("Saturdayrate", js.getJSONObject("Param").getInt("Saturdayrate"));
				priceMap.put("SundayRate",js.getJSONObject("Param").getInt("SundayRate"));
				break;
			}
		}
		return priceMap;
		
	}
}
