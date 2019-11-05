package selpack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

public class CSVExecuter {

	static void sort(CSVRow colName) {
		try {
			FileReader fileReader = new FileReader(new File("C:\\RK\\Workspace\\sel\\src\\MATCH_Target_BD_Hive_Tgt.csv"));
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			ArrayList<CSVRow> csvRows = new ArrayList<CSVRow>();
			
			// 
			while ((line = bufferedReader.readLine()) != null) {
				line = line.replace(",", ", ");
				String[] csvRowArray = line.split(",");
				CSVRow csvRow = new CSVRow(csvRowArray[0], csvRowArray[1], csvRowArray[2], csvRowArray[3], csvRowArray[4], 
											csvRowArray[5], csvRowArray[6], csvRowArray[7], csvRowArray[8], csvRowArray[9], 
											csvRowArray[10],csvRowArray[11], csvRowArray[12], csvRowArray[13], csvRowArray[14],
											csvRowArray[15],csvRowArray[16],csvRowArray[17],csvRowArray[18],csvRowArray[19],
											csvRowArray[20],csvRowArray[21],csvRowArray[22],csvRowArray[23]);
				csvRows.add(csvRow);
			}
			
			fileReader.close();
			
			// Sort rows of csv 
			Collections.sort(csvRows);
			
			// Write sorted values into another file
			FileWriter writer = new FileWriter("C:\\RK\\Workspace\\sel\\src\\new_sorted.csv", true);
			for(CSVRow csvRow : csvRows){
	            writer.write(csvRow.toString());
	            writer.write("\r\n");   // write new line
			}
            writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		
	}

}
