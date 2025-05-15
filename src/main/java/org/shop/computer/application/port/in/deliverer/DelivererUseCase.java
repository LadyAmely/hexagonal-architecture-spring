package org.shop.computer.application.port.in.deliverer;

import org.shop.computer.application.domain.model.Deliverer;


public interface DelivererUseCase {
    public Deliverer addDeliverer(String formDelivery, String companyName, String fax, Integer NIP, Integer REGON);
}
