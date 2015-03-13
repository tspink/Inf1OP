package uk.ac.ed.inf.op.util;

import java.util.regex.Pattern;

public class EmailAddressValidator {
	public static boolean validEmailAddress(String emailAddress)
	{
		Pattern p = Pattern.compile("[a-z0-9]+\\@[a-z0-9]+(\\.[a-z0-9]+)*");
		return p.matcher(emailAddress).matches();
	}
}
