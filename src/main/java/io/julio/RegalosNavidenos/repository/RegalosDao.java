package io.julio.RegalosNavidenos.repository;

import io.julio.RegalosNavidenos.model.Regalo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegalosDao extends JpaRepository<Regalo, Long> {
    Regalo findByDecorado(String name);
}
