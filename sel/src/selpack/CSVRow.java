package selpack;

public class CSVRow implements Comparable<CSVRow> {

	static void sort(CSVRow columnName) {
		
	
	}
	String col1,col2, col3, col4, col5, col6, col7, col8, col9, col10, col11, col12, col13, col14, col15, col16, col17, col18, col19, col20, col21, col22, col23, col24;
		
	public CSVRow(String col1, String col2, String col3, String col4, String col5, String col6, String col7,
			String col8, String col9, String col10, String col11, String col12, String col13, String col14,
			String col15, String col16, String col17, String col18, String col19, String col20, String col21, 
			String col22, String col23, String col24) {
		super();
		this.col1 = col1;
		this.col2 = col2;
		this.col3 = col3;
		this.col4 = col4;
		this.col5 = col5;
		this.col6 = col6;
		this.col7 = col7;
		this.col8 = col8;
		this.col9 = col9;
		this.col10 = col10;
		this.col11 = col11;
		this.col12 = col12;
		this.col13 = col13;
		this.col14 = col14;
		this.col15 = col15;
		this.col16 = col16;
		this.col17 = col17;
		this.col18 = col18;
		this.col19 = col19;
		this.col20 = col20;
		this.col21 = col21;
		this.col22 = col22;
		this.col23 = col23;
		this.col24 = col24;
	}

	@Override
	public String toString() {
		return col1 + "," + col2 + "," + col3 + "," + col4 + "," + col5 + "," 
				+ col6 + "," + col7 + "," + col8 + "," + col9 + "," + col10 + "," 
				+ col11 + "," + col12 + "," + col13 + "," + col14 + "," + col15 + "," 
				+ col16 + "," + col17 + "," + col18 + "," + col19 + "," + col20 + "," 
				+ col21 + "," + col22 + "," + col23 + "," + col24;
	}
	CSVRow columnName;
	@Override
	public int compareTo(CSVRow o) {
		return columnName.compareTo(o.columnName);
	}
}
