package com.project16.project16.repository.crudRepository;

import com.project16.project16.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductCrudRepository extends CrudRepository<Product, Integer> {
}
