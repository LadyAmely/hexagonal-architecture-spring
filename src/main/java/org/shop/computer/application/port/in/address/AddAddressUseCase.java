package org.shop.computer.application.port.in.address;

import org.shop.computer.application.domain.model.Address;

public interface AddAddressUseCase {
    public Address addAddress(String city, String country, String street, String zip);
}
