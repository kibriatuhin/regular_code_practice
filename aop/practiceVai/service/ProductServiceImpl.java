package aop.practiceVai.service;

import java.util.HashMap;
import java.util.Map;

public class ProductServiceImpl implements ProductService{
    private Map<Integer , String> map = new HashMap<>();
    @Override
    public String getProductById(int id) {
        if (map.containsKey(id))
            return map.get(id);
        throw new RuntimeException("Sorry product is not available...");
    }

    @Override
    public void saveProduct(String product) {
        if (product != null){
            int nextIdx = map.size()+1;
            map.put(nextIdx, product);
            System.out.println("save successfully");
            return;
        }
        throw new RuntimeException("Product cannot be null");
    }
}
