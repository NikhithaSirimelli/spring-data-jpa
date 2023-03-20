package com.example.springstoreapplication.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springstoreapplication.entity.Products;

public interface ProductsRepository extends CrudRepository<Products,Long> {

}
