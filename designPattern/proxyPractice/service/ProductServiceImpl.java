package designPattern.proxyPractice.service;

import java.util.HashMap;
import java.util.Map;

public class ProductServiceImpl implements ProductService {

    public Map<Integer,String> productTable = new HashMap<>();

    @Override
    public String getProductById(int pid) {
        if (productTable.containsKey(pid))
            return productTable.get(pid);
        return "product not found" + pid;
    }

    @Override
    public void saveProduct(String product) {
        if (product != null){
            int nextpId = productTable.size()+1;
            productTable.put(nextpId,product);
            System.out.println("save success..");
            return;
        }
        throw new RuntimeException("Product cannot be null");
    }
}
