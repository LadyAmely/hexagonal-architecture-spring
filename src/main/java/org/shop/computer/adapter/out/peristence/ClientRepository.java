package org.shop.computer.adapter.out.peristence;

import org.shop.computer.application.domain.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
