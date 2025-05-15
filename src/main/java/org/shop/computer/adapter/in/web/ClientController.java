package org.shop.computer.adapter.in.web;

import org.shop.computer.application.domain.model.Client;
import org.shop.computer.application.domain.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/client")
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService){
        this.clientService = clientService;
    }

    @PostMapping
    public ResponseEntity<Client> addClient(@RequestBody Client client){
        Client createClient = clientService.addClient(client.getPhone_number(), client.getEmail(), client.getRegular_client());
        return new ResponseEntity<>(createClient, HttpStatus.CREATED);
    }
}
