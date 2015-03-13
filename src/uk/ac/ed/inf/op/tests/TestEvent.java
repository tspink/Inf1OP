package uk.ac.ed.inf.op.tests;

import static org.junit.Assert.*;

import java.util.Date;

import uk.ac.ed.inf.op.model.*;

import org.junit.Test;

public class TestEvent {

	@Test
	public void testDoubleAddGuest() throws Exception {
		Client client = new Client("First", "Last", "email@address.com");
		Guest guest = new Guest("First", "Last", "email@address.com");
		Event evt = new Event(new Date(), client);

		evt.addGuest(guest);
		
		try {
			evt.addGuest(guest);
			fail("Double adding guest failed to throw exception");
		} catch (Exception ex) {
			
		}
	}

}
