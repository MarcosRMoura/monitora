package com.monitora.carteira.repositories;

import com.monitora.carteira.entities.Carteira;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarteiraRepository extends JpaRepository<Carteira, Long> {
}
