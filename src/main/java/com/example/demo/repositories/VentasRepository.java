package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Venta;

public interface VentasRepository extends CrudRepository<Venta, Integer> {
}
