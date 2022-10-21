package nghia.codegym.service;

import nghia.codegym.entity.Product;
import nghia.codegym.repository.IProductRepository;
import nghia.codegym.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface IProductService {

    List<Product> findAll();

    void save(Product product);

    Product findById(Integer id);

    void update(Integer id, Product product);

    void remove(Integer id);

    List<Product> search(String name);
}
