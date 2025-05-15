package org.shop.computer.adapter.out.peristence;

import org.shop.computer.application.domain.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
