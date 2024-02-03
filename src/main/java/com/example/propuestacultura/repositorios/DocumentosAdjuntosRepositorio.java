package com.example.propuestacultura.repositorios;

import com.example.propuestacultura.models.DocumentosAdjuntos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentosAdjuntosRepositorio extends JpaRepository<DocumentosAdjuntos,Integer> {

}
