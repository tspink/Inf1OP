package uk.ac.ed.inf.op.tests;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;

import org.junit.Test;

import uk.ac.ed.inf.op.model.Person;

public class TestPerson {

	@Test
	public void testFullName() {
		Person person = new Person("First", "Last", "email@address.com");
		assertEquals("First Last", person.getFullName());
	}

	@Test
	public void testFirstName() {
		Person person = new Person("First", "Last", "email@address.com");
		assertEquals("First", person.getFirstName());
		
		try {
			Person person1 = new Person("", "Last", "email@address.com");
			fail("An exception wasn't thrown for an invalid first name");
		} catch (InvalidParameterException ex) {
			
		}
	}

	@Test
	public void testLastName() {
		Person person = new Person("First", "Last", "email@address.com");
		assertEquals("Last", person.getLastName());

		try {
			Person person1 = new Person("First", "", "email@address.com");
			fail("An exception wasn't thrown for an invalid last name");
		} catch (Exception ex) {
			
		}
	}
	
	@Test
	public void testEmailAddress() {
		Person person1 = new Person("First", "Last", "email@address.com");
		assertEquals("email@address.com", person1.getEmailAddress());
		
		try {
			Person person = new Person("First", "Last", "");
			fail("An exception wasn't thrown for an invalid email address");
		} catch (InvalidParameterException ex) {
			
		}
		
		try {
			Person person = new Person("First", "Last", "email@address.");
			fail("An exception wasn't thrown for an invalid email address");
		} catch (InvalidParameterException ex) {
			
		}
		
		try {
			Person person = new Person("First", "Last", "email");
			fail("An exception wasn't thrown for an invalid email address");
		} catch (InvalidParameterException ex) {
			
		}
		
		try {
			Person person = new Person("First", "Last", "email@");
			fail("An exception wasn't thrown for an invalid email address");
		} catch (InvalidParameterException ex) {
			
		}
	}

}
