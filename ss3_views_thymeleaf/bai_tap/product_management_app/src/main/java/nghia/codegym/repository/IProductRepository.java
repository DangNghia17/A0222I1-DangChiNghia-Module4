package nghia.codegym.repository;

import nghia.codegym.entity.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    void save(Product product);

    Product findById(Integer id);

    void update(Integer id, Product product);

    void remove(Integer id);

    List<Product> search(String name);
}
