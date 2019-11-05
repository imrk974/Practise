package com.hackerrank;

import java.security.Timestamp;

public class Drive {

	static int timeTakenBwStations(int stId, int destID, int[] timArray, int nitroUsed) {
		int timetaken = 0;
		if (nitroUsed==0) {
			timetaken = timArray[destID - stId - 1];
		} else {
			timetaken = timArray[destID - stId - 1] - nitroUsed;
		}
		
		return timetaken;
	}

	static int timeSpentWaitingForCommuters(int[][] commuters) {
		
		
		return 0;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
