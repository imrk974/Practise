package com.testvagrant.Subscription;

public class NewsPaper extends DailyRate {

	private String newspapername;
	private DailyRate rate;
	
	public String getNewspapername() {
		return newspapername;
	}
	public void setNewspapername(String newspapername) {
		this.newspapername = newspapername;
	}
	public DailyRate getRate() {
		return rate;
	}
	public void setRate(DailyRate rate) {
		this.rate = rate;
	}
	
	
}
