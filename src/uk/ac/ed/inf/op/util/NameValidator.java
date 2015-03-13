package uk.ac.ed.inf.op.util;

import java.util.regex.Pattern;

public class NameValidator {
	public static boolean validName(String name)
	{
		Pattern p = Pattern.compile("[a-zA-Z'-]+");
		return p.matcher(name).matches();
	}
}
