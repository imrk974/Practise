/**
 * 
 */
package selpack;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @author rakkumar
 *
 */
public class FileFetch implements Comparable<FileFetch>{
	
	static ArrayList<FileFetch> aList = new ArrayList<FileFetch>();
	String column1, column2, column3,column4;
	FileFetch(String column1, String column2, String column3, String column4) {
		this.column1 = column1;
		this.column2 = column2;
		this.column3 = column3;
		this.column4 = column4;
		
	}
	
	public int compareTo(FileFetch fm) {
		ArrayList<FileFetch> al = new ArrayList<>();
		al.add(aList.get(3));
		Collections.sort(al);
		
		return 1;
				
	}
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		try{
			   FileInputStream fstream = new FileInputStream("C:\\RK\\Workspace\\sel\\src\\MATCH_Target_BD_Hive_Tgt.csv");
			   BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			   String strLine;
			   /* read log line by line */
			   while ((strLine = br.readLine()) != null)   {
			     /* parse strLine to obtain what you want */
			   // System.out.println (strLine);
			    String[] arr = strLine.split(",");
			    String col1 = arr[0];
			    String col2 = arr[1];
			    String col3 = arr[2];
			    String col4 = arr[3];
			    aList.add(new FileFetch(col1, col2, col3, col4));
			    
				/*   if (strLine.contains("Named Entity Recognition engine version")) {
					   System.out.println(strLine.substring(strLine.length()-6, strLine.length()-1).replaceAll("\\[|\\]", ""));
					//   System.out.println(strLine.replaceAll(".*?(.?.?.?)?$", "$1"));
					//   System.out.println(strLine.replaceAll("\\s|=|\"|[a-zA-Z]|<|>|\\[|\\]", ""));
			   		} */	
			   }
			   fstream.close();
			} catch (Exception e) {
			     System.err.println("Error: " + e.getMessage());
			}
		Collections.sort(aList);
//		System.out.println(aList);
		System.out.println("\n++++++++++++++++++++++++++++\n\n");
		FileWriter fileWriter = new FileWriter("C:\\RK\\Workspace\\sel\\src\\sorted.csv");
		PrintWriter printWriter = new PrintWriter(fileWriter);
	    for (FileFetch line : aList){
	    	System.out.println(aList);
	    	printWriter.printf("%s" + "%n", line);
	    }
	    printWriter.close();

	}

}
