package com.monitora.papel.repositories;

import com.monitora.papel.entities.Papel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PapelRepository extends JpaRepository<Papel, Long> {
}
