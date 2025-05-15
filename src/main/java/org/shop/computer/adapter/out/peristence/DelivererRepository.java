package org.shop.computer.adapter.out.peristence;

import org.shop.computer.application.domain.model.Deliverer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DelivererRepository extends JpaRepository<Deliverer, Long> {
}
