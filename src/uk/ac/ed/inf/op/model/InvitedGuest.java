package uk.ac.ed.inf.op.model;

public class InvitedGuest {
	public enum InvitationState
	{
		NOTSENT,
		SENT,
		ACCEPTED,
		REJECTED
	}
	
	private Guest guest;
	private InvitationState state;
	
	public InvitedGuest(Guest guest) throws Exception
	{
		if (guest == null) {
			throw new Exception("Guest may not be null");
		}
		
		this.guest = guest;
		this.state = InvitationState.NOTSENT;
	}
	
	public Guest getGuest()
	{
		return guest;
	}
	
	public InvitationState getInvitationState()
	{
		return state;
	}
	
	public boolean hasAccepted()
	{
		return state == InvitationState.ACCEPTED;
	}
	
	public void sendInvitation() throws Exception
	{
		if (state != InvitationState.NOTSENT) {
			throw new Exception("Cannot send an invitation in this state");
		}
		
		state = InvitationState.SENT;
	}
	
	public void acceptInvitation() throws Exception
	{
		if (state != InvitationState.SENT && state != InvitationState.REJECTED) {
			throw new Exception("Object not in correct state");
		}
		
		state = InvitationState.ACCEPTED;
	}
	
	public void rejectInvitation() throws Exception
	{
		if (state != InvitationState.SENT) {
			throw new Exception("Object not in correct state");
		}
		
		state = InvitationState.REJECTED;
	}
	
	public void cancelInvitation() throws Exception
	{
		if (state != InvitationState.ACCEPTED) {
			throw new Exception("Object not in correct state");
		}
		
		state = InvitationState.REJECTED;
	}
}
