package com.oba.springbootmicroservices2compra.repository;

import com.oba.springbootmicroservices2compra.model.Compra;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompraRespository extends JpaRepository<Compra, Long> {
    List<Compra> findAllByUserId(Long userId);
}
