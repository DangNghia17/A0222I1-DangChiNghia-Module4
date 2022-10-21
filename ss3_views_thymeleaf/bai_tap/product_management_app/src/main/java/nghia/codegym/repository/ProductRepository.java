package nghia.codegym.repository;

import nghia.codegym.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepository implements IProductRepository {
    private static final Map<Integer, Product> productMap = new HashMap<>();

    static {
        productMap.put(1, new Product(1, "Mouse", 19900d, "mouse for laptop", "Newmen"));
        productMap.put(2, new Product(2, "Keyboard", 29900d, "keyboard for pc", "DareU"));
        productMap.put(3, new Product(3, "Light", 39900d, "get light", "BaseUs"));
        productMap.put(4, new Product(4, "Laptop", 1999900d, "laptop", "ASUS"));
        productMap.put(5, new Product(5, "Headphone", 29900d, "headphone", "Logitech"));
    }


    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(), product);
    }

    @Override
    public Product findById(Integer id) {
        return productMap.get(id);
    }

    @Override
    public void update(Integer id, Product product) {
        productMap.put(id, product);
    }

    @Override
    public void remove(Integer id) {
        productMap.remove(id);
    }

    @Override
    public List<Product> search(String name) {
        List<Product> productList = new ArrayList<>(productMap.values());
        List<Product> productListSearch = new ArrayList<>();
        for (Product product: productList){
            if(name.equals(product.getName())){
                productListSearch.add(product);
            }
        }
        return productListSearch;
    }
}
