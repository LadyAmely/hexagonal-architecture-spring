package org.shop.computer.adapter.in.web;

import org.shop.computer.application.domain.model.Address;
import org.shop.computer.application.domain.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/address")
public class AddressController {

    private final AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService){
        this.addressService = addressService;
    }

    @PostMapping
    public ResponseEntity<Address> addAddress(@RequestBody Address address){
        Address createdAddress = addressService.addAddress(address.getCity(), address.getCountry(), address.getStreet(), address.getZip_code());
        return new ResponseEntity<>(createdAddress, HttpStatus.CREATED);
    }

}
