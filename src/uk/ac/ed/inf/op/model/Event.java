package uk.ac.ed.inf.op.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Event {
	private Date eventDate;
	private Client client;
	private int budget;
	private List<InvitedGuest> guests;
	
	public Event(Date date, Client client)
	{
		this.eventDate = date;
		this.client = client;
		this.guests = new ArrayList<InvitedGuest>();
	}
	
	public Date getDate()
	{
		return this.eventDate;
	}
	
	public Client getClient()
	{
		return this.client;
	}
	
	public void changeDate(Date newDate)
	{
		this.eventDate = newDate;
	}
	
	public void setBudget(int budget)
	{
		this.budget = budget;
	}
	
	public int getBudget()
	{
		return this.budget;
	}
	
	public void addGuest(Guest guest) throws Exception
	{
		for (InvitedGuest invitedGuest : guests) {
			if (invitedGuest.getGuest() == guest) {
				throw new Exception("Guest already invited");
			}
		}
		
		guests.add(new InvitedGuest(guest));
	}
	
	public List<Guest> getAcceptedGuests()
	{
		List<Guest> acceptedGuests = new ArrayList<Guest>();
		
		for (InvitedGuest invitedGuest : guests) {
			if (invitedGuest.hasAccepted()) {
				acceptedGuests.add(invitedGuest.getGuest());
			}
		}
		
		return acceptedGuests;
	}
}
