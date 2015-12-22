package springboot.repositories;

import org.springframework.data.repository.CrudRepository;
import springboot.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{
}