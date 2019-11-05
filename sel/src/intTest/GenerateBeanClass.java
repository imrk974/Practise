/**
 * 
 */
package intTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.JSONObject;

/**
 * @author rakkumar
 *
 */
public class GenerateBeanClass {


	//String js = "{\"repoId\": 143,\"repoName\": \"DS_UNSTR_FS_DROWS\",\"dbTypeId\": \"32\",\"repoDbTypeId\": \"19\",\"ApplicationGroup\": \"1\"";
	JSONObject reqJson = new JSONObject();
	GenerateBeanClass genbean = null;
	
	String pathname = "C:\\RK\\report\\beans\\";
	File file = null;
	FileInputStream fs = null;
	FileOutputStream fo = null;
	FileWriter fw = null;
	
	// e.g - {"connectionDetails":{"User":"ilmadmin","SourceConnectionName":""}, "SecurityGroups":["Administrator"]}
	
	
	public void createBeanfile(String filename, JSONObject js) throws IOException {
		genbean = new GenerateBeanClass();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the json: \n");
		reqJson = new JSONObject(in.nextLine());
//		reqJson = js;
		file = new File(pathname + filename);
		boolean fvar = file.createNewFile();
	     if (fvar){
	          System.out.println("File has been created successfully");
	     }
		
		fs = new FileInputStream(file);
		genbean.writeTobeanFile();
		System.out.println("\nBean file created successfully\n");
		in.close();
	}
	
	public String checkdataType(String s) {
		
		if (s.matches("-?\\d+(\\.\\d+)?")) {
			return "Integer";
		} else if (s.matches("true") | s.matches("false")) {
			return "boolean";
		} else {
			return "String";
		}
		
	}
	
	public void writeTobeanFile() throws IOException {
		fo = new FileOutputStream(file);
		fw = new FileWriter(pathname + "bean.java");
        StringBuffer temp = new StringBuffer();
        boolean isJsonObject = false, isJsonArray = false;
        @SuppressWarnings("static-access")
		String[] param = reqJson.getNames(reqJson);
        int j = param.length;
        StringBuffer set = new StringBuffer();
        StringBuffer get = new StringBuffer();
        
        while(j > 0 ) 
        { 
        	try {
        		reqJson.getJSONObject(param[j-1]);
        		isJsonObject = true;
        	} catch (Exception e) {
        		isJsonObject = false;
        	}
        	
        	try {
        		reqJson.getJSONArray(param[j-1]);
        		isJsonArray = true;
        	} catch (Exception e) {
        		isJsonArray = false;
        	}
        	if (isJsonArray) {
        		temp.append("private " + param[j-1] + "Bean" + " " + param[j-1] + ";\n\n");
        	} else if (isJsonObject) {
        		temp.append("private " + param[j-1] + "Bean" + " " + param[j-1] + ";\n\n");
        	} else {
        		temp.append("private " + checkdataType(reqJson.get(param[j-1]).toString()) + " " + param[j-1] + ";\n\n");
        	}
        	
        	if (isJsonArray | isJsonObject) {
            	// Create getter and setter method
            	createGetter(param[j-1], (param[j-1] + "Bean").toString(), get);
            	createSetter(param[j-1], (param[j-1] + "Bean").toString().toString(), set);
        	} else {
            	// Create getter and setter method
            	createGetter(param[j-1], checkdataType(reqJson.get(param[j-1]).toString()), get);
            	createSetter(param[j-1], checkdataType(reqJson.get(param[j-1]).toString()), set);
        	}
        	
            j--;
        } 

        // Write variable declaration to file
        
        fw.write(temp.toString());
        
        // Write getter setter to the bean file
        fw.write(get.toString());
        fw.write(set.toString());
        
        //close the file 
        fw.close(); 
		
	}
	
	private void createSetter(String fieldName, String fieldType, StringBuffer setter){
		  
		  setter.append("public void").append(" set");
		  setter.append(fieldName);
		  setter.append("(final " + fieldType + " " + fieldName + ") {");
		  setter.append("\n\t this."+ fieldName + " = " + fieldName + ";");
		  setter.append("\n" + "}" + "\n");
		 }
		 
		 
	private void createGetter(String fieldName, String fieldType, StringBuffer getter){
	  // for boolean field method starts with "is" otherwise with "get"
	  getter.append("public " + fieldType).append((fieldType.equals("boolean")?" is" : " get") + fieldName + "(){");
	  getter.append("\n\treturn " + fieldName + ";");
	  getter.append("\n" + "}" + "\n");
	 }
		  
		  
	
	public static void main(String[] args) throws IOException {
		GenerateBeanClass genbean = new GenerateBeanClass();
		genbean.createBeanfile("updateConnBean.java", genbean.reqJson);

	}

}
