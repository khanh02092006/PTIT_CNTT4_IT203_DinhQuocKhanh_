package miniproject16;

import java.util.*;

public class FoodProduct implements   IRepository<Product> {

    private List<Product> productList = new ArrayList<>();
    private Map<String, Product> productMap = new HashMap<>();

    @Override
    public boolean add(Product item) {
        if (item == null || productMap.containsKey(item.getId())) {
            return false;
        }
        productList.add(item);
        productMap.put(item.getId(), item);
        return true;
    }

    @Override
    public boolean removeById(String id) {
        if (id == null || !productMap.containsKey(id)) {
            return false;
        }
        Product product = productMap.remove(id);
        productList.remove(product);
        return true;
    }

    @Override
    public Product findById(String id) {
        if (id == null) return null;
        return productMap.get(id);
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }
}
