package org.shop.computer.application.port.in.client;

import org.shop.computer.application.domain.model.Client;


public interface ClientUseCase {
    public Client addClient(String phone, String email, Boolean isRegular);
}
