package uk.ac.ed.inf.op.model;

import java.security.InvalidParameterException;

import uk.ac.ed.inf.op.util.EmailAddressValidator;
import uk.ac.ed.inf.op.util.NameValidator;

public class Person {
	private String firstName;
	private String lastName;
	private String emailAddress;
	
	public Person(String firstName, String lastName, String emailAddress) throws InvalidParameterException {
		if (!NameValidator.validName(firstName))
			throw new InvalidParameterException("First name is invalid");

		if (!NameValidator.validName(lastName))
			throw new InvalidParameterException("First name is invalid");

		if (!EmailAddressValidator.validEmailAddress(emailAddress))
			throw new InvalidParameterException("Email address is invalid");

		this.firstName = firstName;
		this.lastName = lastName;		
		this.emailAddress = emailAddress;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getFullName()
	{
		return firstName + " " + lastName;
	}
	
	public String getEmailAddress()
	{
		return emailAddress;
	}
}
