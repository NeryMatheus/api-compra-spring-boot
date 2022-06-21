package com.compras.compras.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compras.compras.model.Compra;

public interface CompraRepository extends JpaRepository<Compra, Long> {
    Compra findById(long id);
}
