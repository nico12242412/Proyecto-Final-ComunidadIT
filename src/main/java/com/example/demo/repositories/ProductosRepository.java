package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Producto;

public interface ProductosRepository extends CrudRepository<Producto, Integer> {

	Producto findFirstByCodigo(String codigo);

	Producto findById(Long idproducto);

	void deleteById(Long id);
}
