package org.udemy.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckMatch {

	/*
	 * +"asdf 374 38-9367 sdfadfa 561 99 2286 xyz 8309869871"
	 * +"asdf this is fine xyz 123-38-9367" +"asdf this is fine xyz 000-38-9367"
	 * +"asdf this is fine xyz 123-00-9367" +"asdf this is fine xyz 123-38-0000"
	 * +"asdf this is fine xyz 923-38-9367"
	 * +"alksjdfkasdf 23 23 5 2345  qweqlkwer34523452"
	 * +"MalE F Female female feMale" +"mAlE" +"MaLE" +"maLe" +"MALe" +"feMAlE"
	 * +"MaLE" +"MAlE" +"FeMALe" +"mALe" +"MAlE" +"male";
	 */

	public static void main(String[] args) {
		String text = "asdf 374 38-9367 male xyz Male 123-38-9367 Male mALe feMALE femaLe FEmaLe FeMALE";
		// +"asdf 374 38-9367 sdfadfa 561 99 2286 xyz 8309869871"
		// +"asdf this is fine xyz 123-38-9367"
		// +"asdf this is fine xyz 000-38-9367"
		// +"asdf this is fine xyz 123-00-9367"
		// +"asdf this is fine xyz 123-38-0000"
		// +"asdf this is fine xyz 923-38-9367"
		// +"alksjdfkasdf 23 23 5 2345 qweqlkwer34523452"
		// +"MalE F Female female feMale"
		// +"mAlE F29 F M 29M"
		// +"MaLE"
		// +"maLe"
		// +"MALe"
		// +"feMAlE"
		// +"MaLE"
		// +"MAlE"
		// +"FeMALe"
		// +"mALe"
		// +"MAlE"
		// +"male";
		String patternString = "([mM][aA][lL][eE])|([fF][eE][mM][aA][lL][eE])|([\\s][mM|fF][\\s])";

		Pattern pattern = Pattern.compile(patternString);

		Matcher m = pattern.matcher(text);
		boolean matches = m.find();

		while (matches) {
			String matchedVale = m.group();
			int startIndx = m.start(0);
			List<String> resValues = new ArrayList<>();
			resValues.add(matchedVale);
			System.out.println(m.group());
			for (int i = 0; i < m.groupCount(); i++) {
				try {
					m.group(i);
					matches = m.find(m.end(i));
					System.out.println("Group count : " + i + " and Matches is : " + matches);
				} catch (Exception e) {
					
					System.out.println("No group matched");
				}
			}

			System.out.println(resValues);
		}

	}
}
