package aop.practiceVai2.service;

import java.util.HashMap;
import java.util.Map;

public class ProductServiceImp2 implements ProductService2{
    private Map<Integer , String> map = new HashMap<>();

    @Override
    public String getProductById(int id) {
        if (map.containsKey(id))
            return map.get(id);
        throw new RuntimeException("sorry product is not available...");
    }

    @Override
    public void saveProduct(String product) {
        if (product != null){
            int idx = map.size()+1;
            map.put(idx , product);
            return;
        }
        throw new  RuntimeException("product cannot be null");
    }
}
