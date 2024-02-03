package com.example.propuestacultura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoProponenteRepositorio extends JpaRepository<TipoProponenteRepositorio,Integer> {
}
