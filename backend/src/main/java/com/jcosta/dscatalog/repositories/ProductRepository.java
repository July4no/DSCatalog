package com.jcosta.dscatalog.repositories;

import com.jcosta.dscatalog.entities.Category;
import com.jcosta.dscatalog.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


}
