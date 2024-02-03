package com.example.propuestacultura.repositorios;

import com.example.propuestacultura.models.ValorPropuesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValorPropuestaRepositorio extends JpaRepository<ValorPropuesta,Integer> {
}
