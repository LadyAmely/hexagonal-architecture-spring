package org.shop.computer.application.port.out.client;

import org.shop.computer.application.domain.model.Client;

import java.util.List;

public interface ClientOutputPort {
    public Client getClient(Long id);
    public Client deleteClient(Long id);
    public List<Client> getAllClients();
}
