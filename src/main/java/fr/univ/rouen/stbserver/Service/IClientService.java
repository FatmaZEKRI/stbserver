package fr.univ.rouen.stbserver.Service;

import fr.univ.rouen.stbserver.model.Client;


public interface IClientService {
	public Client saveClient(Client client);
	public Client updateClient(Client client);
	public void deleteClient(Integer clientId);
}
