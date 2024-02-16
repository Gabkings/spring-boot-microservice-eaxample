package com.gabkings.productSvs.repository;


import com.gabkings.productSvs.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
