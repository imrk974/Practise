package selpack;

public class test {

	public static void main(String[] args) {
		String a = "8.12%";
		System.out.println(a.contains(".") ? a.replace("%", "") : a.replace("%", ".0"));   
	}

}
