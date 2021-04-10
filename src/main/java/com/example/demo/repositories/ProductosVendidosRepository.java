package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.ProductoVendido;

public interface ProductosVendidosRepository extends CrudRepository<ProductoVendido, Integer> {

}
