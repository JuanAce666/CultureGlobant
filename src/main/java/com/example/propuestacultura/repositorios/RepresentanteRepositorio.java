package com.example.propuestacultura.repositorios;

import com.example.propuestacultura.models.Representante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RepresentanteRepositorio extends JpaRepository<Representante, UUID> {

}
