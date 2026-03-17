package edu.jfs.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.jfs.app.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    Optional<Product> findByName(String name);

    Optional<Product> findByCost(double cost);
}