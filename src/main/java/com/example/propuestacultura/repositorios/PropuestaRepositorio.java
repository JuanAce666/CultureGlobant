package com.example.propuestacultura.repositorios;

import com.example.propuestacultura.models.Propuesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PropuestaRepositorio extends JpaRepository<Propuesta, UUID> {

}
