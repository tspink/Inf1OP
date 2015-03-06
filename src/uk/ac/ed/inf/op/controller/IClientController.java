package uk.ac.ed.inf.op.controller;

import uk.ac.ed.inf.op.model.Client;

import java.util.List;

public interface IClientController {
	Client addClient(String firstName, String lastName, String emailAddress);
	void deleteClient(Client client);
	List<Client> getClients();
	
	Client findBestClient();
}
