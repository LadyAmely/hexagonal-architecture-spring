package org.shop.computer.application.domain.service;

import org.shop.computer.adapter.out.peristence.DelivererRepository;
import org.shop.computer.application.domain.model.Deliverer;
import org.shop.computer.application.port.in.deliverer.DelivererUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DelivererService implements DelivererUseCase {

    private final DelivererRepository delivererRepository;

    @Autowired
    public DelivererService(DelivererRepository delivererRepository){
        this.delivererRepository = delivererRepository;
    }

    @Override
    public Deliverer addDeliverer(String formDelivery, String companyName, String fax, Integer NIP, Integer REGON){
        Deliverer deliverer = new Deliverer();
        deliverer.setForm_delivery(formDelivery);
        deliverer.setCompany_name(companyName);
        deliverer.setFax(fax);
        deliverer.setNIP(NIP);
        deliverer.setREGON(REGON);
        return delivererRepository.save(deliverer);
    }
}
