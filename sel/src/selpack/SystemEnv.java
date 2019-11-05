package selpack;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SystemEnv {

	public static void main(String[] args) throws Exception {

		String processingTime = "0 days: 0 hrs: 1 mins: 35 secs";
//		System.out.println(processingTime.replaceAll("[a-z]|\\s", ""));
		String a = processingTime.replaceAll("[a-z]|\\s", "");
		System.out.println("a is " + a);
		String[] arr = a.split(":");
		long milli = (Integer.parseInt(arr[1])*3600000)+(Integer.parseInt(arr[2])*60000)+(Integer.parseInt(arr[3])*1000);
		System.out.println(milli);
		
		long dbmilli = 95771;
		int dbmilli2 = (int) dbmilli/1000;
		System.out.println(((dbmilli)/1000)*1000);
		
		
		// (((((Integer.parseInt(validateSATS.getJobDetails(jobID).get(14)))+500)/1000)*1000)
		
		
        /*SimpleDateFormat sdf = new SimpleDateFormat("dd:hh:mm:ss");
        Date date = sdf.parse(a);
        System.out.println("date is " + date);
        long millis = date.getTime();
        System.out.println("processing time :" + a);
        System.out.println("Millis is " + millis);
*/        
		
		
//		String[] s = a.split(",|&|\\|");
//		
//		for (int i=0; i<s.length;i++) {
//			System.out.println(s[i].replaceAll("\\(|\\)", ""));
	//		a = a.replace(s[i].replaceAll("\\(|\\)", ""), "abc");
			
	//		StringBuffer sb = new StringBuffer(a.replace(s[i].replaceAll("\\(|\\)", ""), "abc"));
	//		StringBuffer sb = new StringBuffer(s[i].replaceAll("\\(|\\)", ""));

	//		System.out.println("after replacing "+s[i].replaceAll("\\(|\\)", "") + " with abc. New string is " + a );
		}
		
		
//		System.getenv("INFA_HOME");
//		System.out.println(System.getenv("INFA_HOME"));
//	      // gets the value of the specified environment variable "PATH"
////	      System.out.println("System.getenv("PATH")");
//	      System.out.println(System.getenv("PATH"));
//
//	      // gets the value of the specified environment variable "TEMP"
//	//      System.out.print("System.getenv("TEMP") = ");
//	      System.out.println(System.getenv("TEMP"));
//
//	      // gets the value of the specified environment variable "USERNAME"
//	  //    System.out.print("System.getenv("USERNAME") = ");
//	      System.out.println(System.getenv("USERNAME"));
	   }
	

