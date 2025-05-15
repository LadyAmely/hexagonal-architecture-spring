package org.shop.computer.application.port.in.client;

import org.shop.computer.application.domain.model.Client;

import java.util.List;

public interface ClientUseCase {
    public Client addClient(String phone, String email, Boolean isRegular);
    public Client getClient(Long id);
    public Client deleteClient(Long id);
    public List<Client> getAllClients();
}
