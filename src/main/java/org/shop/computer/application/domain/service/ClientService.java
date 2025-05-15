package org.shop.computer.application.domain.service;

import jakarta.persistence.EntityNotFoundException;
import org.shop.computer.adapter.out.peristence.ClientRepository;
import org.shop.computer.application.domain.model.Client;
import org.shop.computer.application.port.in.client.ClientUseCase;
import org.shop.computer.application.port.out.client.ClientOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService implements ClientUseCase, ClientOutputPort {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    @Override
    public Client addClient(String phone, String email, Boolean isRegular){
        Client createClient = new Client();
        createClient.setPhone_number(phone);
        createClient.setEmail(email);
        createClient.setRegular_client(isRegular);
        return clientRepository.save(createClient);
    }

    @Override
    public Client getClient(Long id){
        return clientRepository.findById(id)
                .orElseThrow(()->new EntityNotFoundException("Client not found."));
    }

    @Override
    public Client deleteClient(Long id){
        Client client = clientRepository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException("Client not found."));
        clientRepository.deleteById(id);
        return client;
    }

    @Override
    public List<Client> getAllClients(){
        return clientRepository.findAll();
    }
}
