package selpack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SortCSVFile {
    public static void main(String[] args) throws Exception {
     
     Scanner s =new Scanner(System.in);
     System.out.println("Enter the coloum number of the Primary key in the CSV file");
     int col=s.nextInt();
     
     getCSVfile(col); 
        
    }

    public static void getCSVfile(int colNumber) throws IOException{
     
     String sPath="C:\\RK\\Workspace\\sel\\src\\Tgt_m_caseConverter_Rt_hive.csv";
     String sPath2="C:\\RK\\Workspace\\sel\\src\\Tgt.csv";
     BufferedReader reader = new BufferedReader(new FileReader(sPath));
        Map<String, List<String>> map = new TreeMap<String, List<String>>();
        String line = "";//read header
//        System.out.println(line);
        while ((line = reader.readLine()) != null) {
            String key = getField(line,colNumber);
            System.out.println(key);
            List<String> l = map.get(key);
            if (l == null) {
                l = new LinkedList<String>();
                map.put(key, l);
            }
            l.add(line);

        }
        reader.close();
        FileWriter writer = new FileWriter(sPath2);
      
        for (List<String> list : map.values()) {
            for (String val : list) {
                writer.write(val);
                writer.write("\n");
            }
        }
        writer.close();
    }
    
    private static String getField(String line,int colNumber) {
        return line.split(",")[colNumber];// extract value you want to sort on
    }
}