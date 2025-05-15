package org.shop.computer.adapter.in.web;

import org.shop.computer.application.domain.model.Deliverer;
import org.shop.computer.application.domain.service.DelivererService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/deliverer")
public class DelivererController {

    private final DelivererService delivererService;

    @Autowired
    public DelivererController(DelivererService delivererService){
        this.delivererService = delivererService;
    }

    @PostMapping
    public ResponseEntity<Deliverer> addDeliverer(@RequestBody Deliverer deliverer){
        Deliverer createDeliverer = delivererService.addDeliverer(deliverer.getForm_delivery(), deliverer.getCompany_name(), deliverer.getFax(), deliverer.getNIP(), deliverer.getREGON());
        return new ResponseEntity<>(createDeliverer, HttpStatus.CREATED);
    }

}
