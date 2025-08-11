package com.github.pedrorenan.pr_ecommerce.repositories;

import com.github.pedrorenan.pr_ecommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {// dentro do diamonds o tipo da classe e o tipo do Id da classe


}
