package com.example.demo.Que8;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ProductRepository extends MongoRepository<Product,Integer> {

}
