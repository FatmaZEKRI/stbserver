package fr.univ.rouen.stbserver.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.univ.rouen.stbserver.Repository.IClientDao;
import fr.univ.rouen.stbserver.model.Client;
@Service("clientService")
@Transactional
public class ClientServiceImpl implements IClientService {
	@Autowired
	IClientDao clientDao;

	@Override
	public Client saveClient(Client client) {
		
		return this.clientDao.save(client);
	}

	@Override
	public Client updateClient(Client client) {
		
		return this.clientDao.save(client);
	}

	@Override
	public void deleteClient(Integer clientId) {
		this.clientDao.deleteById(clientId);
		
	}
	
}
