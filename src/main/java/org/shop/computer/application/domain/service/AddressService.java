package org.shop.computer.application.domain.service;

import org.shop.computer.adapter.out.peristence.AddressRepository;
import org.shop.computer.application.domain.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AddressService {

    private final AddressRepository addressRepository;

    @Autowired
    public AddressService(AddressRepository addressRepository){
        this.addressRepository = addressRepository;
    }

    public Address addAddress(String city, String country, String street, String zip){
        Address address = new Address();
        address.setCity(city);
        address.setCountry(country);
        address.setStreet(street);
        address.setZip_code(zip);
        return addressRepository.save(address);
    }
}
